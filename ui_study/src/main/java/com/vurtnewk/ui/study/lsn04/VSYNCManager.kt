package com.vurtnewk.ui.study.lsn04

/**
 * @author VurtneWk
 * 2022/3/5
 */
class VSYNCManager private constructor() {


    private val list = mutableListOf<AnimationFrameCallback>()
    private val runnable: Runnable = Runnable {
        while (true) {
            Thread.sleep(16)
            list.forEach {
                it.doAnimationFrame(System.currentTimeMillis())
            }
        }
    }


    companion object {
        val instance: VSYNCManager by lazy { VSYNCManager() }
    }

    init {
        Thread(runnable).start()
    }

    fun add(callback: AnimationFrameCallback) {
        list.add(callback)
    }

    interface AnimationFrameCallback {
        fun doAnimationFrame(currentTime: Long): Boolean
    }
}