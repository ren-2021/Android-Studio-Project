package com.example.del.techclass.HowToList.DownloadMovies;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

public class DirectAdapter extends FragmentStatePagerAdapter {
    private static int counts = 5;
    public DirectAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        if(position==0){
            return new Direct1();
        }
        else if(position==1) {
            return new Direct2();
        }
        else if(position==2){
            return new Direct3();
        }
        else if(position==3){
            return new Direct4();
        }
        else if(position==4){
            return new Direct5();
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
