package com.vurtnewk.base

import android.app.Application
import com.blankj.utilcode.util.Utils
import com.orhanobut.logger.AndroidLogAdapter
import com.orhanobut.logger.FormatStrategy
import com.orhanobut.logger.Logger
import com.orhanobut.logger.PrettyFormatStrategy


/**
 * Created by VurtneWk on 2021/5/9
 */
@Suppress("unused")
class BaseApp : Application() {

    override fun onCreate() {
        super.onCreate()
        val formatStrategy: FormatStrategy = PrettyFormatStrategy.newBuilder()
                .showThreadInfo(false)
                .methodCount(1)
                .tag("AndroidAdvance") // (Optional) Global tag for every log. Default PRETTY_LOGGER
                .build()
        Logger.addLogAdapter(AndroidLogAdapter(formatStrategy))
        Utils.init(this)
    }
}