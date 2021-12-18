package com.example.del.techclass.HowToList;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

public class VirtualDesktopAdapter extends FragmentStatePagerAdapter {

    private static int counts = 2;

    public VirtualDesktopAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        if(position == 0){
            return new VirtualDesktopFragment1();
        }
        else if(position == 1){
            return new VirtualDesktopFragment2();
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
