package com.example.tablayout.Adapters;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.example.tablayout.Fragments.CallsFragment;
import com.example.tablayout.Fragments.ChatsFragment;
import com.example.tablayout.Fragments.StatusFragment;

public class ViewPagerMessengerAdapters extends FragmentPagerAdapter {

    public ViewPagerMessengerAdapters(@NonNull FragmentManager fragment){

        super(fragment);
    }

// set fragment in each tab
    @Override
    public Fragment getItem(int position){
        if(position == 0){

            return new ChatsFragment();

        }else if(position == 1){

            return new StatusFragment();
        }else{

            return new CallsFragment();
        }

    }

    @Override
    public int getCount(){
        return 3;
    }

// set title of each tab
    public CharSequence getPageTitle(int position){

        if(position == 0){

            return "Chats";
        }else if(position == 1){
            return "Status";
        }else{
            return "Calls";
        }
    }

}
