package br.com.fiap.githubapp

import android.app.Application
import com.facebook.stetho.Stetho


class MyApplication : Application() {
    override fun onCreate() {
        super.onCreate()
        if(BuildConfig.DEBUG)
            Stetho.initializeWithDefaults(this)
    }
}