package com.sunnyweather.android

import android.annotation.SuppressLint
import android.app.Application
import android.content.Context

class SunnyWeather : Application() {
    companion object{
        @SuppressLint("StaticFieldLeak")
        lateinit var context:Context
        const val TOKEN = "lkvhNERZ92PvPh1Z"
    }

    override fun onCreate() {
        super.onCreate()
        context = applicationContext
    }
}