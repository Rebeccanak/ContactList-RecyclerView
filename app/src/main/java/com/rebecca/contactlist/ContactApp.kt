package com.rebecca.contactlist

import android.app.Application
import android.content.Context

class ContactApp: Application() {
    companion object{
        lateinit var appContext: Context
    }

    override fun onCreate() {
        super.onCreate()
        appContext = applicationContext
    }
}