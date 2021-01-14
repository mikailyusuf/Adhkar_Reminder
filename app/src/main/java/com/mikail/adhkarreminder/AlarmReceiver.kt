package com.mikail.adhkarreminder

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent

class AlarmReceiver : BroadcastReceiver()  {
    override fun onReceive(context: Context?, intent: Intent?) {

        if (intent?.action == "android.intent.action.BOOT_COMPLETED") {
            val notificationUtils = context?.let { NotificationUtils(it) }
            val notification = notificationUtils?.getNotificationBuilder("BOOT COMPLETED")?.build()
            notificationUtils?.getManager()?.notify(150, notification)
        }

        val notificationUtils = context?.let { NotificationUtils(it) }
        val notification = notificationUtils?.getNotificationBuilder("SALAMU ALIKUM")?.build()
        notificationUtils?.getManager()?.notify(150, notification)

    }
}