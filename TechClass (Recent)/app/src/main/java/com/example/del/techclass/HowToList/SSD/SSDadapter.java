package com.example.del.techclass.HowToList.SSD;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

public class SSDadapter extends FragmentStatePagerAdapter {

    private static int counts = 5;
    public SSDadapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        if(position==0){
            return new SSDFragment();
        }
        else if(position==1){
            return new SSDFragment1();
        }
        else if(position==2){
            return new SSDFragment2();
        }
        else if(position==3){
            return new SSDFragment3();
        }
        else if(position==4){
            return new SSDFragment4();
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
