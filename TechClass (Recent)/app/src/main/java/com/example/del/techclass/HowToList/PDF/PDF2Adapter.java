package com.example.del.techclass.HowToList.PDF;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

public class PDF2Adapter extends FragmentStatePagerAdapter {
    private static int counts = 3;
    public PDF2Adapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        if(position==0){
            return new PDF2_A();
        }
        else if(position==1){
            return new PDF2_B();
        }
        else if(position==2){
            return new PDF2_C();
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
