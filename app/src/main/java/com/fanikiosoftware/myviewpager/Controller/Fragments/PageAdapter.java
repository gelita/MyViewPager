package com.fanikiosoftware.myviewpager.Controller.Fragments;


import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.fanikiosoftware.myviewpager.R;

public class PageAdapter extends FragmentPagerAdapter {


    //Default Constructor
    public PageAdapter(FragmentManager mgr) {
        super(mgr);
    }

    @Override
    public int getCount() {
        return(3);
    }

    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0: //Page number 1
                return NewsPageFragment.newInstance();
            case 1: //Page number 2
                return ProfilePageFragment.newInstance();
            case 2: //Page number 3
                return ParamPageFragment.newInstance();
            default:
                return null;
        }
    }

    @Override
    public CharSequence getPageTitle(int position) {
        switch (position){
            case 0: //Page number 1
                return "News";
            case 1: //Page number 2
                return "Profile";
            case 2: //Page number 3
                return "Parameter";
            default:
                return null;
        }
    }
}