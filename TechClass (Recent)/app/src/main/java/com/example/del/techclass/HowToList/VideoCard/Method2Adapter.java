package com.example.del.techclass.HowToList.VideoCard;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

public class Method2Adapter extends FragmentStatePagerAdapter {

    private static int counts = 4;
    public Method2Adapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        if(position==0){
            return new MFragment1();
        }
        else if(position==1){
            return new MFragment2();
        }
        else if(position==2){
            return new MFragment3();
        }
        else if(position==3){
            return new MFragment4();
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
