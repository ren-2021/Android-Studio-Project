package com.example.del.techclass.HowToList.Screen;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

public class ScreenAdapter extends FragmentStatePagerAdapter {
    private static int counts = 6;
    public ScreenAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        if(position==0){
            return new ScreenFragment();
        }
        else if(position==1){
            return new ScreenFragment1();
        }
        else if(position==2){
            return new ScreenFragment2();
        }
        else if(position==3){
            return new ScreenFragment3();
        }
        else if(position==4){
            return new ScreenFragment4();
        }
        else if(position==5){
            return new ScreenFragment5();
        }
        else {
            return null;
        }
    }

    @Override
    public int getCount() {
        return counts;
    }
}
