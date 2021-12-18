package com.example.del.techclass.HowToList.USBDevice;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

public class UsbAdapter extends FragmentStatePagerAdapter {
    private static int counts = 5;
    public UsbAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        if(position==0){
            return new UsbFragment1();
        }
        else if(position==1){
            return new UsbFragment2();
        }
        else if(position==2){
            return new UsbFragment3();
        }
        else if(position==3){
            return new UsbFragment4();
        }
        else if(position==4){
            return new UsbFragment5();
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
