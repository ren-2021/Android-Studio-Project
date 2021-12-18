package com.example.del.techclass;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.viewpager.widget.ViewPager;

import com.example.del.techclass.Data.ActivityFavorite;
import com.example.del.techclass.Data.ActivityRecent;
import com.example.del.techclass.Data.ActivitySetting;
import com.example.del.techclass.Fragments.FragmentForFirst;
import com.example.del.techclass.Fragments.FragmentForFour;
import com.example.del.techclass.Fragments.FragmentForSecond;
import com.example.del.techclass.Fragments.FragmentForThird;
import com.example.del.techclass.Fragments.MyPagerAdapter;
import com.google.android.material.navigation.NavigationView;
import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

    ViewPager vp;
    TabLayout tabLayout;
    private boolean isUserClickedBackButton = false;
    NavigationView navigationView = null;
    Toolbar toolbar = null;
    DrawerLayout drawer;
    ImageView imageView;
    TextView textView;
    MyPagerAdapter pagerAdapter;
    private int[] tabIcons = {
            R.drawable.ic_techhow,
            R.drawable.ic_techterms2,
            R.drawable.ic_techtips,
            R.drawable.ic_mindgames
    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        //toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        textView = (TextView) findViewById(R.id.searchtext);

        imageView = (ImageView)findViewById(R.id.imageView46);

        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                drawer.openDrawer(GravityCompat.START);
            }
        });

        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openSearchViewAcitivity();
            }
        });




        drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        //ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
        //this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        //drawer.setDrawerListener(toggle);
        //toggle.syncState();

        navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

        vp = (ViewPager) findViewById(R.id.Viewpager);

        tabLayout = (TabLayout) findViewById(R.id.my_Tab);
        tabLayout.setTabGravity(TabLayout.GRAVITY_FILL);
        tabLayout.setupWithViewPager(vp);

        ProgressBar simpleProgressBar = (ProgressBar) findViewById(R.id.simpleProgressBar);
        pagerAdapter = new MyPagerAdapter(getSupportFragmentManager(), this);
        pagerAdapter.addFragment(new FragmentForFirst(), "HowTo?", tabIcons[0]);
        pagerAdapter.addFragment(new FragmentForSecond(), "TechTerms", tabIcons[1]);
        pagerAdapter.addFragment(new FragmentForThird(), "TechTips", tabIcons[2]);
        pagerAdapter.addFragment(new FragmentForFour(), "MindGames", tabIcons[3]);

        vp.setAdapter(pagerAdapter);
        tabLayout.setupWithViewPager(vp);
        vp.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {
                highLightCurrentTab(position);
            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });

        highLightCurrentTab(0);





    }
    public void openSearchViewAcitivity(){
        Intent intent = new Intent(this, SearchViewActivity.class);
        startActivity(intent);
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        }
        if(!isUserClickedBackButton){
            Toast.makeText(this, "Press Back again to exit", Toast.LENGTH_LONG).show();
            isUserClickedBackButton = true;
        }
        else
        {
            super.onBackPressed();
        }
        new CountDownTimer(3000, 1000) {
            @Override
            public void onTick(long milliUntilFinished) {

            }

            @Override
            public void onFinish() {
                isUserClickedBackButton = false;
            }
        }.start();
    }

    private void highLightCurrentTab(int position){
        for(int i = 0; i < tabLayout.getTabCount(); i++){
            TabLayout.Tab tab = tabLayout.getTabAt(i);
            assert tab != null;
            tab.setCustomView(null);
            tab.setCustomView(pagerAdapter.getTabView(i));
        }

        TabLayout.Tab tab = tabLayout.getTabAt(position);
        assert tab != null;
        tab.setCustomView(null);
        tab.setCustomView(pagerAdapter.getSelectedTabView(position));
    }
        //tabOne.setCompoundDrawablesWithIntrinsicBounds(0, R.drawable.ic_techhow, 0, 0);




    //@Override
   // public boolean onCreateOptionsMenu(Menu menu) {
    //    MenuInflater inflater = getMenuInflater();
     //   inflater.inflate(R.menu.menu_main, menu);
    //    return super.onCreateOptionsMenu(menu);
   // }

    //@Override
    //public boolean onOptionsItemSelected(MenuItem item) {
       // switch (item.getItemId()){
         //   case R.id.Exit:
           //     AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
             //   builder.setMessage("Sure to exit TechClass?");
               // builder.setCancelable(true);
               // builder.setPositiveButton("YES", new DialogInterface.OnClickListener() {
                 //   @Override
                   // public void onClick(DialogInterface dialog, int which) {
                    //    finish();
                    //    Toast.makeText(MainActivity.this, "Exit", Toast.LENGTH_SHORT).show();
                   // }
               // });
               // builder.setNegativeButton("NO", new DialogInterface.OnClickListener() {
                 //   @Override
                   // public void onClick(DialogInterface dialog, int which) {
                    //    dialog.cancel();
                    //}
                //});
                //AlertDialog alertDialog = builder.create();
                //alertDialog.show();
           // default:
             //   return super.onOptionsItemSelected(item);
       // }
   // }


    public boolean onNavigationItemSelected(MenuItem item) {


        int id = item.getItemId();
        if (id == R.id.nav_home) {

        } if (id == R.id.nav_recent) {
            Intent intent = new Intent(this, ActivityRecent.class);
            startActivity(intent);
        }if (id == R.id.nav_favorite) {
            Intent intent = new Intent(this, ActivityFavorite.class);
            startActivity(intent);
        }if (id == R.id.nav_manage) {
            Intent intent = new Intent(this, ActivitySetting.class);
            startActivity(intent);
        }
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
