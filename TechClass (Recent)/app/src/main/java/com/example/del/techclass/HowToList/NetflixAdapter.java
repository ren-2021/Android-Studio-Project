package com.example.del.techclass.HowToList;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

public class NetflixAdapter extends FragmentStatePagerAdapter { private static int counts = 6;
    public NetflixAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        if(position==0){
return new NetflixFragment1();}else if(position==1){
return new NetflixFragment2();}else if(position==2){
return new NetflixFragment3();}else if(position==3){
return new NetfliixFragment4();}else if(position==4){
return new NetflixFragment5();}else if(position==5){
return new NetflixFragment6();}else{return null;}}

    @Override
    public int getCount() {
        return counts;
    }
}
