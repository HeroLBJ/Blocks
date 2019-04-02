package com.bocweb.action.ui.act.test.stores;

import com.njh.common.core.ReqTag;
import com.njh.common.flux.annotation.BindAction;
import com.njh.common.flux.dispatcher.Dispatcher;
import com.njh.common.flux.stores.Store;

import java.util.HashMap;


/**
 * @author niejiahuan
 */
public class HouseStore extends Store {
    public HouseStore(Dispatcher dispatcher) {
        super(dispatcher);
    }

    @BindAction(ReqTag.REQ_TAG_GET_HOUSE_SEARCH)
    public void getHouseSearch(HashMap<String, Object> data) {
        emitStoreChange(ReqTag.REQ_TAG_GET_HOUSE_SEARCH, data);
    }
}
