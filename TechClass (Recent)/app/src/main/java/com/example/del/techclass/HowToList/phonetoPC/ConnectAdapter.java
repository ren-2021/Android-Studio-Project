package com.example.del.techclass.HowToList.phonetoPC;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

public class ConnectAdapter extends FragmentStatePagerAdapter {
    private static int counts = 4;
    public ConnectAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        if(position==0){
            return new ConnectPhone1();
        }
        else if(position==1){
            return new ConnectPhone2();
        }
        else if(position==2){
            return new ConnectPhone3();
        }
        else if(position==3){
            return new ConnectPhone4();
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
