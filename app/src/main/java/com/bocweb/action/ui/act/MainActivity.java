package com.bocweb.action.ui.act;

import android.content.Context;
import android.os.Bundle;

import com.bocweb.action.R;
import com.bocweb.action.ui.act.test.actions.HouseAction;
import com.bocweb.action.ui.act.test.stores.HouseStore;
import com.njh.common.core.ReqTag;
import com.njh.common.flux.base.BaseFluxActivity;
import com.njh.common.flux.stores.Store;
import com.socks.library.KLog;

/**
 * @author niejiahuan
 */
public class MainActivity extends BaseFluxActivity<HouseStore, HouseAction> {

    @Override
    protected boolean flux() {
        return true;
    }

    @Override
    public void initData(Bundle savedInstanceState) {
        operateCompatDelegate.setStatsManager(R.id.loading_view);
        operateCompatDelegate.getStateManager().showLoading();

        actionsCreator().getHouseSearch(this,"101030100");
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

    @Override
    protected void updateView(Store.StoreChangeEvent event) {
        super.updateView(event);
        if (event.url.equals(ReqTag.REQ_TAG_GET_HOUSE_SEARCH)){
            KLog.debug(event.data);
        }
    }
}
