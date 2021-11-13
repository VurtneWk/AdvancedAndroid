package com.vurtnewk.datastructure.study01

import org.junit.Test

class Test01 {

    @Test
    fun testSwap(){

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
        a=  a xor b

//        var p1 = Person("张三")
//        var p2 = Person("李四")
//        p1 = p1 xor p2



        println("a = $a , b= $b")
    }

//    data class Person(val name:String)

}