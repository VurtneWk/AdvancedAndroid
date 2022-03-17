package com.vurtnewk.architecture.handler

import android.annotation.SuppressLint
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.os.Message
import com.vurtnewk.architecture.databinding.ActivityHandlerSampleBinding
import com.vurtnewk.base.BaseActivity

/**
 * @author VurtneWk
 * 2022/3/17
 *
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
        }
    }

    private val handler2 = Handler(Looper.getMainLooper()) {
        true
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
    }

    private fun setListener() {
    }

    private fun observeData() {
    }


}