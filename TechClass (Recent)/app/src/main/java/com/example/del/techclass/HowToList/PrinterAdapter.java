package com.example.del.techclass.HowToList;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

public class PrinterAdapter extends FragmentStatePagerAdapter {
    private static int Screen_Pages = 2;
    public PrinterAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new PrinterFragment1();
        } else if (position == 1) {
            return new PrinterFragment2();
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
