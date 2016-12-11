package com.dayday.cook.ui.model;

import com.dayday.cook.base.BaseContract;
import com.dayday.cook.beans.ChuYi;

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
public interface ChuYiModel {
    interface View extends BaseContract.BaseView {
        void showChuYi(ChuYi chuYi);
    }

    interface Presenter<T> extends BaseContract.BasePresenter<T> {
        void getChuYi(String deviceId,String curr, String mainland, String languageId,
                          String version, String regionCode,String pagesize);
    }
}
