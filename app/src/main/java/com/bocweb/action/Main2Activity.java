package com.bocweb.action;

import android.content.Context;
import android.os.Bundle;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.njh.base.ui.act.BaseAct;

@Route(path = "/app/main2")
public class Main2Activity extends BaseAct {

    @Override
    public void initBus() {

    }

    @Override
    public void initData(Bundle savedInstanceState) {

    }

    @Override
    public void setListener() {

    }

    @Override
    public int getLayoutId() {
        return R.layout.activity_main2;
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
