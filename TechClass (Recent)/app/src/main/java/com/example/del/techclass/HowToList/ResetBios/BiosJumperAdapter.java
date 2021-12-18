package com.example.del.techclass.HowToList.ResetBios;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

public class BiosJumperAdapter extends FragmentStatePagerAdapter {
    private static int counts = 7;
    public BiosJumperAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        if(position==0){
            return new BiosJumper1();
        }
        else if(position==1){
            return new BiosJumper2();
        }
        else if(position==2){
            return new BiosJumper3();
        }
        else if(position==3){
            return new BiosJumper4();
        }
        else if(position==4){
            return new BiosJumper5();
        }
        else if(position==5){
            return new BiosJumper6();
        }
        else if(position==6){
            return new BiosJumper7();
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
