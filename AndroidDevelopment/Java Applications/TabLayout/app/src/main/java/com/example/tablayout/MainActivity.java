package com.example.tablayout;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.fragment.app.FragmentTransaction;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.view.Window;

import com.example.tablayout.Adapters.ViewPagerMessengerAdapters;
import com.example.tablayout.Fragments.CallsFragment;
import com.example.tablayout.Fragments.ChatsFragment;
import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {

    TabLayout tabLayout;
    ViewPager viewPager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tabLayout = findViewById(R.id.tablayout);
        viewPager = findViewById(R.id.viewPager);

        Window window = getWindow();
        window.setStatusBarColor(getColor(R.color.darkgreen));


//        getSupportFragmentManager() take the reference from adapter class
        ViewPagerMessengerAdapters viewPagerMessengerAdapters = new ViewPagerMessengerAdapters(getSupportFragmentManager());
        viewPager.setAdapter(viewPagerMessengerAdapters); // set adapter(viewpager)

//        Synchronize the tablayout and viewpager
        tabLayout.setupWithViewPager(viewPager);
    }



}