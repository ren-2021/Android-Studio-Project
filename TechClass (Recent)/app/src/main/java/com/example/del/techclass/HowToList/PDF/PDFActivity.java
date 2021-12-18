package com.example.del.techclass.HowToList.PDF;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ListView;

import com.example.del.techclass.Data.MyClass;
import com.example.del.techclass.ListView.CustomAdapter;
import com.example.del.techclass.R;

import java.util.ArrayList;

public class PDFActivity extends AppCompatActivity {

    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pdf_activity);
        ListView lv = (ListView)findViewById(R.id.list_pdf);
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
                    Intent myIntent = new Intent(view.getContext(), PDF1.class);
                    startActivityForResult(myIntent, 0);
                }
                if (position == 1) {
                    /* Activity for How to Crimp RJ45 */
                    Intent myIntent = new Intent(view.getContext(), PDF2.class);
                    startActivityForResult(myIntent, 1);
                    onDestroy();
                }
                if (position == 2) {
                    /* Activity for How to Crimp RJ45 */
                    Intent myIntent = new Intent(view.getContext(), PDF3.class);
                    startActivityForResult(myIntent, 1);
                    onDestroy();
                }
                if (position == 3){
                    /* Activity for How to Crimp RJ45 */
                    Intent myIntent = new Intent(view.getContext(), PDF4.class);
                    startActivityForResult(myIntent, 1);
                    onDestroy();
                }
            }

        });
    }

    private ArrayList<MyClass> getSecondfragment() {
        ArrayList<MyClass> title = new ArrayList<>();
        MyClass myClass = new MyClass("Using Adobe Acrobat", "Planning to buy a new PC? why not build it yourself. Learn this simple steps on how to build your personal Computer.", R.drawable.server);
        title.add(myClass);
        myClass = new MyClass("Using Microsoft Word", "Planning to buy a new PC? why not build it yourself. Learn this simple steps on how to build your personal Computer.", R.drawable.pinc);
        title.add(myClass);
        myClass = new MyClass("Using Google Docs", "Planning to buy a new PC? why not build it yourself. Learn this simple steps on how to build your personal Computer.", R.drawable.pinc);
        title.add(myClass);
        myClass = new MyClass("Using a PDF Editor", "Planning to buy a new PC? why not build it yourself. Learn this simple steps on how to build your personal Computer.", R.drawable.pinc);
        title.add(myClass);
        return title;
    }
}
