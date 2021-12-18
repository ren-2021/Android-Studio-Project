package com.example.del.techclass.Fragments;

import android.content.Intent;
import android.os.Bundle;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import android.widget.SearchView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;


import com.example.del.techclass.FragmentsTerms.*;
import com.example.del.techclass.FragmentsTerms.Boolean;
import com.example.del.techclass.FragmentsTerms.Character;
import com.example.del.techclass.R;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Del on 1/14/2017.
 */

public class FragmentForSecond extends Fragment {
    ArrayAdapter<String> adapter;


    @Override
    public View onCreateView(final LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_second, container, false);

        ListView lv = (ListView) rootView.findViewById(R.id.listview);
        final ArrayList<String> arrayItem = new ArrayList<>();
        SearchView sv = (SearchView) rootView.findViewById(R.id.search);
        arrayItem.addAll(Arrays.asList(getResources().getStringArray(R.array.array_item)));

        adapter = new ArrayAdapter<>(
                getActivity(),
                android.R.layout.simple_list_item_1,
                arrayItem);

        lv.setAdapter(adapter);


        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                if(position == 0){
                    Intent myIntent = new Intent(view.getContext(), abtexting.class);
                    startActivityForResult(myIntent, 0);
                }
                else if (position == 1){
                    Intent myIntent = new Intent(view.getContext(), Adhocnetwork.class);
                    startActivityForResult(myIntent, 1);
                }
                else if (position == 2){
                    Intent myIntent = new Intent(view.getContext(), affiliate.class);
                    startActivityForResult(myIntent, 2);
                }
                else if(position == 3){
                    Intent myIntent = new Intent(view.getContext(), analog.class);
                    startActivityForResult(myIntent, 3);
                }
                else if(position == 4){
                    Intent myIntent = new Intent(view.getContext(), ansi.class);
                    startActivityForResult(myIntent, 4);
                }
                else if(position == 5){
                    Intent myIntent = new Intent(view.getContext(), API.class);
                    startActivityForResult(myIntent, 5);
                }
                else if(position == 6){
                    Intent myIntent = new Intent(view.getContext(), Apple.class);
                    startActivityForResult(myIntent, 6);
                }
                else if(position == 7){
                    Intent myIntent = new Intent(view.getContext(), application.class);
                    startActivityForResult(myIntent, 7);
                }
                else if(position == 8){
                    Intent myIntent = new Intent(view.getContext(), Arp.class);
                    startActivityForResult(myIntent, 8);
                }
                else if(position == 9){
                    Intent myIntent = new Intent(view.getContext(), artificial.class);
                    startActivityForResult(myIntent, 9);
                }
                else if(position == 10){
                    Intent myIntent = new Intent(view.getContext(), ASCII.class);
                    startActivityForResult(myIntent, 10);
                }
                else if(position == 11){
                    Intent myIntent = new Intent(view.getContext(), assistive.class);
                    startActivityForResult(myIntent, 11);
                }
                else if(position == 12){
                    Intent myIntent = new Intent(view.getContext(), attribute.class);
                    startActivityForResult(myIntent, 12);
                }
                else if(position == 13){
                    Intent myIntent = new Intent(view.getContext(), augmented.class);
                    startActivityForResult(myIntent, 13);
                }
                else if(position == 14){
                    Intent myIntent = new Intent(view.getContext(), BackEnd.class);
                    startActivityForResult(myIntent, 14);
                }
                else if(position == 15){
                    Intent myIntent = new Intent(view.getContext(), barcraft.class);
                    startActivityForResult(myIntent, 15);
                }
                else if(position == 16){
                    Intent myIntent = new Intent(view.getContext(), BaseBand.class);
                    startActivityForResult(myIntent, 16);
                }
                else if(position == 17){
                    Intent myIntent = new Intent(view.getContext(), Bespoke.class);
                    startActivityForResult(myIntent, 17);
                }
                else if(position == 18){
                    Intent myIntent = new Intent(view.getContext(), BezierCurve.class);
                    startActivityForResult(myIntent, 18);
                }
                else if(position == 19){
                    Intent myIntent = new Intent(view.getContext(), bigdata.class);
                    startActivityForResult(myIntent, 19);
                }
                else if(position == 20){
                    Intent myIntent = new Intent(view.getContext(), Binary.class);
                    startActivityForResult(myIntent, 20);
                }
                else if(position == 21){
                    Intent myIntent = new Intent(view.getContext(), Biometrix.class);
                    startActivityForResult(myIntent, 21);
                }
                else if(position == 22){
                    Intent myIntent = new Intent(view.getContext(), Bitcoin.class);
                    startActivityForResult(myIntent, 22);
                }
                else if(position == 23){
                    Intent myIntent = new Intent(view.getContext(), Blacklist.class);
                    startActivityForResult(myIntent, 23);
                }
                else if(position == 24){
                    Intent myIntent = new Intent(view.getContext(), Bluetooth.class);
                    startActivityForResult(myIntent, 24);
                }
                else if(position == 25){
                    Intent myIntent = new Intent(view.getContext(), Boolean.class);
                    startActivityForResult(myIntent, 25);
                }
                else if(position == 26){
                    Intent myIntent = new Intent(view.getContext(), Boot.class);
                    startActivityForResult(myIntent, 26);
                }
                else if(position == 27){
                    Intent myIntent = new Intent(view.getContext(), bootsector.class);
                    startActivityForResult(myIntent, 27);
                }
                else if(position == 28){
                    Intent myIntent = new Intent(view.getContext(), bootsequence.class);
                    startActivityForResult(myIntent, 28);
                }
                else if(position == 29){
                    Intent myIntent = new Intent(view.getContext(), bounce.class);
                    startActivityForResult(myIntent, 29);
                }
                else if(position == 30){
                    Intent myIntent = new Intent(view.getContext(), Breadcrumbs.class);
                    startActivityForResult(myIntent, 30);
                }
                else if(position == 31){
                    Intent myIntent = new Intent(view.getContext(), Buffer.class);
                    startActivityForResult(myIntent, 31);
                }
                else if(position == 32){
                    Intent myIntent = new Intent(view.getContext(), Bug.class);
                    startActivityForResult(myIntent, 32);
                }
                else if(position == 33){
                    Intent myIntent = new Intent(view.getContext(), Burn.class);
                    startActivityForResult(myIntent, 33);
                }
                else if(position == 34){
                    Intent myIntent = new Intent(view.getContext(), Cache.class);
                    startActivityForResult(myIntent, 34);
                }
                else if(position == 35){
                    Intent myIntent = new Intent(view.getContext(), Caching.class);
                    startActivityForResult(myIntent, 35);
                }
                else if(position == 36){
                    Intent myIntent = new Intent(view.getContext(), CAD.class);
                    startActivityForResult(myIntent, 36);
                }
                else if(position == 37){
                    Intent myIntent = new Intent(view.getContext(), Calltoaction.class);
                    startActivityForResult(myIntent, 37);
                }
                else if(position == 38){
                    Intent myIntent = new Intent(view.getContext(), Camelcase.class);
                    startActivityForResult(myIntent, 38);
                }
                else if(position == 39){
                    Intent myIntent = new Intent(view.getContext(), CameraRaw.class);
                    startActivityForResult(myIntent, 39);
                }
                else if(position == 40){
                    Intent myIntent = new Intent(view.getContext(), Capslock.class);
                    startActivityForResult(myIntent, 40);
                }
                else if(position == 41){
                    Intent myIntent = new Intent(view.getContext(), CDMA.class);
                    startActivityForResult(myIntent, 41);
                }
                else if(position == 42){
                    Intent myIntent = new Intent(view.getContext(), Character.class);
                    startActivityForResult(myIntent, 42);
                }
                else if(position == 43){
                    Intent myIntent = new Intent(view.getContext(), Circuit.class);
                    startActivityForResult(myIntent, 43);
                }
                else if(position == 44){
                    Intent myIntent = new Intent(view.getContext(), CleanRoom.class);
                    startActivityForResult(myIntent, 44);
                }
                else if(position == 45){
                    Intent myIntent = new Intent(view.getContext(), client_server.class);
                    startActivityForResult(myIntent, 45);
                }
                else if(position == 46){
                    Intent myIntent = new Intent(view.getContext(), Clockcycle.class);
                    startActivityForResult(myIntent, 46);
                }
                else if(position == 47){
                    Intent myIntent = new Intent(view.getContext(), ClockSpeed.class);
                    startActivityForResult(myIntent, 47);
                }
                else if(position == 48){
                    Intent myIntent = new Intent(view.getContext(), CloudComp.class);
                    startActivityForResult(myIntent, 48);
                }
                else if(position == 49){
                    Intent myIntent = new Intent(view.getContext(), CMYK.class);
                    startActivityForResult(myIntent, 49);
                }
                else if(position == 50){
                    Intent myIntent = new Intent(view.getContext(), Coldboot.class);
                    startActivityForResult(myIntent, 50);
                }
                else if(position == 51){
                    Intent myIntent = new Intent(view.getContext(), Colortheory.class);
                    startActivityForResult(myIntent, 51);
                }
                else if(position == 52){
                    Intent myIntent = new Intent(view.getContext(), ColorValue.class);
                    startActivityForResult(myIntent, 52);
                }
                else if(position == 53){
                    Intent myIntent = new Intent(view.getContext(), Column.class);
                    startActivityForResult(myIntent, 53);
                }
                else if(position == 54){
                    Intent myIntent = new Intent(view.getContext(), ComputerEthics.class);
                    startActivityForResult(myIntent, 54);
                }
                else if(position == 55){
                    Intent myIntent = new Intent(view.getContext(), ComputerScience.class);
                    startActivityForResult(myIntent, 55);
                }
                else if(position == 56){
                    Intent myIntent = new Intent(view.getContext(), Configuration.class);
                    startActivityForResult(myIntent, 56);
                }
                else if(position == 57){
                    Intent myIntent = new Intent(view.getContext(), Constant.class);
                    startActivityForResult(myIntent, 57);
                }
                else if(position == 58){
                    Intent myIntent = new Intent(view.getContext(), contentcuration.class);
                    startActivityForResult(myIntent, 58);
                }
                else if(position == 59){
                    Intent myIntent = new Intent(view.getContext(), contentmarketing.class);
                    startActivityForResult(myIntent, 59);
                }
                if(position == 60){
                    Intent myIntent = new Intent(view.getContext(), conversion.class);
                    startActivityForResult(myIntent, 60);
                }
                else if (position == 61){
                    Intent myIntent = new Intent(view.getContext(), Copyright.class);
                    startActivityForResult(myIntent, 61);
                }
                else if (position == 62){
                    Intent myIntent = new Intent(view.getContext(), copyrightinfringe.class);
                    startActivityForResult(myIntent, 62);
                }
                else if(position == 63){
                    Intent myIntent = new Intent(view.getContext(), CPS.class);
                    startActivityForResult(myIntent, 63);
                }
                else if(position == 64){
                    Intent myIntent = new Intent(view.getContext(), Crop.class);
                    startActivityForResult(myIntent, 64);
                }
                else if(position == 65){
                    Intent myIntent = new Intent(view.getContext(), Crossplatform.class);
                    startActivityForResult(myIntent, 65);
                }
                else if(position == 66){
                    Intent myIntent = new Intent(view.getContext(), Cryptography.class);
                    startActivityForResult(myIntent, 66);
                }
                else if(position == 67){
                    Intent myIntent = new Intent(view.getContext(), CSS.class);
                    startActivityForResult(myIntent, 67);
                }
                else if(position == 68){
                    Intent myIntent = new Intent(view.getContext(), CSS3.class);
                    startActivityForResult(myIntent, 68);
                }
                else if(position == 69){
                    Intent myIntent = new Intent(view.getContext(), CTP.class);
                    startActivityForResult(myIntent, 69);
                }
                if(position == 70){
                    Intent myIntent = new Intent(view.getContext(), CTR.class);
                    startActivityForResult(myIntent, 70);
                }
                else if (position == 71){
                    Intent myIntent = new Intent(view.getContext(), CUDA.class);
                    startActivityForResult(myIntent, 71);
                }
                else if (position == 72){
                    Intent myIntent = new Intent(view.getContext(), CyberCrime.class);
                    startActivityForResult(myIntent, 72);
                }
                else if(position == 73){
                    Intent myIntent = new Intent(view.getContext(), dataarchitech.class);
                    startActivityForResult(myIntent, 73);
                }
                else if(position == 74){
                    Intent myIntent = new Intent(view.getContext(), Database.class);
                    startActivityForResult(myIntent, 74);
                }
                else if(position == 75){
                    Intent myIntent = new Intent(view.getContext(), datamining.class);
                    startActivityForResult(myIntent, 75);
                }
                else if(position == 76){
                    Intent myIntent = new Intent(view.getContext(), datamodel.class);
                    startActivityForResult(myIntent, 76);
                }
                else if(position == 77){
                    Intent myIntent = new Intent(view.getContext(), datavisual.class);
                    startActivityForResult(myIntent, 77);
                }
                else if(position == 78){
                    Intent myIntent = new Intent(view.getContext(), daw.class);
                    startActivityForResult(myIntent, 78);
                }
                else if(position == 79){
                    Intent myIntent = new Intent(view.getContext(), declaration.class);
                    startActivityForResult(myIntent, 79);
                }
                else if(position == 80){
                    Intent myIntent = new Intent(view.getContext(), DDL.class);
                    startActivityForResult(myIntent, 80);
                }
                else if (position == 81){
                    Intent myIntent = new Intent(view.getContext(), Default.class);
                    startActivityForResult(myIntent, 81);
                }
                else if (position == 82){
                    Intent myIntent = new Intent(view.getContext(), defragment.class);
                    startActivityForResult(myIntent, 82);
                }
                else if(position == 83){
                    Intent myIntent = new Intent(view.getContext(), delete.class);
                    startActivityForResult(myIntent, 83);
                }
                else if(position == 84){
                    Intent myIntent = new Intent(view.getContext(), denary.class);
                    startActivityForResult(myIntent, 84);
                }
                else if(position == 85){
                    Intent myIntent = new Intent(view.getContext(), devops.class);
                    startActivityForResult(myIntent, 85);
                }
                else if(position == 86){
                    Intent myIntent = new Intent(view.getContext(), developer.class);
                    startActivityForResult(myIntent, 86);
                }
                else if(position == 87){
                    Intent myIntent = new Intent(view.getContext(), DFS.class);
                    startActivityForResult(myIntent, 87);
                }
                else if(position == 88){
                    Intent myIntent = new Intent(view.getContext(), digital.class);
                    startActivityForResult(myIntent, 88);
                }
                else if(position == 89){
                    Intent myIntent = new Intent(view.getContext(), digitize.class);
                    startActivityForResult(myIntent, 89);
                }
                else if(position == 90){
                    Intent myIntent = new Intent(view.getContext(), dithering.class);
                    startActivityForResult(myIntent, 90);
                }
                else if (position == 91){
                    Intent myIntent = new Intent(view.getContext(), DMZ.class);
                    startActivityForResult(myIntent, 91);
                }
                else if (position == 92){
                    Intent myIntent = new Intent(view.getContext(), domain.class);
                    startActivityForResult(myIntent, 92);
                }
                else if(position == 93){
                    Intent myIntent = new Intent(view.getContext(), dotmatrix.class);
                    startActivityForResult(myIntent, 93);
                }
                else if(position == 94){
                    Intent myIntent = new Intent(view.getContext(), doubleclick.class);
                    startActivityForResult(myIntent, 94);
                }
                else if(position == 95){
                    Intent myIntent = new Intent(view.getContext(), dpi.class);
                    startActivityForResult(myIntent, 95);
                }
                else if(position == 96){
                    Intent myIntent = new Intent(view.getContext(), drag.class);
                    startActivityForResult(myIntent, 96);
                }
                else if(position == 97){
                    Intent myIntent = new Intent(view.getContext(), drm.class);
                    startActivityForResult(myIntent, 97);
                }
                else if(position == 98){
                    Intent myIntent = new Intent(view.getContext(), dtd.class);
                    startActivityForResult(myIntent, 98);
                }
                else if(position == 99){
                    Intent myIntent = new Intent(view.getContext(), dv.class);
                    startActivityForResult(myIntent, 99);
                }
                if(position == 100){
                    Intent myIntent = new Intent(view.getContext(), elearning.class);
                    startActivityForResult(myIntent, 100);
                }
                else if (position == 101){
                    Intent myIntent = new Intent(view.getContext(), edutainment.class);
                    startActivityForResult(myIntent, 101);
                }
                else if (position == 102){
                    Intent myIntent = new Intent(view.getContext(), element.class);
                    startActivityForResult(myIntent, 102);
                }
                else if(position == 103){
                    Intent myIntent = new Intent(view.getContext(), emailmarket.class);
                    startActivityForResult(myIntent, 103);
                }
                else if(position == 104){
                    Intent myIntent = new Intent(view.getContext(), embedding.class);
                    startActivityForResult(myIntent, 104);
                }
                else if(position == 105){
                    Intent myIntent = new Intent(view.getContext(), emulation.class);
                    startActivityForResult(myIntent, 105);
                }
                else if(position == 106){
                    Intent myIntent = new Intent(view.getContext(), encryption.class);
                    startActivityForResult(myIntent, 106);
                }
                else if(position == 107){
                    Intent myIntent = new Intent(view.getContext(), enduser.class);
                    startActivityForResult(myIntent, 107);
                }
                else if(position == 108){
                    Intent myIntent = new Intent(view.getContext(), engagement.class);
                    startActivityForResult(myIntent, 108);
                }
                else if(position == 109){
                    Intent myIntent = new Intent(view.getContext(), enterprise.class);
                    startActivityForResult(myIntent, 109);
                }
                else if(position == 110){
                    Intent myIntent = new Intent(view.getContext(), ergonomics.class);
                    startActivityForResult(myIntent, 110);
                }
                else if (position == 111){
                    Intent myIntent = new Intent(view.getContext(), esports.class);
                    startActivityForResult(myIntent, 111);
                }
                else if (position == 112){
                    Intent myIntent = new Intent(view.getContext(), EUP.class);
                    startActivityForResult(myIntent, 112);
                }
                else if(position == 113){
                    Intent myIntent = new Intent(view.getContext(), FAQ.class);
                    startActivityForResult(myIntent, 113);
                }
                else if(position == 114){
                    Intent myIntent = new Intent(view.getContext(), fddi.class);
                    startActivityForResult(myIntent, 114);
                }
                else if(position == 115){
                    Intent myIntent = new Intent(view.getContext(), field.class);
                    startActivityForResult(myIntent, 115);
                }
                else if(position == 116){
                    Intent myIntent = new Intent(view.getContext(), fifo.class);
                    startActivityForResult(myIntent, 116);
                }
                else if(position == 117){
                    Intent myIntent = new Intent(view.getContext(), filesystem.class);
                    startActivityForResult(myIntent, 117);
                }
                else if(position == 118){
                    Intent myIntent = new Intent(view.getContext(), filo.class);
                    startActivityForResult(myIntent, 118);
                }
                else if(position == 119){
                    Intent myIntent = new Intent(view.getContext(), firewall.class);
                    startActivityForResult(myIntent, 119);
                }
                else if(position == 120){
                    Intent myIntent = new Intent(view.getContext(), flexible.class);
                    startActivityForResult(myIntent, 120);
                }
                else if (position == 121){
                    Intent myIntent = new Intent(view.getContext(), floatingpoint.class);
                    startActivityForResult(myIntent, 121);
                }
                else if (position == 122){
                    Intent myIntent = new Intent(view.getContext(), flops.class);
                    startActivityForResult(myIntent, 122);
                }
                else if(position == 123){
                    Intent myIntent = new Intent(view.getContext(), flowchart.class);
                    startActivityForResult(myIntent, 123);
                }
                else if(position == 124){
                    Intent myIntent = new Intent(view.getContext(), font.class);
                    startActivityForResult(myIntent, 124);
                }
                else if(position == 125){
                    Intent myIntent = new Intent(view.getContext(), fontcase.class);
                    startActivityForResult(myIntent, 125);
                }
                else if(position == 126){
                    Intent myIntent = new Intent(view.getContext(), footer.class);
                    startActivityForResult(myIntent, 126);
                }
                else if(position == 127){
                    Intent myIntent = new Intent(view.getContext(), format.class);
                    startActivityForResult(myIntent, 127);
                }
                else if(position == 128){
                    Intent myIntent = new Intent(view.getContext(), formula.class);
                    startActivityForResult(myIntent, 128);
                }
                else if(position == 129){
                    Intent myIntent = new Intent(view.getContext(), fqdn.class);
                    startActivityForResult(myIntent, 129);
                }
                else if(position == 130){
                    Intent myIntent = new Intent(view.getContext(), fragmentation.class);
                    startActivityForResult(myIntent, 130);
                }
                else if (position == 131){
                    Intent myIntent = new Intent(view.getContext(), frame.class);
                    startActivityForResult(myIntent, 131);
                }
                else if (position == 132){
                    Intent myIntent = new Intent(view.getContext(), framework.class);
                    startActivityForResult(myIntent, 132);
                }
                else if(position == 133){
                    Intent myIntent = new Intent(view.getContext(), frequency.class);
                    startActivityForResult(myIntent, 133);
                }
                else if(position == 134){
                    Intent myIntent = new Intent(view.getContext(), frontend.class);
                    startActivityForResult(myIntent, 134);
                }
                else if(position == 135){
                    Intent myIntent = new Intent(view.getContext(), fullduplex.class);
                    startActivityForResult(myIntent, 135);
                }
                else if(position == 136){
                    Intent myIntent = new Intent(view.getContext(), funnel.class);
                    startActivityForResult(myIntent, 136);
                }
                else if(position == 137){
                    Intent myIntent = new Intent(view.getContext(), gigaflops.class);
                    startActivityForResult(myIntent, 137);
                }
                else if(position == 138){
                    Intent myIntent = new Intent(view.getContext(), gigahertz.class);
                    startActivityForResult(myIntent, 138);
                }
                else if(position == 139){
                    Intent myIntent = new Intent(view.getContext(), gigo.class);
                    startActivityForResult(myIntent, 139);
                }
                else if(position == 140){
                    Intent myIntent = new Intent(view.getContext(), gis.class);
                    startActivityForResult(myIntent, 140);
                }
                else if (position == 141){
                    Intent myIntent = new Intent(view.getContext(), gpgpu.class);
                    startActivityForResult(myIntent, 141);
                }
                else if (position == 142){
                    Intent myIntent = new Intent(view.getContext(), gpio.class);
                    startActivityForResult(myIntent, 142);
                }
                else if(position == 143){
                    Intent myIntent = new Intent(view.getContext(), gps.class);
                    startActivityForResult(myIntent, 143);
                }
                else if(position == 144){
                    Intent myIntent = new Intent(view.getContext(), graphics.class);
                    startActivityForResult(myIntent, 144);
                }
                else if(position == 145){
                    Intent myIntent = new Intent(view.getContext(), grayscale.class);
                    startActivityForResult(myIntent, 145);
                }
                else if(position == 146){
                    Intent myIntent = new Intent(view.getContext(), grid.class);
                    startActivityForResult(myIntent, 146);
                }
                else if(position == 147){
                    Intent myIntent = new Intent(view.getContext(), growthhacking.class);
                    startActivityForResult(myIntent, 147);
                }
                else if(position == 148){
                    Intent myIntent = new Intent(view.getContext(), hacker.class);
                    startActivityForResult(myIntent, 148);
                }
                else if(position == 149){
                    Intent myIntent = new Intent(view.getContext(), halfduplex.class);
                    startActivityForResult(myIntent, 149);
                }
                else if(position == 150){
                    Intent myIntent = new Intent(view.getContext(), halftone.class);
                    startActivityForResult(myIntent, 150);
                }
                else if (position == 151){
                    Intent myIntent = new Intent(view.getContext(), handshake.class);
                    startActivityForResult(myIntent, 151);
                }
                else if (position == 152){
                    Intent myIntent = new Intent(view.getContext(), hardcopy.class);
                    startActivityForResult(myIntent, 152);
                }
                else if(position == 153){
                    Intent myIntent = new Intent(view.getContext(), hdtv.class);
                    startActivityForResult(myIntent, 153);
                }
                else if(position == 154){
                    Intent myIntent = new Intent(view.getContext(), hdv.class);
                    startActivityForResult(myIntent, 154);
                }
                else if(position == 155){
                    Intent myIntent = new Intent(view.getContext(), header.class);
                    startActivityForResult(myIntent, 155);
                }
                else if(position == 156){
                    Intent myIntent = new Intent(view.getContext(), hertz.class);
                    startActivityForResult(myIntent, 156);
                }
                else if(position == 157){
                    Intent myIntent = new Intent(view.getContext(), hezadecimal.class);
                    startActivityForResult(myIntent, 157);
                }
                else if(position == 158){
                    Intent myIntent = new Intent(view.getContext(), hfs.class);
                    startActivityForResult(myIntent, 158);
                }
                else if(position == 159){
                    Intent myIntent = new Intent(view.getContext(), hibernate.class);
                    startActivityForResult(myIntent, 159);
                }
                if(position == 160){
                    Intent myIntent = new Intent(view.getContext(), hybridapp.class);
                    startActivityForResult(myIntent, 160);
                }
                else if (position == 161){
                    Intent myIntent = new Intent(view.getContext(), html.class);
                    startActivityForResult(myIntent, 161);
                }
                else if (position == 162){
                    Intent myIntent = new Intent(view.getContext(), html5.class);
                    startActivityForResult(myIntent, 162);
                }
                else if(position == 163){
                    Intent myIntent = new Intent(view.getContext(), hostname.class);
                    startActivityForResult(myIntent, 163);
                }
                else if(position == 164){
                    Intent myIntent = new Intent(view.getContext(), hover.class);
                    startActivityForResult(myIntent, 164);
                }
                else if(position == 165){
                    Intent myIntent = new Intent(view.getContext(), hyperthreading.class);
                    startActivityForResult(myIntent, 165);
                }
                else if(position == 166){
                    Intent myIntent = new Intent(view.getContext(), IO.class);
                    startActivityForResult(myIntent, 166);
                }
                else if(position == 167){
                    Intent myIntent = new Intent(view.getContext(), ide.class);
                    startActivityForResult(myIntent, 167);
                }
                else if(position == 168){
                    Intent myIntent = new Intent(view.getContext(), ids.class);
                    startActivityForResult(myIntent, 168);
                }
                else if(position == 169){
                    Intent myIntent = new Intent(view.getContext(), ieee.class);
                    startActivityForResult(myIntent, 169);
                }
                if(position == 170){
                    Intent myIntent = new Intent(view.getContext(), impressions.class);
                    startActivityForResult(myIntent, 170);
                }
                else if (position == 171){
                    Intent myIntent = new Intent(view.getContext(), infuencer.class);
                    startActivityForResult(myIntent, 171);
                }
                else if (position == 172){
                    Intent myIntent = new Intent(view.getContext(), infitainment.class);
                    startActivityForResult(myIntent, 172);
                }
                else if(position == 173){
                    Intent myIntent = new Intent(view.getContext(), input.class);
                    startActivityForResult(myIntent, 173);
                }
                else if(position == 174){
                    Intent myIntent = new Intent(view.getContext(), integer.class);
                    startActivityForResult(myIntent, 174);
                }
                else if(position == 175){
                    Intent myIntent = new Intent(view.getContext(), integrated.class);
                    startActivityForResult(myIntent, 175);
                }
                else if(position == 176){
                    Intent myIntent = new Intent(view.getContext(), intellectualproperty.class);
                    startActivityForResult(myIntent, 176);
                }
                else if(position == 177){
                    Intent myIntent = new Intent(view.getContext(), interlaced.class);
                    startActivityForResult(myIntent, 177);
                }
                else if(position == 178){
                    Intent myIntent = new Intent(view.getContext(), intranet.class);
                    startActivityForResult(myIntent, 178);
                }
                else if(position == 179){
                    Intent myIntent = new Intent(view.getContext(), ips.class);
                    startActivityForResult(myIntent, 179);
                }
                if(position == 180){
                    Intent myIntent = new Intent(view.getContext(), ipx.class);
                    startActivityForResult(myIntent, 180);
                }
                else if (position == 181){
                    Intent myIntent = new Intent(view.getContext(), iso.class);
                    startActivityForResult(myIntent, 181);
                }
                else if (position == 182){
                    Intent myIntent = new Intent(view.getContext(), it.class);
                    startActivityForResult(myIntent, 182);
                }
                else if(position == 183){
                    Intent myIntent = new Intent(view.getContext(), ivr.class);
                    startActivityForResult(myIntent, 183);
                }
                else if(position == 184){
                    Intent myIntent = new Intent(view.getContext(), jfs.class);
                    startActivityForResult(myIntent, 184);
                }
                else if(position == 185){
                    Intent myIntent = new Intent(view.getContext(), kerning.class);
                    startActivityForResult(myIntent, 185);
                }
                else if(position == 186){
                    Intent myIntent = new Intent(view.getContext(), keystroke.class);
                    startActivityForResult(myIntent, 186);
                }
                else if(position == 187){
                    Intent myIntent = new Intent(view.getContext(), keywords.class);
                    startActivityForResult(myIntent, 187);
                }
                else if(position == 188){
                    Intent myIntent = new Intent(view.getContext(), kilohertz.class);
                    startActivityForResult(myIntent, 188);
                }
                else if(position == 189){
                    Intent myIntent = new Intent(view.getContext(), Lan.class);
                    startActivityForResult(myIntent, 189);
                }
                if(position == 190){
                    Intent myIntent = new Intent(view.getContext(), leading.class);
                    startActivityForResult(myIntent, 190);
                }
                else if (position == 191){
                    Intent myIntent = new Intent(view.getContext(), leaf.class);
                    startActivityForResult(myIntent, 191);
                }
                else if (position == 192){
                    Intent myIntent = new Intent(view.getContext(), leftclick.class);
                    startActivityForResult(myIntent, 192);
                }
                else if(position == 193){
                    Intent myIntent = new Intent(view.getContext(), lifo.class);
                    startActivityForResult(myIntent, 193);
                }
                else if(position == 194){
                    Intent myIntent = new Intent(view.getContext(), loadbalancing.class);
                    startActivityForResult(myIntent, 194);
                }
                else if(position == 195){
                    Intent myIntent = new Intent(view.getContext(), localhost.class);
                    startActivityForResult(myIntent, 195);
                }
                else if(position == 196){
                    Intent myIntent = new Intent(view.getContext(), logon.class);
                    startActivityForResult(myIntent, 196);
                }
                else if(position == 197){
                    Intent myIntent = new Intent(view.getContext(), logicgate.class);
                    startActivityForResult(myIntent, 197);
                }
                else if(position == 198){
                    Intent myIntent = new Intent(view.getContext(), login.class);
                    startActivityForResult(myIntent, 198);
                }
                else if(position == 199){
                    Intent myIntent = new Intent(view.getContext(), lpi.class);
                    startActivityForResult(myIntent, 199);
                }
                if(position == 200){
                    Intent myIntent = new Intent(view.getContext(), lte.class);
                    startActivityForResult(myIntent, 200);
                }
                else if (position == 201){
                    Intent myIntent = new Intent(view.getContext(), lun.class);
                    startActivityForResult(myIntent, 201);
                }
                else if (position == 202){
                    Intent myIntent = new Intent(view.getContext(), macintosh.class);
                    startActivityForResult(myIntent, 202);
                }
                else if(position == 203){
                    Intent myIntent = new Intent(view.getContext(), manet.class);
                    startActivityForResult(myIntent, 203);
                }
                else if(position == 204){
                    Intent myIntent = new Intent(view.getContext(), margin.class);
                    startActivityForResult(myIntent, 204);
                }
                else if(position == 205){
                    Intent myIntent = new Intent(view.getContext(), marketingautomation.class);
                    startActivityForResult(myIntent, 205);
                }
                else if(position == 206){
                    Intent myIntent = new Intent(view.getContext(), markuplang.class);
                    startActivityForResult(myIntent, 206);
                }
                else if(position == 207){
                    Intent myIntent = new Intent(view.getContext(), matrix.class);
                    startActivityForResult(myIntent, 207);
                }
                else if(position == 208){
                    Intent myIntent = new Intent(view.getContext(), mdi.class);
                    startActivityForResult(myIntent, 208);
                }
                else if(position == 209){
                    Intent myIntent = new Intent(view.getContext(), megahertz.class);
                    startActivityForResult(myIntent, 209);
                }
                else if(position == 210){
                    Intent myIntent = new Intent(view.getContext(), megapixel.class);
                    startActivityForResult(myIntent, 210);
                }
                else if (position == 211){
                    Intent myIntent = new Intent(view.getContext(), memorybank.class);
                    startActivityForResult(myIntent, 211);
                }
                else if (position == 212){
                    Intent myIntent = new Intent(view.getContext(), mention.class);
                    startActivityForResult(myIntent, 212);
                }
                else if(position == 213){
                    Intent myIntent = new Intent(view.getContext(), metaelements.class);
                    startActivityForResult(myIntent, 213);
                }
                else if(position == 214){
                    Intent myIntent = new Intent(view.getContext(), metadata.class);
                    startActivityForResult(myIntent, 214);
                }
                else if(position == 215){
                    Intent myIntent = new Intent(view.getContext(), microblog.class);
                    startActivityForResult(myIntent, 215);
                }
                else if(position == 216){
                    Intent myIntent = new Intent(view.getContext(), micron.class);
                    startActivityForResult(myIntent, 216);
                }
                else if(position == 217){
                    Intent myIntent = new Intent(view.getContext(), midi.class);
                    startActivityForResult(myIntent, 217);
                }
                else if(position == 218){
                    Intent myIntent = new Intent(view.getContext(), minidv.class);
                    startActivityForResult(myIntent, 218);
                }
                else if(position == 219){
                    Intent myIntent = new Intent(view.getContext(), mips.class);
                    startActivityForResult(myIntent, 219);
                }
                if(position == 220){
                    Intent myIntent = new Intent(view.getContext(), mis.class);
                    startActivityForResult(myIntent, 220);
                }
                else if (position == 221){
                    Intent myIntent = new Intent(view.getContext(), mms.class);
                    startActivityForResult(myIntent, 221);
                }
                else if (position == 222){
                    Intent myIntent = new Intent(view.getContext(), mnemonic.class);
                    startActivityForResult(myIntent, 222);
                }
                else if(position == 223){
                    Intent myIntent = new Intent(view.getContext(), mobile.class);
                    startActivityForResult(myIntent, 223);
                }
                else if(position == 224){
                    Intent myIntent = new Intent(view.getContext(), monochrome.class);
                    startActivityForResult(myIntent, 224);
                }
                else if(position == 225){
                    Intent myIntent = new Intent(view.getContext(), moodboard.class);
                    startActivityForResult(myIntent, 225);
                }
                else if(position == 226){
                    Intent myIntent = new Intent(view.getContext(), multichannel.class);
                    startActivityForResult(myIntent, 226);
                }
                else if(position == 227){
                    Intent myIntent = new Intent(view.getContext(), multimedia.class);
                    startActivityForResult(myIntent, 227);
                }
                else if(position == 228){
                    Intent myIntent = new Intent(view.getContext(), multiplatform.class);
                    startActivityForResult(myIntent, 228);
                }
                else if(position == 229){
                    Intent myIntent = new Intent(view.getContext(), namespace.class);
                    startActivityForResult(myIntent, 229);
                }
                else if(position == 230){
                    Intent myIntent = new Intent(view.getContext(), nanometer.class);
                    startActivityForResult(myIntent, 230);
                }
                else if (position == 231){
                    Intent myIntent = new Intent(view.getContext(), nativeapp.class);
                    startActivityForResult(myIntent, 231);
                }
                else if (position == 232){
                    Intent myIntent = new Intent(view.getContext(), network.class);
                    startActivityForResult(myIntent, 232);
                }
                else if(position == 233){
                    Intent myIntent = new Intent(view.getContext(), networktopology.class);
                    startActivityForResult(myIntent, 233);
                }
                else if(position == 234){
                    Intent myIntent = new Intent(view.getContext(), newbie.class);
                    startActivityForResult(myIntent, 234);
                }
                else if(position == 235){
                    Intent myIntent = new Intent(view.getContext(), newline.class);
                    startActivityForResult(myIntent, 235);
                }
                else if(position == 236){
                    Intent myIntent = new Intent(view.getContext(), nino.class);
                    startActivityForResult(myIntent, 236);
                }
                else if(position == 237){
                    Intent myIntent = new Intent(view.getContext(), ntfs.class);
                    startActivityForResult(myIntent, 237);
                }
                else if(position == 238){
                    Intent myIntent = new Intent(view.getContext(), nfc.class);
                    startActivityForResult(myIntent, 238);
                }
                else if(position == 239){
                    Intent myIntent = new Intent(view.getContext(), nui.class);
                    startActivityForResult(myIntent, 239);
                }
                else if(position == 240){
                    Intent myIntent = new Intent(view.getContext(), Null.class);
                    startActivityForResult(myIntent, 240);
                }
                else if (position == 241){
                    Intent myIntent = new Intent(view.getContext(), numlock.class);
                    startActivityForResult(myIntent, 241);
                }
                else if (position == 242){
                    Intent myIntent = new Intent(view.getContext(), oasis.class);
                    startActivityForResult(myIntent, 242);
                }
                else if(position == 243){
                    Intent myIntent = new Intent(view.getContext(), oop.class);
                    startActivityForResult(myIntent, 243);
                }
                else if(position == 244){
                    Intent myIntent = new Intent(view.getContext(), oep.class);
                    startActivityForResult(myIntent, 244);
                }
                else if(position == 245){
                    Intent myIntent = new Intent(view.getContext(), offline.class);
                    startActivityForResult(myIntent, 245);
                }
                else if(position == 246){
                    Intent myIntent = new Intent(view.getContext(), olap.class);
                    startActivityForResult(myIntent, 246);
                }
                else if(position == 247){
                    Intent myIntent = new Intent(view.getContext(), online.class);
                    startActivityForResult(myIntent, 247);
                }
                else if(position == 248){
                    Intent myIntent = new Intent(view.getContext(), opencl.class);
                    startActivityForResult(myIntent, 248);
                }
                else if(position == 249){
                    Intent myIntent = new Intent(view.getContext(), openingtag.class);
                    startActivityForResult(myIntent, 249);
                }
                else if(position == 250){
                    Intent myIntent = new Intent(view.getContext(), optimization.class);
                    startActivityForResult(myIntent, 250);
                }
                else if (position == 251){
                    Intent myIntent = new Intent(view.getContext(), organic.class);
                    startActivityForResult(myIntent, 251);
                }
                else if (position == 252){
                    Intent myIntent = new Intent(view.getContext(), osimodel.class);
                    startActivityForResult(myIntent, 252);
                }
                else if(position == 253){
                    Intent myIntent = new Intent(view.getContext(), ota.class);
                    startActivityForResult(myIntent, 253);
                }
                else if(position == 254){
                    Intent myIntent = new Intent(view.getContext(), output.class);
                    startActivityForResult(myIntent, 254);
                }
                else if(position == 255){
                    Intent myIntent = new Intent(view.getContext(), overwrite.class);
                    startActivityForResult(myIntent, 255);
                }
                else if(position == 256){
                    Intent myIntent = new Intent(view.getContext(), pagefault.class);
                    startActivityForResult(myIntent, 256);
                }
                else if(position == 257){
                    Intent myIntent = new Intent(view.getContext(), pageorientation.class);
                    startActivityForResult(myIntent, 257);
                }
                else if(position == 258){
                    Intent myIntent = new Intent(view.getContext(), parity.class);
                    startActivityForResult(myIntent, 258);
                }
                else if(position == 259){
                    Intent myIntent = new Intent(view.getContext(), paritybit.class);
                    startActivityForResult(myIntent, 259);
                }
                else if(position == 260){
                    Intent myIntent = new Intent(view.getContext(), parse.class);
                    startActivityForResult(myIntent, 260);
                }
                else if (position == 261){
                    Intent myIntent = new Intent(view.getContext(), partition.class);
                    startActivityForResult(myIntent, 261);
                }
                else if (position == 262){
                    Intent myIntent = new Intent(view.getContext(), passcode.class);
                    startActivityForResult(myIntent, 262);
                }
                else if(position == 263){
                    Intent myIntent = new Intent(view.getContext(), passphrase.class);
                    startActivityForResult(myIntent, 263);
                }
                else if(position == 264){
                    Intent myIntent = new Intent(view.getContext(), password.class);
                    startActivityForResult(myIntent, 264);
                }
                else if(position == 265){
                    Intent myIntent = new Intent(view.getContext(), peopleware.class);
                    startActivityForResult(myIntent, 265);
                }
                else if(position == 266){
                    Intent myIntent = new Intent(view.getContext(), phreaking.class);
                    startActivityForResult(myIntent, 266);
                }
                else if(position == 267){
                    Intent myIntent = new Intent(view.getContext(), piconet.class);
                    startActivityForResult(myIntent, 267);
                }
                else if(position == 268){
                    Intent myIntent = new Intent(view.getContext(), pixel.class);
                    startActivityForResult(myIntent, 268);
                }
                else if(position == 269){
                    Intent myIntent = new Intent(view.getContext(), plagiarism.class);
                    startActivityForResult(myIntent, 269);
                }
                else if(position == 270){
                    Intent myIntent = new Intent(view.getContext(), platform.class);
                    startActivityForResult(myIntent, 270);
                }
                else if (position == 271){
                    Intent myIntent = new Intent(view.getContext(), podcast.class);
                    startActivityForResult(myIntent, 271);
                }
                else if (position == 272){
                    Intent myIntent = new Intent(view.getContext(), port.class);
                    startActivityForResult(myIntent, 272);
                }
                else if(position == 273){
                    Intent myIntent = new Intent(view.getContext(), poweruser.class);
                    startActivityForResult(myIntent, 273);
                }
                else if(position == 274){
                    Intent myIntent = new Intent(view.getContext(), ppi.class);
                    startActivityForResult(myIntent, 274);
                }
                else if(position == 275){
                    Intent myIntent = new Intent(view.getContext(), ppm.class);
                    startActivityForResult(myIntent, 275);
                }
                else if(position == 276){
                    Intent myIntent = new Intent(view.getContext(), pretest.class);
                    startActivityForResult(myIntent, 276);
                }
                else if(position == 277){
                    Intent myIntent = new Intent(view.getContext(), primarykey.class);
                    startActivityForResult(myIntent, 277);
                }
                else if(position == 278){
                    Intent myIntent = new Intent(view.getContext(), progressivescan.class);
                    startActivityForResult(myIntent, 278);
                }
                else if(position == 279){
                    Intent myIntent = new Intent(view.getContext(), property.class);
                    startActivityForResult(myIntent, 279);
                }
                else if(position == 280){
                    Intent myIntent = new Intent(view.getContext(), push.class);
                    startActivityForResult(myIntent, 280);
                }
                else if (position == 281){
                    Intent myIntent = new Intent(view.getContext(), qrcode.class);
                    startActivityForResult(myIntent, 281);
                }
                else if (position == 282){
                    Intent myIntent = new Intent(view.getContext(), queue.class);
                    startActivityForResult(myIntent, 282);
                }
                else if(position == 283){
                    Intent myIntent = new Intent(view.getContext(), qwerty.class);
                    startActivityForResult(myIntent, 283);
                }
                else if(position == 284){
                    Intent myIntent = new Intent(view.getContext(), raid.class);
                    startActivityForResult(myIntent, 284);
                }
                else if(position == 285){
                    Intent myIntent = new Intent(view.getContext(), raster.class);
                    startActivityForResult(myIntent, 285);
                }
                else if(position == 286){
                    Intent myIntent = new Intent(view.getContext(), rdf.class);
                    startActivityForResult(myIntent, 286);
                }
                else if(position == 287){
                    Intent myIntent = new Intent(view.getContext(), reach.class);
                    startActivityForResult(myIntent, 287);
                }
                else if(position == 288){
                    Intent myIntent = new Intent(view.getContext(), readonly.class);
                    startActivityForResult(myIntent, 288);
                }
                else if(position == 289){
                    Intent myIntent = new Intent(view.getContext(), realnumber.class);
                    startActivityForResult(myIntent, 289);
                }
                else if(position == 290){
                    Intent myIntent = new Intent(view.getContext(), realtime.class);
                    startActivityForResult(myIntent, 290);
                }
                else if (position == 291){
                    Intent myIntent = new Intent(view.getContext(), recursion.class);
                    startActivityForResult(myIntent, 291);
                }
                else if (position == 292){
                    Intent myIntent = new Intent(view.getContext(), recursivefunction.class);
                    startActivityForResult(myIntent, 292);
                }
                else if(position == 293){
                    Intent myIntent = new Intent(view.getContext(), redundancy.class);
                    startActivityForResult(myIntent, 293);
                }
                else if(position == 294){
                    Intent myIntent = new Intent(view.getContext(), refresh.class);
                    startActivityForResult(myIntent, 294);
                }
                else if(position == 295){
                    Intent myIntent = new Intent(view.getContext(), refreshrate.class);
                    startActivityForResult(myIntent, 295);
                }
                else if(position == 296){
                    Intent myIntent = new Intent(view.getContext(), regularexpres.class);
                    startActivityForResult(myIntent, 296);
                }
                else if(position == 297){
                    Intent myIntent = new Intent(view.getContext(), relational.class);
                    startActivityForResult(myIntent, 297);
                }
                else if(position == 298){
                    Intent myIntent = new Intent(view.getContext(), remoteaccess.class);
                    startActivityForResult(myIntent, 298);
                }
                else if(position == 299){
                    Intent myIntent = new Intent(view.getContext(), remoteuser.class);
                    startActivityForResult(myIntent, 299);
                }
                else if(position == 300){
                    Intent myIntent = new Intent(view.getContext(), rendering.class);
                    startActivityForResult(myIntent, 300);
                }
                else if (position == 301){
                    Intent myIntent = new Intent(view.getContext(), resolution.class);
                    startActivityForResult(myIntent, 301);
                }
                else if (position == 302){
                    Intent myIntent = new Intent(view.getContext(), responsive.class);
                    startActivityForResult(myIntent, 302);
                }
                else if(position == 303){
                    Intent myIntent = new Intent(view.getContext(), restore.class);
                    startActivityForResult(myIntent, 303);
                }
                else if(position == 304){
                    Intent myIntent = new Intent(view.getContext(), retinadis.class);
                    startActivityForResult(myIntent, 304);
                }
                else if(position == 305){
                    Intent myIntent = new Intent(view.getContext(), rgb.class);
                    startActivityForResult(myIntent, 305);
                }
                else if(position == 306){
                    Intent myIntent = new Intent(view.getContext(), rightclick.class);
                    startActivityForResult(myIntent, 306);
                }
                else if(position == 307){
                    Intent myIntent = new Intent(view.getContext(), ripcording.class);
                    startActivityForResult(myIntent, 307);
                }
                else if(position == 308){
                    Intent myIntent = new Intent(view.getContext(), rj45.class);
                    startActivityForResult(myIntent, 308);
                }
                else if(position == 309){
                    Intent myIntent = new Intent(view.getContext(), router.class);
                    startActivityForResult(myIntent, 309);
                }
                else if(position == 310){
                    Intent myIntent = new Intent(view.getContext(), row.class);
                    startActivityForResult(myIntent, 310);
                }
                else if (position == 311){
                    Intent myIntent = new Intent(view.getContext(), rup.class);
                    startActivityForResult(myIntent, 311);
                }
                else if (position == 312){
                    Intent myIntent = new Intent(view.getContext(), safemode.class);
                    startActivityForResult(myIntent, 312);
                }
                else if(position == 313){
                    Intent myIntent = new Intent(view.getContext(), sample.class);
                    startActivityForResult(myIntent, 313);
                }
                else if(position == 314){
                    Intent myIntent = new Intent(view.getContext(), samplerate.class);
                    startActivityForResult(myIntent, 314);
                }
                else if(position == 315){
                    Intent myIntent = new Intent(view.getContext(), sampling.class);
                    startActivityForResult(myIntent, 315);
                }
                else if(position == 316){
                    Intent myIntent = new Intent(view.getContext(), scalable.class);
                    startActivityForResult(myIntent, 316);
                }
                else if(position == 317){
                    Intent myIntent = new Intent(view.getContext(), sdk.class);
                    startActivityForResult(myIntent, 317);
                }
                else if(position == 318){
                    Intent myIntent = new Intent(view.getContext(), searchen.class);
                    startActivityForResult(myIntent, 318);
                }
                else if(position == 319){
                    Intent myIntent = new Intent(view.getContext(), selector.class);
                    startActivityForResult(myIntent, 319);
                }
                else if(position == 320){
                    Intent myIntent = new Intent(view.getContext(), selfclosing.class);
                    startActivityForResult(myIntent, 320);
                }
                else if (position == 321){
                    Intent myIntent = new Intent(view.getContext(), semantic.class);
                    startActivityForResult(myIntent, 321);
                }
                else if (position == 322){
                    Intent myIntent = new Intent(view.getContext(), seo.class);
                    startActivityForResult(myIntent, 322);
                }
                else if(position == 323){
                    Intent myIntent = new Intent(view.getContext(), serif.class);
                    startActivityForResult(myIntent, 323);
                }
                else if(position == 324){
                    Intent myIntent = new Intent(view.getContext(), sidebar.class);
                    startActivityForResult(myIntent, 324);
                }
                else if(position == 325){
                    Intent myIntent = new Intent(view.getContext(), simplex.class);
                    startActivityForResult(myIntent, 325);
                }
                else if(position == 326){
                    Intent myIntent = new Intent(view.getContext(), sitemap.class);
                    startActivityForResult(myIntent, 326);
                }
                else if(position == 327){
                    Intent myIntent = new Intent(view.getContext(), sku.class);
                    startActivityForResult(myIntent, 327);
                }
                else if(position == 328){
                    Intent myIntent = new Intent(view.getContext(), sla.class);
                    startActivityForResult(myIntent, 328);
                }
                else if(position == 329){
                    Intent myIntent = new Intent(view.getContext(), smarthome.class);
                    startActivityForResult(myIntent, 329);
                }
                else if(position == 330){
                    Intent myIntent = new Intent(view.getContext(), sms.class);
                    startActivityForResult(myIntent, 330);
                }
                else if (position == 331){
                    Intent myIntent = new Intent(view.getContext(), soa.class);
                    startActivityForResult(myIntent, 331);
                }
                else if (position == 332){
                    Intent myIntent = new Intent(view.getContext(), softcopy.class);
                    startActivityForResult(myIntent, 332);
                }
                else if(position == 333){
                    Intent myIntent = new Intent(view.getContext(), software.class);
                    startActivityForResult(myIntent, 333);
                }
                else if(position == 334){
                    Intent myIntent = new Intent(view.getContext(), socialgraph.class);
                    startActivityForResult(myIntent, 334);
                }
                else if(position == 335){
                    Intent myIntent = new Intent(view.getContext(), speechrecog.class);
                    startActivityForResult(myIntent, 335);
                }
                else if(position == 336){
                    Intent myIntent = new Intent(view.getContext(), spooling.class);
                    startActivityForResult(myIntent, 336);
                }
                else if(position == 337){
                    Intent myIntent = new Intent(view.getContext(), spx.class);
                    startActivityForResult(myIntent, 337);
                }
                else if(position == 338){
                    Intent myIntent = new Intent(view.getContext(), srgb.class);
                    startActivityForResult(myIntent, 338);
                }
                else if(position == 339){
                    Intent myIntent = new Intent(view.getContext(), ssid.class);
                    startActivityForResult(myIntent, 339);
                }
                else if(position == 340){
                    Intent myIntent = new Intent(view.getContext(), stack.class);
                    startActivityForResult(myIntent, 340);
                }
                else if (position == 341){
                    Intent myIntent = new Intent(view.getContext(), standalone.class);
                    startActivityForResult(myIntent, 341);
                }
                else if (position == 342){
                    Intent myIntent = new Intent(view.getContext(), standby.class);
                    startActivityForResult(myIntent, 342);
                }
                else if(position == 343){
                    Intent myIntent = new Intent(view.getContext(), storagecapacity.class);
                    startActivityForResult(myIntent, 343);
                }
                else if(position == 344){
                    Intent myIntent = new Intent(view.getContext(), structural.class);
                    startActivityForResult(myIntent, 344);
                }
                else if(position == 345){
                    Intent myIntent = new Intent(view.getContext(), subnetmask.class);
                    startActivityForResult(myIntent, 345);
                }
                else if(position == 346){
                    Intent myIntent = new Intent(view.getContext(), subscrift.class);
                    startActivityForResult(myIntent, 346);
                }
                else if(position == 347){
                    Intent myIntent = new Intent(view.getContext(), superscript.class);
                    startActivityForResult(myIntent, 347);
                }
                else if(position == 348){
                    Intent myIntent = new Intent(view.getContext(), swipe.class);
                    startActivityForResult(myIntent, 348);
                }
                else if(position == 349){
                    Intent myIntent = new Intent(view.getContext(), sync.class);
                    startActivityForResult(myIntent, 349);
                }
                else if(position == 350){
                    Intent myIntent = new Intent(view.getContext(), syntax.class);
                    startActivityForResult(myIntent, 350);
                }
                else if (position == 351){
                    Intent myIntent = new Intent(view.getContext(), systemanalyst.class);
                    startActivityForResult(myIntent, 351);
                }
                else if (position == 352){
                    Intent myIntent = new Intent(view.getContext(), systemhardening.class);
                    startActivityForResult(myIntent, 352);
                }
                else if(position == 353){
                    Intent myIntent = new Intent(view.getContext(), systemresources.class);
                    startActivityForResult(myIntent, 353);
                }
                else if(position == 354){
                    Intent myIntent = new Intent(view.getContext(), table.class);
                    startActivityForResult(myIntent, 354);
                }
                else if(position == 355){
                    Intent myIntent = new Intent(view.getContext(), targetdisk.class);
                    startActivityForResult(myIntent, 355);
                }
                else if(position == 356){
                    Intent myIntent = new Intent(view.getContext(), technologyservice.class);
                    startActivityForResult(myIntent, 356);
                }
                else if(position == 357){
                    Intent myIntent = new Intent(view.getContext(), telecom.class);
                    startActivityForResult(myIntent, 357);
                }
                else if(position == 358){
                    Intent myIntent = new Intent(view.getContext(), telecon.class);
                    startActivityForResult(myIntent, 358);
                }
                else if(position == 359){
                    Intent myIntent = new Intent(view.getContext(), telehealth.class);
                    startActivityForResult(myIntent, 359);
                }
                if(position == 360){
                    Intent myIntent = new Intent(view.getContext(), terahertz.class);
                    startActivityForResult(myIntent, 360);
                }
                else if (position == 361){
                    Intent myIntent = new Intent(view.getContext(), textedit.class);
                    startActivityForResult(myIntent, 361);
                }
                else if (position == 362){
                    Intent myIntent = new Intent(view.getContext(), textalign.class);
                    startActivityForResult(myIntent, 362);
                }
                else if(position == 363){
                    Intent myIntent = new Intent(view.getContext(), tftp.class);
                    startActivityForResult(myIntent, 363);
                }
                else if(position == 364){
                    Intent myIntent = new Intent(view.getContext(), thirdparty.class);
                    startActivityForResult(myIntent, 364);
                }
                else if(position == 365){
                    Intent myIntent = new Intent(view.getContext(), thread.class);
                    startActivityForResult(myIntent, 365);
                }
                else if(position == 366){
                    Intent myIntent = new Intent(view.getContext(), throughput.class);
                    startActivityForResult(myIntent, 366);
                }
                else if(position == 367){
                    Intent myIntent = new Intent(view.getContext(), token.class);
                    startActivityForResult(myIntent, 367);
                }
                else if(position == 368){
                    Intent myIntent = new Intent(view.getContext(), traffic.class);
                    startActivityForResult(myIntent, 368);
                }
                else if(position == 369){
                    Intent myIntent = new Intent(view.getContext(), trim.class);
                    startActivityForResult(myIntent, 369);
                }
                else if(position == 370){
                    Intent myIntent = new Intent(view.getContext(), throubleshooting.class);
                    startActivityForResult(myIntent, 370);
                }
                else if(position == 371){
                    Intent myIntent = new Intent(view.getContext(), truncate.class);
                    startActivityForResult(myIntent, 371);
                }
                else if(position == 372){
                    Intent myIntent = new Intent(view.getContext(), tweak.class);
                    startActivityForResult(myIntent, 372);
                }
                else if(position == 373){
                    Intent myIntent = new Intent(view.getContext(), typerface.class);
                    startActivityForResult(myIntent, 373);
                }
                else if(position == 374){
                    Intent myIntent = new Intent(view.getContext(), typehierarchy.class);
                    startActivityForResult(myIntent, 374);
                }
                else if(position == 375){
                    Intent myIntent = new Intent(view.getContext(), u.class);
                    startActivityForResult(myIntent, 375);
                }
                else if(position == 376){
                    Intent myIntent = new Intent(view.getContext(), userflow.class);
                    startActivityForResult(myIntent, 376);
                }
                else if(position == 377){
                    Intent myIntent = new Intent(view.getContext(), userinterface.class);
                    startActivityForResult(myIntent, 377);
                }
                else if(position == 378){
                    Intent myIntent = new Intent(view.getContext(), userpersona.class);
                    startActivityForResult(myIntent, 378);
                }
                else if(position == 379){
                    Intent myIntent = new Intent(view.getContext(), userresearch.class);
                    startActivityForResult(myIntent, 379);
                }
                else if(position == 380){
                    Intent myIntent = new Intent(view.getContext(), uat.class);
                    startActivityForResult(myIntent, 380);
                }
                else if(position == 381){
                    Intent myIntent = new Intent(view.getContext(), uddi.class);
                    startActivityForResult(myIntent, 381);
                }
                else if(position == 382){
                    Intent myIntent = new Intent(view.getContext(), uefi.class);
                    startActivityForResult(myIntent, 382);
                }
                else if(position == 383){
                    Intent myIntent = new Intent(view.getContext(), unc.class);
                    startActivityForResult(myIntent, 383);
                }
                else if(position == 384){
                    Intent myIntent = new Intent(view.getContext(), uptime.class);
                    startActivityForResult(myIntent, 384);
                }
                else if(position == 385){
                    Intent myIntent = new Intent(view.getContext(), usergenerate.class);
                    startActivityForResult(myIntent, 385);
                }
                else if(position == 386){
                    Intent myIntent = new Intent(view.getContext(), userfriendly.class);
                    startActivityForResult(myIntent, 386);
                }
                else if(position == 387){
                    Intent myIntent = new Intent(view.getContext(), username.class);
                    startActivityForResult(myIntent, 387);
                }
                else if(position == 388){
                    Intent myIntent = new Intent(view.getContext(), ux.class);
                    startActivityForResult(myIntent, 388);
                }
                else if(position == 389){
                    Intent myIntent = new Intent(view.getContext(), value.class);
                    startActivityForResult(myIntent, 389);
                }
                else if(position == 390){
                    Intent myIntent = new Intent(view.getContext(), vaporware.class);
                    startActivityForResult(myIntent, 390);
                }
                else if(position == 391){
                    Intent myIntent = new Intent(view.getContext(), variable.class);
                    startActivityForResult(myIntent, 391);
                }
                else if(position == 392){
                    Intent myIntent = new Intent(view.getContext(), vector.class);
                    startActivityForResult(myIntent, 392);
                }
                else if(position == 393){
                    Intent myIntent = new Intent(view.getContext(), veronica.class);
                    startActivityForResult(myIntent, 393);
                }
                else if(position == 394){
                    Intent myIntent = new Intent(view.getContext(), version.class);
                    startActivityForResult(myIntent, 394);
                }
                else if(position == 395){
                    Intent myIntent = new Intent(view.getContext(), vfat.class);
                    startActivityForResult(myIntent, 395);
                }
                else if(position == 396){
                    Intent myIntent = new Intent(view.getContext(), viral.class);
                    startActivityForResult(myIntent, 396);
                }
                else if(position == 397){
                    Intent myIntent = new Intent(view.getContext(), virtualmachine.class);
                    startActivityForResult(myIntent, 397);
                }
                else if(position == 398){
                    Intent myIntent = new Intent(view.getContext(), virtualmemo.class);
                    startActivityForResult(myIntent, 398);
                }
                else if(position == 399){
                    Intent myIntent = new Intent(view.getContext(), virtualreality.class);
                    startActivityForResult(myIntent, 399);
                }
                else if(position == 400){
                    Intent myIntent = new Intent(view.getContext(), vlan.class);
                    startActivityForResult(myIntent, 400);
                }
                else if(position == 401){
                    Intent myIntent = new Intent(view.getContext(), vle.class);
                    startActivityForResult(myIntent, 401);
                }
                else if(position == 402){
                    Intent myIntent = new Intent(view.getContext(), vpn.class);
                    startActivityForResult(myIntent, 402);
                }
                else if(position == 403){
                    Intent myIntent = new Intent(view.getContext(), vrml.class);
                    startActivityForResult(myIntent, 403);
                }
                else if(position == 404){
                    Intent myIntent = new Intent(view.getContext(), warmboot.class);
                    startActivityForResult(myIntent, 404);
                }
                else if(position == 405){
                    Intent myIntent = new Intent(view.getContext(), wavelength.class);
                    startActivityForResult(myIntent, 405);
                }
                else if(position == 406){
                    Intent myIntent = new Intent(view.getContext(), webapp.class);
                    startActivityForResult(myIntent, 406);
                }
                else if(position == 407){
                    Intent myIntent = new Intent(view.getContext(), webserver.class);
                    startActivityForResult(myIntent, 407);
                }
                else if(position == 408){
                    Intent myIntent = new Intent(view.getContext(), wep.class);
                    startActivityForResult(myIntent, 408);
                }
                else if(position == 409){
                    Intent myIntent = new Intent(view.getContext(), whitebalance.class);
                    startActivityForResult(myIntent, 409);
                }
                else if(position == 410){
                    Intent myIntent = new Intent(view.getContext(), whitepaper.class);
                    startActivityForResult(myIntent, 410);
                }
                else if(position == 411){
                    Intent myIntent = new Intent(view.getContext(), whitelist.class);
                    startActivityForResult(myIntent, 411);
                }
                else if(position == 412){
                    Intent myIntent = new Intent(view.getContext(), wifi.class);
                    startActivityForResult(myIntent, 412);
                }
                else if(position == 413){
                    Intent myIntent = new Intent(view.getContext(), wildcard.class);
                    startActivityForResult(myIntent, 413);
                }
                else if(position == 414){
                    Intent myIntent = new Intent(view.getContext(), wimax.class);
                    startActivityForResult(myIntent, 414);
                }
                else if(position == 415){
                    Intent myIntent = new Intent(view.getContext(), wired.class);
                    startActivityForResult(myIntent, 415);
                }
                else if(position == 416){
                    Intent myIntent = new Intent(view.getContext(), wireframe.class);
                    startActivityForResult(myIntent, 416);
                }
                else if(position == 417){
                    Intent myIntent = new Intent(view.getContext(), wireless.class);
                    startActivityForResult(myIntent, 417);
                }
                else if(position == 418){
                    Intent myIntent = new Intent(view.getContext(), wpa.class);
                    startActivityForResult(myIntent, 418);
                }
                else if(position == 419){
                    Intent myIntent = new Intent(view.getContext(), xml.class);
                    startActivityForResult(myIntent, 419);
                }
                else if(position == 420){
                    Intent myIntent = new Intent(view.getContext(), xslt.class);
                    startActivityForResult(myIntent, 420);
                }
                else if(position == 421){
                    Intent myIntent = new Intent(view.getContext(), y2k.class);
                    startActivityForResult(myIntent, 421);
                }
            }
        });



        return rootView;
    }


    // @Override
    // public String toString() {
    //     return "TECH TERMS";
    //  }
}
