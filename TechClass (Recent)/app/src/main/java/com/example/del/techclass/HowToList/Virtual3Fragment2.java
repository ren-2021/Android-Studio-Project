package com.example.del.techclass.HowToList;


import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.example.del.techclass.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class Virtual3Fragment2 extends Fragment {

    TextView buttonone, buttontwo, buttonthree;


    public Virtual3Fragment2() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_virtual2, container, false);
        buttonone = (TextView) view.findViewById(R.id.textViewone);
        buttontwo = (TextView) view.findViewById(R.id.textViewtwo);
        buttonthree = (TextView) view.findViewById(R.id.textViewthree);

        buttonone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openOneActivity(v);
            }
        });

        buttontwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openTwoActivity(v);
            }
        });

        buttonthree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openThreeActivity(v);
            }
        });

        return view;
    }

    public void openOneActivity(View view){
        Intent intent = new Intent(view.getContext(), VirtualDesktopActivity.class);
        startActivity(intent);
        onDestroy();
    }

    public void openTwoActivity(View view){
        Intent intent = new Intent(view.getContext(), Virtual2Activity.class);
        startActivity(intent);
        onDestroy();
    }

    public void openThreeActivity(View view){
        Intent intent = new Intent(view.getContext(), VDActivity.class);
        startActivity(intent);
        onDestroy();
    }

}
