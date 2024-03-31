package dev.yellowhatpro.studyadda

import android.app.Application
import android.content.Context
import dagger.hilt.android.HiltAndroidApp

@HiltAndroidApp
class StudyAddaApp: Application() {
    lateinit var appContext: Context
    override fun onCreate() {
        super.onCreate()

    }
}