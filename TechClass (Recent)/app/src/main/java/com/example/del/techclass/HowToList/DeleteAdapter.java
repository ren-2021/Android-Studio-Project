package com.example.del.techclass.HowToList;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

public class DeleteAdapter extends FragmentStatePagerAdapter {

    private static int counts = 6;

    public DeleteAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        if(position==0){
            return new DeleteFragment1();
        }
        else if(position==1){
            return new DeleteFragment2();
        }
        else if(position==2){
            return new DeleteFragment3();
        }
        else if(position==3){
            return new DeleteFragment4();
        }
        else if(position==4){
            return new DeleteFragment5();
        }
        else if(position==5){
            return new DeleteFragment6();
        }
        return null;
    }

    @Override
    public int getCount() {
        return counts;
    }
}
