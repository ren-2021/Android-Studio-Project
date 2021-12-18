package com.example.del.techclass.HowToList.Uninstall_Program;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

public class UninstallAdapter extends FragmentStatePagerAdapter {
    private static int counts = 6;
    public UninstallAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        if(position==0){
            return new UninstallFragment1();
        }
        else if(position==1){
            return new UninstallFragment2();
        }
        else if(position==2){
            return new UninstallFragment3();
        }
        else if(position==3){
            return new UninstallFragment4();
        }
        else if(position==4){
            return new UninstallFragment5();
        }
        else if(position==5){
            return new UninstallFragment6();
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
