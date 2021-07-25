package eu.micer.clipboardservice

import android.app.Service
import android.content.ClipData
import android.content.ClipboardManager
import android.content.Context
import android.content.Intent
import android.os.IBinder

class ClipboardService : Service() {
    companion object {
        private val TAG = ClipboardService::class.java.simpleName
    }

    override fun onBind(intent: Intent): IBinder? {
        return null
    }

    override fun onStartCommand(intent: Intent, flags: Int, startId: Int): Int {
        val text = intent.getStringExtra("text")
        val clipboard = getSystemService(Context.CLIPBOARD_SERVICE) as ClipboardManager
        clipboard.setPrimaryClip(ClipData.newPlainText(TAG, text))
        stopSelf()
        return START_NOT_STICKY
    }
}
