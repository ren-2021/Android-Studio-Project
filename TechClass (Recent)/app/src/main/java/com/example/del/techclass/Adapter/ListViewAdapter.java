package com.example.del.techclass.Adapter;

import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.icu.util.ValueIterator;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.FilterQueryProvider;
import android.widget.TextView;

import com.example.del.techclass.FragmentsTerms.*;
import com.example.del.techclass.FragmentsTerms.Boolean;
import com.example.del.techclass.FragmentsTerms.Character;
import com.example.del.techclass.R;
import com.example.del.techclass.SearchViewActivity;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class ListViewAdapter extends BaseAdapter{

    Context mContext;
    LayoutInflater layoutInflater;
    List<Country> modellist;
    ArrayList<Country> arrayList;

    public ListViewAdapter(Context context, List<Country> modellist) {
        mContext = context;
        this.modellist = modellist;
        layoutInflater = LayoutInflater.from(context);
        this.arrayList = new ArrayList<Country>();
        this.arrayList.addAll(modellist);
    }

    public class ViewHolder{
        TextView title;
    }

    @Override
    public int getCount() {
        return modellist.size();
    }

    @Override
    public Object getItem(int position) {
        return modellist.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(final int position, View view, ViewGroup parent) {
        ViewHolder viewHolder;
       if(view==null){
            viewHolder = new ViewHolder();
            view = layoutInflater.inflate(R.layout.item_layout, null);

            viewHolder.title = view.findViewById(R.id.username);

            view.setTag(viewHolder);
        }else {
            viewHolder = (ViewHolder)view.getTag();
        }

        viewHolder.title.setText(modellist.get(position).getName());

        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(modellist.get(position).getName().equals("A/B TESTING")){
                    Intent intent = new Intent(v.getContext(), abtexting.class);
                    v.getContext().startActivity(intent);
                }
                else if(modellist.get(position).getName().equals("Ad Hoc Network")){
                    Intent intent = new Intent(v.getContext(), Adhocnetwork.class);
                    v.getContext().startActivity(intent);
                }
                else if(modellist.get(position).getName().equals("Affiliate Marketing")){
                    Intent intent = new Intent(v.getContext(), affiliate.class);
                    v.getContext().startActivity(intent);
                }
                else if(modellist.get(position).getName().equals("Analog")){
                    Intent intent = new Intent(v.getContext(), analog.class);
                    v.getContext().startActivity(intent);
                }
                else if(modellist.get(position).getName().equals("ANSI")){
                    Intent intent = new Intent(v.getContext(), ansi.class);
                    v.getContext().startActivity(intent);
                }
                else if(modellist.get(position).getName().equals("API")){
                    Intent intent = new Intent(v.getContext(), API.class);
                    v.getContext().startActivity(intent);
                }
                else if(modellist.get(position).getName().equals("Apple")){
                    Intent intent = new Intent(v.getContext(), Apple.class);
                    v.getContext().startActivity(intent);
                }
                else if(modellist.get(position).getName().equals("APPLICATION")){
                    Intent intent = new Intent(v.getContext(), application.class);
                    v.getContext().startActivity(intent);
                }
                else if(modellist.get(position).getName().equals("ARP")){
                    Intent intent = new Intent(v.getContext(), Arp.class);
                    v.getContext().startActivity(intent);
                }
                else if(modellist.get(position).getName().equals("ASCII")){
                    Intent intent = new Intent(v.getContext(), artificial.class);
                    v.getContext().startActivity(intent);
                }
                else if(modellist.get(position).getName().equals("Assistive Technology")){
                    Intent intent = new Intent(v.getContext(), assistive.class);
                    v.getContext().startActivity(intent);
                }
                else if(modellist.get(position).getName().equals("ATTRIBUTE")){
                    Intent intent = new Intent(v.getContext(), attribute.class);
                    v.getContext().startActivity(intent);
                }
                else if(modellist.get(position).getName().equals("Augmented Reality")){
                    Intent intent = new Intent(v.getContext(), augmented.class);
                    v.getContext().startActivity(intent);
                }
                else if(modellist.get(position).getName().equals("Back End")){
                    Intent intent = new Intent(v.getContext(), BackEnd.class);
                    v.getContext().startActivity(intent);
                }
                else if(modellist.get(position).getName().equals("BarCraft")){
                    Intent intent = new Intent(v.getContext(), barcraft.class);
                    v.getContext().startActivity(intent);
                }
                else if(modellist.get(position).getName().equals("Baseband")){
                    Intent intent = new Intent(v.getContext(), BaseBand.class);
                    v.getContext().startActivity(intent);
                }
                else if(modellist.get(position).getName().equals("Bespoke")){
                    Intent intent = new Intent(v.getContext(), Bespoke.class);
                    v.getContext().startActivity(intent);
                }
                else if(modellist.get(position).getName().equals("Bézier Curve")){
                    Intent intent = new Intent(v.getContext(), BezierCurve.class);
                    v.getContext().startActivity(intent);
                }
                else if(modellist.get(position).getName().equals("BIG DATA")){
                    Intent intent = new Intent(v.getContext(), bigdata.class);
                    v.getContext().startActivity(intent);
                }
                else if(modellist.get(position).getName().equals("Binary")){
                    Intent intent = new Intent(v.getContext(), Binary.class);
                    v.getContext().startActivity(intent);
                }
                else if(modellist.get(position).getName().equals("Biometrics")){
                    Intent intent = new Intent(v.getContext(), Biometrix.class);
                    v.getContext().startActivity(intent);
                }
                else if(modellist.get(position).getName().equals("Bitcoin")){
                    Intent intent = new Intent(v.getContext(), Bitcoin.class);
                    v.getContext().startActivity(intent);
                }
                else if(modellist.get(position).getName().equals("Blacklist")){
                    Intent intent = new Intent(v.getContext(), Blacklist.class);
                    v.getContext().startActivity(intent);
                }
                else if(modellist.get(position).getName().equals("Bluetooth")){
                    Intent intent = new Intent(v.getContext(), Bluetooth.class);
                    v.getContext().startActivity(intent);
                }
                else if(modellist.get(position).getName().equals("Boolean")){
                    Intent intent = new Intent(v.getContext(), Boolean.class);
                    v.getContext().startActivity(intent);
                }
                else if(modellist.get(position).getName().equals("Boot")){
                    Intent intent = new Intent(v.getContext(), Boot.class);
                    v.getContext().startActivity(intent);
                }
                else if(modellist.get(position).getName().equals("Boot Sector")){
                    Intent intent = new Intent(v.getContext(), bootsector.class);
                    v.getContext().startActivity(intent);
                }
                else if(modellist.get(position).getName().equals("Boot Sequence")){
                    Intent intent = new Intent(v.getContext(), bootsequence.class);
                    v.getContext().startActivity(intent);
                }
                else if(modellist.get(position).getName().equals("Bounce Rate")){
                    Intent intent = new Intent(v.getContext(), bounce.class);
                    v.getContext().startActivity(intent);
                }
                else if(modellist.get(position).getName().equals("Breadcrumbs")){
                    Intent intent = new Intent(v.getContext(), Breadcrumbs.class);
                    v.getContext().startActivity(intent);
                }
                else if(modellist.get(position).getName().equals("Buffer")){
                    Intent intent = new Intent(v.getContext(), Buffer.class);
                    v.getContext().startActivity(intent);
                }
                else if(modellist.get(position).getName().equals("Bug")){
                    Intent intent = new Intent(v.getContext(), Bug.class);
                    v.getContext().startActivity(intent);
                }
                else if(modellist.get(position).getName().equals("Burn")){
                    Intent intent = new Intent(v.getContext(), Burn.class);
                    v.getContext().startActivity(intent);
                }
                else if(modellist.get(position).getName().equals("Cache")){
                    Intent intent = new Intent(v.getContext(), Cache.class);
                    v.getContext().startActivity(intent);
                }
                else if(modellist.get(position).getName().equals("Caching")){
                    Intent intent = new Intent(v.getContext(), Caching.class);
                    v.getContext().startActivity(intent);
                }
                else if(modellist.get(position).getName().equals("CAD")){
                    Intent intent = new Intent(v.getContext(), CAD.class);
                    v.getContext().startActivity(intent);
                }
                else if(modellist.get(position).getName().equals("Call to Action (CTA)")){
                    Intent intent = new Intent(v.getContext(), Calltoaction.class);
                    v.getContext().startActivity(intent);
                }
                else if(modellist.get(position).getName().equals("CamelCase")){
                    Intent intent = new Intent(v.getContext(), Camelcase.class);
                    v.getContext().startActivity(intent);
                }
                else if(modellist.get(position).getName().equals("Camera RAW")){
                    Intent intent = new Intent(v.getContext(), CameraRaw.class);
                    v.getContext().startActivity(intent);
                }
                else if(modellist.get(position).getName().equals("Caps Lock")){
                    Intent intent = new Intent(v.getContext(), Capslock.class);
                    v.getContext().startActivity(intent);
                }
                else if(modellist.get(position).getName().equals("CDMA")){
                    Intent intent = new Intent(v.getContext(), CDMA.class);
                    v.getContext().startActivity(intent);
                }
                else if(modellist.get(position).getName().equals("Character")){
                    Intent intent = new Intent(v.getContext(), Character.class);
                    v.getContext().startActivity(intent);
                }
                else if(modellist.get(position).getName().equals("Circuit")){
                    Intent intent = new Intent(v.getContext(), Circuit.class);
                    v.getContext().startActivity(intent);
                }
                else if(modellist.get(position).getName().equals("Clean Room")){
                    Intent intent = new Intent(v.getContext(), CleanRoom.class);
                    v.getContext().startActivity(intent);
                }
                else if(modellist.get(position).getName().equals("Client-Server Model")){
                    Intent intent = new Intent(v.getContext(), client_server.class);
                    v.getContext().startActivity(intent);
                }
                else if(modellist.get(position).getName().equals("Clock Cycle")){
                    Intent intent = new Intent(v.getContext(), Clockcycle.class);
                    v.getContext().startActivity(intent);
                }
                else if(modellist.get(position).getName().equals("Clock Speed")){
                    Intent intent = new Intent(v.getContext(), ClockSpeed.class);
                    v.getContext().startActivity(intent);
                }
                else if(modellist.get(position).getName().equals("Cloud Computing")){
                    Intent intent = new Intent(v.getContext(), CloudComp.class);
                    v.getContext().startActivity(intent);
                }
                else if(modellist.get(position).getName().equals("CMYK")){
                    Intent intent = new Intent(v.getContext(), CMYK.class);
                    v.getContext().startActivity(intent);
                }
                else if(modellist.get(position).getName().equals("Cold Boot")){
                    Intent intent = new Intent(v.getContext(), Coldboot.class);
                    v.getContext().startActivity(intent);
                }
                else if(modellist.get(position).getName().equals("Color Theory")){
                    Intent intent = new Intent(v.getContext(), Colortheory.class);
                    v.getContext().startActivity(intent);
                }
                else if(modellist.get(position).getName().equals("Color Value")){
                    Intent intent = new Intent(v.getContext(), ColorValue.class);
                    v.getContext().startActivity(intent);
                }
                else if(modellist.get(position).getName().equals("Column")){
                    Intent intent = new Intent(v.getContext(), Column.class);
                    v.getContext().startActivity(intent);
                }
                else if(modellist.get(position).getName().equals("Computer Ethics")){
                    Intent intent = new Intent(v.getContext(), ComputerEthics.class);
                    v.getContext().startActivity(intent);
                }
                else if(modellist.get(position).getName().equals("Computer Science")){
                    Intent intent = new Intent(v.getContext(), ComputerScience.class);
                    v.getContext().startActivity(intent);
                }
                else if(modellist.get(position).getName().equals("Configuration")){
                    Intent intent = new Intent(v.getContext(), Configuration.class);
                    v.getContext().startActivity(intent);
                }
                else if(modellist.get(position).getName().equals("Constant")){
                    Intent intent = new Intent(v.getContext(), Constant.class);
                    v.getContext().startActivity(intent);
                }
                else if(modellist.get(position).getName().equals("Content Curation")){
                    Intent intent = new Intent(v.getContext(), contentcuration.class);
                    v.getContext().startActivity(intent);
                }
                else if(modellist.get(position).getName().equals("Content Marketing")){
                    Intent intent = new Intent(v.getContext(), contentmarketing.class);
                    v.getContext().startActivity(intent);
                }
                else if(modellist.get(position).getName().equals("Conversion")){
                    Intent intent = new Intent(v.getContext(), conversion.class);
                    v.getContext().startActivity(intent);
                }
                else if(modellist.get(position).getName().equals("Copyright")){
                    Intent intent = new Intent(v.getContext(), Copyright.class);
                    v.getContext().startActivity(intent);
                }
                else if(modellist.get(position).getName().equals("Copyright Infringement")){
                    Intent intent = new Intent(v.getContext(), copyrightinfringe.class);
                    v.getContext().startActivity(intent);
                }
                else if(modellist.get(position).getName().equals("CPS")){
                    Intent intent = new Intent(v.getContext(), CPS.class);
                    v.getContext().startActivity(intent);
                }
                else if(modellist.get(position).getName().equals("Crop")){
                    Intent intent = new Intent(v.getContext(), Crop.class);
                    v.getContext().startActivity(intent);
                }
                else if(modellist.get(position).getName().equals("Crossplatform")){
                    Intent intent = new Intent(v.getContext(), Crossplatform.class);
                    v.getContext().startActivity(intent);
                }
                else if(modellist.get(position).getName().equals("Cryptography")){
                    Intent intent = new Intent(v.getContext(), Cryptography.class);
                    v.getContext().startActivity(intent);
                }
                else if(modellist.get(position).getName().equals("CSS")){
                    Intent intent = new Intent(v.getContext(), CSS.class);
                    v.getContext().startActivity(intent);
                }
                else if(modellist.get(position).getName().equals("CSS3")){
                    Intent intent = new Intent(v.getContext(), CSS3.class);
                    v.getContext().startActivity(intent);
                }
                else if(modellist.get(position).getName().equals("CTP")){
                    Intent intent = new Intent(v.getContext(), CTP.class);
                    v.getContext().startActivity(intent);
                }
                else if(modellist.get(position).getName().equals("CLICK THROUGH RATE (CTR)")){
                    Intent intent = new Intent(v.getContext(), CTR.class);
                    v.getContext().startActivity(intent);
                }
                else if(modellist.get(position).getName().equals("CUDA")){
                    Intent intent = new Intent(v.getContext(), CUDA.class);
                    v.getContext().startActivity(intent);
                }
                else if(modellist.get(position).getName().equals("Cybercrime")){
                    Intent intent = new Intent(v.getContext(), CyberCrime.class);
                    v.getContext().startActivity(intent);
                }
                else if(modellist.get(position).getName().equals("Data Architecture")){
                    Intent intent = new Intent(v.getContext(), dataarchitech.class);
                    v.getContext().startActivity(intent);
                }
                else if(modellist.get(position).getName().equals("Database")){
                    Intent intent = new Intent(v.getContext(), Database.class);
                    v.getContext().startActivity(intent);
                }
                else if(modellist.get(position).getName().equals("Data Mining")){
                    Intent intent = new Intent(v.getContext(), datamining.class);
                    v.getContext().startActivity(intent);
                }
                else if(modellist.get(position).getName().equals("Data Modelling")){
                    Intent intent = new Intent(v.getContext(), datamodel.class);
                    v.getContext().startActivity(intent);
                }
                else if(modellist.get(position).getName().equals("Data Visualization")){
                    Intent intent = new Intent(v.getContext(), datavisual.class);
                    v.getContext().startActivity(intent);
                }
                else if(modellist.get(position).getName().equals("DAW")){
                    Intent intent = new Intent(v.getContext(), daw.class);
                    v.getContext().startActivity(intent);
                }
                else if(modellist.get(position).getName().equals("Declaration")){
                    Intent intent = new Intent(v.getContext(), declaration.class);
                    v.getContext().startActivity(intent);
                }
                else if(modellist.get(position).getName().equals("DDL")){
                    Intent intent = new Intent(v.getContext(), DDL.class);
                    v.getContext().startActivity(intent);
                }
                else if(modellist.get(position).getName().equals("Default")){
                    Intent intent = new Intent(v.getContext(), Default.class);
                    v.getContext().startActivity(intent);
                }
                else if(modellist.get(position).getName().equals("Defragment")){
                    Intent intent = new Intent(v.getContext(), defragment.class);
                    v.getContext().startActivity(intent);
                }
                else if(modellist.get(position).getName().equals("Delete")){
                    Intent intent = new Intent(v.getContext(), delete.class);
                    v.getContext().startActivity(intent);
                }
                else if(modellist.get(position).getName().equals("Denary")){
                    Intent intent = new Intent(v.getContext(), denary.class);
                    v.getContext().startActivity(intent);
                }
                else if(modellist.get(position).getName().equals("DEVOPS")){
                    Intent intent = new Intent(v.getContext(), devops.class);
                    v.getContext().startActivity(intent);
                }
                else if(modellist.get(position).getName().equals("Developer")){
                    Intent intent = new Intent(v.getContext(), developer.class);
                    v.getContext().startActivity(intent);
                }
                else if(modellist.get(position).getName().equals("DFS")){
                    Intent intent = new Intent(v.getContext(), DFS.class);
                    v.getContext().startActivity(intent);
                }
                else if(modellist.get(position).getName().equals("Digital")){
                    Intent intent = new Intent(v.getContext(), digital.class);
                    v.getContext().startActivity(intent);
                }
                else if(modellist.get(position).getName().equals("Digitize")){
                    Intent intent = new Intent(v.getContext(), digitize.class);
                    v.getContext().startActivity(intent);
                }
                else if(modellist.get(position).getName().equals("Dithering")){
                    Intent intent = new Intent(v.getContext(), dithering.class);
                    v.getContext().startActivity(intent);
                }
                else if(modellist.get(position).getName().equals("DMZ")){
                    Intent intent = new Intent(v.getContext(), DMZ.class);
                    v.getContext().startActivity(intent);
                }
                else if(modellist.get(position).getName().equals("Domain")){
                    Intent intent = new Intent(v.getContext(), domain.class);
                    v.getContext().startActivity(intent);
                }
                else if(modellist.get(position).getName().equals("Dot Matrix")){
                    Intent intent = new Intent(v.getContext(), dotmatrix.class);
                    v.getContext().startActivity(intent);
                }
                else if(modellist.get(position).getName().equals("Double Click")){
                    Intent intent = new Intent(v.getContext(), doubleclick.class);
                    v.getContext().startActivity(intent);
                }
                else if(modellist.get(position).getName().equals("DPI")){
                    Intent intent = new Intent(v.getContext(), dpi.class);
                    v.getContext().startActivity(intent);
                }
                else if(modellist.get(position).getName().equals("Drag")){
                    Intent intent = new Intent(v.getContext(), drag.class);
                    v.getContext().startActivity(intent);
                }
                else if(modellist.get(position).getName().equals("DRM")){
                    Intent intent = new Intent(v.getContext(), drm.class);
                    v.getContext().startActivity(intent);
                }
                else if(modellist.get(position).getName().equals("DTD")){
                    Intent intent = new Intent(v.getContext(), dtd.class);
                    v.getContext().startActivity(intent);
                }
                else if(modellist.get(position).getName().equals("DV")){
                    Intent intent = new Intent(v.getContext(), dv.class);
                    v.getContext().startActivity(intent);
                }
                else if(modellist.get(position).getName().equals("E-learning")){
                    Intent intent = new Intent(v.getContext(), elearning.class);
                    v.getContext().startActivity(intent);
                }
                else if(modellist.get(position).getName().equals("Edutainment")){
                    Intent intent = new Intent(v.getContext(), edutainment.class);
                    v.getContext().startActivity(intent);
                }
                else if(modellist.get(position).getName().equals("Element")){
                    Intent intent = new Intent(v.getContext(), element.class);
                    v.getContext().startActivity(intent);
                }
                else if(modellist.get(position).getName().equals("Email Marketing")){
                    Intent intent = new Intent(v.getContext(), emailmarket.class);
                    v.getContext().startActivity(intent);
                }
                else if(modellist.get(position).getName().equals("Embedding")){
                    Intent intent = new Intent(v.getContext(), embedding.class);
                    v.getContext().startActivity(intent);
                }
                else if(modellist.get(position).getName().equals("Emulation")){
                    Intent intent = new Intent(v.getContext(), emulation.class);
                    v.getContext().startActivity(intent);
                }
                else if(modellist.get(position).getName().equals("Encryption")){
                    Intent intent = new Intent(v.getContext(), encryption.class);
                    v.getContext().startActivity(intent);
                }
                else if(modellist.get(position).getName().equals("End User")){
                    Intent intent = new Intent(v.getContext(), enduser.class);
                    v.getContext().startActivity(intent);
                }
                else if(modellist.get(position).getName().equals("Engagement")){
                    Intent intent = new Intent(v.getContext(), engagement.class);
                    v.getContext().startActivity(intent);
                }
                else if(modellist.get(position).getName().equals("Enterprise")){
                    Intent intent = new Intent(v.getContext(), enterprise.class);
                    v.getContext().startActivity(intent);
                }
                else if(modellist.get(position).getName().equals("Ergonomics")){
                    Intent intent = new Intent(v.getContext(), ergonomics.class);
                    v.getContext().startActivity(intent);
                }
                else if(modellist.get(position).getName().equals("eSports")){
                    Intent intent = new Intent(v.getContext(), esports.class);
                    v.getContext().startActivity(intent);
                }
                else if(modellist.get(position).getName().equals("EUP")){
                    Intent intent = new Intent(v.getContext(), EUP.class);
                    v.getContext().startActivity(intent);
                }
                else if(modellist.get(position).getName().equals("FAQ")){
                    Intent intent = new Intent(v.getContext(), FAQ.class);
                    v.getContext().startActivity(intent);
                }
                else if(modellist.get(position).getName().equals("FDDI")){
                    Intent intent = new Intent(v.getContext(), fddi.class);
                    v.getContext().startActivity(intent);
                }
                else if(modellist.get(position).getName().equals("Field")){
                    Intent intent = new Intent(v.getContext(), field.class);
                    v.getContext().startActivity(intent);
                }
                else if(modellist.get(position).getName().equals("FIFO")){
                    Intent intent = new Intent(v.getContext(), fifo.class);
                    v.getContext().startActivity(intent);
                }
                else if(modellist.get(position).getName().equals("File System")){
                    Intent intent = new Intent(v.getContext(), filesystem.class);
                    v.getContext().startActivity(intent);
                }
                else if(modellist.get(position).getName().equals("FILO")){
                    Intent intent = new Intent(v.getContext(), filo.class);
                    v.getContext().startActivity(intent);
                }
                else if(modellist.get(position).getName().equals("FIREWALL")){
                    Intent intent = new Intent(v.getContext(), firewall.class);
                    v.getContext().startActivity(intent);
                }
                else if(modellist.get(position).getName().equals("Flexible")){
                    Intent intent = new Intent(v.getContext(), flexible.class);
                    v.getContext().startActivity(intent);
                }
                else if(modellist.get(position).getName().equals("Floating Point")){
                    Intent intent = new Intent(v.getContext(), floatingpoint.class);
                    v.getContext().startActivity(intent);
                }
                else if(modellist.get(position).getName().equals("FLOPS")){
                    Intent intent = new Intent(v.getContext(), flops.class);
                    v.getContext().startActivity(intent);
                }
                else if(modellist.get(position).getName().equals("Flowchart")){
                    Intent intent = new Intent(v.getContext(), flowchart.class);
                    v.getContext().startActivity(intent);
                }
                else if(modellist.get(position).getName().equals("Font")){
                    Intent intent = new Intent(v.getContext(), font.class);
                    v.getContext().startActivity(intent);
                }
                else if(modellist.get(position).getName().equals("Font Case")){
                    Intent intent = new Intent(v.getContext(), fontcase.class);
                    v.getContext().startActivity(intent);
                }
                else if(modellist.get(position).getName().equals("Footer")){
                    Intent intent = new Intent(v.getContext(), footer.class);
                    v.getContext().startActivity(intent);
                }
                else if(modellist.get(position).getName().equals("Format")){
                    Intent intent = new Intent(v.getContext(), format.class);
                    v.getContext().startActivity(intent);
                }
                else if(modellist.get(position).getName().equals("Formula")){
                    Intent intent = new Intent(v.getContext(), formula.class);
                    v.getContext().startActivity(intent);
                }
                else if(modellist.get(position).getName().equals("FQDN")){
                    Intent intent = new Intent(v.getContext(), fqdn.class);
                    v.getContext().startActivity(intent);
                }
                else if(modellist.get(position).getName().equals("Fragmentation")){
                    Intent intent = new Intent(v.getContext(), fragmentation.class);
                    v.getContext().startActivity(intent);
                }
                else if(modellist.get(position).getName().equals("Frame")){
                    Intent intent = new Intent(v.getContext(), frame.class);
                    v.getContext().startActivity(intent);
                }
                else if(modellist.get(position).getName().equals("FRAMEWORK")){
                    Intent intent = new Intent(v.getContext(), framework.class);
                    v.getContext().startActivity(intent);
                }
                else if(modellist.get(position).getName().equals("Frequency")){
                    Intent intent = new Intent(v.getContext(), frequency.class);
                    v.getContext().startActivity(intent);
                }
                else if(modellist.get(position).getName().equals("Front End")){
                    Intent intent = new Intent(v.getContext(), frontend.class);
                    v.getContext().startActivity(intent);
                }
                else if(modellist.get(position).getName().equals("Full-Duplex")){
                    Intent intent = new Intent(v.getContext(), fullduplex.class);
                    v.getContext().startActivity(intent);
                }
                else if(modellist.get(position).getName().equals("FUNNEL")){
                    Intent intent = new Intent(v.getContext(), funnel.class);
                    v.getContext().startActivity(intent);
                }
                else if(modellist.get(position).getName().equals("Gigaflops")){
                    Intent intent = new Intent(v.getContext(), gigaflops.class);
                    v.getContext().startActivity(intent);
                }
                else if(modellist.get(position).getName().equals("Gigahertz")){
                    Intent intent = new Intent(v.getContext(), gigahertz.class);
                    v.getContext().startActivity(intent);
                }
                else if(modellist.get(position).getName().equals("GIGO")){
                    Intent intent = new Intent(v.getContext(), gigo.class);
                    v.getContext().startActivity(intent);
                }
                else if(modellist.get(position).getName().equals("GIS")){
                    Intent intent = new Intent(v.getContext(), gis.class);
                    v.getContext().startActivity(intent);
                }
                else if(modellist.get(position).getName().equals("GPGPU")){
                    Intent intent = new Intent(v.getContext(), gpgpu.class);
                    v.getContext().startActivity(intent);
                }
                else if(modellist.get(position).getName().equals("GPIO")){
                    Intent intent = new Intent(v.getContext(), gpio.class);
                    v.getContext().startActivity(intent);
                }
                else if(modellist.get(position).getName().equals("GPS")){
                    Intent intent = new Intent(v.getContext(), gps.class);
                    v.getContext().startActivity(intent);
                }
                else if(modellist.get(position).getName().equals("Graphics")){
                    Intent intent = new Intent(v.getContext(), graphics.class);
                    v.getContext().startActivity(intent);
                }
                else if(modellist.get(position).getName().equals("Grayscale")){
                    Intent intent = new Intent(v.getContext(), grayscale.class);
                    v.getContext().startActivity(intent);
                }
                else if(modellist.get(position).getName().equals("Grid System")){
                    Intent intent = new Intent(v.getContext(), grid.class);
                    v.getContext().startActivity(intent);
                }
                else if(modellist.get(position).getName().equals("Growth Hacking")){
                    Intent intent = new Intent(v.getContext(), growthhacking.class);
                    v.getContext().startActivity(intent);
                }
                else if(modellist.get(position).getName().equals("Hacker")){
                    Intent intent = new Intent(v.getContext(), hacker.class);
                    v.getContext().startActivity(intent);
                }
                else if(modellist.get(position).getName().equals("Half-Duplex")){
                    Intent intent = new Intent(v.getContext(), halfduplex.class);
                    v.getContext().startActivity(intent);
                }
                else if(modellist.get(position).getName().equals("Halftone")){
                    Intent intent = new Intent(v.getContext(), halftone.class);
                    v.getContext().startActivity(intent);
                }
                else if(modellist.get(position).getName().equals("Handshake")){
                    Intent intent = new Intent(v.getContext(), handshake.class);
                    v.getContext().startActivity(intent);
                }
                else if(modellist.get(position).getName().equals("Hard Copy")){
                    Intent intent = new Intent(v.getContext(), hardcopy.class);
                    v.getContext().startActivity(intent);
                }
                else if(modellist.get(position).getName().equals("HDTV")){
                    Intent intent = new Intent(v.getContext(), hdtv.class);
                    v.getContext().startActivity(intent);
                }
                else if(modellist.get(position).getName().equals("HDV")){
                    Intent intent = new Intent(v.getContext(), hdv.class);
                    v.getContext().startActivity(intent);
                }
                else if(modellist.get(position).getName().equals("Header")){
                    Intent intent = new Intent(v.getContext(), header.class);
                    v.getContext().startActivity(intent);
                }
                else if(modellist.get(position).getName().equals("Hertz")){
                    Intent intent = new Intent(v.getContext(), hertz.class);
                    v.getContext().startActivity(intent);
                }
                else if(modellist.get(position).getName().equals("Hexadecimal")){
                    Intent intent = new Intent(v.getContext(), hezadecimal.class);
                    v.getContext().startActivity(intent);
                }
                else if(modellist.get(position).getName().equals("HFS")){
                    Intent intent = new Intent(v.getContext(), hfs.class);
                    v.getContext().startActivity(intent);
                }
                else if(modellist.get(position).getName().equals("Hibernate")){
                    Intent intent = new Intent(v.getContext(), hibernate.class);
                    v.getContext().startActivity(intent);
                }
                else if(modellist.get(position).getName().equals("Hybrid App")){
                    Intent intent = new Intent(v.getContext(), hybridapp.class);
                    v.getContext().startActivity(intent);
                }
                else if(modellist.get(position).getName().equals("HTML")){
                    Intent intent = new Intent(v.getContext(), html.class);
                    v.getContext().startActivity(intent);
                }
                else if(modellist.get(position).getName().equals("HTML5")){
                    Intent intent = new Intent(v.getContext(), html5.class);
                    v.getContext().startActivity(intent);
                }
                else if(modellist.get(position).getName().equals("Hostname")){
                    Intent intent = new Intent(v.getContext(), hostname.class);
                    v.getContext().startActivity(intent);
                }
                else if(modellist.get(position).getName().equals("Hover")){
                    Intent intent = new Intent(v.getContext(), hover.class);
                    v.getContext().startActivity(intent);
                }
                else if(modellist.get(position).getName().equals("Hyper-Threading")){
                    Intent intent = new Intent(v.getContext(), hyperthreading.class);
                    v.getContext().startActivity(intent);
                }
                else if(modellist.get(position).getName().equals("I/O")){
                    Intent intent = new Intent(v.getContext(), IO.class);
                    v.getContext().startActivity(intent);
                }
                else if(modellist.get(position).getName().equals("IDE")){
                    Intent intent = new Intent(v.getContext(), ide.class);
                    v.getContext().startActivity(intent);
                }
                else if(modellist.get(position).getName().equals("IDS")){
                    Intent intent = new Intent(v.getContext(), ids.class);
                    v.getContext().startActivity(intent);
                }
                else if(modellist.get(position).getName().equals("IEEE")){
                    Intent intent = new Intent(v.getContext(), ieee.class);
                    v.getContext().startActivity(intent);
                }
                else if(modellist.get(position).getName().equals("Impressions")){
                    Intent intent = new Intent(v.getContext(), impressions.class);
                    v.getContext().startActivity(intent);
                }
                else if(modellist.get(position).getName().equals("Influencer")){
                    Intent intent = new Intent(v.getContext(), infuencer.class);
                    v.getContext().startActivity(intent);
                }
                else if(modellist.get(position).getName().equals("Infotainment")){
                    Intent intent = new Intent(v.getContext(), infitainment.class);
                    v.getContext().startActivity(intent);
                }
                else if(modellist.get(position).getName().equals("Input")){
                    Intent intent = new Intent(v.getContext(), input.class);
                    v.getContext().startActivity(intent);
                }
                else if(modellist.get(position).getName().equals("Integer")){
                    Intent intent = new Intent(v.getContext(), integer.class);
                    v.getContext().startActivity(intent);
                }
                else if(modellist.get(position).getName().equals("Integrated")){
                    Intent intent = new Intent(v.getContext(), integrated.class);
                    v.getContext().startActivity(intent);
                }
                else if(modellist.get(position).getName().equals("Intellectual Property")){
                    Intent intent = new Intent(v.getContext(), intellectualproperty.class);
                    v.getContext().startActivity(intent);
                }
                else if(modellist.get(position).getName().equals("Interlaced")){
                    Intent intent = new Intent(v.getContext(), interlaced.class);
                    v.getContext().startActivity(intent);
                }
                else if(modellist.get(position).getName().equals("Intranet")){
                    Intent intent = new Intent(v.getContext(), intranet.class);
                    v.getContext().startActivity(intent);
                }
                else if(modellist.get(position).getName().equals("IPS")){
                    Intent intent = new Intent(v.getContext(), ips.class);
                    v.getContext().startActivity(intent);
                }
                else if(modellist.get(position).getName().equals("IPX")){
                    Intent intent = new Intent(v.getContext(), ipx.class);
                    v.getContext().startActivity(intent);
                }
                else if(modellist.get(position).getName().equals("ISO")){
                    Intent intent = new Intent(v.getContext(), iso.class);
                    v.getContext().startActivity(intent);
                }
                else if(modellist.get(position).getName().equals("IT")){
                    Intent intent = new Intent(v.getContext(), it.class);
                    v.getContext().startActivity(intent);
                }
                else if(modellist.get(position).getName().equals("IVR")){
                    Intent intent = new Intent(v.getContext(), ivr.class);
                    v.getContext().startActivity(intent);
                }
                else if(modellist.get(position).getName().equals("JFS")){
                    Intent intent = new Intent(v.getContext(), jfs.class);
                    v.getContext().startActivity(intent);
                }
                else if(modellist.get(position).getName().equals("Kerning")){
                    Intent intent = new Intent(v.getContext(), kerning.class);
                    v.getContext().startActivity(intent);
                }
                else if(modellist.get(position).getName().equals("Keystroke")){
                    Intent intent = new Intent(v.getContext(), keystroke.class);
                    v.getContext().startActivity(intent);
                }
                else if(modellist.get(position).getName().equals("Keywords")){
                    Intent intent = new Intent(v.getContext(), keywords.class);
                    v.getContext().startActivity(intent);
                }
                else if(modellist.get(position).getName().equals("Kilohertz")){
                    Intent intent = new Intent(v.getContext(), kilohertz.class);
                    v.getContext().startActivity(intent);
                }
                else if(modellist.get(position).getName().equals("LAN")){
                    Intent intent = new Intent(v.getContext(), Lan.class);
                    v.getContext().startActivity(intent);
                }
                else if(modellist.get(position).getName().equals("Leading")){
                    Intent intent = new Intent(v.getContext(), leading.class);
                    v.getContext().startActivity(intent);
                }
                else if(modellist.get(position).getName().equals("Leaf")){
                    Intent intent = new Intent(v.getContext(), leaf.class);
                    v.getContext().startActivity(intent);
                }
                else if(modellist.get(position).getName().equals("Left-Click")){
                    Intent intent = new Intent(v.getContext(), leftclick.class);
                    v.getContext().startActivity(intent);
                }
                else if(modellist.get(position).getName().equals("LIFO")){
                    Intent intent = new Intent(v.getContext(), lifo.class);
                    v.getContext().startActivity(intent);
                }
                else if(modellist.get(position).getName().equals("Load Balancing")){
                    Intent intent = new Intent(v.getContext(), loadbalancing.class);
                    v.getContext().startActivity(intent);
                }
                else if(modellist.get(position).getName().equals("Localhost")){
                    Intent intent = new Intent(v.getContext(), localhost.class);
                    v.getContext().startActivity(intent);
                }
                else if(modellist.get(position).getName().equals("Log On")){
                    Intent intent = new Intent(v.getContext(), logon.class);
                    v.getContext().startActivity(intent);
                }
                else if(modellist.get(position).getName().equals("Logic Gate")){
                    Intent intent = new Intent(v.getContext(), logicgate.class);
                    v.getContext().startActivity(intent);
                }
                else if(modellist.get(position).getName().equals("Login")){
                    Intent intent = new Intent(v.getContext(), login.class);
                    v.getContext().startActivity(intent);
                }
                else if(modellist.get(position).getName().equals("LPI")){
                    Intent intent = new Intent(v.getContext(), lpi.class);
                    v.getContext().startActivity(intent);
                }
                else if(modellist.get(position).getName().equals("LTE")){
                    Intent intent = new Intent(v.getContext(), lte.class);
                    v.getContext().startActivity(intent);
                }
                else if(modellist.get(position).getName().equals("LUN")){
                    Intent intent = new Intent(v.getContext(), lun.class);
                    v.getContext().startActivity(intent);
                }
                else if(modellist.get(position).getName().equals("Macintosh")){
                    Intent intent = new Intent(v.getContext(), macintosh.class);
                    v.getContext().startActivity(intent);
                }
                else if(modellist.get(position).getName().equals("MANET")){
                    Intent intent = new Intent(v.getContext(), manet.class);
                    v.getContext().startActivity(intent);
                }
                else if(modellist.get(position).getName().equals("Margin")){
                    Intent intent = new Intent(v.getContext(), margin.class);
                    v.getContext().startActivity(intent);
                }
                else if(modellist.get(position).getName().equals("Marketing Automation")){
                    Intent intent = new Intent(v.getContext(), marketingautomation.class);
                    v.getContext().startActivity(intent);
                }
                else if(modellist.get(position).getName().equals("Markup Language")){
                    Intent intent = new Intent(v.getContext(), markuplang.class);
                    v.getContext().startActivity(intent);
                }
                else if(modellist.get(position).getName().equals("Matrix")){
                    Intent intent = new Intent(v.getContext(), matrix.class);
                    v.getContext().startActivity(intent);
                }
                else if(modellist.get(position).getName().equals("MDI")){
                    Intent intent = new Intent(v.getContext(), mdi.class);
                    v.getContext().startActivity(intent);
                }
                else if(modellist.get(position).getName().equals("Megahertz")){
                    Intent intent = new Intent(v.getContext(), megahertz.class);
                    v.getContext().startActivity(intent);
                }
                else if(modellist.get(position).getName().equals("Megapixel")){
                    Intent intent = new Intent(v.getContext(), megapixel.class);
                    v.getContext().startActivity(intent);
                }
                else if(modellist.get(position).getName().equals("Memory Bank")){
                    Intent intent = new Intent(v.getContext(), memorybank.class);
                    v.getContext().startActivity(intent);
                }
                else if(modellist.get(position).getName().equals("Mention")){
                    Intent intent = new Intent(v.getContext(), mention.class);
                    v.getContext().startActivity(intent);
                }
                else if(modellist.get(position).getName().equals("Meta Elements")){
                    Intent intent = new Intent(v.getContext(), metaelements.class);
                    v.getContext().startActivity(intent);
                }
                else if(modellist.get(position).getName().equals("Metadata")){
                    Intent intent = new Intent(v.getContext(), metadata.class);
                    v.getContext().startActivity(intent);
                }
                else if(modellist.get(position).getName().equals("MicroBlogging")){
                    Intent intent = new Intent(v.getContext(), microblog.class);
                    v.getContext().startActivity(intent);
                }
                else if(modellist.get(position).getName().equals("Micron")){
                    Intent intent = new Intent(v.getContext(), micron.class);
                    v.getContext().startActivity(intent);
                }
                else if(modellist.get(position).getName().equals("MIDI")){
                    Intent intent = new Intent(v.getContext(), midi.class);
                    v.getContext().startActivity(intent);
                }
                else if(modellist.get(position).getName().equals("Mini DV")){
                    Intent intent = new Intent(v.getContext(), minidv.class);
                    v.getContext().startActivity(intent);
                }
                else if(modellist.get(position).getName().equals("MIPS")){
                    Intent intent = new Intent(v.getContext(), mips.class);
                    v.getContext().startActivity(intent);
                }
                else if(modellist.get(position).getName().equals("MIS")){
                    Intent intent = new Intent(v.getContext(), mis.class);
                    v.getContext().startActivity(intent);
                }
                else if(modellist.get(position).getName().equals("MMS")){
                    Intent intent = new Intent(v.getContext(), mms.class);
                    v.getContext().startActivity(intent);
                }
                else if(modellist.get(position).getName().equals("Mnemonic")){
                    Intent intent = new Intent(v.getContext(), mnemonic.class);
                    v.getContext().startActivity(intent);
                }
                else if(modellist.get(position).getName().equals("Mobile")){
                    Intent intent = new Intent(v.getContext(), mobile.class);
                    v.getContext().startActivity(intent);
                }
                else if(modellist.get(position).getName().equals("Monochrome")){
                    Intent intent = new Intent(v.getContext(), monochrome.class);
                    v.getContext().startActivity(intent);
                }
                else if(modellist.get(position).getName().equals("Mood Board")){
                    Intent intent = new Intent(v.getContext(), moodboard.class);
                    v.getContext().startActivity(intent);
                }
                else if(modellist.get(position).getName().equals("Multichannel")){
                    Intent intent = new Intent(v.getContext(), multichannel.class);
                    v.getContext().startActivity(intent);
                }
                else if(modellist.get(position).getName().equals("Multimedia")){
                    Intent intent = new Intent(v.getContext(), multimedia.class);
                    v.getContext().startActivity(intent);
                }
                else if(modellist.get(position).getName().equals("Multiplatform")){
                    Intent intent = new Intent(v.getContext(), multiplatform.class);
                    v.getContext().startActivity(intent);
                }
                else if(modellist.get(position).getName().equals("Namespace")){
                    Intent intent = new Intent(v.getContext(), namespace.class);
                    v.getContext().startActivity(intent);
                }
                else if(modellist.get(position).getName().equals("Nanometer")){
                    Intent intent = new Intent(v.getContext(), nanometer.class);
                    v.getContext().startActivity(intent);
                }
                else if(modellist.get(position).getName().equals("Native App")){
                    Intent intent = new Intent(v.getContext(), nativeapp.class);
                    v.getContext().startActivity(intent);
                }
                else if(modellist.get(position).getName().equals("Network")){
                    Intent intent = new Intent(v.getContext(), network.class);
                    v.getContext().startActivity(intent);
                }
                else if(modellist.get(position).getName().equals("Network Topology")){
                    Intent intent = new Intent(v.getContext(), networktopology.class);
                    v.getContext().startActivity(intent);
                }
                else if(modellist.get(position).getName().equals("Newbie")){
                    Intent intent = new Intent(v.getContext(), newbie.class);
                    v.getContext().startActivity(intent);
                }
                else if(modellist.get(position).getName().equals("Newline")){
                    Intent intent = new Intent(v.getContext(), newline.class);
                    v.getContext().startActivity(intent);
                }
                else if(modellist.get(position).getName().equals("NINO")){
                    Intent intent = new Intent(v.getContext(), nino.class);
                    v.getContext().startActivity(intent);
                }
                else if(modellist.get(position).getName().equals("NTFS")){
                    Intent intent = new Intent(v.getContext(), ntfs.class);
                    v.getContext().startActivity(intent);
                }
                else if(modellist.get(position).getName().equals("NFC")){
                    Intent intent = new Intent(v.getContext(), nfc.class);
                    v.getContext().startActivity(intent);
                }
                else if(modellist.get(position).getName().equals("NUI")){
                    Intent intent = new Intent(v.getContext(), nui.class);
                    v.getContext().startActivity(intent);
                }
                else if(modellist.get(position).getName().equals("Null")){
                    Intent intent = new Intent(v.getContext(), Null.class);
                    v.getContext().startActivity(intent);
                }
                else if(modellist.get(position).getName().equals("Num Lock")){
                    Intent intent = new Intent(v.getContext(), numlock.class);
                    v.getContext().startActivity(intent);
                }
                else if(modellist.get(position).getName().equals("OASIS")){
                    Intent intent = new Intent(v.getContext(), oasis.class);
                    v.getContext().startActivity(intent);
                }
                else if(modellist.get(position).getName().equals("OOP")){
                    Intent intent = new Intent(v.getContext(), oop.class);
                    v.getContext().startActivity(intent);
                }
                else if(modellist.get(position).getName().equals("OEM")){
                    Intent intent = new Intent(v.getContext(), oep.class);
                    v.getContext().startActivity(intent);
                }
                else if(modellist.get(position).getName().equals("Offline")){
                    Intent intent = new Intent(v.getContext(), offline.class);
                    v.getContext().startActivity(intent);
                }
                else if(modellist.get(position).getName().equals("OLAP")){
                    Intent intent = new Intent(v.getContext(), olap.class);
                    v.getContext().startActivity(intent);
                }
                else if(modellist.get(position).getName().equals("Online")){
                    Intent intent = new Intent(v.getContext(), online.class);
                    v.getContext().startActivity(intent);
                }
                else if(modellist.get(position).getName().equals("OpenCL")){
                    Intent intent = new Intent(v.getContext(), opencl.class);
                    v.getContext().startActivity(intent);
                }
                else if(modellist.get(position).getName().equals("Opening Tag and Closing Tag")){
                    Intent intent = new Intent(v.getContext(), openingtag.class);
                    v.getContext().startActivity(intent);
                }
                else if(modellist.get(position).getName().equals("Optimization")){
                    Intent intent = new Intent(v.getContext(), optimization.class);
                    v.getContext().startActivity(intent);
                }
                else if(modellist.get(position).getName().equals("Organic")){
                    Intent intent = new Intent(v.getContext(), organic.class);
                    v.getContext().startActivity(intent);
                }
                else if(modellist.get(position).getName().equals("OSI Model")){
                    Intent intent = new Intent(v.getContext(), osimodel.class);
                    v.getContext().startActivity(intent);
                }
                else if(modellist.get(position).getName().equals("OTA")){
                    Intent intent = new Intent(v.getContext(), ota.class);
                    v.getContext().startActivity(intent);
                }
                else if(modellist.get(position).getName().equals("Output")){
                    Intent intent = new Intent(v.getContext(), output.class);
                    v.getContext().startActivity(intent);
                }
                else if(modellist.get(position).getName().equals("Overwrite")){
                    Intent intent = new Intent(v.getContext(), overwrite.class);
                    v.getContext().startActivity(intent);
                }
                else if(modellist.get(position).getName().equals("Page Fault")){
                    Intent intent = new Intent(v.getContext(), pagefault.class);
                    v.getContext().startActivity(intent);
                }
                else if(modellist.get(position).getName().equals("Page Orientation")){
                    Intent intent = new Intent(v.getContext(), pageorientation.class);
                    v.getContext().startActivity(intent);
                }
                else if(modellist.get(position).getName().equals("Parity")){
                    Intent intent = new Intent(v.getContext(), parity.class);
                    v.getContext().startActivity(intent);
                }
                else if(modellist.get(position).getName().equals("Parity Bit")){
                    Intent intent = new Intent(v.getContext(), paritybit.class);
                    v.getContext().startActivity(intent);
                }
                else if(modellist.get(position).getName().equals("Parse")){
                    Intent intent = new Intent(v.getContext(), parse.class);
                    v.getContext().startActivity(intent);
                }
                else if(modellist.get(position).getName().equals("Partition")){
                    Intent intent = new Intent(v.getContext(), partition.class);
                    v.getContext().startActivity(intent);
                }
                else if(modellist.get(position).getName().equals("Passcode")){
                    Intent intent = new Intent(v.getContext(), passcode.class);
                    v.getContext().startActivity(intent);
                }
                else if(modellist.get(position).getName().equals("Passphrase")){
                    Intent intent = new Intent(v.getContext(), passphrase.class);
                    v.getContext().startActivity(intent);
                }
                else if(modellist.get(position).getName().equals("Password")){
                    Intent intent = new Intent(v.getContext(), password.class);
                    v.getContext().startActivity(intent);
                }
                else if(modellist.get(position).getName().equals("Peopleware")){
                    Intent intent = new Intent(v.getContext(), peopleware.class);
                    v.getContext().startActivity(intent);
                }
                else if(modellist.get(position).getName().equals("Phreak")){
                    Intent intent = new Intent(v.getContext(), phreaking.class);
                    v.getContext().startActivity(intent);
                }
                else if(modellist.get(position).getName().equals("Piconet")){
                    Intent intent = new Intent(v.getContext(), piconet.class);
                    v.getContext().startActivity(intent);
                }
                else if(modellist.get(position).getName().equals("Pixel")){
                    Intent intent = new Intent(v.getContext(), pixel.class);
                    v.getContext().startActivity(intent);
                }
                else if(modellist.get(position).getName().equals("Plagiarism")){
                    Intent intent = new Intent(v.getContext(), plagiarism.class);
                    v.getContext().startActivity(intent);
                }
                else if(modellist.get(position).getName().equals("Platform")){
                    Intent intent = new Intent(v.getContext(), platform.class);
                    v.getContext().startActivity(intent);
                }
                else if(modellist.get(position).getName().equals("Podcast")){
                    Intent intent = new Intent(v.getContext(), podcast.class);
                    v.getContext().startActivity(intent);
                }
                else if(modellist.get(position).getName().equals("Port")){
                    Intent intent = new Intent(v.getContext(), port.class);
                    v.getContext().startActivity(intent);
                }
                else if(modellist.get(position).getName().equals("Power User")){
                    Intent intent = new Intent(v.getContext(), poweruser.class);
                    v.getContext().startActivity(intent);
                }
                else if(modellist.get(position).getName().equals("PPI")){
                    Intent intent = new Intent(v.getContext(), ppi.class);
                    v.getContext().startActivity(intent);
                }
                else if(modellist.get(position).getName().equals("PPM")){
                    Intent intent = new Intent(v.getContext(), ppm.class);
                    v.getContext().startActivity(intent);
                }
                else if(modellist.get(position).getName().equals("Pretest")){
                    Intent intent = new Intent(v.getContext(), pretest.class);
                    v.getContext().startActivity(intent);
                }
                else if(modellist.get(position).getName().equals("Primary Key")){
                    Intent intent = new Intent(v.getContext(), primarykey.class);
                    v.getContext().startActivity(intent);
                }
                else if(modellist.get(position).getName().equals("Progressive Scan")){
                    Intent intent = new Intent(v.getContext(), progressivescan.class);
                    v.getContext().startActivity(intent);
                }
                else if(modellist.get(position).getName().equals("Property")){
                    Intent intent = new Intent(v.getContext(), property.class);
                    v.getContext().startActivity(intent);
                }
                else if(modellist.get(position).getName().equals("Push")){
                    Intent intent = new Intent(v.getContext(), push.class);
                    v.getContext().startActivity(intent);
                }
                else if(modellist.get(position).getName().equals("QR Code")){
                    Intent intent = new Intent(v.getContext(), qrcode.class);
                    v.getContext().startActivity(intent);
                }
                else if(modellist.get(position).getName().equals("Queue")){
                    Intent intent = new Intent(v.getContext(), queue.class);
                    v.getContext().startActivity(intent);
                }
                else if(modellist.get(position).getName().equals("QWERTY")){
                    Intent intent = new Intent(v.getContext(), qwerty.class);
                    v.getContext().startActivity(intent);
                }
                else if(modellist.get(position).getName().equals("RAID")){
                    Intent intent = new Intent(v.getContext(), raid.class);
                    v.getContext().startActivity(intent);
                }
                else if(modellist.get(position).getName().equals("Raster")){
                    Intent intent = new Intent(v.getContext(), raster.class);
                    v.getContext().startActivity(intent);
                }
                else if(modellist.get(position).getName().equals("RDF")){
                    Intent intent = new Intent(v.getContext(), rdf.class);
                    v.getContext().startActivity(intent);
                }
                else if(modellist.get(position).getName().equals("Reach")){
                    Intent intent = new Intent(v.getContext(), reach.class);
                    v.getContext().startActivity(intent);
                }
                else if(modellist.get(position).getName().equals("Read-only")){
                    Intent intent = new Intent(v.getContext(), readonly.class);
                    v.getContext().startActivity(intent);
                }
                else if(modellist.get(position).getName().equals("Real Number")){
                    Intent intent = new Intent(v.getContext(), realnumber.class);
                    v.getContext().startActivity(intent);
                }
                else if(modellist.get(position).getName().equals("RTC")){
                    Intent intent = new Intent(v.getContext(), realtime.class);
                    v.getContext().startActivity(intent);
                }
                else if(modellist.get(position).getName().equals("Recursion")){
                    Intent intent = new Intent(v.getContext(), recursion.class);
                    v.getContext().startActivity(intent);
                }
                else if(modellist.get(position).getName().equals("Recursive Function")){
                    Intent intent = new Intent(v.getContext(), recursivefunction.class);
                    v.getContext().startActivity(intent);
                }
                else if(modellist.get(position).getName().equals("Redundancy")){
                    Intent intent = new Intent(v.getContext(), redundancy.class);
                    v.getContext().startActivity(intent);
                }
                else if(modellist.get(position).getName().equals("Refresh")){
                    Intent intent = new Intent(v.getContext(), refresh.class);
                    v.getContext().startActivity(intent);
                }
                else if(modellist.get(position).getName().equals("Refresh Rate")){
                    Intent intent = new Intent(v.getContext(), refreshrate.class);
                    v.getContext().startActivity(intent);
                }
                else if(modellist.get(position).getName().equals("Regular Expression")){
                    Intent intent = new Intent(v.getContext(), regularexpres.class);
                    v.getContext().startActivity(intent);
                }
                else if(modellist.get(position).getName().equals("RDBMS")){
                    Intent intent = new Intent(v.getContext(), relational.class);
                    v.getContext().startActivity(intent);
                }
                else if(modellist.get(position).getName().equals("Remote Access")){
                    Intent intent = new Intent(v.getContext(), remoteaccess.class);
                    v.getContext().startActivity(intent);
                }
                else if(modellist.get(position).getName().equals("Remote User")){
                    Intent intent = new Intent(v.getContext(), remoteuser.class);
                    v.getContext().startActivity(intent);
                }
                else if(modellist.get(position).getName().equals("Rendering")){
                    Intent intent = new Intent(v.getContext(), rendering.class);
                    v.getContext().startActivity(intent);
                }
                else if(modellist.get(position).getName().equals("Resolution")){
                    Intent intent = new Intent(v.getContext(), resolution.class);
                    v.getContext().startActivity(intent);
                }
                else if(modellist.get(position).getName().equals("RWD")){
                    Intent intent = new Intent(v.getContext(), responsive.class);
                    v.getContext().startActivity(intent);
                }
                else if(modellist.get(position).getName().equals("Restore")){
                    Intent intent = new Intent(v.getContext(), restore.class);
                    v.getContext().startActivity(intent);
                }
                else if(modellist.get(position).getName().equals("Retina Display")){
                    Intent intent = new Intent(v.getContext(), retinadis.class);
                    v.getContext().startActivity(intent);
                }
                else if(modellist.get(position).getName().equals("RGB")){
                    Intent intent = new Intent(v.getContext(), rgb.class);
                    v.getContext().startActivity(intent);
                }
                else if(modellist.get(position).getName().equals("Right Click")){
                    Intent intent = new Intent(v.getContext(), rightclick.class);
                    v.getContext().startActivity(intent);
                }
                else if(modellist.get(position).getName().equals("Ripcording")){
                    Intent intent = new Intent(v.getContext(), ripcording.class);
                    v.getContext().startActivity(intent);
                }
                else if(modellist.get(position).getName().equals("RJ45")){
                    Intent intent = new Intent(v.getContext(), rj45.class);
                    v.getContext().startActivity(intent);
                }
                else if(modellist.get(position).getName().equals("ROUTER")){
                    Intent intent = new Intent(v.getContext(), router.class);
                    v.getContext().startActivity(intent);
                }
                else if(modellist.get(position).getName().equals("Row")){
                    Intent intent = new Intent(v.getContext(), row.class);
                    v.getContext().startActivity(intent);
                }
                else if(modellist.get(position).getName().equals("RUP")){
                    Intent intent = new Intent(v.getContext(), rup.class);
                    v.getContext().startActivity(intent);
                }
                else if(modellist.get(position).getName().equals("Safe Mode")){
                    Intent intent = new Intent(v.getContext(), safemode.class);
                    v.getContext().startActivity(intent);
                }
                else if(modellist.get(position).getName().equals("Sample")){
                    Intent intent = new Intent(v.getContext(), sample.class);
                    v.getContext().startActivity(intent);
                }
                else if(modellist.get(position).getName().equals("Sample Rate")){
                    Intent intent = new Intent(v.getContext(), samplerate.class);
                    v.getContext().startActivity(intent);
                }
                else if(modellist.get(position).getName().equals("Sampling")){
                    Intent intent = new Intent(v.getContext(), sampling.class);
                    v.getContext().startActivity(intent);
                }
                else if(modellist.get(position).getName().equals("Scalable")){
                    Intent intent = new Intent(v.getContext(), scalable.class);
                    v.getContext().startActivity(intent);
                }
                else if(modellist.get(position).getName().equals("SDK")){
                    Intent intent = new Intent(v.getContext(), sdk.class);
                    v.getContext().startActivity(intent);
                }
                else if(modellist.get(position).getName().equals("Search Engine")){
                    Intent intent = new Intent(v.getContext(), searchen.class);
                    v.getContext().startActivity(intent);
                }
                else if(modellist.get(position).getName().equals("SELECTOR")){
                    Intent intent = new Intent(v.getContext(), selector.class);
                    v.getContext().startActivity(intent);
                }
                else if(modellist.get(position).getName().equals("SELF-CLOSING TAG")){
                    Intent intent = new Intent(v.getContext(), selfclosing.class);
                    v.getContext().startActivity(intent);
                }
                else if(modellist.get(position).getName().equals("SEMANTIC ELEMENT")){
                    Intent intent = new Intent(v.getContext(), semantic.class);
                    v.getContext().startActivity(intent);
                }
                else if(modellist.get(position).getName().equals("SEO")){
                    Intent intent = new Intent(v.getContext(), seo.class);
                    v.getContext().startActivity(intent);
                }
                else if(modellist.get(position).getName().equals("SERIF")){
                    Intent intent = new Intent(v.getContext(), serif.class);
                    v.getContext().startActivity(intent);
                }
                else if(modellist.get(position).getName().equals("Sidebar")){
                    Intent intent = new Intent(v.getContext(), sidebar.class);
                    v.getContext().startActivity(intent);
                }
                else if(modellist.get(position).getName().equals("Simplex")){
                    Intent intent = new Intent(v.getContext(), simplex.class);
                    v.getContext().startActivity(intent);
                }
                else if(modellist.get(position).getName().equals("SITEMAP")){
                    Intent intent = new Intent(v.getContext(), sitemap.class);
                    v.getContext().startActivity(intent);
                }
                else if(modellist.get(position).getName().equals("SKU")){
                    Intent intent = new Intent(v.getContext(), sku.class);
                    v.getContext().startActivity(intent);
                }
                else if(modellist.get(position).getName().equals("SLA")){
                    Intent intent = new Intent(v.getContext(), sla.class);
                    v.getContext().startActivity(intent);
                }
                else if(modellist.get(position).getName().equals("Smart Home")){
                    Intent intent = new Intent(v.getContext(), smarthome.class);
                    v.getContext().startActivity(intent);
                }
                else if(modellist.get(position).getName().equals("SMS")){
                    Intent intent = new Intent(v.getContext(), sms.class);
                    v.getContext().startActivity(intent);
                }
                else if(modellist.get(position).getName().equals("SOA")){
                    Intent intent = new Intent(v.getContext(), soa.class);
                    v.getContext().startActivity(intent);
                }
                else if(modellist.get(position).getName().equals("Soft Copy")){
                    Intent intent = new Intent(v.getContext(), softcopy.class);
                    v.getContext().startActivity(intent);
                }
                else if(modellist.get(position).getName().equals("SOFTWARE")){
                    Intent intent = new Intent(v.getContext(), software.class);
                    v.getContext().startActivity(intent);
                }
                else if(modellist.get(position).getName().equals("SOCIAL GRAPH")){
                    Intent intent = new Intent(v.getContext(), socialgraph.class);
                    v.getContext().startActivity(intent);
                }
                else if(modellist.get(position).getName().equals("Speech Recognition")){
                    Intent intent = new Intent(v.getContext(), speechrecog.class);
                    v.getContext().startActivity(intent);
                }
                else if(modellist.get(position).getName().equals("Spooling")){
                    Intent intent = new Intent(v.getContext(), spooling.class);
                    v.getContext().startActivity(intent);
                }
                else if(modellist.get(position).getName().equals("SPX")){
                    Intent intent = new Intent(v.getContext(), spx.class);
                    v.getContext().startActivity(intent);
                }
                else if(modellist.get(position).getName().equals("sRGB")){
                    Intent intent = new Intent(v.getContext(), srgb.class);
                    v.getContext().startActivity(intent);
                }
                else if(modellist.get(position).getName().equals("SSID")){
                    Intent intent = new Intent(v.getContext(), ssid.class);
                    v.getContext().startActivity(intent);
                }
                else if(modellist.get(position).getName().equals("Stack")){
                    Intent intent = new Intent(v.getContext(), stack.class);
                    v.getContext().startActivity(intent);
                }
                else if(modellist.get(position).getName().equals("Standalone")){
                    Intent intent = new Intent(v.getContext(), standalone.class);
                    v.getContext().startActivity(intent);
                }
                else if(modellist.get(position).getName().equals("Standby")){
                    Intent intent = new Intent(v.getContext(), standby.class);
                    v.getContext().startActivity(intent);
                }
                else if(modellist.get(position).getName().equals("Storage Capacity")){
                    Intent intent = new Intent(v.getContext(), storagecapacity.class);
                    v.getContext().startActivity(intent);
                }
                else if(modellist.get(position).getName().equals("Structural Element")){
                    Intent intent = new Intent(v.getContext(), structural.class);
                    v.getContext().startActivity(intent);
                }
                else if(modellist.get(position).getName().equals("Subnet Mask")){
                    Intent intent = new Intent(v.getContext(), subnetmask.class);
                    v.getContext().startActivity(intent);
                }
                else if(modellist.get(position).getName().equals("Subscript")){
                    Intent intent = new Intent(v.getContext(), subscrift.class);
                    v.getContext().startActivity(intent);
                }
                else if(modellist.get(position).getName().equals("Superscript")){
                    Intent intent = new Intent(v.getContext(), superscript.class);
                    v.getContext().startActivity(intent);
                }
                else if(modellist.get(position).getName().equals("Swipe")){
                    Intent intent = new Intent(v.getContext(), swipe.class);
                    v.getContext().startActivity(intent);
                }
                else if(modellist.get(position).getName().equals("Sync")){
                    Intent intent = new Intent(v.getContext(), sync.class);
                    v.getContext().startActivity(intent);
                }
                else if(modellist.get(position).getName().equals("Syntax")){
                    Intent intent = new Intent(v.getContext(), syntax.class);
                    v.getContext().startActivity(intent);
                }
                else if(modellist.get(position).getName().equals("System Analyst")){
                    Intent intent = new Intent(v.getContext(), systemanalyst.class);
                    v.getContext().startActivity(intent);
                }
                else if(modellist.get(position).getName().equals("System Hardening")){
                    Intent intent = new Intent(v.getContext(), systemhardening.class);
                    v.getContext().startActivity(intent);
                }
                else if(modellist.get(position).getName().equals("System Resources")){
                    Intent intent = new Intent(v.getContext(), systemresources.class);
                    v.getContext().startActivity(intent);
                }
                else if(modellist.get(position).getName().equals("Table")){
                    Intent intent = new Intent(v.getContext(), table.class);
                    v.getContext().startActivity(intent);
                }
                else if(modellist.get(position).getName().equals("Target Disk Mode")){
                    Intent intent = new Intent(v.getContext(), targetdisk.class);
                    v.getContext().startActivity(intent);
                }
                else if(modellist.get(position).getName().equals("Technology Services")){
                    Intent intent = new Intent(v.getContext(), technologyservice.class);
                    v.getContext().startActivity(intent);
                }
                else if(modellist.get(position).getName().equals("Telecommunications")){
                    Intent intent = new Intent(v.getContext(), telecom.class);
                    v.getContext().startActivity(intent);
                }
                else if(modellist.get(position).getName().equals("Teleconference")){
                    Intent intent = new Intent(v.getContext(), telecon.class);
                    v.getContext().startActivity(intent);
                }
                else if(modellist.get(position).getName().equals("Telehealth")){
                    Intent intent = new Intent(v.getContext(), telehealth.class);
                    v.getContext().startActivity(intent);
                }
                else if(modellist.get(position).getName().equals("Terahertz")){
                    Intent intent = new Intent(v.getContext(), terahertz.class);
                    v.getContext().startActivity(intent);
                }
                else if(modellist.get(position).getName().equals("TEXT EDITOR")){
                    Intent intent = new Intent(v.getContext(), textedit.class);
                    v.getContext().startActivity(intent);
                }
                else if(modellist.get(position).getName().equals("Text Alignment")){
                    Intent intent = new Intent(v.getContext(), textalign.class);
                    v.getContext().startActivity(intent);
                }
                else if(modellist.get(position).getName().equals("TFTP")){
                    Intent intent = new Intent(v.getContext(), tftp.class);
                    v.getContext().startActivity(intent);
                }
                else if(modellist.get(position).getName().equals("Third Party")){
                    Intent intent = new Intent(v.getContext(), thirdparty.class);
                    v.getContext().startActivity(intent);
                }
                else if(modellist.get(position).getName().equals("Thread")){
                    Intent intent = new Intent(v.getContext(), thread.class);
                    v.getContext().startActivity(intent);
                }
                else if(modellist.get(position).getName().equals("Throughput")){
                    Intent intent = new Intent(v.getContext(), throughput.class);
                    v.getContext().startActivity(intent);
                }
                else if(modellist.get(position).getName().equals("Token")){
                    Intent intent = new Intent(v.getContext(), token.class);
                    v.getContext().startActivity(intent);
                }
                else if(modellist.get(position).getName().equals("TRAFFIC")){
                    Intent intent = new Intent(v.getContext(), traffic.class);
                    v.getContext().startActivity(intent);
                }
                else if(modellist.get(position).getName().equals("TRIM")){
                    Intent intent = new Intent(v.getContext(), trim.class);
                    v.getContext().startActivity(intent);
                }
                else if(modellist.get(position).getName().equals("Troubleshooting")){
                    Intent intent = new Intent(v.getContext(), throubleshooting.class);
                    v.getContext().startActivity(intent);
                }
                else if(modellist.get(position).getName().equals("Truncate")){
                    Intent intent = new Intent(v.getContext(), truncate.class);
                    v.getContext().startActivity(intent);
                }
                else if(modellist.get(position).getName().equals("Tweak")){
                    Intent intent = new Intent(v.getContext(), tweak.class);
                    v.getContext().startActivity(intent);
                }
                else if(modellist.get(position).getName().equals("Typeface")){
                    Intent intent = new Intent(v.getContext(), typerface.class);
                    v.getContext().startActivity(intent);
                }
                else if(modellist.get(position).getName().equals("TYPE HIERARCHY")){
                    Intent intent = new Intent(v.getContext(), typehierarchy.class);
                    v.getContext().startActivity(intent);
                }
                else if(modellist.get(position).getName().equals("U")){
                    Intent intent = new Intent(v.getContext(), u.class);
                    v.getContext().startActivity(intent);
                }
                else if(modellist.get(position).getName().equals("USER FLOW")){
                    Intent intent = new Intent(v.getContext(), userflow.class);
                    v.getContext().startActivity(intent);
                }
                else if(modellist.get(position).getName().equals("User Interface")){
                    Intent intent = new Intent(v.getContext(), userinterface.class);
                    v.getContext().startActivity(intent);
                }
                else if(modellist.get(position).getName().equals("USER PERSONA")){
                    Intent intent = new Intent(v.getContext(), userpersona.class);
                    v.getContext().startActivity(intent);
                }
                else if(modellist.get(position).getName().equals("USER RESEARCH")){
                    Intent intent = new Intent(v.getContext(), userresearch.class);
                    v.getContext().startActivity(intent);
                }
                else if(modellist.get(position).getName().equals("UAT")){
                    Intent intent = new Intent(v.getContext(), uat.class);
                    v.getContext().startActivity(intent);
                }
                else if(modellist.get(position).getName().equals("UDDI")){
                    Intent intent = new Intent(v.getContext(), uddi.class);
                    v.getContext().startActivity(intent);
                }
                else if(modellist.get(position).getName().equals("UEFI")){
                    Intent intent = new Intent(v.getContext(), uefi.class);
                    v.getContext().startActivity(intent);
                }
                else if(modellist.get(position).getName().equals("UNC")){
                    Intent intent = new Intent(v.getContext(), unc.class);
                    v.getContext().startActivity(intent);
                }
                else if(modellist.get(position).getName().equals("UPTIME and DOWNTIME")){
                    Intent intent = new Intent(v.getContext(), uptime.class);
                    v.getContext().startActivity(intent);
                }
                else if(modellist.get(position).getName().equals("USER-GENERATED CONTENT (UGC)")){
                    Intent intent = new Intent(v.getContext(), usergenerate.class);
                    v.getContext().startActivity(intent);
                }
                else if(modellist.get(position).getName().equals("User-Friendly")){
                    Intent intent = new Intent(v.getContext(), userfriendly.class);
                    v.getContext().startActivity(intent);
                }
                else if(modellist.get(position).getName().equals("Username")){
                    Intent intent = new Intent(v.getContext(), username.class);
                    v.getContext().startActivity(intent);
                }
                else if(modellist.get(position).getName().equals("UX")){
                    Intent intent = new Intent(v.getContext(), ux.class);
                    v.getContext().startActivity(intent);
                }
                else if(modellist.get(position).getName().equals("VALUE")){
                    Intent intent = new Intent(v.getContext(), value.class);
                    v.getContext().startActivity(intent);
                }
                else if(modellist.get(position).getName().equals("Vaporware")){
                    Intent intent = new Intent(v.getContext(), vaporware.class);
                    v.getContext().startActivity(intent);
                }
                else if(modellist.get(position).getName().equals("Variable")){
                    Intent intent = new Intent(v.getContext(), variable.class);
                    v.getContext().startActivity(intent);
                }
                else if(modellist.get(position).getName().equals("Vector")){
                    Intent intent = new Intent(v.getContext(), vector.class);
                    v.getContext().startActivity(intent);
                }
                else if(modellist.get(position).getName().equals("Veronica")){
                    Intent intent = new Intent(v.getContext(), veronica.class);
                    v.getContext().startActivity(intent);
                }
                else if(modellist.get(position).getName().equals("VERSION CONTROL")){
                    Intent intent = new Intent(v.getContext(), version.class);
                    v.getContext().startActivity(intent);
                }
                else if(modellist.get(position).getName().equals("VFAT")){
                    Intent intent = new Intent(v.getContext(), vfat.class);
                    v.getContext().startActivity(intent);
                }
                else if(modellist.get(position).getName().equals("Viral")){
                    Intent intent = new Intent(v.getContext(), viral.class);
                    v.getContext().startActivity(intent);
                }
                else if(modellist.get(position).getName().equals("VIRTUAL MACHINE (VM)")){
                    Intent intent = new Intent(v.getContext(), virtualmachine.class);
                    v.getContext().startActivity(intent);
                }
                else if(modellist.get(position).getName().equals("Virtual Memory")){
                    Intent intent = new Intent(v.getContext(), virtualmemo.class);
                    v.getContext().startActivity(intent);
                }
                else if(modellist.get(position).getName().equals("Virtual Reality")){
                    Intent intent = new Intent(v.getContext(), virtualreality.class);
                    v.getContext().startActivity(intent);
                }
                else if(modellist.get(position).getName().equals("VLAN")){
                    Intent intent = new Intent(v.getContext(), vlan.class);
                    v.getContext().startActivity(intent);
                }
                else if(modellist.get(position).getName().equals("VLE")){
                    Intent intent = new Intent(v.getContext(), vle.class);
                    v.getContext().startActivity(intent);
                }
                else if(modellist.get(position).getName().equals("VPN – VIRTUAL PRIVATE NETWORK")){
                    Intent intent = new Intent(v.getContext(), vpn.class);
                    v.getContext().startActivity(intent);
                }
                else if(modellist.get(position).getName().equals("VRML")){
                    Intent intent = new Intent(v.getContext(), vrml.class);
                    v.getContext().startActivity(intent);
                }
                else if(modellist.get(position).getName().equals("Warm Boot")){
                    Intent intent = new Intent(v.getContext(), warmboot.class);
                    v.getContext().startActivity(intent);
                }
                else if(modellist.get(position).getName().equals("Wavelength")){
                    Intent intent = new Intent(v.getContext(), wavelength.class);
                    v.getContext().startActivity(intent);
                }
                else if(modellist.get(position).getName().equals("WEB APP")){
                    Intent intent = new Intent(v.getContext(), webapp.class);
                    v.getContext().startActivity(intent);
                }
                else if(modellist.get(position).getName().equals("WEB SERVER")){
                    Intent intent = new Intent(v.getContext(), webserver.class);
                    v.getContext().startActivity(intent);
                }
                else if(modellist.get(position).getName().equals("WEP")){
                    Intent intent = new Intent(v.getContext(), wep.class);
                    v.getContext().startActivity(intent);
                }
                else if(modellist.get(position).getName().equals("White Balance")){
                    Intent intent = new Intent(v.getContext(), whitebalance.class);
                    v.getContext().startActivity(intent);
                }
                else if(modellist.get(position).getName().equals("White Paper")){
                    Intent intent = new Intent(v.getContext(), whitepaper.class);
                    v.getContext().startActivity(intent);
                }
                else if(modellist.get(position).getName().equals("Whitelist")){
                    Intent intent = new Intent(v.getContext(), whitelist.class);
                    v.getContext().startActivity(intent);
                }
                else if(modellist.get(position).getName().equals("Wi-Fi")){
                    Intent intent = new Intent(v.getContext(), wifi.class);
                    v.getContext().startActivity(intent);
                }
                else if(modellist.get(position).getName().equals("Wildcard")){
                    Intent intent = new Intent(v.getContext(), wildcard.class);
                    v.getContext().startActivity(intent);
                }
                else if(modellist.get(position).getName().equals("WiMAX")){
                    Intent intent = new Intent(v.getContext(), wimax.class);
                    v.getContext().startActivity(intent);
                }
                else if(modellist.get(position).getName().equals("Wired")){
                    Intent intent = new Intent(v.getContext(), wired.class);
                    v.getContext().startActivity(intent);
                }
                else if(modellist.get(position).getName().equals("WireFrame")){
                    Intent intent = new Intent(v.getContext(), wireframe.class);
                    v.getContext().startActivity(intent);
                }
                else if(modellist.get(position).getName().equals("Wireless")){
                    Intent intent = new Intent(v.getContext(), wireless.class);
                    v.getContext().startActivity(intent);
                }
                else if(modellist.get(position).getName().equals("WPA")){
                    Intent intent = new Intent(v.getContext(), wpa.class);
                    v.getContext().startActivity(intent);
                }
                else if(modellist.get(position).getName().equals("XML")){
                    Intent intent = new Intent(v.getContext(), xml.class);
                    v.getContext().startActivity(intent);
                }
                else if(modellist.get(position).getName().equals("XSLT")){
                    Intent intent = new Intent(v.getContext(), xslt.class);
                    v.getContext().startActivity(intent);
                }
                else if(modellist.get(position).getName().equals("Y2K")){
                    Intent intent = new Intent(v.getContext(), y2k.class);
                    v.getContext().startActivity(intent);
                }
            }
        });


        return view;
    }

    public void filter(String charText){
        charText = charText.toLowerCase(Locale.getDefault());
        modellist.clear();
        if(charText.length()==0){
            modellist.addAll(arrayList);
        }
        else {
            for (Country country : arrayList){
                if(country.getName().toLowerCase(Locale.getDefault()).contains(charText)){
                    modellist.add(country);
                }
            }
        }
        notifyDataSetChanged();
    }
}
