package com.example.del.techclass.HowToList;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ListView;

import com.example.del.techclass.CompTwoActivity;
import com.example.del.techclass.CrimpActivity;
import com.example.del.techclass.Data.MyClass;
import com.example.del.techclass.FormatComputer;
import com.example.del.techclass.HowToList.VideoCard.Method1;
import com.example.del.techclass.HowToList.VideoCard.Method2;
import com.example.del.techclass.HowToList.VideoCard.Method3;
import com.example.del.techclass.ListView.CustomAdapter;
import com.example.del.techclass.R;

import java.util.ArrayList;

public class VideoCardActivity extends AppCompatActivity {

    ImageView imageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.video_card_activity);

        ListView lv = (ListView)findViewById(R.id.list_id);
        CustomAdapter customAdapter = new CustomAdapter(this, getSecondfragment());
        lv.setAdapter(customAdapter);
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (position == 0) {
                    /* Activity for How to Assemble a Computer */
                    Intent myIntent = new Intent(view.getContext(), Method1.class);
                    startActivityForResult(myIntent, 0);
                }
                if (position == 1) {
                    /* Activity for How to Crimp RJ45 */
                    Intent myIntent = new Intent(view.getContext(), Method2.class);
                    startActivityForResult(myIntent, 1);
                    onDestroy();
                }
                if (position == 2) {
                    /* Activity for How to Test A Power Supply */
                    Intent myIntent = new Intent(view.getContext(), Method3.class);
                    startActivityForResult(myIntent, 2);
                    onDestroy();
                }
            }

        });

        imageView = (ImageView) findViewById(R.id.imageView45);

        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });
    }

    private ArrayList<MyClass> getSecondfragment() {
        ArrayList<MyClass> title = new ArrayList<>();
        MyClass myClass = new MyClass("Update video drivers through Windows Update", "Planning to buy a new PC? why not build it yourself. Learn this simple steps on how to build your personal Computer.", R.drawable.server);
        title.add(myClass);
        myClass = new MyClass("Download and install new drivers from manufacturers", "Planning to buy a new PC? why not build it yourself. Learn this simple steps on how to build your personal Computer.", R.drawable.pinc);
        title.add(myClass);
        myClass = new MyClass("Update video drivers using other Software", "Planning to buy a new PC? why not build it yourself. Learn this simple steps on how to build your personal Computer.", R.drawable.pinc);
        title.add(myClass);
        return title;
    }
}
