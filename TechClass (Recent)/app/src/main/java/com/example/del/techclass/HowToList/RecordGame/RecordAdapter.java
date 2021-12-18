package com.example.del.techclass.HowToList.RecordGame;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

public class RecordAdapter extends FragmentStatePagerAdapter {
    private static int counts = 4;
    public RecordAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        if(position==0){
            return new RecordFragment1();
        }
        else if(position==1){
            return new RecordFragment2();
        }
        else if(position==2){
            return new RecordFragment3();
        }
        else if(position==3){
            return new RecordFragment4();
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
