package com.dayday.cook.api;

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

import java.util.List;

import retrofit2.http.GET;
import retrofit2.http.POST;
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

    //http://api.daydaycook.com.cn/daydaycook/recommend/getMoreThemeRecipe.do?deviceId=862744038984662&mainland=1&languageId=3&version=2.3.2&regionCode=156
    @GET("/daydaycook/recommend/getMoreThemeRecipe.do")
    Observable<FaXian> getFaXian(@Query("deviceId") String deviceId, @Query("mainland") String mainland, @Query("languageId") String languageId,
                                 @Query("version")String version, @Query("regionCode") String regionCode);

    @GET("/daydaycook/server/searchTag/hotSearch.do")
    Observable<List<HotSearch>> getHotSearch(@Query("deviceId") String deviceId, @Query("mainland") String mainland, @Query("languageId") String languageId,
                                            @Query("version")String version, @Query("regionCode") String regionCode);

    @GET("/daydaycook/server/classification/hotCatalog/list.do")
    Observable<Date> getDate(@Query("deviceId") String deviceId, @Query("mainland") String mainland, @Query("languageId") String languageId,
                             @Query("version")String version, @Query("regionCode") String regionCode);
    @GET("/daydaycook/server/lesson/list.do")
    Observable<ChuYi> getChuYi(@Query("deviceId") String deviceId, @Query("currentPage") String currentPage, @Query("mainland") String mainland, @Query("languageId") String languageId,
                               @Query("version")String version, @Query("regionCode") String regionCode, @Query("pageSize")String pagesize);
    @POST("/daydaycook/server/video/catalog/listCatalogs.do")
    Observable<ShiPinZhuanQu> getShipin(@Query("deviceId") String deviceId, @Query("currentPage") String currentPage, @Query("mainland") String mainland, @Query("languageId") String languageId,
                                        @Query("version")String version, @Query("regionCode") String regionCode, @Query("pageSize")String pagesize);
//    Content-Disposition: form-data; name="deviceId"
//    862744038984662
//    Content-Disposition: form-data; name="mainland"
//    1
//    Content-Disposition: form-data; name="id"
//    39609
//    Content-Disposition: form-data; name="languageId"
//    3
//    Content-Disposition: form-data; name="ver"
//    2.3.3
//    Content-Disposition: form-data; name="regionCode"
//    156
//    Content-Disposition: form-data; name="version"
//    2.4.1

    @POST("/daydaycook/server/recipe/detailsBytv.do")
    Observable<ShipinXiangQing> getShipinXiangQing(@Query("deviceId") String deviceId , @Query("mainland") String mainland,
                                                   @Query("id")String id,@Query("languageId") String languageId,
                                                   @Query("ver")String ver,@Query("regionCode") String regionCode,
                                                   @Query("version")String version);
    @POST("/daydaycook/server/recipe/details.do")
    Observable<XiangQing> getXiangQing(@Query("deviceId") String deviceId , @Query("mainland") String mainland,
                                       @Query("id")String id, @Query("languageId") String languageId,
                                       @Query("ver")String ver, @Query("regionCode") String regionCode,
                                       @Query("version")String version);
}
