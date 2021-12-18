package com.example.del.techclass;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

public class WindowsAdapter extends FragmentStatePagerAdapter {

    private static int Win_Pages = 18;

    public WindowsAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        if(position==0){
            return new WindowsFragment();
        }
        else if(position==1){
            return new WindowsFragment2();
        }
        else if(position==2){
            return new WindowsFragment3();
        }
        else if(position==3){
            return new WindowsFragment4();
        }
        else if(position==4){
            return new WindowsFragment5();
        }
        else if(position==5){
            return new WindowsFragment6();
        }
        else if(position==6){
            return new WindowsFragment7();
        }
        else if(position==7){
            return new WindowsFragment8();
        }
        else if(position==8){
            return new WindowsFragment9();
        }
        else if(position==9){
            return new WindowsFragment10();
        }
        else if(position==10){
            return new WindowsFragment11();
        }
        else if(position==11){
            return new WindowsFragment12();
        }
        else if(position==12){
            return new WindowsFragment13();
        }
        else if(position==13){
            return new WindowsFragment14();
        }
        else if(position==14){
            return new WindowsFragment15();
        }
        else if(position==15){
            return new WindowsFragment16();
        }
        else if(position==16){
            return new WindowsFragment17();
        }
        else if(position==17){
            return new WindowsFragment18();
        }
        else{return null;}

    }

    @Override
    public int getCount() {
        return Win_Pages;
    }
}
