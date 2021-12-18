package com.example.del.techclass.HowToList.RotateScreen;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

public class RotateAdapter extends FragmentStatePagerAdapter {
    private static int counts = 6;
    public RotateAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        if(position==0){
            return new Rotate();
        }
        else if(position==1){
            return new Rotate1();
        }
        else if(position==2){
            return new Rotate2();
        }
        else if(position==3){
            return new Rotate3();
        }
        else if(position==4){
            return new Rotate4();
        }
        else if(position==5){
            return new Rotate5();
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
