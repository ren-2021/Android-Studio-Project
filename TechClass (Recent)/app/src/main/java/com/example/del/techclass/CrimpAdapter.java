package com.example.del.techclass;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

public class CrimpAdapter extends FragmentStatePagerAdapter {

    private static int NUM_Items = 9;

    public CrimpAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        if(position==0){
            CrimpFragment1 crimp1 = new CrimpFragment1();
            return crimp1;
        }
        else if(position==1){
            CrimpFragment2 crimp2 = new CrimpFragment2();
            return crimp2;
        }
        else if(position==2){
            CrimpFragment3 crimp3 = new CrimpFragment3();
            return crimp3;
        }
        else if(position==3){
            CrimpFragment4 crimp4 = new CrimpFragment4();
            return crimp4;
        }
        else if(position==4){
            CrimpFragment5 crimp5 = new CrimpFragment5();
            return crimp5;
        }
        else if(position==5){
            CrimpFragment6 crimp6 = new CrimpFragment6();
            return crimp6;
        }
        else if(position==6){
            CrimpFragment7 crimp7 = new CrimpFragment7();
            return crimp7;
        }
        else if(position==7){
            CrimpFragment8 crimp8 = new CrimpFragment8();
            return crimp8;
        }
        else if(position==8){
            CrimpFragment9 crimp9 = new CrimpFragment9();
            return crimp9;
        }
        else {
            return null;
        }
    }

    @Override
    public int getCount() {
        return NUM_Items;
    }
}
