package com.dayday.cook.ui.presenter;

import com.dayday.cook.api.DayApi;
import com.dayday.cook.base.RxPresenter;
import com.dayday.cook.beans.ChuYi;
import com.dayday.cook.ui.model.ChuYiModel;
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
public class ChuYiPresenter extends RxPresenter<ChuYiModel.View> implements ChuYiModel.Presenter<ChuYiModel.View> {
    public ChuYiPresenter(ChuYiModel.View view) {
        mView = view;
    }

    @Override
    public void getChuYi(String deviceId, String curr, String mainland, String languageId, String version, String regionCode, String pagesize) {
        String key = StringUtils.creatAcacheKey("chuyi", deviceId,curr,mainland, languageId, version, regionCode,pagesize);
        Observable<ChuYi> fromNetWork = DayApi.getService().getChuYi(deviceId,curr,mainland, languageId, version, regionCode,pagesize)
                .compose(RxUtil.<ChuYi>rxCacheListHelper(key));
        Subscription rxSubscription = Observable.concat(RxUtil.rxCreateDiskObservable(key, ChuYi.class), fromNetWork)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Observer<ChuYi>() {
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
                    public void onNext(ChuYi date) {
                        mView.showChuYi(date);
                    }
                });
        addSubscrebe(rxSubscription);
    }
}
