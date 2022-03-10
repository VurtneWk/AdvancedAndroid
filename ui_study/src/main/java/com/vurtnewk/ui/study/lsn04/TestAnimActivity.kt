package com.vurtnewk.ui.study.lsn04

import android.os.Bundle
import android.view.animation.Animation
import android.view.animation.TranslateAnimation
import com.blankj.utilcode.util.ToastUtils
import com.vurtnewk.base.BaseActivity
import com.vurtnewk.ui.study.databinding.ActivityTestAnimBinding

class TestAnimActivity : BaseActivity() {


    private var _binding: ActivityTestAnimBinding? = null
    private val binding: ActivityTestAnimBinding get() = _binding!!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        if (_binding == null) {
            _binding = ActivityTestAnimBinding.inflate(layoutInflater)
            setContentView(binding.root)
            initView()
            setListener()
            observeData()
        }
    }

    private fun initView() {

    }

    private fun setListener() {
        binding.apply {
            tvAnimView.setOnClickListener {
                ToastUtils.showShort("animView")
            }
            btnTranslate.setOnClickListener {
                val anim = TranslateAnimation(0F, 880F, 0F, 0F)
                anim.duration = 2000
                anim.fillAfter = true
//                anim.repeatMode = Animation.REVERSE
//                btnTranslate.animation = anim
//                anim.start()
                tvAnimView.startAnimation(anim)
            }
        }
    }

    private fun observeData() {
    }


}

