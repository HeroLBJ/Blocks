package com.bocweb.action.ui.act.test.actions;

import com.njh.base.ui.view.BaseView;
import com.njh.common.core.ReqTag;
import com.njh.common.flux.actions.ActionsCreator;
import com.njh.common.flux.base.BaseFluxActivity;
import com.njh.common.flux.dispatcher.Dispatcher;
import com.njh.network.api.ApiService;
import com.njh.network.api.ServiceManager;

/**
 * @author niejiahuan
 */

public class HouseAction extends ActionsCreator {
    public HouseAction(Dispatcher dispatcher, BaseView view) {
        super(dispatcher,view);
    }

    /**
     * 楼盘搜索
     * @param act
     * @param param
     */
    public void getHouseSearch(BaseFluxActivity act, String param) {
        reqDate(ServiceManager.create(ApiService.class).get(param),
                act,true, ReqTag.REQ_TAG_GET_HOUSE_SEARCH);
    }
}
