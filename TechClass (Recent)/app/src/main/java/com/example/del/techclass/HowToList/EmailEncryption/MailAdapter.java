package com.example.del.techclass.HowToList.EmailEncryption;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

public class MailAdapter extends FragmentStatePagerAdapter {
    private static int counts = 4;
    public MailAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        if(position==0){
            return new MailFragment();
        }
        else if(position==1){
            return new MailFragment1();
        }
        else if(position==2){
            return new MailFragment2();
        }
        else if(position==3){
            return new MailFragment3();
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
