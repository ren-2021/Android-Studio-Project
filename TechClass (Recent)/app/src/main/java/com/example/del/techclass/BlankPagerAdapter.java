package com.example.del.techclass;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

public class BlankPagerAdapter extends FragmentStatePagerAdapter{


    private static int NUM_ITEMS = 11;

    public BlankPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int i) {
        switch (i) {
            case 0: // Fragment # 0 - This will show FirstFragment
                return FragmentA.newInstance(0, "How To Assemble A Computer Unit");
            case 1: // Fragment # 0 - This will show FirstFragment different title
                return FragmentB.newInstance(1, "Page # 2");
            case 2: // Fragment # 1 - This will show SecondFragment
                return FragmentC.newInstance(2, "Page # 3");
            case 3: // Fragment # 1 - This will show SecondFragment
                return FragmentD.newInstance(3, "Page # 4");
            case 4: // Fragment # 1 - This will show SecondFragment
                return FragmentE.newInstance(4, "Page # 5");
            case 5: // Fragment # 1 - This will show SecondFragment
                return FragmentF.newInstance(5, "Page # 6");
            case 6: // Fragment # 1 - This will show SecondFragment
                return FragmentG.newInstance(6, "Page # 7");
            case 7: // Fragment # 1 - This will show SecondFragment
                return FragmentI.newInstance(7, "Page # 8");
            case 8: // Fragment # 1 - This will show SecondFragment
                return FragmentJ.newInstance(8, "Page # 9");
            case 9: // Fragment # 1 - This will show SecondFragment
                return FragmentK.newInstance(9, "Page # 10");
            case 10: // Fragment # 1 - This will show SecondFragment
                return FragmentM.newInstance(10, "Page # 11");
            default:
                return null;
        }
    }


    @Override
    public int getCount() {
        return NUM_ITEMS;
    }
}
