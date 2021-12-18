package com.example.del.techclass.HowToList;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

public class LaptopToAdapter extends FragmentStatePagerAdapter {

    public static int counts = 7;

    public LaptopToAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        if(position==0){
            return new LaptopFragment1();
        }
        else if(position==1){
            return new LaptopFragment2();
        }
        else if(position==2){
            return new LaptopFragment3();
        }
        else if(position==3){
            return new LaptopFragment4();
        }
        else if(position==4){
            return new LaptopFragment5();
        }
        else if(position==5){
            return new LaptopFragment6();
        }
        else if(position==6){
            return new LaptopFragment7();
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
