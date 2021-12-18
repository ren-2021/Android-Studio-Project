package com.example.del.techclass;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

public class VpnAdapter extends FragmentStatePagerAdapter {

    private static int Win_Pages = 4;

    public VpnAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        if(position==0){
            return new VpnFragment1();
        }
        else if(position==1){
            return new VpnFragment2();
        }
        else if(position==2){
            return new VpnFragment3();
        }
        else if(position==3){
            return new VpnFragment4();
        }
        else{
            return null;
        }

    }

    @Override
    public int getCount() {
        return Win_Pages;
    }
}
