package com.nusuki.app

import android.app.Application
import dagger.hilt.android.HiltAndroidApp

@HiltAndroidApp
class NusukiApp : Application() {
    override fun onCreate() {
        super.onCreate()
    }
}