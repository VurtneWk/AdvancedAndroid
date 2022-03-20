package com.vurtnewk.architecture.handler

import android.annotation.SuppressLint
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.os.Message
import com.orhanobut.logger.Logger
import com.vurtnewk.architecture.databinding.ActivityHandlerSampleBinding
import com.vurtnewk.base.BaseActivity
import java.lang.ref.WeakReference
import java.util.*

/**
 * @author VurtneWk
 * 2022/3/17
 * 1、Handler内存泄露测试
 * 2、为什么不能在子线程创建Handler
 * 3、textView.setText()只能在主线程执行，这句话是错误！
 * 4、new Handler()两种写法有什么区别？
 * 5、ThreadLocal用法和原理
 */
class HandlerSampleActivity : BaseActivity() {


    private var _binding: ActivityHandlerSampleBinding? = null
    private val binding: ActivityHandlerSampleBinding get() = _binding!!


    companion object {

        private val handler1 = object : Handler(Looper.getMainLooper()) {

            override fun handleMessage(msg: Message) {
                super.handleMessage(msg)
            }
        }

        private val handler2 = Handler(Looper.getMainLooper()) {

            true
        }
    }

    private val handler1 = object : Handler(Looper.getMainLooper()) {
        override fun handleMessage(msg: Message) {
            super.handleMessage(msg)
            Logger.d("handleMessage => ${msg.obj} -- ${msg.what}")
        }
    }

    private val handler2 = Handler(Looper.getMainLooper()) { msg ->
        Logger.d("${msg.obj} -- ${msg.what}")
        binding.tvText.text = msg.obj.toString()
        true
    }

    class Handler3 constructor(activity: HandlerSampleActivity) : Handler(Looper.getMainLooper()) {

        val weakReference = WeakReference(activity)

        override fun handleMessage(msg: Message) {
            super.handleMessage(msg)
            weakReference.get()?.binding?.tvText?.text = ""
        }

    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        if (_binding == null) {
            _binding = ActivityHandlerSampleBinding.inflate(layoutInflater)
            setContentView(binding.root)
            initView()
            setListener()
            observeData()
        }
    }

    private fun initView() {
        Logger.d("handler2 = $handler2")
        Thread {
            Thread.sleep(400)
            //正常使用
            val msg = Message()
//            val msg2 = Message.obtain()
            msg.what = 123
            msg.obj = "handler"
            handler2.sendMessage(msg)
//            handler2.handleMessage(msg)
            Logger.d("handler2.handleMessage(msg) $handler2")


        }.start()

//        handler1.dispatchMessage(Message.obtain())
    }


    private fun setListener() {
    }

    private fun observeData() {
    }

    override fun onDestroy() {
        super.onDestroy()
        Logger.d("onDestroy")
    }

}