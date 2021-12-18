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
public class VirtualDesktopFragment2 extends Fragment {

    TextView buttonone, buttontwo, buttonthree;


    public VirtualDesktopFragment2() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.virtualdesktop_fragment2, container, false);
        buttonone = (TextView) view.findViewById(R.id.clickableone);
        buttontwo = (TextView) view.findViewById(R.id.clickabletwo);
        buttonthree = (TextView) view.findViewById(R.id.clickablethree);

        buttonone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openFirstActivity(v);
            }
        });

        buttontwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openSecondActivity(v);
            }
        });

        buttonthree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openThirdActivity(v);
            }
        });

        return view;
    }

    public void openFirstActivity(View view){
        Intent intent = new Intent(view.getContext(), Virtual2Activity.class);
        startActivity(intent);
        onDestroy();
    }

    public void openSecondActivity(View view){
        Intent intent = new Intent(view.getContext(), Virtual3Activity.class);
        startActivity(intent);
        onDestroy();
    }

    public void openThirdActivity(View view){
        Intent intent = new Intent(view.getContext(), VDActivity.class);
        startActivity(intent);
        onDestroy();
    }

}
