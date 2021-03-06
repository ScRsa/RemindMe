package ru.scrsa.remindme.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import ru.scrsa.remindme.fragment.ExampleFragment;

public class TabsPagerFragmentAdapter extends FragmentPagerAdapter {

    private String[] tabs;

    public TabsPagerFragmentAdapter(FragmentManager fm) {
        super(fm);
        tabs = new String[] {
                "Tab 1", "Напоминания", "Tab 2"
        };
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return tabs[position];
    }

    @Override
    public Fragment getItem(int position) {

        switch (position) {
            case 0:
                return ExampleFragment.getInstans();
            case 1:
                return ExampleFragment.getInstans();
            case 2:
                return ExampleFragment.getInstans();
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return tabs.length;
    }
}
