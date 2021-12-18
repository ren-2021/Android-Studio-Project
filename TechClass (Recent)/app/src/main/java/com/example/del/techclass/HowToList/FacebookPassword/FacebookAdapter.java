package com.example.del.techclass.HowToList.FacebookPassword;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

public class FacebookAdapter extends FragmentStatePagerAdapter {
    private static int counts = 5;
    public FacebookAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        if(position==0){
            return new FacebookFragment1();
        }
        else if(position==1){
            return new FacebookFragment2();
        }
        else if(position==2){
            return new FacebookFragment3();
        }
        else if(position==3){
            return new FacebookFragment4();
        }
        else if(position==4){
            return new FacebookFragment5();
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
