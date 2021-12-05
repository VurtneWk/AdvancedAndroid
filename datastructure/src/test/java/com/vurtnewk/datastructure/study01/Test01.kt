package com.vurtnewk.datastructure.study01

import androidx.core.util.rangeTo
import org.junit.Test
import kotlin.math.pow

class Test01 {

    @Test
    fun testSwap() {

        var a = 5
        var b = 6
        //方法一 空间上多了一个变量
//        val temp = a
//        a = b
//        b = temp

        //方法二 空间上少一个变量 但是不能对对象使用
//        a += b    //a = a + b   a 11 b 6
//        b = a - b //a 11 b 5
//        a -= b    //a = a - b   a 6  b 5

        //方法三  按位异或 性能最优(但是可读性查)
        /**
         * 二进制转换 11/2 余数1结果5 5/2 余数1结果2 2/2 余数0结果1 所以11的二进制是 1011   2^3 + 0 + 2^1 + 1
         * 假如
         * a = 1 1 1 1
         * b = 1 0 0 1
         * -----------
         * a = 0 1 1 0 //相同取0 不同取1
         * b = 1 1 1 1
         * a = 1 0 0 1
         */
        a = a xor b
        b = a xor b
        a = a xor b

//        var p1 = Person("张三")
//        var p2 = Person("李四")
//        p1 = p1 xor p2


        println("a = $a , b= $b")
    }

//    data class Person(val name:String)


    /**
     * 冒泡排序
     * 两两对比后，第一轮会找出最大值，放到最后
     * 一共持续 N-1 轮
     */
    private fun bubbleSort(array: IntArray) {
        //每次能把最后一个值给排好，所以每次递减一次
        for (j in array.size downTo 1) {
            var flag = true
            for (i in 0..array.size - 2) {
                if (array[i] > array[i + 1]) {
                    val temp = array[i]
                    array[i] = array[i + 1]
                    array[i + 1] = temp
                    flag = false
                }
            }
            if (flag) {//说明一次都没进排序 就可以终止循环
                break
            }
        }
    }

    @Test
    fun testBubble() {
        val array = intArrayOf(3, 2, 6, 1, 9, 5, 4, 8, 7)
        bubbleSort(array)
        array.forEach { println(it) }
    }

    /**
     * 选择排序
     * 每次选择一个放到第一位
     */
    private fun selectSearch(arr: IntArray) {

        for (i in arr.indices) {
            var index = i
            for (j in i + 1 until arr.size) {
                if (arr[j] < arr[index]) {
                    index = j
                }
            }
            if (index != i) {
                val temp = arr[index]
                arr[index] = arr[i]
                arr[i] = temp
            }
        }
    }

    @Test
    fun testSelectSearch() {
        val array = intArrayOf(3, 2, 6, 1, 9, 5, 4, 8, 7)
//        val array = intArrayOf(3, 2, 6)
        selectSearch(array)
        array.forEach { println(it) }
    }
}
