package com.example.myfitnessapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.myfitnessapplication.ui.forth.ForthFragment;

public class MainActivity3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_activity2);
        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.container, ForthFragment.newInstance())
                    .commitNow();
        }
    }
}