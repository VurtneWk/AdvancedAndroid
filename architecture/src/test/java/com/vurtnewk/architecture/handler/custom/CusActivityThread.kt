package com.vurtnewk.architecture.handler.custom

import org.junit.Test

class CusActivityThread {

    @Test
    fun main() {
        //
        CusLooper.prepare()


        CusLooper.loop()
    }
}