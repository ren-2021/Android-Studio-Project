package com.example.del.techclass;


import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class FragmentM extends Fragment {


    private String title;
    private int page;
    Button button;

    public FragmentM() {
        // Required empty public constructor
    }

    public static FragmentM newInstance(int page, String title) {
        FragmentM fragmentFirst = new FragmentM();
        Bundle args = new Bundle();
        args.putInt("someInt", page);
        args.putString("someTitle", title);
        fragmentFirst.setArguments(args);
        return fragmentFirst;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        page = getArguments().getInt("someInt", 0);
        title = getArguments().getString("someTitle");
    }


    @Override
    // Inflate the layout for this fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_m, container, false);
        TextView tvLabel = (TextView) view.findViewById(R.id.tvLabel);
        button = (Button) view.findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openOtherActivity(v);
            }
        });
        tvLabel.setText(page + " -- " + title);
        return view;
    }

    public void openOtherActivity(View view){
        Intent intent = new Intent(view.getContext(), WindowsActivity.class);
        startActivity(intent);
        onDestroy();
    }

}
