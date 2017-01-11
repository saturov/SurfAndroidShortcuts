package ru.surf.android_shortcut_sample;

import android.app.Activity;
import android.content.pm.ShortcutInfo;
import android.content.pm.ShortcutManager;
import android.graphics.drawable.Icon;
import android.os.Bundle;

import java.util.Arrays;

public class FirstActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);

        ShortcutManager shortcutManager = getSystemService(ShortcutManager.class);

        ShortcutInfo shortcut = new ShortcutInfo.Builder(this, "id1")
                .setShortLabel("Dynamic")
                .setLongLabel("Dynamic shortcut")
                .setIcon(Icon.createWithResource(this, R.drawable.ic_shortcut))
                .setIntent(SecondActivity.getIntent(this))
                .build();

        shortcutManager.setDynamicShortcuts(Arrays.asList(shortcut));

    }
}
