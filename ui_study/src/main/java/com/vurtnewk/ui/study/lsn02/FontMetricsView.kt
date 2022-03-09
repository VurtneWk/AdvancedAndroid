package com.vurtnewk.ui.study.lsn02

import android.content.Context
import android.graphics.Canvas
import android.graphics.Paint
import android.graphics.Rect
import android.util.AttributeSet
import android.view.View

/**
 * @author VurtneWk
 * 2022/3/9
 */
class FontMetricsView @JvmOverloads constructor(
    context: Context, attrs: AttributeSet? = null, defStyleAttr: Int = 0
) : View(context, attrs, defStyleAttr) {

    private val mPaint: Paint = Paint().also {
        it.isAntiAlias = true
    }
    private val str = "测试文字"

    private val rect = Rect()


    override fun onDraw(canvas: Canvas) {
        super.onDraw(canvas)
        mPaint.getTextBounds(str, 0, str.length, rect)

        canvas.drawText(str, 0F, 0F, mPaint)
    }


}