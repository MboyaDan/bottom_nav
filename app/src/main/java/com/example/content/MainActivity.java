package com.example.content;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.FrameLayout;
import com.google.android.material.bottomnavigation.BottomNavigationView;
public class MainActivity extends AppCompatActivity {
    private BottomNavigationView mMainNav;
    private FrameLayout mMainFrame;
    private fragment_add_photo mphoto;
    private fragment_category mcategory;
    private fragment_home mhome;
    private fragment_notitfication mnotification;
private fragment_message mmessage;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mMainFrame= findViewById(R.id.main_frame);
        mMainNav= findViewById(R.id.bottom_navigation);
        mphoto=new fragment_add_photo();
        mcategory=new fragment_category();
        mhome=new fragment_home();
        mnotification=new fragment_notitfication();
        mmessage=new fragment_message();
        mMainNav.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                switch (menuItem.getItemId()){
                    case R.id.add:
                        mMainNav.setItemBackgroundResource(R.color.ColorWhite);
                        setFragment(mphoto);
                        return true;

                    case R.id.category:
                        mMainNav.setItemBackgroundResource(R.color.ColorWhite);
                        setFragment(mcategory);
                        return true;

                    case R.id.home:
                        mMainNav.setItemBackgroundResource(R.color.ColorWhite);
                        setFragment(mhome);
                        return true;
                    case R.id.message:
                        mMainNav.setItemBackgroundResource(R.color.ColorWhite);
                        setFragment(mmessage);
                        return true;
                    case R.id.notification:
                        mMainNav.setItemBackgroundResource(R.color.ColorWhite);
                        setFragment(mnotification);

                        return true;
                    default:return false;
                }}

                    private void setFragment(Fragment fragment) {
                FragmentTransaction fragmentTransaction=getSupportFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.main_frame,fragment);
                fragmentTransaction.commit();
            }

        });
    }
}
