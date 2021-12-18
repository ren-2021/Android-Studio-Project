package com.example.del.techclass.HowToList;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

public class BootAdapter extends FragmentStatePagerAdapter {

    private static int counts = 6;
    public BootAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        if(position==0){
            return new BootFragment1();
        }
        else if(position==1){
            return new BootFragment2();
        }
        else if(position==2){
            return new BootFragment3();
        }
        else if(position==3){
            return new BootFragment4();
        }
        else if(position==4){
            return new BootFragment5();
        }
        else if(position==5){
            return new BootFragment6();
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
