package com.example.del.techclass.HowToList.Brightness;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

public class BrightAdapter extends FragmentStatePagerAdapter {
    private static int counts = 4;
    public BrightAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        if(position==0){
            return new BrightFragment();
        }
        else if(position==1){
            return new BrightFragment1();
        }
        else if(position==2){
            return new BrightFragment2();
        }
        else if(position==3){
            return new BrightFragment3();
        }
        else{
            return null;
        }
    }

    @Override
    public int getCount() {
        return counts;
    }
}
