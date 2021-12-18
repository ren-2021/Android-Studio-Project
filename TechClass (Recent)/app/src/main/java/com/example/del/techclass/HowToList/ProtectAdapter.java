package com.example.del.techclass.HowToList;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

public class ProtectAdapter extends FragmentStatePagerAdapter {
    private static int counts = 8;
    public ProtectAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        if(position==0){
            return new ProtectFragment1();
        }
        else if(position==1){
            return new ProtectFragment2();
        }
        else if(position==2){
            return new ProtectFragment3();
        }
        else if(position==3){
            return new ProtectFragment4();
        }
        else if(position==4){
            return new ProtectFragment5();
        }
        else if(position==5){
            return new ProtectFragment6();
        }
        else if(position==6){
            return new ProtectFragment7();
        }
        else if(position==7){
            return new ProtectFragment8();
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
