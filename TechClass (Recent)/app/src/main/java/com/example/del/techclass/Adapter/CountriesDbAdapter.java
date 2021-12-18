package com.example.del.techclass.Adapter;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

import java.util.jar.Attributes;

public class CountriesDbAdapter {

    public static final String KEY_ROWID = "_id";
    public static final String KEY_NAME = "name";


    private static final String TAG = "CountriesDbAdapter";
    private DatabaseHelper mDbHelper;
    private SQLiteDatabase mDb;

    private static final String DATABASE_NAME = "World";
    private static final String SQLITE_TABLE = "Country";
    private static final int DATABASE_VERSION = 1;

    private final Context mCtx;

    private static final String DATABASE_CREATE =
            "CREATE TABLE if not exists " + SQLITE_TABLE + " (" +
                    KEY_ROWID + " integer PRIMARY KEY autoincrement," +
                    KEY_NAME + "," +
                    " UNIQUE (" + KEY_NAME +"));";

    private static class DatabaseHelper extends SQLiteOpenHelper {

        DatabaseHelper(Context context) {
            super(context, DATABASE_NAME, null, DATABASE_VERSION);
        }


        @Override
        public void onCreate(SQLiteDatabase db) {
            Log.w(TAG, DATABASE_CREATE);
            db.execSQL(DATABASE_CREATE);
        }

