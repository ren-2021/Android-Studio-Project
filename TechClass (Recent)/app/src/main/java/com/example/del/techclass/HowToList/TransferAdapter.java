package com.example.del.techclass.HowToList;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

public class TransferAdapter extends FragmentStatePagerAdapter {

    private static int counts = 4;

    public TransferAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        if(position==0){
            return new TransferFragment1();
        }
        else if(position==1){
            return new TransferFragment2();
        }
        else if(position==2){
            return new TransferFragment3();
        }
        else if(position==3){
            return new TransferFragment4();
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
