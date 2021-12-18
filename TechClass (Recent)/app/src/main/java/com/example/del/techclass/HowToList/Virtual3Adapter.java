package com.example.del.techclass.HowToList;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

public class Virtual3Adapter extends FragmentStatePagerAdapter {

    private static int counts = 2;
    public Virtual3Adapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        if(position==0){
            return new Virtual3Fragment1();
        }
        else if(position==1){
            return new Virtual3Fragment2();
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
