package com.dayday.cook.ui.presenter;

import com.dayday.cook.api.DayApi;
import com.dayday.cook.base.RxPresenter;
import com.dayday.cook.beans.ShiPinZhuanQu;
import com.dayday.cook.ui.model.ShiPinZhuanQuModel;
import com.dayday.cook.util.RxUtil;
import com.dayday.cook.util.StringUtils;
import com.orhanobut.logger.Logger;

import rx.Observable;
import rx.Observer;
import rx.Subscription;
import rx.android.schedulers.AndroidSchedulers;

/**
 * Created by fan on 2016/12/7.
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
public class ShiPinPresenter extends RxPresenter<ShiPinZhuanQuModel.View> implements ShiPinZhuanQuModel.Presenter<ShiPinZhuanQuModel.View> {
    public ShiPinPresenter(ShiPinZhuanQuModel.View view) {
        mView = view;
    }

    @Override
    public void getShiPin(String deviceId, String curr, String mainland, String languageId, String version, String regionCode, String pagesize) {
        String key = StringUtils.creatAcacheKey("shipin", deviceId,curr, mainland, languageId, version,regionCode,pagesize);
        Observable<ShiPinZhuanQu> fromNetWork = DayApi.getService().getShipin(deviceId,curr,mainland, languageId, version, regionCode,pagesize)
                .compose(RxUtil.<ShiPinZhuanQu>rxCacheListHelper(key));
        Subscription rxSubscription = Observable.concat(RxUtil.rxCreateDiskObservable(key, ShiPinZhuanQu.class), fromNetWork)
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Observer<ShiPinZhuanQu>() {
                    @Override
                    public void onCompleted() {
                        mView.complete();
                    }

                    @Override
                    public void onError(Throwable e) {
                        Logger.e(e.toString());
                        mView.showError();
                    }

                    @Override
                    public void onNext(ShiPinZhuanQu date) {
                        mView.getShiPin(date);
                    }
                });
        addSubscrebe(rxSubscription);
    }
}
