package com.example.del.techclass;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cursoradapter.widget.SimpleCursorAdapter;
import androidx.recyclerview.widget.RecyclerView;

import android.app.DownloadManager;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputMethodManager;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CursorAdapter;
import android.widget.EditText;
import android.widget.FilterQueryProvider;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.del.techclass.Adapter.CountriesDbAdapter;
import com.example.del.techclass.Adapter.Country;
import com.example.del.techclass.Adapter.ListViewAdapter;
import com.example.del.techclass.FragmentsTerms.*;
import com.example.del.techclass.FragmentsTerms.Boolean;
import com.example.del.techclass.FragmentsTerms.Character;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class SearchViewActivity extends AppCompatActivity {

    ImageView imageView;
    private TextView textView;
    private EditText mSearchField;
    CountriesDbAdapter dbHelper;
    ListViewAdapter listViewAdapter;
    private Button btnClear;
    ListView listView;
    ArrayList<Country> arrayList;
    String[] name;
    CountriesDbAdapter countriesDbAdapter;
    // the XML defined views which the data will be bound to


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search_view);
        imageView = (ImageView) findViewById(R.id.imageView45);
        textView = (TextView) findViewById(R.id.search_text);
        mSearchField = (EditText)findViewById(R.id.search_field);
        mSearchField.requestFocus();
        InputMethodManager imm = (InputMethodManager) getSystemService(Context.INPUT_METHOD_SERVICE);
        imm.showSoftInput(mSearchField, InputMethodManager.SHOW_IMPLICIT);
        arrayList = new ArrayList<Country>();
        listView = (ListView)findViewById(R.id.list_view);
        arrayList = new ArrayList<Country>();
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });
        btnClear = (Button)findViewById(R.id.btn_clear);
        mSearchField.addTextChangedListener(textWatcher());
        btnClear.setOnClickListener(onClickListener());

        name = new String[]{
                "A/B TESTING",
        "Ad Hoc Network",
        "Affiliate Marketing",
        "Analog",
        "ANSI",
        "API",
        "Apple",
        "APPLICATION",
        "ARP",
        "Artificial Intelligence",
        "ASCII",
        "Assistive Technology",
        "ATTRIBUTE",
        "Augmented Reality",
        "Back End",
        "BarCraft",
        "Baseband",
        "Bespoke",
                "Bézier Curve",
        "BIG DATA",
        "Binary",
        "Biometrics",
        "Bitcoin",
        "Blacklist",
        "Bluetooth",
        "Boolean",
        "Boot",
        "Boot Sector",
       "Boot Sequence",
        "Bounce Rate",
        "Breadcrumbs",
     "Buffer",
        "Bug",
        "Burn",
        "Cache",
        "Caching",
        "CAD",
        "Call to Action (CTA)",
        "CamelCase",
        "Camera RAW",
        "Caps Lock",
        "CDMA",
        "Character",
        "Circuit",
        "Clean Room",
        "Client-Server Model",
        "Clock Cycle",
        "Clock Speed",
        "Cloud Computing",
        "CMYK",
        "Cold Boot",
        "Color Theory",
        "Color Value",
        "Column",
        "Computer Ethics",
        "Computer Science",
        "Configuration",
        "Constant",
        "Content Curation",
        "Content Marketing",
        "Conversion",
        "Copyright",
        "Copyright Infringement",
        "CPS",
        "Crop",
        "Crossplatform",
        "Cryptography",
        "CSS",
        "CSS3",
        "CTP",
        "CLICK THROUGH RATE (CTR)",
        "CUDA",
        "Cybercrime",
        "Data Architecture",
        "Database",
        "Data Mining",
        "Data Modelling",
        "Data Visualization",
        "DAW",
        "Declaration",
        "DDL",
        "Default",
        "Defragment",
        "Delete",
        "Denary",
        "DEVOPS",
        "Developer",
        "DFS",
        "Digital",
        "Digitize",
         "Dithering",
        "DMZ",
        "Domain",
        "Dot Matrix",
        "Double Click",
        "DPI",
        "Drag",
        "DRM",
        "DTD",
        "DV",
        "E-learning",
        "Edutainment",
        "Element",
        "Email Marketing",
        "Embedding",
        "Emulation",
        "Encryption",
        "End User",
        "Engagement",
        "Enterprise",
        "Ergonomics",
         "eSports",
        "EUP",
        "FAQ",
        "FDDI",
        "Field",
        "FIFO",
        "File System",
        "FILO",
         "FIREWALL",
        "Flexible",
        "Floating Point",
        "FLOPS",
        "Flowchart",
         "Font",
        "Font Case",
        "Footer",
        "Format",
        "Formula",
        "FQDN",
        "Fragmentation",
        "Frame",
        "FRAMEWORK",
        "Frequency",
        "Front End",
        "Full-Duplex",
        "FUNNEL",
        "Gigaflops",
        "Gigahertz",
        "GIGO",
        "GIS",
        "GPGPU",
        "GPIO",
         "GPS",
         "Graphics",
        "Grayscale",
        "Grid System",
        "Growth Hacking",
         "Hacker",
        "Half-Duplex",
        "Halftone",
        "Handshake",
        "Hard Copy",
        "HDTV",
        "HDV",
        "Header",
        "Hertz",
        "Hexadecimal",
        "HFS",
        "Hibernate",
        "Hybrid App",
        "HTML",
        "HTML5",
        "Hostname",
        "Hover",
        "Hyper-Threading",
        "I/O",
        "IDE",
        "IDS",
        "IEEE",
        "Impressions",
        "Influencer",
        "Infotainment",
        "Input",
        "Integer",
        "Integrated",
        "Intellectual Property",
        "Interlaced",
        "Intranet",
        "IPS",
        "IPX",
        "ISO",
        "IT",
        "IVR",
        "JFS",
        "Kerning",
        "Keystroke",
        "Keywords",
        "Kilohertz",
         "LAN",
         "Leading",
        "Leaf",
         "Left-Click",
         "LIFO",
        "Load Balancing",
         "Localhost",
        "Log On",
        "Logic Gate",
        "Login",
         "LPI",
        "LTE",
        "LUN",
        "Macintosh",
        "MANET",
        "Margin",
         "Marketing Automation",
       "Markup Language",
         "Matrix",
        "MDI",
         "Megahertz",
         "Megapixel",
         "Memory Bank",
        "Mention",
         "Meta Elements",
        "Metadata",
        "MicroBlogging",
        "Micron",
        "MIDI",
        "Mini DV",
        "MIPS",
        "MIS",
        "MMS",
        "Mnemonic",
        "Mobile",
        "Monochrome",
         "Mood Board",
         "Multichannel",
        "Multimedia",
        "Multiplatform",
         "Namespace",
        "Nanometer",
        "Native App",
        "Network",
         "Network Topology",
         "Newbie",
         "Newline",
        "NINO",
        "NTFS",
        "NFC",
        "NUI",
         "Null",
        "Num Lock",
         "OASIS",
         "OOP",
        "OEM",
       "Offline",
        "OLAP",
        "Online",
        "OpenCL",
        "Opening Tag and Closing Tag",
        "Optimization",
        "Organic",
        "OSI Model",
        "OTA",
        "Output",
        "Overwrite",
        "Page Fault",
        "Page Orientation",
        "Parity",
        "Parity Bit",
         "Parse",
        "Partition",
         "Passcode",
        "Passphrase",
        "Password",
        "Peopleware",
        "Phreak",
        "Piconet",
        "Pixel",
        "Plagiarism",
        "Platform",
        "Podcast",
        "Port",
        "Power User",
        "PPI",
        "PPM",
        "Pretest",
        "Primary Key",
        "Progressive Scan",
        "Property",
        "Push",
        "QR Code",
        "Queue",
        "QWERTY",
        "RAID",
        "Raster",
        "RDF",
        "Reach",
        "Read-only",
        "Real Number",
        "RTC",
        "Recursion",
        "Recursive Function",
        "Redundancy",
        "Refresh",
        "Refresh Rate",
        "Regular Expression",
        "RDBMS",
        "Remote Access",
         "Remote User",
         "Rendering",
        "Resolution",
        "RWD",
         "Restore",
         "Retina Display",
         "RGB",
        "Right Click",
       "Ripcording",
        "RJ45",
         "ROUTER",
        "Row",
        "RUP",
        "Safe Mode",
        "Sample",
       "Sample Rate",
        "Sampling",
        "Scalable",
        "SDK",
         "Search Engine",
        "SELECTOR",
        "SELF-CLOSING TAG",
        "SEMANTIC ELEMENT",
        "SEO",
        "SERIF",
        "Sidebar",
         "Simplex",
        "SITEMAP",
        "SKU",
        "SLA",
        "Smart Home",
        "SMS",
        "SOA",
        "Soft Copy",
        "SOFTWARE",
        "SOCIAL GRAPH",
        "Speech Recognition",
         "Spooling",
         "SPX",
         "sRGB",
       "SSID",
        "Stack",
        "Standalone",
       "Standby",
        "Storage Capacity",
        "Structural Element",
        "Subnet Mask",
         "Subscript",
         "Superscript",
       "Swipe",
      "Sync",
        "Syntax",
        "System Analyst",
        "System Hardening",
        "System Resources",
        "Table",
        "Target Disk Mode",
        "Technology Services",
        "Telecommunications",
        "Teleconference",
         "Telehealth",
        "Terahertz",
         "TEXT EDITOR",
        "Text Alignment",
         "TFTP",
         "Third Party",
        "Thread",
        "Throughput",
         "Token",
        "TRAFFIC",
        "TRIM",
         "Troubleshooting",
        "Truncate",
        "Tweak",
        "Typeface",
        "TYPE HIERARCHY",
         "U",
        "USER FLOW",
        "User Interface",
        "USER PERSONA",
        "USER RESEARCH",
         "UAT",
         "UDDI",
        "UEFI",
        "UNC",
        "UPTIME and DOWNTIME",
        "USER-GENERATED CONTENT (UGC)",
         "User-Friendly",
         "Username",
         "UX",
        "VALUE",
        "Vaporware",
         "Variable",
        "Vector",
        "Veronica",
        "VERSION CONTROL",
         "VFAT",
         "Viral",
        "VIRTUAL MACHINE (VM)",
        "Virtual Memory",
        "Virtual Reality",
        "VLAN",
        "VLE",
        "VPN – VIRTUAL PRIVATE NETWORK",
        "VRML",
         "Warm Boot",
         "Wavelength",
         "WEB APP",
        "WEB SERVER",
        "WEP",
         "White Balance",
        "White Paper",
       "Whitelist",
        "Wi-Fi",
        "Wildcard",
        "WiMAX",
         "Wired",
        "WireFrame",
        "Wireless",
        "WPA",
        "XML",
        "XSLT",
        "Y2K",
        "4K",
         "802.11a",
         "802.11ac",
        "802.11b",
        "802.11g",
        "802.11n"
        };




        //Clean all data

        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        for (int i = 0; i < name.length; i++){
            Country country = new Country(name[i]);
            arrayList.add(country);
        }

        listViewAdapter = new ListViewAdapter(this, arrayList);
        listView.setAdapter(listViewAdapter);

        //displayListView();
        //Generate ListView from SQLite Database

      mSearchField.addTextChangedListener(new TextWatcher() {
            public void afterTextChanged(Editable s) {
            }

            public void beforeTextChanged(CharSequence s, int start,
                                          int count, int after) {
            }

            public void onTextChanged(CharSequence s, int start,
                                      int before, int count) {
                if(TextUtils.isEmpty(s)){
                    listViewAdapter.filter("");
                    listView.clearTextFilter();
                }
                else {
                    listViewAdapter.filter(s.toString());
                }
            }
        });

     listViewAdapter.filter(String.valueOf(new FilterQueryProvider() {
         @Override
         public Cursor runQuery(CharSequence constraint) {
             return dbHelper.fetchCountriesByName(constraint.toString());
         }
     }));


    }

    private View.OnClickListener onClickListener() {
        return new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                mSearchField.setText(""); //clear edittext
                //Toast.makeText(SearchViewActivity.this, "Button Delete clicked!", Toast.LENGTH_SHORT).show();
            }
        };
    }

    private TextWatcher textWatcher() {
        return new TextWatcher() {

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if (!mSearchField.getText().toString().equals("")) { //if edittext include text
                    btnClear.setVisibility(View.VISIBLE);
                } else { //not include text
                    btnClear.setVisibility(View.GONE);
                    //Toast.makeText(SearchViewActivity.this, "All texts have gone!!!", Toast.LENGTH_SHORT).show();
                }

            }

            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        };
    }


    @Override
    public boolean onSupportNavigateUp() {
        onBackPressed();
        return true;
    }

}