        @Override
        public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
            Log.w(TAG, "Upgrading database from version " + oldVersion + " to "
                    + newVersion + ", which will destroy all old data");
            db.execSQL("DROP TABLE IF EXISTS " + SQLITE_TABLE);
            onCreate(db);
        }
    }

    public CountriesDbAdapter(Context ctx) {
        this.mCtx = ctx;
    }

    public CountriesDbAdapter open() throws SQLException {
        mDbHelper = new DatabaseHelper(mCtx);
        mDb = mDbHelper.getWritableDatabase();
        return this;
    }

    public void close() {
        if (mDbHelper != null) {
            mDbHelper.close();
        }
    }

    public long createCountry(String name) {

        ContentValues initialValues = new ContentValues();
        initialValues.put(KEY_NAME, name);

        return mDb.insert(SQLITE_TABLE, null, initialValues);
    }

    public boolean deleteAllCountries() {

        int doneDelete = 0;
        doneDelete = mDb.delete(SQLITE_TABLE, null , null);
        Log.w(TAG, Integer.toString(doneDelete));
        return doneDelete > 0;

    }

    public Cursor fetchCountriesByName(String inputText) throws SQLException {
        Log.w(TAG, inputText);
        Cursor mCursor = null;
        if (inputText == null  ||  inputText.length () == 0)  {
            mCursor = mDb.query(SQLITE_TABLE, new String[] {KEY_ROWID,
                            KEY_NAME},
                    null, null, null, null, null);

        }
        else {
            mCursor = mDb.query(true, SQLITE_TABLE, new String[] {KEY_ROWID,
                            KEY_NAME},
                    KEY_NAME + " like '%" + inputText + "%'", null,
                    null, null, null, null);
        }
        if (mCursor != null) {
            mCursor.moveToFirst();
        }
        return mCursor;

    }

    public Cursor fetchAllCountries() {

        Cursor mCursor = mDb.query(SQLITE_TABLE, new String[] {KEY_ROWID,
                        KEY_NAME},
                null, null, null, null, null);

        if (mCursor != null) {
            mCursor.moveToFirst();
        }
        return mCursor;
    }

    public void insertSomeCountries() {

        createCountry("A/B TESTING");
        createCountry("Ad Hoc Network");
        createCountry("Affiliate Marketing");
        createCountry("Analog");
        createCountry("ANSI");
        createCountry("API");
        createCountry("Apple");
        createCountry("APPLICATION");
        createCountry("ARP");
        createCountry("Artificial Intelligence");
        createCountry("ASCII");
        createCountry("Assistive Technology");
        createCountry("ATTRIBUTE");
        createCountry("Augmented Reality");
        createCountry("Back End");
        createCountry("BarCraft");
        createCountry("Baseband");
        createCountry("Bespoke");
        createCountry("Bézier Curve");
        createCountry("BIG DATA");
        createCountry("Binary");
        createCountry("Biometrics");
        createCountry("Bitcoin");
        createCountry("Blacklist");
        createCountry("Bluetooth");
        createCountry("Boolean");
        createCountry("Boot");
        createCountry("Boot Sector");
        createCountry("Boot Sequence");
        createCountry("Bounce Rate");
        createCountry("Breadcrumbs");
        createCountry("Buffer");
        createCountry("Bug");
        createCountry("Burn");
        createCountry("Cache");
        createCountry("Caching");
        createCountry("CAD");
        createCountry("Call to Action (CTA)");
        createCountry("CamelCase");
        createCountry("Camera RAW");
        createCountry("Caps Lock");
        createCountry("CDMA");
        createCountry("Character");
        createCountry("Circuit");
        createCountry("Clean Room");
        createCountry("Client-Server Model");
        createCountry("Clock Cycle");
        createCountry("Clock Speed");
        createCountry("Cloud Computing");
        createCountry("CMYK");
        createCountry("Cold Boot");
        createCountry("Color Theory");
        createCountry("Color Value");
        createCountry("Column");
        createCountry("Computer Ethics");
        createCountry("Computer Science");
        createCountry("Configuration");
        createCountry("Constant");
        createCountry("Content Curation");
        createCountry("Content Marketing");
        createCountry("Conversion");
        createCountry("Copyright");
        createCountry("Copyright Infringement");
        createCountry("CPS");
        createCountry("Crop");
        createCountry("Crossplatform");
        createCountry("Cryptography");
        createCountry("CSS");
        createCountry("CSS3");
        createCountry("CTP");
        createCountry("CLICK THROUGH RATE (CTR)");
        createCountry("CUDA");
        createCountry("Cybercrime");
        createCountry("Data Architecture");
        createCountry("Database");
        createCountry("Data Mining");
        createCountry("Data Modelling");
        createCountry("Data Visualization");
        createCountry("DAW");
        createCountry("Declaration");
        createCountry("DDL");
        createCountry("Default");
        createCountry("Defragment");
        createCountry("Delete");
        createCountry("Denary");
        createCountry("DEVOPS");
        createCountry("Developer");
        createCountry("DFS");
        createCountry("Digital");
        createCountry("Digitize");
        createCountry( "Dithering");
        createCountry("DMZ");
        createCountry("Domain");
        createCountry("Dot Matrix");
        createCountry("Double Click");
        createCountry("DPI");
        createCountry("Drag");
        createCountry("DRM");
        createCountry("DTD");
        createCountry("DV");
        createCountry("E-learning");
        createCountry("Edutainment");
        createCountry("Element");
        createCountry("Email Marketing");
        createCountry("Embedding");
        createCountry("Emulation");
        createCountry("Encryption");
        createCountry("End User");
        createCountry("Engagement");
        createCountry("Enterprise");
        createCountry("Ergonomics");
        createCountry( "eSports");
        createCountry("EUP");
        createCountry("FAQ");
        createCountry("FDDI");
        createCountry("Field");
        createCountry("FIFO");
        createCountry("File System");
        createCountry("FILO");
        createCountry( "FIREWALL");
        createCountry("Flexible");
        createCountry("Floating Point");
        createCountry( "FLOPS");
        createCountry("Flowchart");
        createCountry( "Font");
        createCountry( "Font Case");
        createCountry( "Footer");
        createCountry(  "Format");
        createCountry("Formula");
        createCountry( "FQDN");
        createCountry( "Fragmentation");
        createCountry( "Frame");
        createCountry( "FRAMEWORK");
        createCountry( "Frequency");
        createCountry( "Front End");
        createCountry( "Full-Duplex");
        createCountry( "FUNNEL");
        createCountry( "Gigaflops");
        createCountry( "Gigahertz");
        createCountry( "GIGO");
        createCountry( "GIS");
        createCountry( "GPGPU");
        createCountry( "GPIO");
        createCountry( "GPS");
        createCountry( "Graphics");
        createCountry("Grayscale");
        createCountry( "Grid System");
        createCountry("Growth Hacking");
        createCountry( "Hacker");
        createCountry( "Half-Duplex");
        createCountry( "Halftone");
        createCountry("Handshake");
        createCountry("Hard Copy");
        createCountry("HDTV");
        createCountry( "HDV");
        createCountry("Header");
        createCountry("Hertz");
        createCountry( "Hexadecimal");
        createCountry( "HFS");
        createCountry( "Hibernate");
        createCountry( "Hybrid App");
        createCountry("HTML");
        createCountry("HTML5");
        createCountry( "Hostname");
        createCountry("Hover");
        createCountry( "Hyper-Threading");
        createCountry("I/O");
        createCountry( "IDE");
        createCountry( "IDS");
        createCountry( "IEEE");
        createCountry( "Impressions");
        createCountry( "Influencer");
        createCountry( "Infotainment");
        createCountry("Input");
        createCountry("Integer");
        createCountry("Integrated");
        createCountry("Intellectual Property");
        createCountry( "Interlaced");
        createCountry( "Intranet");
        createCountry( "IPS");
        createCountry( "IPX");
        createCountry( "ISO");
        createCountry( "IT");
        createCountry( "IVR");
        createCountry( "JFS");
        createCountry("Kerning");
        createCountry("Keystroke");
        createCountry("Keywords");
        createCountry("Kilohertz");
        createCountry( "LAN");
        createCountry( "Leading");
        createCountry( "Leaf");
        createCountry( "Left-Click");
        createCountry( "LIFO");
        createCountry("Load Balancing");
        createCountry( "Localhost");
        createCountry("Log On");
        createCountry( "Logic Gate");
        createCountry("Login");
        createCountry( "LPI");
        createCountry( "LTE");
        createCountry( "LUN");
        createCountry( "Macintosh");
        createCountry( "MANET");
        createCountry( "Margin");
        createCountry( "Marketing Automation");
        createCountry( "Markup Language");
        createCountry(  "Matrix");
        createCountry( "MDI");
        createCountry( "Megahertz");
        createCountry(  "Megapixel");
        createCountry(  "Memory Bank");
        createCountry( "Mention");
        createCountry( "Meta Elements");
        createCountry( "Metadata");
        createCountry( "MicroBlogging");
        createCountry("Micron");
        createCountry("MIDI");
        createCountry("Mini DV");
        createCountry( "MIPS");
        createCountry("MIS");
        createCountry( "MMS");
        createCountry("Mnemonic");
        createCountry("Mobile");
        createCountry( "Monochrome");
        createCountry( "Mood Board");
        createCountry( "Multichannel");
        createCountry( "Multimedia");
        createCountry( "Multiplatform");
        createCountry( "Namespace");
        createCountry( "Nanometer");
        createCountry( "Native App");
        createCountry( "Network");
        createCountry( "Network Topology");
        createCountry( "Newbie");
        createCountry( "Newline");
        createCountry( "NINO");
        createCountry( "NTFS");
        createCountry( "NFC");
        createCountry( "NUI");
        createCountry( "Null");
        createCountry( "Num Lock");
        createCountry( "OASIS");
        createCountry( "OOP");
        createCountry( "OEM");
        createCountry( "Offline");
        createCountry( "OLAP");
        createCountry( "Online");
        createCountry( "OpenCL");
        createCountry("Opening Tag and Closing Tag");
        createCountry("Optimization");
        createCountry("Organic");
        createCountry( "OSI Model");
        createCountry("OTA");
        createCountry("Output");
        createCountry( "Overwrite");
        createCountry("Page Fault");
        createCountry("Page Orientation");
        createCountry("Parity");
        createCountry("Parity Bit");
        createCountry( "Parse");
        createCountry("Partition");
        createCountry(  "Passcode");
        createCountry(  "Passphrase");
        createCountry( "Password");
        createCountry( "Peopleware");
        createCountry( "Phreak");
        createCountry( "Piconet");
        createCountry( "Pixel");
        createCountry("Plagiarism");
        createCountry( "Platform");
        createCountry( "Podcast");
        createCountry( "Port");
        createCountry(  "Power User");
        createCountry( "PPI");
        createCountry( "PPM");
        createCountry( "Pretest");
        createCountry( "Primary Key");
        createCountry( "Progressive Scan");
        createCountry( "Property");
        createCountry( "Push");
        createCountry( "QR Code");
        createCountry( "Queue");
        createCountry( "QWERTY");
        createCountry( "RAID");
        createCountry( "Raster");
        createCountry( "RDF");
        createCountry( "Reach");
        createCountry( "Read-only");
        createCountry( "Real Number");
        createCountry( "RTC");
        createCountry( "Recursion");
        createCountry( "Recursive Function");
        createCountry( "Redundancy");
        createCountry( "Refresh");
        createCountry( "Refresh Rate");
        createCountry( "Regular Expression");
        createCountry( "RDBMS");
        createCountry( "Remote Access");
        createCountry(  "Remote User");
        createCountry(  "Rendering");
        createCountry( "Resolution");
        createCountry(  "RWD");
        createCountry( "Restore");
        createCountry(  "Retina Display");
        createCountry(  "RGB");
        createCountry(  "Right Click");
        createCountry( "Ripcording");
        createCountry( "RJ45");
        createCountry( "ROUTER");
        createCountry( "Row");
        createCountry( "RUP");
        createCountry( "Safe Mode");
        createCountry( "Sample");
        createCountry( "Sample Rate");
        createCountry(  "Sampling");
        createCountry( "Scalable");
        createCountry( "SDK");
        createCountry(  "Search Engine");
        createCountry( "SELECTOR");
        createCountry(  "SELF-CLOSING TAG");
        createCountry( "SEMANTIC ELEMENT");
        createCountry( "SEO");
        createCountry("SERIF");
        createCountry("Sidebar");
        createCountry( "Simplex");
        createCountry( "SITEMAP");
        createCountry( "SKU");
        createCountry( "SLA");
        createCountry( "Smart Home");
        createCountry("SMS");
        createCountry( "SOA");
        createCountry( "Soft Copy");
        createCountry( "SOFTWARE");
        createCountry( "SOCIAL GRAPH");
        createCountry(  "Speech Recognition");
        createCountry(  "Spooling");
        createCountry(  "SPX");
        createCountry(  "sRGB");
        createCountry( "SSID");
        createCountry( "Stack");
        createCountry( "Standalone");
        createCountry( "Standby");
        createCountry( "Storage Capacity");
        createCountry( "Structural Element");
        createCountry( "Subnet Mask");
        createCountry( "Subscript");
        createCountry( "Superscript");
        createCountry( "Swipe");
        createCountry( "Sync");
        createCountry( "Syntax");
        createCountry( "System Analyst");
        createCountry( "System Hardening");
        createCountry("System Resources");
        createCountry( "Table");
        createCountry("Target Disk Mode");
        createCountry("Technology Services");
        createCountry("Telecommunications");
        createCountry("Teleconference");
        createCountry( "Telehealth");
        createCountry( "Terahertz");
        createCountry( "TEXT EDITOR");
        createCountry( "Text Alignment");
        createCountry( "TFTP");
        createCountry( "Third Party");
        createCountry("Thread");
        createCountry( "Throughput");
        createCountry( "Token");
        createCountry("TRAFFIC");
        createCountry("TRIM");
        createCountry( "roubleshooting");
        createCountry( "Truncate");
        createCountry( "Tweak");
        createCountry( "Typeface");
        createCountry( "TYPE HIERARCHY");
        createCountry(  "U");
        createCountry("USER FLOW");
        createCountry( "User Interface");
        createCountry( "USER PERSONA");
        createCountry( "USER RESEARCH");
        createCountry( "UAT");
        createCountry( "UDDI");
        createCountry( "UEFI");
        createCountry("UNC");
        createCountry("UPTIME and DOWNTIME");
        createCountry( "USER-GENERATED CONTENT (UGC)");
        createCountry( "User-Friendly");
        createCountry( "Username");
        createCountry(  "UX");
        createCountry( "VALUE");
        createCountry( "Vaporware");
        createCountry( "Variable");
        createCountry("Vector");
        createCountry("Veronica");
        createCountry("VERSION CONTROL");
        createCountry( "VFAT");
        createCountry( "Viral");
        createCountry( "VIRTUAL MACHINE (VM)");
        createCountry( "Virtual Memory");
        createCountry("Virtual Reality");
        createCountry( "VLAN");
        createCountry( "VLE");
        createCountry( "VPN – VIRTUAL PRIVATE NETWORK");
        createCountry( "VRML");
        createCountry( "Warm Boot");
        createCountry( "Wavelength");
        createCountry( "WEB APP");
        createCountry( "WEB SERVER");
        createCountry( "WEP");
        createCountry( "White Balance");
        createCountry( "White Paper");
        createCountry( "Whitelist");
        createCountry( "Wi-Fi");
        createCountry( "Wildcard");
        createCountry( "WiMAX");
        createCountry( "Wired");
        createCountry( "WireFrame");
        createCountry( "Wireless");
        createCountry( "WPA");
        createCountry( "XML");
        createCountry( "XSLT");
        createCountry( "Y2K");
        createCountry( "4K");
        createCountry( "802.11a");
        createCountry( "802.11ac");
        createCountry( "802.11b");
        createCountry( "802.11g");
        createCountry( "802.11n");
    }



}