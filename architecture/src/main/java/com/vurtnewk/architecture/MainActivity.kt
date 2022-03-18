package com.vurtnewk.architecture

import android.os.Bundle
import com.vurtnewk.architecture.databinding.ActivityMainBinding
import com.vurtnewk.architecture.handler.HandlerSampleActivity
import com.vurtnewk.base.BaseActivity
import com.vurtnewk.base.LaunchAdapter
import com.vurtnewk.basemodule.ClassEntity

class MainActivity : BaseActivity() {

    private var _binding: ActivityMainBinding? = null
    private val binding: ActivityMainBinding get() = _binding!!

    private val datas = mutableListOf<ClassEntity>().also {
        it.add(ClassEntity("HandlerSample", HandlerSampleActivity::class.java))
    }

    private val mAdapter = LaunchAdapter()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        if (_binding == null) {
            _binding = ActivityMainBinding.inflate(layoutInflater)
            setContentView(binding.root)
            initView()
            setListener()
            observeData()
        }
    }

    private fun initView() {
        binding.recyclerView.adapter = mAdapter
        mAdapter.submitList(datas)
    }

    private fun setListener() {
    }

    private fun observeData() {
    }


}