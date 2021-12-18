package com.example.del.techclass.HowToList;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.del.techclass.R;

public class VDActivity extends AppCompatActivity {
    ImageView imageView;
    TextView buttonone, buttontwo, buttonthree;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.vd_activity);
        imageView = (ImageView) findViewById(R.id.imageView45);
        buttonone = (TextView) findViewById(R.id.oneText);
        buttontwo = (TextView) findViewById(R.id.twoText);
        buttonthree = (TextView) findViewById(R.id.threeText);

        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });

        buttonone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openFirstActivity(v);
            }
        });

        buttontwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openSecondActivity(v);
            }
        });

        buttonthree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openThirdActivity(v);
            }
        });
    }


    public void openFirstActivity(View view){
        Intent intent = new Intent(view.getContext(), VirtualDesktopActivity.class);
        startActivity(intent);
        onDestroy();
    }

    public void openSecondActivity(View view){
        Intent intent = new Intent(view.getContext(), Virtual3Activity.class);
        startActivity(intent);
        onDestroy();
    }

    public void openThirdActivity(View view){
        Intent intent = new Intent(view.getContext(), Virtual2Activity.class);
        startActivity(intent);
        onDestroy();
    }
}
