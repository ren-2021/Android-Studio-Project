package com.example.del.techclass.HowToList.FaxMachine;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

public class Fax1Adapter extends FragmentStatePagerAdapter {

    private static int counts = 8;
    public Fax1Adapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new F1Fragment1();
        }
        else if(position==1){
            return new F1Fragment2();
        }
        else if(position==2){
            return new F1Fragment3();
        }
        else if(position==3){
            return new F1Fragment4();
        }
        else if(position==4){
            return new F1Fragment5();
        }
        else if(position==5){
            return new F1Fragment6();
        }
        else if(position==6){
            return new F1Fragment7();
        }
        else if(position==7){
            return new F1Fragment8();
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
