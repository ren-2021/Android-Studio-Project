package com.example.del.techclass.HowToList.PDF;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

public class PDF3Adapter extends FragmentStatePagerAdapter {
    private static int counts = 7;
    public PDF3Adapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        if(position==0){
            return new PDF3_A();
        }
        else if(position==1){
            return new PDF3_B();
        }
        else if(position==2){
            return new PDF3_C();
        }
        else if(position==3){
            return new PDF3_D();
        }
        else if(position==4){
            return new PDF3_E();
        }
        else if(position==5){
            return new PDF3_F();
        }
        else if(position==6){
            return new PDF3_G();
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
