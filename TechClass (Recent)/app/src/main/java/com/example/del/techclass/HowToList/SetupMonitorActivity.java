package com.example.del.techclass.HowToList;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.example.del.techclass.R;

public class SetupMonitorActivity extends AppCompatActivity {

    ViewPager viewPager;
    SetupAdapter setupAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.setupmonitor_actiivity);
        viewPager = (ViewPager)findViewById(R.id.setuppager);
        setupAdapter = new SetupAdapter(getSupportFragmentManager());
        viewPager.setAdapter(setupAdapter);
    }
}
