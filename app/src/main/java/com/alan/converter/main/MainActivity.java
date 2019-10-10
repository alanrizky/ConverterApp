package com.alan.converter.main;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;


import com.alan.converter.R;
import com.alan.converter.fragments.DigitalStorageFragment;
import com.alan.converter.fragments.LengthConverterFragment;

public class MainActivity extends AppCompatActivity implements LengthConverterFragment.OnFragmentInteractionListener, DigitalStorageFragment.OnFragmentInteractionListener{

    private LengthConverterFragment lengthConverterFragment;
    private DigitalStorageFragment digitalStorageFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lengthConverterFragment = new LengthConverterFragment();
        digitalStorageFragment = new DigitalStorageFragment();

    }

    public void lengthHandler(View view) {
        getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, lengthConverterFragment).commit();
    }

    public void digitalStorageHandler(View view) {
        getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, digitalStorageFragment).commit();
    }

    public void onConvertLengthButtonClicked(View view) {
        lengthConverterFragment.setResult();
    }

    public void onConvertDigitalStorageButtonClicked(View view) {
        digitalStorageFragment.setResult();
    }
}
