package com.vurtnewk.architecture

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.vurtnewk.architecture.databinding.ActivityMainBinding
import com.vurtnewk.base.BaseActivity

class MainActivity : BaseActivity() {

    private var _binding: ActivityMainBinding? = null
    private val binding: ActivityMainBinding get() = _binding!!

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
    }

    private fun setListener() {
    }

    private fun observeData() {
    }


}