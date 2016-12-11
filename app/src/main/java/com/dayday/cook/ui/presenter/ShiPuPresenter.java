package com.dayday.cook.ui.presenter;

import com.dayday.cook.api.DayApi;
import com.dayday.cook.base.RxPresenter;
import com.dayday.cook.beans.Date;
import com.dayday.cook.ui.model.ShipuFenLeiModel;
import com.dayday.cook.util.RxUtil;
import com.dayday.cook.util.StringUtils;
import com.orhanobut.logger.Logger;

import rx.Observable;
import rx.Observer;
import rx.Subscription;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

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
public class ShiPuPresenter extends RxPresenter<ShipuFenLeiModel.View> implements ShipuFenLeiModel.Presenter<ShipuFenLeiModel.View> {
    public ShiPuPresenter(ShipuFenLeiModel.View view) {
        mView = view;
    }

    @Override
    public void getDate(String deviceId, String mainland, String languageId, String version, String regionCode) {
        String key = StringUtils.creatAcacheKey("shipu", deviceId, mainland, languageId, version, regionCode);
        Observable<Date> fromNetWork = DayApi.getService().getDate(deviceId, mainland, languageId, version, regionCode)
                .compose(RxUtil.<Date>rxCacheListHelper(key));
        Subscription rxSubscription = Observable.concat(RxUtil.rxCreateDiskObservable(key, Date.class), fromNetWork)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Observer<Date>() {
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
                    public void onNext(Date date) {
                        mView.showDate(date);
                    }
                });
        addSubscrebe(rxSubscription);
    }
}
