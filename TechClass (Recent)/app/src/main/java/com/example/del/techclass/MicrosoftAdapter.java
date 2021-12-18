package com.example.del.techclass;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

import com.example.del.techclass.HowToList.PasswordFragment1;
import com.example.del.techclass.HowToList.PasswordFragment2;

public class MicrosoftAdapter extends FragmentStatePagerAdapter {
    private static int Adapternum = 2;

    public MicrosoftAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        if(position==0){
            return new PasswordFragment1();
        }
        else if(position==1){
            return new PasswordFragment2();
        }
        else{
            return null;
        }
    }

    @Override
    public int getCount() {
        return Adapternum;
    }
}
