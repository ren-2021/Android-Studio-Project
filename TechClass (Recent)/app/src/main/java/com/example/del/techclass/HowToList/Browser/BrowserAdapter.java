package com.example.del.techclass.HowToList.Browser;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

public class BrowserAdapter extends FragmentStatePagerAdapter {
    private static int counts = 4;
    public BrowserAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        if(position==0){
            return new BrowserFragment();
        }
        else if(position==1){
            return new BrowserFragment1();
        }
        else if(position==2){
            return new BrowserFragment2();
        }
        else if(position==3){
            return new BrowserFragment3();
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
