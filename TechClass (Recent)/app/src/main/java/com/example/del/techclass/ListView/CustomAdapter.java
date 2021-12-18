package com.example.del.techclass.ListView;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.del.techclass.Data.MyClass;
import com.example.del.techclass.R;

import java.util.ArrayList;

/**
 * Created by Del on 1/05/2017.
 */

public class CustomAdapter extends BaseAdapter {
    Context c;
    ArrayList<MyClass> show;
    LayoutInflater inflater;

    public CustomAdapter(Context c, ArrayList<MyClass> tvshows){
        this.c = c;
        this.show = tvshows;
    }

    @Override
    public int getCount() {
        return show.size();
    }

    @Override
    public Object getItem(int position) {
        return show.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {

        if(inflater == null)
        {
            inflater = (LayoutInflater)c.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        }
        if(convertView == null)
        {
            convertView = inflater.inflate(R.layout.fragment_blank, parent, false);
        }
        TextView nameTxt = (TextView) convertView.findViewById(R.id.nameTxt);
        ImageView img = (ImageView) convertView.findViewById(R.id.ImageOne);
        TextView nameTxt2 = (TextView) convertView.findViewById(R.id.nameTxt2);

        final String name = show.get(position).getName();
        final String name2 = show.get(position).getParagraph();
        int image = show.get(position).getImage();

        nameTxt.setText(name);
        nameTxt2.setText(name2);
        img.setImageResource(image);



        return convertView;
    }
}
