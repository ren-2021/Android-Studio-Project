package com.example.del.techclass.HowToList.DownloadMovies;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

public class UtorrentAdapter extends FragmentStatePagerAdapter {
    private static int counts = 7;
    public UtorrentAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        if(position==0){
            return new Utorrent1();
        }
        else if(position==1){
            return new Utorrent2();
        }
        else if(position==2){
            return new Utorrent3();
        }
        else if(position==3){
            return new Utorrent4();
        }
        else if(position==4){
            return new Utorrent5();
        }
        else if(position==5){
            return new Utorrent6();
        }
        else if(position==6){
            return new Utorrent7();
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
