package com.example.del.techclass.HowToList.Router;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

public class RouterAdapter extends FragmentStatePagerAdapter {
    private static int counts = 6;
    public RouterAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        if(position==0){
            return new Router();
        }
        else if(position==1){
            return new Router1();
        }
        else if(position==2){
            return new Router2();
        }
        else if(position==3){
            return new Router3();
        }
        else if(position==4){
            return new Router4();
        }
        else if(position==5){
            return new Router5();
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
