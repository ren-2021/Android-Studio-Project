package com.example.del.techclass.HowToList.RidofVirus;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

public class VirusAdapter extends FragmentStatePagerAdapter {
    private static int counts = 9;
    public VirusAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        if(position==0){
            return new VirusFragment();
        }
        else if(position==1){
            return new VirusFragment1();
        }
        else if(position==2){
            return new VirusFragment2();
        }
        else if(position==3){
            return new VirusFragment3();
        }
        else if(position==4){
            return new VirusFragment4();
        }
        else if(position==5){
            return new VirusFragment5();
        }
        else if(position==6){
            return new VirusFragment6();
        }
        else if(position==7){
            return new VirusFragment7();
        }
        else if(position==8){
            return new VirusFragment8();
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
