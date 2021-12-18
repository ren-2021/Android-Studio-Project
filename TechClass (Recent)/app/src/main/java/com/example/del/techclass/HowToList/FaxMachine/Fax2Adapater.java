package com.example.del.techclass.HowToList.FaxMachine;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

public class Fax2Adapater extends FragmentStatePagerAdapter {
    private static int counts = 7;
    public Fax2Adapater(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        if(position==0){
            return new F2Fragment1();
        }
        else if(position==1){
            return new F2Fragment2();
        }
        else if(position==2){
            return new F2Fragment3();
        }
        else if(position==3){
            return new F2Fragment4();
        }
        else if(position==4){
            return new F2Fragment5();
        }
        else if(position==5){
            return new F2Fragment6();
        }
        else if(position==6){
            return new F2Fragment7();
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
