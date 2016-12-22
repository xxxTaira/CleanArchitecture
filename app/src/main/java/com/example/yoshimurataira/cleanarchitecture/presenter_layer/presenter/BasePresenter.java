package com.example.yoshimurataira.cleanarchitecture.presenter_layer.presenter;

import android.view.View;

public abstract class BasePresenter {

    private View mView;

    public void setView(View view){
        mView = view;
    }

    public abstract void onResume();

    public abstract void onPause();
}
