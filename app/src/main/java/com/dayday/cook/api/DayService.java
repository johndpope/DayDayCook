package com.dayday.cook.api;

import com.dayday.cook.beans.Bannar;
import com.dayday.cook.beans.HomeNew;
import com.dayday.cook.beans.HomeTopic;

import retrofit2.http.GET;
import retrofit2.http.Query;
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
public interface DayService {
    //http://api.daydaycook.com.cn/daydaycook/server/ad/listAds.do?deviceId=862744038984662&mainland=1&languageId=3&version=2.3.2&regionCode=156
    @GET("/daydaycook/server/ad/listAds.do")
    Observable<Bannar> getBannar(@Query("deviceId") String deviceId,@Query("mainland") String mainland,@Query("languageId") String languageId,
                                 @Query("version")String version,@Query("regionCode") String regionCode);

    @GET("/daydaycook/recommend/queryRecommendAll.do")
    Observable<HomeTopic> getTopic(@Query("deviceId") String deviceId, @Query("mainland") String mainland, @Query("languageId") String languageId,
                                   @Query("version")String version, @Query("regionCode") String regionCode);

    //http://api.daydaycook.com.cn/daydaycook/server/recipe/search.do?deviceId=862744038984662&currentPage=0&mainland=1&languageId=3&version=2.3.2&regionCode=156&pageSize=10
    @GET("/daydaycook/server/recipe/search.do")
    Observable<HomeNew> getNew(@Query("deviceId") String deviceId, @Query("mainland") String mainland, @Query("languageId") String languageId,
                                 @Query("version")String version, @Query("regionCode") String regionCode,@Query("currentPage") String currentPage,@Query("pageSize") String pageSize);
}
