package com.example.del.techclass.Fragments;

import android.content.Intent;
import android.os.Bundle;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import com.example.del.techclass.CompTwoActivity;
import com.example.del.techclass.CrimpActivity;
import com.example.del.techclass.Data.MyClass;
import com.example.del.techclass.FormatComputer;
import com.example.del.techclass.HowToList.AccountPass;
import com.example.del.techclass.HowToList.BiosActivity;
import com.example.del.techclass.HowToList.BootActivity;
import com.example.del.techclass.HowToList.Brightness.BrightActivity;
import com.example.del.techclass.HowToList.Browser.BrowserActivity;
import com.example.del.techclass.HowToList.CleanComputer.CleanComputer;
import com.example.del.techclass.HowToList.ConnecttvActivity;
import com.example.del.techclass.HowToList.DaisyChain.DaisyChainActivity;
import com.example.del.techclass.HowToList.DeleteActivity;
import com.example.del.techclass.HowToList.DownloadMovies.DownloadMovies;
import com.example.del.techclass.HowToList.DualActivity;
import com.example.del.techclass.HowToList.EmailEncryption.MailActivity;
import com.example.del.techclass.HowToList.Encrypt_Files.EncryptedActivity;
import com.example.del.techclass.HowToList.EnterBios.EnterToBiosActivity;
import com.example.del.techclass.HowToList.FacebookPassword.FacebookActivity;
import com.example.del.techclass.HowToList.FaxMachine.FaxMainActivity;
import com.example.del.techclass.HowToList.LaptopKeyboard.FixKeyboard;
import com.example.del.techclass.HowToList.LaptopToMonitor;
import com.example.del.techclass.HowToList.LockScreen.LockScreen;
import com.example.del.techclass.HowToList.LoginInformation.LoginActivity;
import com.example.del.techclass.HowToList.MountISO.MountIso;
import com.example.del.techclass.HowToList.NetflixActivity;
import com.example.del.techclass.HowToList.PDF.PDFActivity;
import com.example.del.techclass.HowToList.PrinterActivity;
import com.example.del.techclass.HowToList.ProtectFromVirusActivity;
import com.example.del.techclass.HowToList.RAM.RamActivity;
import com.example.del.techclass.HowToList.RecordGame.RecordGameActivity;
import com.example.del.techclass.HowToList.ResetBios.ResetBios;
import com.example.del.techclass.HowToList.RidofVirus.VirusActivity;
import com.example.del.techclass.HowToList.RotateScreen.RotateActivity;
import com.example.del.techclass.HowToList.Router.RouterActivity;
import com.example.del.techclass.HowToList.RouterIPAddress.RouterAddress;
import com.example.del.techclass.HowToList.SSD.SSDActivity;
import com.example.del.techclass.HowToList.SSID.SSIDActivity;
import com.example.del.techclass.HowToList.SafeActivity;
import com.example.del.techclass.HowToList.Scanner.ScannerActivity;
import com.example.del.techclass.HowToList.Screen.ScreenActivity;
import com.example.del.techclass.HowToList.ScreenShotActivity;
import com.example.del.techclass.HowToList.ShareItActivity.ShareitActivity;
import com.example.del.techclass.HowToList.SpeedUpActivity;
import com.example.del.techclass.HowToList.StartupActivity;
import com.example.del.techclass.HowToList.TVasMonitorActivity;
import com.example.del.techclass.HowToList.TransferActivity;
import com.example.del.techclass.HowToList.USBDevice.UsbDeviceActivity;
import com.example.del.techclass.HowToList.Uninstall_Program.UninstallActivity;
import com.example.del.techclass.HowToList.VDActivity;
import com.example.del.techclass.HowToList.VideoCardActivity;
import com.example.del.techclass.HowToList.Virtual2Activity;
import com.example.del.techclass.HowToList.Virtual3Activity;
import com.example.del.techclass.HowToList.VirtualDesktopActivity;
import com.example.del.techclass.HowToList.Webcam.WebcamActivity;
import com.example.del.techclass.HowToList.phonetoPC.ConnectPhone;
import com.example.del.techclass.ListView.CustomAdapter;
import com.example.del.techclass.R;
import com.example.del.techclass.VpnActivity;
import com.example.del.techclass.WindowsActivity;

import java.util.ArrayList;


/**
 * Created by Del on 1/14/2017.
 */

