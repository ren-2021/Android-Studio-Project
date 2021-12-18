package com.example.del.techclass.Fragments;

import android.os.Bundle;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.del.techclass.R;

/**
 * Created by Del on 2/12/2017.
 */

public class FragmentForFour extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fragment_four, container, false);

        return rootView;
    }


    //  @Override
    //  public String toString() {
    //    return "MIND GAMES";
    // }
}
