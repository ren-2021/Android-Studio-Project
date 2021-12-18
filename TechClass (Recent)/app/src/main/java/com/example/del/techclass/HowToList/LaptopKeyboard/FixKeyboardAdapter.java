package com.example.del.techclass.HowToList.LaptopKeyboard;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

public class FixKeyboardAdapter extends FragmentStatePagerAdapter {
    private static int counts = 6;
    public FixKeyboardAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        if(position==0){
            return new FixKeyboard1();
        }
        else if(position==1){
            return new FixKeyboard2();
        }
        else if(position==2){
            return new FixKeyboard3();
        }
        else if(position==3){
            return new FixKeyboard4();
        }
        else if(position==4){
            return new FixKeyboard5();
        }
        else if(position==5){
            return new FixKeyboard6();
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
