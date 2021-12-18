package com.example.del.techclass.HowToList;


import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.text.SpannableString;
import android.text.style.UnderlineSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.example.del.techclass.FormatComputer;
import com.example.del.techclass.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class PasswordFragment2 extends Fragment {

    Button button;

    public PasswordFragment2() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.password_fragment2, container, false);
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
        Intent intent = new Intent(view.getContext(), FormatComputer.class);
        startActivity(intent);
        onDestroy();
    }

}
