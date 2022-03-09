package com.vurtnewk.ui.study.lsn02

import android.app.Activity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.vurtnewk.base.BaseActivity
import com.vurtnewk.ui.study.databinding.ActivityTestPaintBinding

/**
 * @author VurtneWk
 * 2022/3/5
 */
class TestPaintActivity : BaseActivity() {

    private var _binding: ActivityTestPaintBinding? = null
    private val binding: ActivityTestPaintBinding get() = _binding!!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        if (_binding == null) {
            _binding = ActivityTestPaintBinding.inflate(layoutInflater)
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