package com.example.activitylifecycle

import android.app.Notification
import android.app.NotificationChannel
import android.app.NotificationManager
import android.app.PendingIntent
import android.content.Context
import android.content.Intent
import android.graphics.BitmapFactory
import android.graphics.Color
import android.os.Build
import android.os.Build.VERSION.*
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.RemoteViews

class SecondActivity : AppCompatActivity() {

    var TAG = "ActivityLifeCycle"
    lateinit var  btn:Button

    lateinit var notificationChannel: NotificationChannel
    lateinit var notificationManager: NotificationManager
    lateinit var builder:Notification.Builder
    private val channelId = "i.apps.notifications"
    private val description = "Test notification"


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        btn =  findViewById(R.id.button)
        btn.setOnClickListener(View.OnClickListener {

            val intent=Intent(this,SecondActivity::class.java)
            startActivity(intent)
        })
        Utils.showToast("=>SecondActivity=>Oncreate() ",application)
        Log.i(TAG,"=>SecondActivity=>Oncreate()")

        notificationManager = getSystemService(Context.NOTIFICATION_SERVICE) as NotificationManager


        btn.setOnClickListener(View.OnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            val pendingIntent = PendingIntent.getActivity(this, 0, intent, PendingIntent.FLAG_UPDATE_CURRENT)
            val contentView = RemoteViews(packageName, R.layout.fragmnet_layotone)
            if(SDK_INT>= Build.VERSION_CODES.O)
            {
                notificationChannel = NotificationChannel(channelId, description, NotificationManager.IMPORTANCE_HIGH)
                notificationChannel.enableLights(true)
                notificationChannel.lightColor = Color.GREEN
                notificationChannel.enableVibration(false)
                notificationManager.createNotificationChannel(notificationChannel)
                builder = Notification.Builder(this, channelId)
                    .setContent(contentView)
                    .setSmallIcon(R.drawable.ic_launcher_background)
                    .setLargeIcon(BitmapFactory.decodeResource(this.resources, R.drawable.ic_launcher_background))
                    .setContentIntent(pendingIntent)



            }else
            {

                builder = Notification.Builder(this)
                    .setContent(contentView)
                    .setSmallIcon(R.drawable.ic_launcher_background)
                    .setLargeIcon(BitmapFactory.decodeResource(this.resources, R.drawable.ic_launcher_background))
                    .setContentIntent(pendingIntent)
            }
            notificationManager.notify(1234, builder.build())

        })


    }

    override fun onStart() {
        super.onStart()
        Utils.showToast("=>SecondActivity=>onStart() ",application)
        Log.i(TAG,"=>SecondActivity=>onStart()")
    }

    override fun onResume() {
        super.onResume()
        Utils.showToast("=>SecondActivity=>onResume() ",application)
        Log.i(TAG,"=>SecondActivity=>onResume()")
    }

    override fun onPause() {
        super.onPause()
        Utils.showToast("=>SecondActivity=>onPause() ",application)
        Log.i(TAG,"=>SecondActivity=>onPause()")
    }

    override fun onStop() {
        super.onStop()
        Utils.showToast("=>SecondActivity=>onStop() ",application)
        Log.i(TAG,"=>SecondActivity=>onStop()")
    }

    override fun onRestart() {
        super.onRestart()
        Utils.showToast("=>SecondActivity=>onRestart() ",application)
        Log.i(TAG,"=>SecondActivity=>onRestart()")
    }

    override fun onDestroy() {
        super.onDestroy()
        Utils.showToast("=>SecondActivity=>onDestroy() ",application)
        Log.i(TAG,"=>SecondActivity=>onDestroy()")
    }

}