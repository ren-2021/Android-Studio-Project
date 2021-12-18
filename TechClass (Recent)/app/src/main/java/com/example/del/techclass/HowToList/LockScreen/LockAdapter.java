package com.example.del.techclass.HowToList.LockScreen;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class LockAdapter extends FragmentPagerAdapter {
    private static int counts = 2;
    public LockAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        if(position==0){
            return new LockFragment();
        }
        else if(position==1){
            return new LockFragment1();
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
