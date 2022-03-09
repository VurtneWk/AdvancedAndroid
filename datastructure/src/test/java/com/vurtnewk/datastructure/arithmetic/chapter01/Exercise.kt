package com.vurtnewk.datastructure.arithmetic.chapter01

import org.junit.Test
import java.util.*

/**
 * @author VurtneWk
 * 2022/3/8
 */
class Exercise {


    /**
     * 给出以下表达式的值：
     * a. ( 0 + 15 ) / 2   --> 7
     * b. 2.0e-6 * 100000000.1 --> 200.0000002
     * c. true && false || true && true  --> true
     */
    @Test
    fun q01() {
        println("( 0 + 15 ) / 2  = ${(0 + 15) / 2}")
        println("2.0e-6 * 100000000.1 = ${2.0e-6 * 100000000.1}")
        println("true && false || true && true = ${true && false || true && true}")
    }

    /**
     * 给出以下表达式的类型和值：
     * a. (1 + 2.236)/2   ---> double
     * b. 1 + 2 + 3 + 4.0  ---> double 10.0
     * c. 4.1 >= 4 ---> boolean true
     * d. 1 + 2 + "3" --> String 33
     */
    @Test
    fun q02() {
        println("(1 + 2.236)/2 = ${(1 + 2.236) / 2}")
        println("1 + 2 + 3 + 4.0 = ${1 + 2 + 3 + 4.0}")
        println("4.1 >= 4 = ${4.1 >= 4}")
        //kotlin 不能直接加
//        val a = 1 + 2 + "3"
//        println("1 + 2 + \"3\" = ${1 + 2 + "3"}")
    }

    /**
     * 编写一个程序，从命令行得到三个整数参数。如果它们都相等则打印 equal，否则打印 not equal。
     */
    @Test
    fun q03() {


    }
}
