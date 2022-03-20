package com.vurtnewk.architecture

import org.junit.Test

class ThreadLocalTest {


    @Test
    fun demo1() {
        val tl = ThreadLocal<String>()
        println("tl -> ${tl.get()}") //tl -> null

        val threadLocal = object : ThreadLocal<String>(){
            override fun initialValue(): String {
                return "initialValue"
            }
        }
        //Test worker 1 -> initialValue
        println("${Thread.currentThread().name} 1 -> ${threadLocal.get()}")

        Thread{
            //Thread-3 1 -> initialValue
            println("${Thread.currentThread().name} 1 -> ${threadLocal.get()}")

            threadLocal.set("value1")

            //Thread-3 2 -> value1
            println("${Thread.currentThread().name} 2 -> ${threadLocal.get()}")

            //ps-> 使用完毕注意回收
            threadLocal.remove()
        }.start()

        Thread{
            //Thread-4 1 -> initialValue
            println("${Thread.currentThread().name} 1 -> ${threadLocal.get()}")

            threadLocal.set("value2")

            //Thread-4 2 -> value2
            println("${Thread.currentThread().name} 2 -> ${threadLocal.get()}")

            //ps-> 使用完毕注意回收
            threadLocal.remove()

        }.start()

        //Test worker 2 -> initialValue
        println("${Thread.currentThread().name} 2 -> ${threadLocal.get()}")

        threadLocal.remove()
    }

}