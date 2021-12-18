package com.example.del.techclass.HowToList.LoginInformation;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

public class LoginAdapter extends FragmentStatePagerAdapter {
    private static int counts = 7;
    public LoginAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        if(position==0){
            return new LoginFragment();
        }
        else if(position==1){
            return new LoginFragment1();
        }
        else if(position==2){
            return new LoginFragment2();
        }
        else if(position==3){
            return new LoginFragment3();
        }
        else if(position==4){
            return new LoginFragment4();
        }
        else if(position==5){
            return new LoginFragment5();
        }
        else if(position==6){
            return new LoginFragment6();
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
