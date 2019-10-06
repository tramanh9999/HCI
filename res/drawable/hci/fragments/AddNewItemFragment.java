package com.kiendst.hci.fragments;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.kiendst.hci.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class AddNewItemFragment extends Fragment {


    public AddNewItemFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.add_good, container, false);
    }






}
