package com.example.yoshimurataira.cleanarchitecture.presenter_layer.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.yoshimurataira.cleanarchitecture.R;
import com.example.yoshimurataira.cleanarchitecture.presenter_layer.presenter.MainPresenter;

public class MainFragment extends BaseFragment {

    private MainPresenter mMainPresenter;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return super.onCreateView(inflater, container, savedInstanceState);
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        mMainPresenter = new MainPresenter();
        mMainPresenter.setView(view);
    }

    @Override
    public void onResume(){
        super.onResume();
        mMainPresenter.onResume();
    }

    @Override
    protected int getLayout() {
        return R.layout.fragment_main;
    }


}
