package com.bocweb.action.ui.act;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import com.alibaba.android.arouter.facade.Postcard;
import com.alibaba.android.arouter.facade.callback.NavCallback;
import com.alibaba.android.arouter.launcher.ARouter;
import com.alibaba.fastjson.JSON;
import com.bocweb.action.R;
import com.bocweb.action.ui.act.test.actions.HouseAction;
import com.bocweb.action.ui.act.test.stores.HouseStore;
import com.njh.common.core.ReqTag;
import com.njh.common.flux.base.BaseFluxActivity;
import com.njh.common.flux.stores.Store;
import com.socks.library.KLog;

import butterknife.BindView;

/**
 * @author niejiahuan
 */
public class MainActivity extends BaseFluxActivity<HouseStore, HouseAction> {


    @BindView(R.id.tv_content)
    TextView tvContent;

    @Override
    protected boolean flux() {
        return true;
    }

    @Override
    public void initData(Bundle savedInstanceState) {
        operateCompatDelegate.setStatsManager(R.id.loading_view);
        operateCompatDelegate.getStateManager().showLoading();

        tvContent.postDelayed(new Runnable() {
            @Override
            public void run() {
                actionsCreator().getHouseSearch(MainActivity.this, "101030100");
            }
        },1000);

        tvContent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ARouter.getInstance()
                        .build("/test/activity4")
                        .navigation(getContext(), new NavCallback() {
                            @Override
                            public void onArrival(Postcard postcard) {

                            }

                            @Override
                            public void onInterrupt(Postcard postcard) {
                                Log.d("ARouter", "被拦截了");
                            }
                        });
            }
        });
    }

    @Override
    public void setListener() {

    }

    @Override
    public int getLayoutId() {
        return R.layout.activity_main;
    }


    @Override
    protected void updateView(Store.StoreChangeEvent event) {
        super.updateView(event);
        if (event.url.equals(ReqTag.REQ_TAG_GET_HOUSE_SEARCH)) {
            operateCompatDelegate.getStateManager().showContent();
            tvContent.setText(JSON.toJSONString(event.data));
            KLog.debug(event.data);
        }
    }

}