public class FragmentForFirst extends Fragment {
    ListView lv;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fragment_first, container, false);
        lv = (ListView) rootView.findViewById(R.id.myListView);
        CustomAdapter customAdapter = new CustomAdapter(this.getActivity(), getFirstfragment());
        lv.setAdapter(customAdapter);

        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (position == 0) {
                    /* Activity for How to Assemble a Computer */
                    Intent myIntent = new Intent(view.getContext(), CompTwoActivity.class);
                    startActivityForResult(myIntent, 0);
                }
                if (position == 1) {
                    /* Activity for How to Crimp RJ45 */
                    Intent myIntent = new Intent(view.getContext(), CrimpActivity.class);
                    startActivityForResult(myIntent, 1);
                    onDestroy();
                }
                if (position == 2) {
                    /* Activity for How to Test A Power Supply */
                    Intent myIntent = new Intent(view.getContext(), FormatComputer.class);
                    startActivityForResult(myIntent, 2);
                    onDestroy();
                }
                if (position == 3) {
                    /* Activity for How to Format a Computer */
                    Intent myIntent = new Intent(view.getContext(), WindowsActivity.class);
                    startActivityForResult(myIntent, 3);
                    onDestroy();
                }
                if (position == 4) {
                    Intent myIntent = new Intent(view.getContext(), VpnActivity.class);
                    startActivityForResult(myIntent, 4);
                    onDestroy();
                }
                if (position == 5) {
                    /* Activity for How to Test A Power Supply */
                    Intent myIntent = new Intent(view.getContext(), SpeedUpActivity.class);
                    startActivityForResult(myIntent, 5);
                    onDestroy();
                }
                if (position == 6) {
                    /* Activity for How to Format a Computer */
                    Intent myIntent = new Intent(view.getContext(), ScreenShotActivity.class);
                    startActivityForResult(myIntent, 6);
                    onDestroy();
                }
                if (position == 7) {
                    Intent myIntent = new Intent(view.getContext(), ConnecttvActivity.class);
                    startActivityForResult(myIntent, 7);
                    onDestroy();
                }
                if (position == 8) {
                    /* Activity for How to Test A Power Supply */
                    Intent myIntent = new Intent(view.getContext(), PrinterActivity.class);
                    startActivityForResult(myIntent, 8);
                    onDestroy();
                }
                if (position == 9) {
                    /* Activity for How to Format a Computer */
                    Intent myIntent = new Intent(view.getContext(), StartupActivity.class);
                    startActivityForResult(myIntent, 9  );
                    onDestroy();
                }
                if (position == 10) {
                    Intent myIntent = new Intent(view.getContext(), AccountPass.class);
                    startActivityForResult(myIntent, 10);
                    onDestroy();
                }
                if (position == 11) {
                    /* Activity for How to Crimp RJ45 */
                    Intent myIntent = new Intent(view.getContext(), VirtualDesktopActivity.class);
                    startActivityForResult(myIntent, 11);
                    onDestroy();
                }
                if (position == 12) {
                    /* Activity for How to Test A Power Supply */
                    Intent myIntent = new Intent(view.getContext(), Virtual3Activity.class);
                    startActivityForResult(myIntent, 12);
                    onDestroy();
                }
                if (position == 13) {
                    /* Activity for How to Format a Computer */
                    Intent myIntent = new Intent(view.getContext(), TransferActivity.class);
                    startActivityForResult(myIntent, 13);
                    onDestroy();
                }
                if (position == 14) {
                    Intent myIntent = new Intent(view.getContext(), BiosActivity.class);
                    startActivityForResult(myIntent, 14);
                    onDestroy();
                }
                if (position == 15) {
                    /* Activity for How to Test A Power Supply */
                    Intent myIntent = new Intent(view.getContext(), Virtual2Activity.class);
                    startActivityForResult(myIntent, 15);
                    onDestroy();
                }
                if (position == 16) {
                    /* Activity for How to Format a Computer */
                    Intent myIntent = new Intent(view.getContext(), VDActivity.class);
                    startActivityForResult(myIntent, 16);
                    onDestroy();
                }
                if (position == 17) {
                    Intent myIntent = new Intent(view.getContext(), DualActivity.class);
                    startActivityForResult(myIntent, 17);
                    onDestroy();
                }
                if (position == 18) {
                    /* Activity for How to Test A Power Supply */
                    Intent myIntent = new Intent(view.getContext(), BootActivity.class);
                    startActivityForResult(myIntent, 18);
                    onDestroy();
                }
                if (position == 19) {
                    /* Activity for How to Format a Computer */
                    Intent myIntent = new Intent(view.getContext(), NetflixActivity.class);
                    startActivityForResult(myIntent, 19);
                    onDestroy();
                }
                if (position == 20) {
                    Intent myIntent = new Intent(view.getContext(), SafeActivity.class);
                    startActivityForResult(myIntent, 20);
                    onDestroy();
                }
                if (position == 21) {
                    /* Activity for How to Crimp RJ45 */
                    Intent myIntent = new Intent(view.getContext(), LaptopToMonitor.class);
                    startActivityForResult(myIntent, 21);
                    onDestroy();
                }
                if (position == 22) {
                    /* Activity for How to Test A Power Supply */
                    Intent myIntent = new Intent(view.getContext(), DeleteActivity.class);
                    startActivityForResult(myIntent, 22);
                    onDestroy();
                }
                if (position == 23) {
                    /* Activity for How to Format a Computer */
                    Intent myIntent = new Intent(view.getContext(), TVasMonitorActivity.class);
                    startActivityForResult(myIntent, 23);
                    onDestroy();
                }
                if (position == 24) {
                    Intent myIntent = new Intent(view.getContext(), ProtectFromVirusActivity.class);
                    startActivityForResult(myIntent, 24);
                    onDestroy();
                }
                if (position == 25) {
                    /* Activity for How to Test A Power Supply */
                    Intent myIntent = new Intent(view.getContext(), UninstallActivity.class);
                    startActivityForResult(myIntent, 25);
                    onDestroy();
                }
                if (position == 26) {
                    /* Activity for How to Format a Computer */
                    Intent myIntent = new Intent(view.getContext(), EncryptedActivity.class);
                    startActivityForResult(myIntent, 26);
                    onDestroy();
                }
                if (position == 27) {
                    Intent myIntent = new Intent(view.getContext(), UsbDeviceActivity.class);
                    startActivityForResult(myIntent, 27);
                    onDestroy();
                }
                if (position == 28) {
                    /* Activity for How to Test A Power Supply */
                    Intent myIntent = new Intent(view.getContext(), MailActivity.class);
                    startActivityForResult(myIntent, 28);
                    onDestroy();
                }
                if (position == 29) {
                    /* Activity for How to Format a Computer */
                    Intent myIntent = new Intent(view.getContext(), BrowserActivity.class);
                    startActivityForResult(myIntent, 29);
                    onDestroy();
                }
                if (position == 30) {
                    Intent myIntent = new Intent(view.getContext(), VirusActivity.class);
                    startActivityForResult(myIntent, 30);
                    onDestroy();
                }
                if (position == 31) {
                    /* Activity for How to Crimp RJ45 */
                    Intent myIntent = new Intent(view.getContext(), SSDActivity.class);
                    startActivityForResult(myIntent, 31);
                    onDestroy();
                }
                if (position == 32) {
                    /* Activity for How to Test A Power Supply */
                    Intent myIntent = new Intent(view.getContext(), BrightActivity.class);
                    startActivityForResult(myIntent, 32);
                    onDestroy();
                }
                if (position == 33) {
                    /* Activity for How to Format a Computer */
                    Intent myIntent = new Intent(view.getContext(), ScreenActivity.class);
                    startActivityForResult(myIntent, 33);
                    onDestroy();
                }
                if (position == 34) {
                    Intent myIntent = new Intent(view.getContext(), WebcamActivity.class);
                    startActivityForResult(myIntent, 34);
                    onDestroy();
                }
                if (position == 35) {
                    /* Activity for How to Test A Power Supply */
                    Intent myIntent = new Intent(view.getContext(), VideoCardActivity.class);
                    startActivityForResult(myIntent, 35);
                    onDestroy();
                }
                if (position == 36) {
                    /* Activity for How to Format a Computer */
                    Intent myIntent = new Intent(view.getContext(), RamActivity.class);
                    startActivityForResult(myIntent, 36);
                    onDestroy();
                }
                if (position == 37) {
                    Intent myIntent = new Intent(view.getContext(), FaxMainActivity.class);
                    startActivityForResult(myIntent, 37);
                    onDestroy();
                }
                if (position == 38) {
                    /* Activity for How to Test A Power Supply */
                    Intent myIntent = new Intent(view.getContext(), PDFActivity.class);
                    startActivityForResult(myIntent, 38);
                    onDestroy();
                }
                if (position == 39) {
                    /* Activity for How to Format a Computer */
                    Intent myIntent = new Intent(view.getContext(), ScannerActivity.class);
                    startActivityForResult(myIntent, 39);
                    onDestroy();
                }
                if (position == 40) {
                    Intent myIntent = new Intent(view.getContext(), SSIDActivity.class);
                    startActivityForResult(myIntent, 40);
                    onDestroy();
                }
                if (position == 41) {
                    /* Activity for How to Crimp RJ45 */
                    Intent myIntent = new Intent(view.getContext(), DaisyChainActivity.class);
                    startActivityForResult(myIntent, 41);
                    onDestroy();
                }
                if (position == 42) {
                    /* Activity for How to Test A Power Supply */
                    Intent myIntent = new Intent(view.getContext(), RotateActivity.class);
                    startActivityForResult(myIntent, 42);
                    onDestroy();
                }
                if (position == 43) {
                    /* Activity for How to Format a Computer */
                    Intent myIntent = new Intent(view.getContext(), RouterAddress.class);
                    startActivityForResult(myIntent, 43);
                    onDestroy();
                }
                if (position == 44) {
                    Intent myIntent = new Intent(view.getContext(), ResetBios.class);
                    startActivityForResult(myIntent, 44);
                    onDestroy();
                }
                if (position == 45) {
                    /* Activity for How to Test A Power Supply */
                    Intent myIntent = new Intent(view.getContext(), FixKeyboard.class);
                    startActivityForResult(myIntent, 45);
                    onDestroy();
                }
                if (position == 46) {
                    /* Activity for How to Format a Computer */
                    Intent myIntent = new Intent(view.getContext(), ConnectPhone.class);
                    startActivityForResult(myIntent, 46);
                    onDestroy();
                }
                if (position == 47) {
                    Intent myIntent = new Intent(view.getContext(), CleanComputer.class);
                    startActivityForResult(myIntent, 47);
                    onDestroy();
                }
                if (position == 48) {
                    /* Activity for How to Test A Power Supply */
                    Intent myIntent = new Intent(view.getContext(), LockScreen.class);
                    startActivityForResult(myIntent, 48);
                    onDestroy();
                }
                if (position == 49) {
                    /* Activity for How to Format a Computer */
                    Intent myIntent = new Intent(view.getContext(), EnterToBiosActivity.class);
                    startActivityForResult(myIntent, 49);
                    onDestroy();
                }
                if (position == 50) {
                    Intent myIntent = new Intent(view.getContext(), FacebookActivity.class);
                    startActivityForResult(myIntent, 50);
                    onDestroy();
                }
                if (position == 51) {
                    /* Activity for How to Crimp RJ45 */
                    Intent myIntent = new Intent(view.getContext(), ShareitActivity.class);
                    startActivityForResult(myIntent, 51);
                    onDestroy();
                }
                if (position == 52) {
                    /* Activity for How to Test A Power Supply */
                    Intent myIntent = new Intent(view.getContext(), RecordGameActivity.class);
                    startActivityForResult(myIntent, 52);
                    onDestroy();
                }
                if (position == 53) {
                    /* Activity for How to Format a Computer */
                    Intent myIntent = new Intent(view.getContext(), DownloadMovies.class);
                    startActivityForResult(myIntent, 53);
                    onDestroy();
                }
                if (position == 54) {
                    Intent myIntent = new Intent(view.getContext(), MountIso.class);
                    startActivityForResult(myIntent, 54);
                    onDestroy();
                }
                if (position == 55) {
                    /* Activity for How to Test A Power Supply */
                    Intent myIntent = new Intent(view.getContext(), RouterActivity.class);
                    startActivityForResult(myIntent, 55);
                    onDestroy();
                }
                if (position == 56) {
                    /* Activity for How to Format a Computer */
                    Intent myIntent = new Intent(view.getContext(), LoginActivity.class);
                    startActivityForResult(myIntent, 56);
                    onDestroy();
                }
            }

        });



        return rootView;
    }


    private ArrayList<MyClass> getFirstfragment() {
        ArrayList<MyClass> title = new ArrayList<>();

        //0
        MyClass myClass = new MyClass("How to assemble a Computer", "Planning to buy a new PC? why not build it yourself. Learn this simple steps on how to build your personal Computer.", R.drawable.server);
        title.add(myClass);
        //1
        myClass = new MyClass("How to crimp RJ-45", "Learn this simple steps on how to crimp RJ-45.", R.drawable.pinc);
        title.add(myClass);
        //2
        myClass = new MyClass("How to format/reset Windows 10", "Does your PC's performance is getting slow? Try this step and It could be having a brand new computer again.", R.drawable.resetwindows);
        title.add(myClass);
        //3
        myClass = new MyClass("How to Install Windows", "Learn to install windows 10 in this simple steps.", R.drawable.reset);
        title.add(myClass);
        //4
        myClass = new MyClass("How to Set Up a Virtual Private Network (VPN)", "Are you working from a public places? Do you want a more secure connection? A VPN connection can provide you with that. ", R.drawable.vpn);
        title.add(myClass);
        //5
        myClass = new MyClass("How to Speed Up Windows 10", "Learn this 10 methods on how to make your computer run faster and more efficiently.", R.drawable.speedupwin);
        title.add(myClass);
        //6
        myClass = new MyClass("How to Screenshot on Computers and save as a file", "Learn this basic steps on how to screenshot on windows 10", R.drawable.screenshot);
        title.add(myClass);
        //7
        myClass = new MyClass("How to Connect a Laptop to Your TV", "Are you planning to use your TV as a monitor? Try this simple steps.", R.drawable.laptoptv);
        title.add(myClass);
        //8
        myClass = new MyClass("How to Add a Printer in Windows", "Having a problem on adding a printer component in your computer?", R.drawable.printer);
        title.add(myClass);
        //9
        myClass = new MyClass("How to Change or Disable Startup Programs in Windows 10", "", R.drawable.startup);
        title.add(myClass);
        //10
        myClass = new MyClass("How to Reset a Microsoft Account Password in Windows 10", "Do you think your Computer password is not secured anymore? Why not change it yourself", R.drawable.key);
        title.add(myClass);
        //11
        myClass = new MyClass("How to Create a Windows 10 Virtual Desktop", "", R.drawable.virtualdesktop);
        title.add(myClass);
        //12
        myClass = new MyClass("How to move windows between virtual Desktops", "", R.drawable.virtual);
        title.add(myClass);
        //13
        myClass = new MyClass("How to Transfer Files from Computer to computer", "This will teaches you 4 methods on how to transfer files to another computer.", R.drawable.transferfile);
        title.add(myClass);
        //14
        myClass = new MyClass("How to Update BIOS Software on Windows PCs", "", R.drawable.biosimg);
        title.add(myClass);
        //15
        myClass = new MyClass("How to switch between virtual desktops in Windows 10", "", R.drawable.virtualdesktop);
        title.add(myClass);
        //16
        myClass = new MyClass("How to remove a virtual desktop in Windows 10", "", R.drawable.virtual);
        title.add(myClass);
        //17
        myClass = new MyClass("How to Set Up Dual Monitors on Windows", "", R.drawable.monitordual);
        title.add(myClass);
        //18
        myClass = new MyClass("How to Boot from a USB Drive on Windows", "", R.drawable.usbios);
        title.add(myClass);
        //19
        myClass = new MyClass("How to Download Netflix on a Laptop and Watch Movies", "", R.drawable.imgnetflix);
        title.add(myClass);
        //20
        myClass = new MyClass("How To Get In And Get Out Of Windows PC Safe Mode", "", R.drawable.safemode);
        title.add(myClass);
        //21
        myClass = new MyClass("How to Set Up Portable External Monitor for Your Laptop", "", R.drawable.externalmonitor);
        title.add(myClass);
        //22
        myClass = new MyClass("How To Delete Temporary Files in Windows 10", "", R.drawable.deletefiles);
        title.add(myClass);
        //23
        myClass = new MyClass("How To Use Your TV As A Computer Monitor", "", R.drawable.computertv);
        title.add(myClass);
        //24
        myClass = new MyClass("How to protect your computer from viruses", "", R.drawable.protect);
        title.add(myClass);
        //25
        myClass = new MyClass("How To Uninstall Programs On Windows", "", R.drawable.programs);
        title.add(myClass);
        //26
        myClass = new MyClass("How To Encrypt A File", "", R.drawable.encryptedfile);
        title.add(myClass);
        //27
        myClass = new MyClass("How To Fix USB Device Not Recognized", "", R.drawable.usbimage);
        title.add(myClass);
        //28
        myClass = new MyClass("How To Send Encrypted Email", "", R.drawable.email);
        title.add(myClass);
        //29
        myClass = new MyClass("How To Clear Browser History", "", R.drawable.deletehistory);
        title.add(myClass);
        //30
        myClass = new MyClass("How To Get Rid of a Virus", "", R.drawable.comvirus);
        title.add(myClass);
        //31
        myClass = new MyClass("How To Install a Solid State Hard Drive", "", R.drawable.ssdhdrive);
        title.add(myClass);
        //32
        myClass = new MyClass("How To Turn Off Auto Brightness On Your PC", "", R.drawable.brightnesschange);
        title.add(myClass);
        //33
        myClass = new MyClass("How to Stop Laptop Screen Flickering", "", R.drawable.laptopflicker);
        title.add(myClass);
        //34
        myClass = new MyClass("How To Connect HD Webcam To Your Laptop Or PC", "", R.drawable.camera);
        title.add(myClass);
        //35
        myClass = new MyClass("How To Update Video Drivers on Windows PCs", "", R.drawable.vcard);
        title.add(myClass);
        //36
        myClass = new MyClass("How To Install RAM on a Motherboard", "", R.drawable.randommemory);
        title.add(myClass);
        //37
        myClass = new MyClass("How To Send a Fax", "", R.drawable.faxmachine);
        title.add(myClass);
        //38
        myClass = new MyClass("How To Type On a PDF", "", R.drawable.pdffile);
        title.add(myClass);
        //39
        myClass = new MyClass("How To Use a Scanner", "", R.drawable.scanner);
        title.add(myClass);
        //40
        myClass = new MyClass("How to Change Your SSID", "", R.drawable.ssidimg);
        title.add(myClass);
        //41
        myClass = new MyClass("How to connect two monitors in a daisy chain", "", R.drawable.daisychain);
        title.add(myClass);
        //42
        myClass = new MyClass("How To Rotate Or Flip PC Screen in Windows", "", R.drawable.rotate);
        title.add(myClass);
        //43
        myClass = new MyClass("How to Change Router IP Address", "", R.drawable.modemaddress);
        title.add(myClass);
        //44
        myClass = new MyClass("How To Reset BIOS Settings On Windows PCs", "", R.drawable.resetbios);
        title.add(myClass);
        //45
        myClass = new MyClass("How To Fix a Laptop Keyboard When Locked", "", R.drawable.keyboard);
        title.add(myClass);
        //46
        myClass = new MyClass("How To Connect Phone To Computer via USB", "", R.drawable.cptopc);
        title.add(myClass);
        //47
        myClass = new MyClass("How to clean the inside of your computer", "", R.drawable.cleancom);
        title.add(myClass);
        //48
        myClass = new MyClass("How To Change Lock Screen On Windows 10", "", R.drawable.windowslock);
        title.add(myClass);
        //49
        myClass = new MyClass("How to Enter BIOS Setup on Windows PCs", "", R.drawable.biosimg);
        title.add(myClass);
        //50
        myClass = new MyClass("How to change your Facebook password on desktop and mobile", "", R.drawable.fbpass);
        title.add(myClass);
        //51
        myClass = new MyClass("How to Download Files from iOS on PC via SHAREit", "", R.drawable.shareit);
        title.add(myClass);
        //52
        myClass = new MyClass("How to Record Gameplay on PC", "", R.drawable.recordgame);
        title.add(myClass);
        //53
        myClass = new MyClass("How to Download Movies", "", R.drawable.movies);
        title.add(myClass);
        //54
        myClass = new MyClass("How to Mount an ISO Image", "", R.drawable.iso);
        title.add(myClass);
        //55
        myClass = new MyClass("How to See Who Is Connected to My WIFI (Router)", "", R.drawable.wifiwho);
        title.add(myClass);
        //56
        myClass = new MyClass("How to Change Your Router’s Login Information", "", R.drawable.routerpass);
        title.add(myClass);
        return title;
    }



   // @Override
   // public String toString() {
   //     String Title = "HOW TO?";
  //      return Title;
  //  }
}
