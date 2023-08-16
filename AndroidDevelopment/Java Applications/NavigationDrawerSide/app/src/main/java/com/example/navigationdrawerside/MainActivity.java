package com.example.navigationdrawerside;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.Gravity;
import android.view.MenuItem;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Toast;

import com.example.navigationdrawerside.Fragments.HomeFragment;
import com.example.navigationdrawerside.Fragments.LogoutFragment;
import com.example.navigationdrawerside.Fragments.MailFragment;
import com.google.android.material.navigation.NavigationView;

public class MainActivity extends AppCompatActivity {

    NavigationView navigationView;
    public DrawerLayout drawerLayout;
    ActionBarDrawerToggle actionBarDrawerToggle;
    Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        navigationView = findViewById(R.id.navigation);
        drawerLayout = findViewById(R.id.drawerLayout);
        toolbar = findViewById(R.id.toolbar);

        setSupportActionBar(toolbar);
// to hide status bar


        actionBarDrawerToggle = new ActionBarDrawerToggle(this,drawerLayout,toolbar,R.string.nav_open, R.string.nav_close);
        drawerLayout.addDrawerListener(actionBarDrawerToggle);
//        sync the state(ON/OFF) of navigation drawer
        actionBarDrawerToggle.syncState();

//        set action bar triple line
//        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
//        getSupportActionBar().setDisplayHomeAsUpEnabled();

//      set onClickListener on items of Navigation Drawer

        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {

                    int id = menuItem.getItemId();

                    if(id == R.id.home){
                        HomeFragment homeFragment = new HomeFragment();
                        replaceFragment(homeFragment);
                    } else if (id==R.id.mail) {
                        MailFragment mailFragment = new MailFragment();
                        replaceFragment(mailFragment);
                    }else if(id == R.id.logout){
                        LogoutFragment logoutFragment = new LogoutFragment();
                        replaceFragment(logoutFragment);
                    }
                    drawerLayout.closeDrawers();
                return true;
                }
//            }
        });


    } // end of onCreate fxn

// create fragment method
    public void replaceFragment(Fragment fragment){

        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.frameLayout, fragment);
        fragmentTransaction.commit();
    }
//@Override
//    public boolean onOptionsItemSelected(@NonNull MenuItem menuItem){
//        if(actionBarDrawerToggle.onOptionsItemSelected(menuItem)){
//
//
//            return true;
//        }
//
//    return super.onOptionsItemSelected(menuItem);
//    }

}