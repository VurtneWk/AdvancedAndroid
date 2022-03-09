package com.vurtnewk.datastructure.study02

import org.junit.Test
import java.util.*

class Test {


    @Test
    fun testRadixSort(){
        val list: LinkedList<MaJiang> = LinkedList<MaJiang>()
        list.add(MaJiang(3, 1))
        list.add(MaJiang(2, 3))
        list.add(MaJiang(3, 7))
        list.add(MaJiang(1, 1))
        list.add(MaJiang(3, 8))
        list.add(MaJiang(2, 2))
        list.add(MaJiang(3, 2))
        list.add(MaJiang(1, 3))
        list.add(MaJiang(3, 9))
        println(list)
        radixSort(list)
        println(list)
    }
    /**
     * 链式 基数排序
     * 空间换时间
     */
    private fun radixSort(list: LinkedList<MaJiang>) {
        //先对点数进行分组

        //9个链表的数组
        val rankList: Array<LinkedList<MaJiang>?> = arrayOfNulls(9)
        //初始化9个链表
        rankList.forEachIndexed { index, _ ->
            rankList[index] = LinkedList<MaJiang>()
        }
        //把数据分表放到9个链表当中
        while (list.size > 0){
            val maJiang = list.remove()
//            rankList[maJiang.rank-1]?.add(maJiang)
            rankList[maJiang.rank-1]?.push(maJiang)
        }

        //去出9个放到3个花色里

        //申明3个链表用于存放对应花色的数据
        val rankList2: Array<LinkedList<MaJiang>?> = arrayOfNulls(3)
        //初始化
        rankList2.forEachIndexed { index, _ ->
            rankList2[index] = LinkedList<MaJiang>()
        }
        //循环数组
        rankList.forEach {
            //循环数组中的每个链表
            it?.forEach { m->
                //把每个链表中的数据放入对应花色
                rankList2[m.suit-1]?.add(m)
            }
        }

        rankList2.forEach {
            list.addAll(it!!)
        }
    }

}