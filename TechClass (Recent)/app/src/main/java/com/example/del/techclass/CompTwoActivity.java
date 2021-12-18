/*Copyright 2016 Tommy Buonomo

        Licensed under the Apache License, Version 2.0 (the "License");
        you may not use this file except in compliance with the License.
        You may obtain a copy of the License at

        http://www.apache.org/licenses/LICENSE-2.0

        Unless required by applicable law or agreed to in writing, software
        distributed under the License is distributed on an "AS IS" BASIS,
        WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        See the License for the specific language governing permissions and
        limitations under the License.*/

package com.example.del.techclass;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import androidx.annotation.NonNull;
import com.google.android.material.navigation.NavigationView;
import com.google.android.material.tabs.TabLayout;

import androidx.core.app.NavUtils;
import androidx.core.view.GravityCompat;
import androidx.viewpager.widget.ViewPager;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SearchView;
import androidx.appcompat.widget.Toolbar;

import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.del.techclass.Data.ActivityFavorite;
import com.example.del.techclass.Data.ActivityRecent;
import com.example.del.techclass.Data.ActivitySetting;

public class CompTwoActivity extends AppCompatActivity {

    BlankPagerAdapter adapter;
    ViewPager vpPager;
    ImageView imageView;
    TextView prev, next;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_comp_two);

        vpPager = (ViewPager) findViewById(R.id.vpPager2);
        adapter = new BlankPagerAdapter(getSupportFragmentManager());
        vpPager.setAdapter(adapter);
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
                else if(vpPager.getCurrentItem() == 5){
                    prev.setVisibility(View.VISIBLE);
                    next.setVisibility(View.VISIBLE);
                }
                else if(vpPager.getCurrentItem() == 6){
                    prev.setVisibility(View.VISIBLE);
                    next.setVisibility(View.VISIBLE);
                }
                else if(vpPager.getCurrentItem() == 7){
                    prev.setVisibility(View.VISIBLE);
                    next.setVisibility(View.VISIBLE);
                }
                else if(vpPager.getCurrentItem() == 8){
                    prev.setVisibility(View.VISIBLE);
                    next.setVisibility(View.VISIBLE);
                }
                else if(vpPager.getCurrentItem() == 9){
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
