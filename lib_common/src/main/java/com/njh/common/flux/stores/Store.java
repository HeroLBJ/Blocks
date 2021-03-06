package com.njh.common.flux.stores;


import com.njh.common.core.Constants;
import com.njh.common.flux.dispatcher.Dispatcher;

import java.util.HashMap;

public class Store {

    protected final Dispatcher dispatcher;

    public Store(Dispatcher dispatcher) {
        this.dispatcher = dispatcher;
    }


    protected void emitStoreChange(String url, HashMap<String, Object> data) {
        StoreChangeEvent event = new StoreChangeEvent(url, (Integer) data.get(Constants.CODE), (String) data.get(Constants.MSG), data.get(Constants.DATA));
        dispatcher.emitChange(event);
    }

    public class StoreChangeEvent {
        public String url;
        public String msg;
        public int code;
        public Object data;

        public StoreChangeEvent(String url, int code, String msg, Object data) {
            this.code = code;
            this.url = url;
            this.msg = msg;
            this.data = data;
        }

        @Override
        public String toString() {
            return "StoreChangeEvent{" +
                    "url='" + url + '\'' +
                    ", msg='" + msg + '\'' +
                    ", code=" + code +
                    ", data=" + data +
                    '}';
        }
    }
}
