package com.example.del.techclass.HowToList.Router;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.del.techclass.R;

public class RouterActivity extends AppCompatActivity {
    ViewPager vpPager;
    RouterAdapter routerAdapter;
    ImageView imageView;
    TextView prev, next;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.router_activity);
        vpPager = (ViewPager)findViewById(R.id.routerpager);
        routerAdapter = new RouterAdapter(getSupportFragmentManager());
        vpPager.setAdapter(routerAdapter);
        vpPager.setCurrentItem(0);

        imageView = (ImageView) findViewById(R.id.imageView45);

        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });

        prev = (TextView) findViewById(R.id.search_text_f);
        prev.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                vpPager.setCurrentItem(vpPager.getCurrentItem() - 1);
            }
        });

        next = (TextView) findViewById(R.id.search_text_a);
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                vpPager.setCurrentItem(vpPager.getCurrentItem() + 1);
            }
        });

        vpPager.setOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {

                if(vpPager.getCurrentItem() == 0){
                    prev.setVisibility(View.GONE);
                    next.setVisibility(View.VISIBLE);
                }
                else if(vpPager.getCurrentItem() == 1){
                    prev.setVisibility(View.VISIBLE);
                    next.setVisibility(View.VISIBLE);
                }
                else if(vpPager.getCurrentItem() == 2){
                    prev.setVisibility(View.VISIBLE);
                    next.setVisibility(View.VISIBLE);
                }
                else if(vpPager.getCurrentItem() == 3){
                    prev.setVisibility(View.VISIBLE);
                    next.setVisibility(View.VISIBLE);
                }
                else if(vpPager.getCurrentItem() == 4){
                    prev.setVisibility(View.VISIBLE);
                    next.setVisibility(View.VISIBLE);
                }
                else{
                    prev.setVisibility(View.VISIBLE);
                    next.setVisibility(View.GONE);
                }
            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });
    }
}
