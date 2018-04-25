package eu.micer.clipboardservice;

import android.app.Service;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Intent;
import android.os.IBinder;

public class ClipboardService extends Service {
    private static final String TAG = ClipboardService.class.getSimpleName();

    public ClipboardService() {
    }

    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        String text = intent.getStringExtra("text");
        ClipboardManager clipboard = (ClipboardManager) getSystemService(CLIPBOARD_SERVICE);
        if (clipboard != null) {
            clipboard.setPrimaryClip(ClipData.newPlainText(TAG, text));
        }
        stopSelf();
        return START_NOT_STICKY;
    }
}
