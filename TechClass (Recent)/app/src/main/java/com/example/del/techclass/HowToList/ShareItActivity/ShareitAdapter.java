package com.example.del.techclass.HowToList.ShareItActivity;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

public class ShareitAdapter extends FragmentStatePagerAdapter {
    private static int counts = 6;
    public ShareitAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        if(position==0){
            return new ShareitFragment1();
        }
        else if(position==1){
            return new ShareitFragment2();
        }
        else if(position==2){
            return new ShareitFragment3();
        }
        else if(position==3){
            return new ShareitFragment4();
        }
        else if(position==4){
            return new ShareitFragment5();
        }
        else if(position==5){
            return new ShareitFragment6();
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
