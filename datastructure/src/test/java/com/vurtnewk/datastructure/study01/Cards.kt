package com.vurtnewk.datastructure.study01

/**
 * 扑克牌
 * pokerColors 花色
 * cardPoints 点数
 */
class Cards(val pokerColors: Int, val cardPoints: Int) : Comparable<Cards> {

    override fun compareTo(other: Cards): Int {
        if (this.cardPoints > other.cardPoints) {
            return 1
        } else if (this.cardPoints < other.cardPoints) {
            return -1
        }
        if (this.pokerColors > other.pokerColors) {
            return 1
        } else if (this.pokerColors < other.pokerColors) {
            return -1
        }
        return 0
    }

    override fun toString(): String {
        return "Cards(pokerColors=$pokerColors, cardPoints=$cardPoints)"
    }


}