package com.example.lab2_resources;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.widget.TextViewCompat;

import android.content.res.Configuration;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView orientation = null;
    private int screenOrientation = new Configuration().orientation;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        orientation = findViewById(R.id.orientationTextView);
    }

    @Override
    public void onConfigurationChanged(@NonNull Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
        screenOrientation = newConfig.orientation;
        switch (screenOrientation){
            case Configuration.ORIENTATION_LANDSCAPE:orientation.setText(R.string.landscapeView);
                break;
            case Configuration.ORIENTATION_PORTRAIT:orientation.setText(R.string.portraitView);
                break;
        }
    }
}