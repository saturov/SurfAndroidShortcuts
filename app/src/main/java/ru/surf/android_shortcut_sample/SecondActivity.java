package ru.surf.android_shortcut_sample;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

public class SecondActivity extends Activity {

    public static Intent getIntent(Context context) {
        return new Intent(context, SecondActivity.class).setAction(Intent.ACTION_VIEW);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
    }
}
