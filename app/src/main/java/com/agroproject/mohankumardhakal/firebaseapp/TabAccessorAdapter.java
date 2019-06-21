package com.agroproject.mohankumardhakal.firebaseapp;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class TabAccessorAdapter extends FragmentPagerAdapter {
    public TabAccessorAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {


        ChatsFragment chatsFragment = new ChatsFragment();
        switch (position) {

            case 0:
                return chatsFragment;
            case 1:
                GroupsFragment groupsFragment = new GroupsFragment();
                return groupsFragment;
            case 2:
                ContactsFragment contactsFragment = new ContactsFragment();
                return contactsFragment;
            default:
                return chatsFragment;

        }


    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {

        switch (position) {
            case 0:
                return "Chats";
            case 1:
                return "Groups";
            case 2:
                return "contacts";
            default:
                return "Chats";
        }

    }

    @Override
    public int getCount() {
        return 3;
    }
}
