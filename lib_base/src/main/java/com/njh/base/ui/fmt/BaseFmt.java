package com.njh.base.ui.fmt;


import android.content.Context;
import android.graphics.Color;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.gyf.barlibrary.ImmersionBar;
import com.njh.base.ui.view.BaseView;
import com.trello.rxlifecycle3.components.support.RxFragment;

import androidx.annotation.Nullable;

/**
 * @author niejiahuan
 */
public abstract class BaseFmt extends RxFragment implements BaseView {

    protected ImmersionBar immersionBar;

    protected Context mContext;
    protected View mContentView;
    protected OperateFmtCompatDelegate compatDelegate;
    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        mContext = context;
    }

    @androidx.annotation.Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @androidx.annotation.Nullable ViewGroup container,
                             @androidx.annotation.Nullable Bundle savedInstanceState) {
        super.onCreateView(inflater, container, savedInstanceState);
        if (null==mContentView) {
            mContentView = inflater.inflate(getLayoutId(), container, false);
        }
        return mContentView;
    }


    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        compatDelegate=new OperateFmtCompatDelegate(this);
        initStatusBar();
    }

    /**
     * 设置是否开启
     * @return
     */
    protected boolean isEnableStatusBar() {
        return true;
    }

    protected void initStatusBar() {
        if (isEnableStatusBar()) {
            immersionBar.statusBarDarkFont(true, 0.2f)
                    .navigationBarColorInt(Color.WHITE)
                    .navigationBarDarkIcon(true, 0.2f)
                    .init();
        }
    }

    @Override
    public void onHiddenChanged(boolean hidden) {
        if (hidden) {
            immersionBar.init();
        }
        super.onHiddenChanged(hidden);
    }

}
