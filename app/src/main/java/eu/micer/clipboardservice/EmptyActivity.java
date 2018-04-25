package eu.micer.clipboardservice;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;

public class EmptyActivity extends Activity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        finish();
    }
}
