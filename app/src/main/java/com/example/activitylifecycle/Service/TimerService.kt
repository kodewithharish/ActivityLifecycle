package com.example.activitylifecycle.Service

import android.app.Service
import android.content.Intent
import android.os.IBinder
import kotlinx.coroutines.CoroutineScope
import kotlin.coroutines.CoroutineContext

class TimerService:Service(), CoroutineScope {
    override fun onBind(p0: Intent?): IBinder? {

        return null
    }

    override val coroutineContext: CoroutineContext
        get() = TODO("Not yet implemented")

    override fun onStartCommand(intent: Intent?, flags: Int, startId: Int): Int {
        return super.onStartCommand(intent, flags, startId)
    }

    override fun onCreate() {
        super.onCreate()
    }

    override fun onDestroy() {
        super.onDestroy()
    }

}