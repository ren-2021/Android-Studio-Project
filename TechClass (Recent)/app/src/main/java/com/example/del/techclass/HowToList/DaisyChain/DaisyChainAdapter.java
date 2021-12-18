package com.example.del.techclass.HowToList.DaisyChain;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

public class DaisyChainAdapter extends FragmentStatePagerAdapter {
    private static int counts = 6;
    public DaisyChainAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        if(position==0){
            return new DaisyChain();
        }
        else if(position==1){
            return new DaisyChain1();
        }
        else if(position==2){
            return new DaisyChain2();
        }
        else if(position==3){
            return new DaisyChain3();
        }
        else if(position==4){
            return new DaisyChain4();
        }
        else if(position==5){
            return new DaisyChain5();
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
