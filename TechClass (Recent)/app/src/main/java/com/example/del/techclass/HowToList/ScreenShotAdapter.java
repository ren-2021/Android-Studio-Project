package com.example.del.techclass.HowToList;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

public class ScreenShotAdapter extends FragmentStatePagerAdapter {

    private static int Screen_Pages = 2;
    public ScreenShotAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new ScreenShotFragment();
        } else if (position == 1) {
            return new ScreenShotFragment1();
        }
        else{
            return null;
        }
    }

    @Override
    public int getCount() {
        return Screen_Pages;
    }
}
