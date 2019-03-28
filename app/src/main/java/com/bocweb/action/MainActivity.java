package com.bocweb.action;

import android.content.Context;
import android.os.Bundle;

import com.njh.base.ui.act.BaseAct;
import com.weavey.loading.lib.LoadingLayout;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * @author niejiahuan
 */
public class MainActivity extends BaseAct {

    @BindView(R.id.loading_view)
    LoadingLayout loadingView;

    @Override
    public void initBus() {

    }

    @Override
    public void initData(Bundle savedInstanceState) {
        ButterKnife.bind(this);
        loadingView.setStatus(LoadingLayout.Empty);
    }

    @Override
    public void setListener() {

    }

    @Override
    public int getLayoutId() {
        return R.layout.activity_main;
    }

    @Override
    public Context getContext() {
        return null;
    }

    @Override
    public void showToast(String msg) {

    }

    @Override
    public void showLoading() {

    }

    @Override
    public void hideLoading() {

    }

    @Override
    public void onError(int code, String msg, String tag) {

    }

}
