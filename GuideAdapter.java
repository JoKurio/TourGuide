package io.github.jokurio.tourguide;

import android.content.Context;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.app.Fragment;

public class GuideAdapter extends FragmentPagerAdapter {
    private Context mContext;

    /**
     * Create a new {@link GuideAdapter} object.
     *
     * @param context is the context of the app
     * @param fm is the fragment manager that will keep each fragment's state in the adapter
     *           across swipes.
     */
    public GuideAdapter(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }
    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new SitesFragment();
        } else if (position == 1) {
            return new HotelsFragment();
        } else if (position == 2) {
            return new EventsFragment();
        } else {
            return new ClubsFragment();
        }
    }

    /**
     * Return the total number of pages.
     */
    @Override
    public int getCount() {
        return 4;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0) {
            return mContext.getString(R.string.category_sites);
        } else if (position == 1) {
            return mContext.getString(R.string.category_hotels);
        } else if (position == 2) {
            return mContext.getString(R.string.category_events);
        } else {
            return mContext.getString(R.string.category_clubs);
        }
    }
}
