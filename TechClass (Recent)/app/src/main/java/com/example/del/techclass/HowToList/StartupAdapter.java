package com.example.del.techclass.HowToList;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

public class StartupAdapter extends FragmentStatePagerAdapter {
    private static int numStartup = 2;
    public StartupAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        if(position == 0){
            return new StartupFragment1();
        }
        else if(position == 1){
            return new StartupFragment2();
        }
        else {
            return null;
        }
    }

    @Override
    public int getCount() {
        return numStartup;
    }
}
