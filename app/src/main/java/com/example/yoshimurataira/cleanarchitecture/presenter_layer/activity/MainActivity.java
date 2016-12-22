package com.example.yoshimurataira.cleanarchitecture.presenter_layer.activity;

import android.app.Fragment;
import android.os.Bundle;

import com.example.yoshimurataira.cleanarchitecture.R;
import com.example.yoshimurataira.cleanarchitecture.presenter_layer.fragment.MainFragment;

public class MainActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    protected int getLayout() {
        return R.layout.activity_main;
    }

    @Override
    protected Fragment getFragment() {
        return new MainFragment();
    }
}
