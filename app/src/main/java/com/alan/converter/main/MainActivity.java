package com.alan.converter.main;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;


import com.alan.converter.R;
import com.alan.converter.fragments.LengthConverterFragment;

public class MainActivity extends AppCompatActivity implements LengthConverterFragment.OnFragmentInteractionListener {

    private LengthConverterFragment lengthConverterFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lengthConverterFragment = new LengthConverterFragment();

    }

    public void lengthHandler(View view) {
        getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, lengthConverterFragment).commit();
    }

    public void onConvertButtonClicked(View view) {
        lengthConverterFragment.setResult();
    }
}
