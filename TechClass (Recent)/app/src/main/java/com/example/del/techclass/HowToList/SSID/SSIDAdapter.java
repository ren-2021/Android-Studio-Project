package com.example.del.techclass.HowToList.SSID;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

public class SSIDAdapter extends FragmentStatePagerAdapter {
    private static int counts = 7;
    public SSIDAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        if(position==0){
            return new SSIDFragment();
        }
        else if(position==1){
            return new SSIDFragment1();
        }
        else if(position==2){
            return new SSIDFragment2();
        }
        else if(position==3){
            return new SSIDFragment3();
        }
        else if(position==4){
            return new SSIDFragment4();
        }
        else if(position==5){
            return new SSIDFragment5();
        }
        else if(position==6){
            return new SSIDFragment6();
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
