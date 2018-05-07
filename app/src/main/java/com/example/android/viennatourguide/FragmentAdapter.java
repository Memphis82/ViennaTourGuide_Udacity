package com.example.android.viennatourguide;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;


public class FragmentAdapter extends FragmentPagerAdapter{

    private Context mContext;

    public FragmentAdapter(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }

    // This determines the fragment for each tab
    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new MainFragment();
        } else if (position == 1) {
            return new HotelFragment();
        } else if (position == 2) {
            return new RestaurantFragment();
        } else if (position == 3) {
            return new SightseeingFragment();
        } else {
            return new NightlifeFragment();
        }
    }

    // This determines the number of tabs
    @Override
    public int getCount() {
        return 5;
    }

    // This determines the title for each tab
    @Override
    public CharSequence getPageTitle(int position) {
        // Generate title based on item position
        switch (position) {
            case 0:
                return mContext.getString(R.string.category_main);
            case 1:
                return mContext.getString(R.string.category_hotel);
            case 2:
                return mContext.getString(R.string.category_restaurant);
            case 3:
                return mContext.getString(R.string.category_sightseeing);
            case 4:
                return mContext.getString(R.string.category_nightlife);
            default:
                return null;
        }
    }

}