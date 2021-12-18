package com.example.del.techclass.HowToList.RAM;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

public class RamAdapter extends FragmentStatePagerAdapter {
    private static int counts = 4;
    public RamAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        if(position==0){
            return new RamFragment1();
        }
        else if(position==1){
            return new RamFragment2();
        }
        else if(position==2){
            return new RamFragment3();
        }
        else if(position==3){
            return new RamFragment4();
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
