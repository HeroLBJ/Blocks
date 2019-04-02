package com.njh.network.api;


import com.njh.network.bean.ResponseBean;

import io.reactivex.Observable;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.Path;

import static me.jessyan.retrofiturlmanager.RetrofitUrlManager.DOMAIN_NAME_HEADER;

/**
 * @Description: 提供的系列接口
 * @author: <a href="http://www.xiaoyaoyou1212.com">DAWI</a>
 * @date: 2016-12-30 16:42
 */
public interface ApiService {
//    @Headers({DOMAIN_NAME_HEADER}) //如果不需要多个 BaseUrl ,继续使用初始化时传入 Retrofit 中的默认 BaseUrl ,就不要加上 DOMAIN_NAME_HEADER 这个 Header
//    @GET()
//    Observable<Object> get(@QueryMap Map<String, Object> maps);

    @Headers({DOMAIN_NAME_HEADER}) //如果不需要多个 BaseUrl ,继续使用初始化时传入 Retrofit 中的默认 BaseUrl ,就不要加上 DOMAIN_NAME_HEADER 这个 Header
    @GET("api/weather/city/{city_code}")
    Observable<ResponseBean<Object>> get(@Path("city_code") String city_code);
//    http://t.weather.sojson.com/api/weather/city/+city_code
//
//
//    @Headers({DOMAIN_NAME_HEADER + GITHUB_DOMAIN_NAME})
//    @FormUrlEncoded
//    @POST()
//    Observable<ResultBean> post(@Url() String url, @FieldMap Map<String, Object> maps);
//
//
//    @Headers({DOMAIN_NAME_HEADER + GITHUB_DOMAIN_NAME})
//    @FormUrlEncoded
//    @POST()
//    Observable<ResultBean> postForm(@Url() String url, @FieldMap Map<String, Object> maps);
//
//
//    @Headers({DOMAIN_NAME_HEADER + GITHUB_DOMAIN_NAME})
//    @POST()
//    Observable<ResultBean> postBody(@Url() String url, @Body RequestBody requestBody);
//
//
//    @Headers({DOMAIN_NAME_HEADER + GITHUB_DOMAIN_NAME})
//    @HEAD()
//    Observable<ResultBean> head(@Url String url, @QueryMap Map<String, Object> maps);
//
//
//    @Headers({DOMAIN_NAME_HEADER + GITHUB_DOMAIN_NAME})
//    @OPTIONS()
//    Observable<ResultBean> options(@Url String url, @QueryMap Map<String, Object> maps);
//
//
//    @Headers({DOMAIN_NAME_HEADER + GITHUB_DOMAIN_NAME})
//    @FormUrlEncoded
//    @PUT()
//    Observable<ResponseBody> put(@Url() String url, @FieldMap Map<String, Object> maps);
//
//
//    @Headers({DOMAIN_NAME_HEADER + GITHUB_DOMAIN_NAME})
//    @FormUrlEncoded
//    @PATCH()
//    Observable<ResultBean> patch(@Url() String url, @FieldMap Map<String, Object> maps);
//
//
//    @Headers({DOMAIN_NAME_HEADER + GITHUB_DOMAIN_NAME})
//    @FormUrlEncoded
//    @DELETE()
//    Observable<ResultBean> delete(@Url() String url, @FieldMap Map<String, Object> maps);
//
//
//    @Headers({DOMAIN_NAME_HEADER + GITHUB_DOMAIN_NAME})
//    @Streaming
//    @GET()
//    Observable<ResultBean> downFile(@Url() String url, @QueryMap Map<String, Object> maps);
//
//
//    @Headers({DOMAIN_NAME_HEADER + GITHUB_DOMAIN_NAME})
//    @Multipart
//    @POST()
//    Observable<ResultBean> uploadFiles(@Url() String url, @Part() List<MultipartBody.Part> parts);

}
