package com.example.del.techclass.HowToList;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

public class SafeAdapter extends FragmentStatePagerAdapter {

    private static int counts = 5;
    public SafeAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        if(position==0){
            return new SafeFragment1();
        }
        else if(position==1){
            return new SafeFragment2();
        }
        else if(position==2){
            return new SafeFragment3();
        }
        else if(position==3){
            return new SafeFragment4();
        }
        else if(position==4){
            return new SafeFragment5();
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
