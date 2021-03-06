/*
 * Copyright 2018 JessYan
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.njh.common.core;

/**
 * ================================================
 * CommonSDK 的 Constants 可以定义公用的常量, 比如关于业务的常量或者正则表达式, 每个组件的 Constants 可以定义组件自己的私有常量
 * <p>
 * Created by JessYan on 30/03/2018 17:32
 * <a href="mailto:jess.yan.effort@gmail.com">Contact me</a>
 * <a href="https://github.com/JessYanCoding">Follow me</a>
 * ================================================
 */
public interface Constants {
    public final static String CODE = "NETWORK_CODE";
    public final static String MSG = "NETWORK_MSG";
    public final static String DATA = "NETWORK_DATA";

    public final static int NOT_CODE=200;
    /**
     * 电话号码正则
     */
    String PHONE_REGULAR = "^1[3-9]\\d{9}$";
    /**
     * 记录app状态的sp文件名
     */
    String SP_APP_STATE="app_state";
    /**
     * app启动次
     */
    String SP_APP_START_STATISTICS="app_start_statistics";
}
