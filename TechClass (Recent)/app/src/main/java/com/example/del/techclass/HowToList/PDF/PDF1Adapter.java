package com.example.del.techclass.HowToList.PDF;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

public class PDF1Adapter extends FragmentStatePagerAdapter {
    private static int counts = 4;
    public PDF1Adapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        if(position==0){
            return new PDF1_A();
        }
        else if(position==1){
            return new PDF1_B();
        }
        else if(position==2){
            return new PDF_C();
        }
        else if(position==3){
            return new PDF1_D();
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
