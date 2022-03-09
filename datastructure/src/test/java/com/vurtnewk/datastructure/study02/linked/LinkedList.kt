package com.vurtnewk.datastructure.study02.linked

/**
 * 双向链表
 */
class LinkedList<E> {


    //头结点
    var first: Node<E>? = null

    //尾节点
    var last: Node<E>? = null

    var size = 0

    fun add(e: E) {
        linkLast(e)
    }

    private fun linkLast(e: E) {
        val newNode = Node(last, e, null)
        val l = last

        if (last != null) {
            last!!.next = newNode
        }
        size++
    }


    /**
     * 节点
     */
    class Node<E> {
        //前一个节点
        var prev: Node<E>? = null

        //当前节点
        var item: E? = null

        //下一个节点
        var next: Node<E>? = null

        constructor()

        constructor(prev: Node<E>?, item: E?, next: Node<E>?) {
            this.prev = prev
            this.item = item
            this.next = next
        }
    }

    /**
     * add 到末尾
     */


    /**
     * add 到指定位置
     */

    /**
     * 删除末尾
     */

    /**
     * 删除指定位置
     */

}