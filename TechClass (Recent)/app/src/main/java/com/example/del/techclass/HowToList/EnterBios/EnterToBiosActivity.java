package com.example.del.techclass.HowToList.EnterBios;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ListView;

import com.example.del.techclass.Data.MyClass;
import com.example.del.techclass.HowToList.PDF.PDF1;
import com.example.del.techclass.HowToList.PDF.PDF2;
import com.example.del.techclass.HowToList.PDF.PDF3;
import com.example.del.techclass.HowToList.PDF.PDF4;
import com.example.del.techclass.ListView.CustomAdapter;
import com.example.del.techclass.R;

import java.util.ArrayList;

public class EnterToBiosActivity extends AppCompatActivity {

    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.enter_to_bios);
        ListView lv = (ListView)findViewById(R.id.bioslist);
        CustomAdapter customAdapter = new CustomAdapter(this, getSecondfragment());

        imageView = (ImageView) findViewById(R.id.imageView45);

        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });

        lv.setAdapter(customAdapter);
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (position == 0) {
                    /* Activity for How to Assemble a Computer */
                    Intent myIntent = new Intent(view.getContext(), StartMenu.class);
                    startActivityForResult(myIntent, 0);
                }
                if (position == 1) {
                    /* Activity for How to Crimp RJ45 */
                    Intent myIntent = new Intent(view.getContext(), KeyboardBios.class);
                    startActivityForResult(myIntent, 1);
                    onDestroy();
                }
            }

        });
    }

    private ArrayList<MyClass> getSecondfragment() {
        ArrayList<MyClass> title = new ArrayList<>();
        MyClass myClass = new MyClass("Using Windows Start Menu", "Planning to buy a new PC? why not build it yourself. Learn this simple steps on how to build your personal Computer.", R.drawable.server);
        title.add(myClass);
        myClass = new MyClass("Keyboard Bios", "Planning to buy a new PC? why not build it yourself. Learn this simple steps on how to build your personal Computer.", R.drawable.pinc);
        title.add(myClass);
        return title;
    }
}
