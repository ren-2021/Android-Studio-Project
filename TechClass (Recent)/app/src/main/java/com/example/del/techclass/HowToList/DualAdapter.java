package com.example.del.techclass.HowToList;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

public class DualAdapter extends FragmentStatePagerAdapter {

    private static int counts = 2;
    public DualAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        if(position==0){
            return new DualFragment1();
        }
        else if(position==1){
            return new DualFragment2();
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
