package com.example.del.techclass.HowToList.Browser;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.del.techclass.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class BrowserFragment extends Fragment {


    public BrowserFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_browser, container, false);
    }

}
