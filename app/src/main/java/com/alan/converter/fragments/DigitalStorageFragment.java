package com.alan.converter.fragments;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.alan.converter.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class DigitalStorageFragment extends Fragment {


    public DigitalStorageFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_digital_storage, container, false);
    }

}
