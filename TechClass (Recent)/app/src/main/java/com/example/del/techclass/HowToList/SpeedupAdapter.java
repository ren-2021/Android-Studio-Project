package com.example.del.techclass.HowToList;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

public class SpeedupAdapter extends FragmentStatePagerAdapter {

    private static int Speedup_Pages = 10;
    public SpeedupAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
            if(position==0){
                return new SpeedupFragment();
            }
            else if(position==1){
                return new SpeedupFragment1();
            }
            else if(position==2){
                return new SpeedupFragment3();
            }
            else if(position==3){
                return new SpeedupFragment4();
            }
            else if(position==4){
                return new SpeedupFragment5();
            }
            else if(position==5){
                return new SpeedupFragment6();
            }
            else if(position==6){
                return new SpeedupFragment7();
            }
            else if(position==7){
                return new SpeedupFragment8();
            }
            else if(position==8){
                return new SpeedupFragment9();
            }
            else if(position==9){
                return new SpeedupFragment10();
            }
            else{
                return null;
            }
    }

    @Override
    public int getCount() {
        return Speedup_Pages;
    }
}
