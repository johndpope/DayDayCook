package com.dayday.cook.api;

import com.dayday.cook.api.support.LoggingInterceptor;
import com.dayday.cook.base.Constant;
import com.dayday.cook.beans.Bannar;
import com.dayday.cook.beans.ChuYi;
import com.dayday.cook.beans.Date;
import com.dayday.cook.beans.FaXian;
import com.dayday.cook.beans.HomeNew;
import com.dayday.cook.beans.HomeTopic;
import com.dayday.cook.beans.HotSearch;
import com.dayday.cook.beans.ShiPinZhuanQu;
import com.dayday.cook.beans.ShipinXiangQing;
import com.dayday.cook.beans.XiangQing;
import com.orhanobut.logger.Logger;

import java.util.List;
import java.util.concurrent.TimeUnit;

import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;
import rx.Observable;

/**
 * Created by fan on 2016/12/1.
 * ━━━━━━神兽出没━━━━━━
 * 　　　┏┓　　　┏┓
 * 　　┏┛┻━━━┛┻┓
 * 　　┃　　　　　　　┃
 * 　　┃　　　━　　　┃
 * 　　┃　┳┛　┗┳　┃
 * 　　┃　　　　　　　┃
 * 　　┃　　　┻　　　┃
 * 　　┃　　　　　　　┃
 * 　　┗━┓　　　┏━┛Code is far away from bug with the animal protecting
 * 　　　　┃　　　┃    神兽保佑,代码无bug
 * 　　　　┃　　　┃
 * 　　　　┃　　　┗━━━┓
 * 　　　　┃　　　　　　　┣┓
 * 　　　　┃　　　　　　　┏┛
 * 　　　　┗┓┓┏━┳┓┏┛
 * 　　　　　┃┫┫　┃┫┫
 * 　　　　　┗┻┛　┗┻┛
 * <p/>
 * ━━━━━━感觉萌萌哒━━━━━━
 */
public class DayApi {
    private static DayApi dayApi;
    private DayService service = null;
    public DayApi() {
        LoggingInterceptor logging = new LoggingInterceptor(new MyLog());
        logging.setLevel(LoggingInterceptor.Level.BODY);
        OkHttpClient.Builder builder = new OkHttpClient.Builder().connectTimeout(10, TimeUnit.SECONDS)
                .connectTimeout(20 * 1000, TimeUnit.MILLISECONDS)
                .readTimeout(20 * 1000, TimeUnit.MILLISECONDS)
                .retryOnConnectionFailure(true) // 失败重发
                .addInterceptor(logging);
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(Constant.API_BASE_URL)
//                .addConverterFactory(JacksonConverterFactory.create())
                .addCallAdapterFactory(RxJavaCallAdapterFactory.create()) // 添加Rx适配器
                .addConverterFactory(GsonConverterFactory.create()) // 添加Gson转换器
                .client(builder.build())
                .build();
        service = retrofit.create(DayService.class);
    }
    public static DayApi getService(){
        if(dayApi == null) {
            dayApi = new DayApi();
        }
        return dayApi;
    }
    public static class MyLog implements LoggingInterceptor.Logger {
        @Override
        public void log(String message) {
            Logger.i("oklog: " + message);
        }
    }
    public Observable<Bannar> getBannar(String deviceId, String mainland, String languageId,
                                           String version,String regionCode) {
        return service.getBannar(deviceId,mainland,languageId,version,regionCode);
    }
    public Observable<HomeTopic> getTopic(String deviceId, String mainland, String languageId,
                                            String version, String regionCode) {
        return service.getTopic(deviceId,mainland,languageId,version,regionCode);
    }
    public Observable<HomeNew> getNew(String deviceId, String mainland, String languageId,
                                        String version, String regionCode,String curr,String pageSize) {
        return service.getNew(deviceId,mainland,languageId,version,regionCode,curr,pageSize);
    }
    public Observable<FaXian> getFaXian(String deviceId, String mainland, String languageId,
                                        String version, String regionCode) {
        return service.getFaXian(deviceId,mainland,languageId,version,regionCode);
    }
    public Observable<List<HotSearch>> getHotSearch(String deviceId, String mainland, String languageId,
                                                   String version, String regionCode) {
        return service.getHotSearch(deviceId,mainland,languageId,version,regionCode);
    }

    public Observable<Date> getDate(String deviceId, String mainland, String languageId,
                                         String version, String regionCode) {
        return service.getDate(deviceId,mainland,languageId,version,regionCode);
    }
    public Observable<ChuYi> getChuYi(String deviceId, String curr, String mainland, String languageId,
                                      String version, String regionCode, String pagesize) {
        return service.getChuYi(deviceId,curr,mainland,languageId,version,regionCode,pagesize);
    }
    public Observable<ShiPinZhuanQu> getShipin(String deviceId, String curr, String mainland, String languageId,
                                              String version, String regionCode, String pagesize) {
        return service.getShipin(deviceId,curr,mainland,languageId,version,regionCode,pagesize);
    }

    public Observable<ShipinXiangQing> getShipinXiangQing(String deviceId,String id, String mainland, String languageId,
                                                          String ver,String version, String regionCode) {
        return service.getShipinXiangQing(deviceId,mainland,id,languageId,ver,version,regionCode);
    }
    public Observable<XiangQing> getXiangQing(String deviceId, String id, String mainland, String languageId,
                                                    String ver, String version, String regionCode) {
        return service.getXiangQing(deviceId,mainland,id,languageId,ver,version,regionCode);
    }
}
