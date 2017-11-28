package com.alexsinger.appcenterapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import com.microsoft.appcenter.AppCenter;
import com.microsoft.appcenter.analytics.Analytics;
import com.microsoft.appcenter.crashes.Crashes;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        AppCenter.start(getApplication(), "ff0b7765-9ae9-4b50-8eae-e253a6988db6",
                Analytics.class, Crashes.class);
        setContentView(R.layout.activity_main);

    }
}
