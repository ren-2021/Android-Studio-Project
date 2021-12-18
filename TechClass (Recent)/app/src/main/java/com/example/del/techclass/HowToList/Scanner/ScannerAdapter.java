package com.example.del.techclass.HowToList.Scanner;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

public class ScannerAdapter extends FragmentStatePagerAdapter {
    private static int counts = 8;
    public ScannerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        if(position==0){
            return new ScannerA();
        }
        else if(position==1){
            return new ScannerB();
        }
        else if(position==2){
            return new ScannerC();
        }
        else if(position==3){
            return new ScannerD();
        }
        else if(position==4){
            return new ScannerE();
        }
        else if(position==5){
            return new ScannerF();
        }
        else if(position==6){
            return new ScannerG();
        }
        else if(position==7){
            return new ScannerH();
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
