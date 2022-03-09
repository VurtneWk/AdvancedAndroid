package com.vurtnewk.ui.study

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.vurtnewk.base.LaunchAdapter
import com.vurtnewk.basemodule.ClassEntity
import com.vurtnewk.ui.study.databinding.ActivityMainBinding
import com.vurtnewk.ui.study.lsn02.TestPaintActivity

class MainActivity : AppCompatActivity() {

    private var _binding: ActivityMainBinding? = null
    private val binding: ActivityMainBinding get() = _binding!!

    private val mLaunchAdapter = LaunchAdapter()
    private val data by lazy {
        mutableListOf<ClassEntity>().also {
            it.add(ClassEntity("TestPaint", TestPaintActivity::class.java))
        }
    }

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
        binding.recyclerView.adapter = mLaunchAdapter
        mLaunchAdapter.submitList(data)
    }

    private fun setListener() {
    }

    private fun observeData() {
    }


}