package com.example.del.techclass.HowToList;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

public class TVAdapter extends FragmentStatePagerAdapter {

    private static int counts = 8;
    public TVAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        if(position==0){
            return new TVFragment1();
        }
        else if(position==1){
            return new TVFragment2();
        }
        else if(position==2){
            return new TVFragment3();
        }
        else if(position==3){
            return new TVFragment4();
        }
        else if(position==4){
            return new TVFragment5();
        }
        else if(position==5){
            return new TVFragment6();
        }
        else if(position==6){
            return new TVFragment7();
        }
        else if(position==7){
            return new TVFragment8();
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
