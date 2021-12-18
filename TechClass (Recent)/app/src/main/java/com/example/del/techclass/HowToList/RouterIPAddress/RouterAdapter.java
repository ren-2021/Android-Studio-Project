package com.example.del.techclass.HowToList.RouterIPAddress;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

public class RouterAdapter extends FragmentStatePagerAdapter {
    private static int count = 7;
    public RouterAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        if(position==0){
            return new Address();
        }
        else if(position==1){
            return new Address1();
        }
        else if(position==2){
            return new Address2();
        }
        else if(position==3){
            return new Address3();
        }
        else if(position==4){
            return new Address4();
        }
        else if(position==5){
            return new Address5();
        }
        else if(position==6){
            return new Address6();
        }
        else{
            return null;
        }
    }

    @Override
    public int getCount() {
        return count;
    }
}
