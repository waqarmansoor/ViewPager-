package com.example.waqar.viewpager;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by waqar on 7/23/2017.
 */

public class FragmentAdapter extends FragmentPagerAdapter {

    Fragment fragment=null;
    public FragmentAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        if(position==0){
            fragment=new MyFragment();
            return fragment;
        }else if(position==1){
            fragment=new MyFragment2();
            return fragment;
        }else if(position==2){
            fragment=new MyFragment3();
            return fragment;
        }else
            return null;
    }

    @Override
    public int getCount() {
        return 3;
    }
}
