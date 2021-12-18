package com.example.del.techclass.HowToList.Encrypt_Files;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

public class EncryptedAdapter extends FragmentStatePagerAdapter {
    private static int counts = 5;
    public EncryptedAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        if(position==0){
            return new EncryptFragment();
        }
        else if(position==1){
            return new EncryptFragment1();
        }
        else if(position==2){
            return new EncryptFragment2();
        }
        else if(position==3){
            return new EncryptFragment3();
        }
        else if(position==4){
            return new EncryptFragment4();
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
