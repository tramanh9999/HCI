package com.kiendst.hci.fragments;


import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.google.android.material.tabs.TabLayout;
import com.kiendst.hci.R;
import com.kiendst.hci.adapters.FragmentAdapter;

/**
 * A simple {@link Fragment} subclass.
 */
public class ChattingFragment extends Fragment {

    TabLayout tabLayout;
    ViewPager viewPager;
    FragmentAdapter adapter;
    public ChattingFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =  inflater.inflate(R.layout.fragment_chatting, container, false);
        tabLayout =view.findViewById(R.id.tabs);
        viewPager = view.findViewById(R.id.viewpaper);
        adapter = new FragmentAdapter(view.getContext(),getFragmentManager());
        adapter.notifyChangeInPosition(1);
        adapter.notifyDataSetChanged();
        viewPager.setAdapter(adapter);
        tabLayout.setupWithViewPager(viewPager);
        return view;
    }

}
