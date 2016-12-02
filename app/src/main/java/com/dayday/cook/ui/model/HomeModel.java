package com.dayday.cook.ui.model;

import com.dayday.cook.base.BaseContract;
import com.dayday.cook.beans.Bannar;
import com.dayday.cook.beans.HomeNew;
import com.dayday.cook.beans.HomeTopic;

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
public interface HomeModel {
    interface View extends BaseContract.BaseView {
        void showBannar(Bannar bannar);
        void showTopic(HomeTopic homeTopic);
        void showNew(HomeNew homeNew);
    }

    interface Presenter<T> extends BaseContract.BasePresenter<T> {
        void getBannar(String deviceId, String mainland, String languageId,
                       String version,String regionCode);
        void getTopic(String deviceId, String mainland, String languageId,
                      String version,String regionCode);
        void getNew(String deviceId, String mainland, String languageId,
                      String version,String regionCode,String curr,String pageSize);
    }

}
