package com.example.del.techclass.HowToList.CleanComputer;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

public class CleanAdapter extends FragmentStatePagerAdapter {
    private static int counts = 8;
    public CleanAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        if(position==0){
            return new CleanFragment();
        }
        else if(position==1){
            return new CleanFragment1();
        }
        else if(position==2){
            return new CleanFragment2();
        }
        else if(position==3){
            return new CleanFragment3();
        }
        else if(position==4){
            return new CleanFragment4();
        }
        else if(position==5){
            return new CleanFragment5();
        }
        else if(position==6){
            return new CleanFragment6();
        }
        else if(position==7){
            return new CleanFragment7();
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
