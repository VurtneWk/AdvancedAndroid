package com.vurtnewk.ui.study.lsn02

import android.content.Context
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.graphics.Path
import android.util.AttributeSet
import android.view.View

/**
 * @author VurtneWk
 * 2022/3/9
 */
class PaintMethodView @JvmOverloads constructor(
    context: Context, attrs: AttributeSet? = null, defStyleAttr: Int = 0
) : View(context, attrs, defStyleAttr) {

    private var mPaint: Paint = Paint()
    private var mPaint2: Paint = Paint()
    private var mPaint3: Paint = Paint()

    val path = Path()

    init {
//        mPaint.setColor(Color.RED);// 设置颜色
//        mPaint.setARGB(255, 255, 255, 0); // 设置 Paint对象颜色,范围为0~255
//        mPaint.setAlpha(200); // 设置alpha不透明度,范围为0~255
        //        mPaint.setColor(Color.RED);// 设置颜色
//        mPaint.setARGB(255, 255, 255, 0); // 设置 Paint对象颜色,范围为0~255
//        mPaint.setAlpha(200); // 设置alpha不透明度,范围为0~255
//        mPaint.isAntiAlias = true // 抗锯齿
//        mPaint2.isAntiAlias = false
//        mPaint3.isAntiAlias = true

//        mPaint.style = Paint.Style.FILL //描边效果
//        mPaint2.style = Paint.Style.FILL
//        mPaint3.style = Paint.Style.FILL
//
//        mPaint.strokeCap = Paint.Cap.BUTT
//        mPaint2.strokeCap = Paint.Cap.ROUND
//        mPaint3.strokeCap = Paint.Cap.SQUARE
//
//        mPaint.strokeWidth = 80F
//        mPaint2.strokeWidth = 80F
//        mPaint3.strokeWidth = 80F

//        mPaint2.strokeWidth = 4F
//        mPaint.setStrokeWidth(4);//描边宽度
//        mPaint.setStrokeCap(Paint.Cap.ROUND); //圆角效果
//        mPaint.setStrokeJoin(Paint.Join.MITER);//拐角风格
//        mPaint.setShader(new SweepGradient(200, 200, Color.BLUE, Color.RED)); //设置环形渲染器
//        mPaint.set4Xfermode(new PorterDuffXfermode(PorterDuff.Mode.DARKEN)); //设置图层混合模式
//        mPaint.setColorFilter(new LightingColorFilter(0x00ffff, 0x000000)); //设置颜色过滤器
//        mPaint.setFilterBitmap(true); //设置双线性过滤
//        mPaint.setMaskFilter(new BlurMaskFilter(10, BlurMaskFilter.Blur.NORMAL));//设置画笔遮罩滤镜 ,传入度数和样式
//        mPaint.setTextScaleX(2);// 设置文本缩放倍数
//        mPaint.setTextSize(38);// 设置字体大小
//        mPaint.setTextAlign(Paint.Align.LEFT);//对其方式
//        mPaint.setUnderlineText(true);// 设置下划线
//
//        String str = "Android高级工程师";
//        Rect rect = new Rect();
//        mPaint.getTextBounds(str, 0, str.length(), rect); //测量文本大小，将文本大小信息存放在rect中
//        mPaint.measureText(str); //获取文本的宽
//        mPaint.getFontMetrics(); //获取字体度量对象
    }

    override fun onDraw(canvas: Canvas) {
        super.onDraw(canvas)
//        canvas.drawCircle(150F, 200F, 100F, mPaint)
//        canvas.drawCircle(400F, 200F, 100F, mPaint2)
//        canvas.drawCircle(650F, 200F, 100F, mPaint3)



//        region Paint.Cap部分

//        mPaint.strokeWidth = 80F
//        mPaint.isAntiAlias = true
//        mPaint.color = Color.GREEN
//        mPaint.style = Paint.Style.STROKE
//
//        mPaint.strokeCap = Paint.Cap.BUTT
//        canvas.drawLine(100F, 200F, 400F, 200F, mPaint)
//
//        mPaint.strokeCap = Paint.Cap.SQUARE
//        canvas.drawLine(100F, 400F, 400F, 400F, mPaint)
//
//        mPaint.strokeCap = Paint.Cap.ROUND
//        canvas.drawLine(100F, 600F, 400F, 600F, mPaint)
//
//        //垂直画出x=100这条线
//        mPaint.reset()
//        mPaint.strokeWidth = 2F
//        mPaint.color = Color.RED
//        canvas.drawLine(100F, 50F, 100F, 750F, mPaint)

        //endregion

        //region Paint.Join

        mPaint.strokeWidth = 80F
        mPaint.color = Color.RED
        mPaint.style = Paint.Style.STROKE
        mPaint.isAntiAlias = true


        path.moveTo(100F, 100F)
        path.lineTo(450F, 100F)
        path.lineTo(450F, 300F)
        mPaint.strokeJoin = Paint.Join.MITER
        canvas.drawPath(path, mPaint)

        path.moveTo(100F, 400F)
        path.lineTo(450F, 400F)
        path.lineTo(450F, 600F)
        mPaint.strokeJoin = Paint.Join.BEVEL
        canvas.drawPath(path, mPaint)

        path.moveTo(100F, 700F)
        path.lineTo(450F, 700F)
        path.lineTo(450F, 900F)
        mPaint.strokeJoin = Paint.Join.ROUND
        canvas.drawPath(path, mPaint)

    }
}