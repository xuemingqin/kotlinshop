package com.example.kotlinshop
import android.annotation.SuppressLint
import android.app.Application
import android.content.Context
import com.alibaba.android.arouter.launcher.ARouter

@SuppressLint("Registered")
open class BaseApplication: Application() {

    lateinit var appComponent: AppComponent

    override fun onCreate() {
        super.onCreate()
        context = this

        ARouter.openLog()
        ARouter.openDebug()
        ARouter.init(this)

    }

    companion object {
        @SuppressLint("StaticFieldLeak")
        lateinit var context: Context
    }


}