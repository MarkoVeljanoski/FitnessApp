package com.example.myfitnessapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.myfitnessapplication.ui.third.ThirdFragment;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_activity);
        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.container, ThirdFragment.newInstance())
                    .commitNow();
        }
    }
}