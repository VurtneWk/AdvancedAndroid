package com.vurtnewk.ui.study.lsn02

import android.animation.ValueAnimator
import android.content.Context
import android.graphics.*
import android.util.AttributeSet
import android.view.View

/**
 * @author VurtneWk
 * 2022/3/9
 */
class PaintMethodView @JvmOverloads constructor(
    context: Context, attrs: AttributeSet? = null, defStyleAttr: Int = 0
) : View(context, attrs, defStyleAttr) {

    private var mPaint: Paint = Paint().also {
        it.strokeWidth = 4F
        it.color = Color.BLUE
        it.style = Paint.Style.STROKE
        it.isAntiAlias = true
    }

    private val path = Path()

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
//
//        mPaint.strokeCap = Paint.Cap.BUTT
//
//        mPaint.strokeWidth = 80F

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

//        testCornerPathEffect(canvas)
        testDashPathEffect(canvas)
    }

    //https://blog.csdn.net/lu1024188315/article/details/77370547
    private fun testDashPathEffect(canvas: Canvas) {
        path.moveTo(100F, 600F)
        path.lineTo(400F, 100F)
        path.lineTo(700F, 900F)
        canvas.drawPath(path, mPaint)

        mPaint.color = Color.RED
        mPaint.pathEffect = DashPathEffect(floatArrayOf(20F, 10F, 100F, 100F), 0F)
        canvas.translate(0F, 100F)
        canvas.drawPath(path, mPaint)

        mPaint.color = Color.BLACK
        mPaint.pathEffect = DashPathEffect(floatArrayOf(20F, 10F, 100F, 100F), 15F)
        canvas.translate(0F, 100F)
        canvas.drawPath(path, mPaint)
    }

    private fun testCornerPathEffect(canvas: Canvas) {
        mPaint.strokeWidth = 4F
        mPaint.color = Color.BLUE
        mPaint.style = Paint.Style.STROKE

        path.moveTo(100F, 600F)
        path.lineTo(400F, 100F)
        path.lineTo(700F, 900F)

        canvas.drawPath(path, mPaint)

        //画笔改为红色花第二条线
        mPaint.color = Color.RED
        mPaint.pathEffect = CornerPathEffect(100F)//角度为100
        canvas.drawPath(path, mPaint)

        mPaint.color = Color.BLACK
        mPaint.pathEffect = CornerPathEffect(200F)//角度为200
        canvas.drawPath(path, mPaint)
    }

    private fun testPaintCap(canvas: Canvas) {
        //        region Paint.Cap部分

        mPaint.strokeWidth = 80F
        mPaint.isAntiAlias = true
        mPaint.color = Color.GREEN
        mPaint.style = Paint.Style.STROKE

        mPaint.strokeCap = Paint.Cap.BUTT
        canvas.drawLine(100F, 200F, 400F, 200F, mPaint)

        mPaint.strokeCap = Paint.Cap.SQUARE
        canvas.drawLine(100F, 400F, 400F, 400F, mPaint)

        mPaint.strokeCap = Paint.Cap.ROUND
        canvas.drawLine(100F, 600F, 400F, 600F, mPaint)

        //垂直画出x=100这条线
        mPaint.reset()
        mPaint.strokeWidth = 2F
        mPaint.color = Color.RED
        canvas.drawLine(100F, 50F, 100F, 750F, mPaint)

        //endregion
    }

    private fun testPaintJoin(canvas: Canvas) {
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

        //endregion
    }

    private fun testShader(canvas: Canvas) {
        mPaint.shader = SweepGradient(200f, 200f, Color.BLUE, Color.RED) //设置环形渲染器
    }
}