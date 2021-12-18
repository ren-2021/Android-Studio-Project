package com.example.del.techclass.HowToList.ResetBios;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

public class BiosMenuAdapter extends FragmentStatePagerAdapter {
    private static int counts = 5;
    public BiosMenuAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        if(position==0){
            return new BiosMenu1();
        }
        else if(position==1){
            return new BiosMenu2();
        }
        else if(position==2){
            return new BiosMenu3();
        }
        else if(position==3){
            return new BiosMenu4();
        }
        else if(position==4){
            return new BiosMenu5();
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
