package com.example.del.techclass.HowToList;


import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.del.techclass.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class SpeedupFragment6 extends Fragment {

    Button button;


    public SpeedupFragment6() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_speedup6, container, false);
        button = (Button) view.findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openOtherActivity(v);
            }
        });
        return view;

    }
    public void openOtherActivity(View view){
        Intent intent = new Intent(view.getContext(), StartupActivity.class);
        startActivity(intent);
        onDestroy();
    }

}
