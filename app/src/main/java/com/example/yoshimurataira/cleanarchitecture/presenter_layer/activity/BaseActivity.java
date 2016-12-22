package com.example.yoshimurataira.cleanarchitecture.presenter_layer.activity;

import android.app.Fragment;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.example.yoshimurataira.cleanarchitecture.R;

public abstract class BaseActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(getLayout());

        if(savedInstanceState == null){
            getFragmentManager().beginTransaction().add(R.id.activity_container, getFragment()).commit();
        }
    }

    protected abstract int getLayout();

    protected abstract Fragment getFragment();
}
