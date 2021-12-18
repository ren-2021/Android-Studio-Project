package com.example.del.techclass.HowToList.Webcam;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

public class WebcamAdapter extends FragmentStatePagerAdapter {
    private static int counts = 6;
    public WebcamAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        if(position==0){
            return new WebcamFragment();
        }
        else if(position==1){
            return new WebcamFragment1();
        }
        else if(position==2){
            return new WebcamFragment2();
        }
        else if(position==3){
            return new WebcamFragment3();
        }
        else if(position==4){
            return new WebcamFragment4();
        }
        else if(position==5){
            return new WebcamFragment5();
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
