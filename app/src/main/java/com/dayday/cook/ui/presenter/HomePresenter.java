package com.dayday.cook.ui.presenter;

import com.dayday.cook.api.DayApi;
import com.dayday.cook.base.RxPresenter;
import com.dayday.cook.beans.Bannar;
import com.dayday.cook.beans.HomeNew;
import com.dayday.cook.beans.HomeTopic;
import com.dayday.cook.ui.model.HomeModel;
import com.dayday.cook.util.RxUtil;
import com.dayday.cook.util.StringUtils;
import com.orhanobut.logger.Logger;

import rx.Observable;
import rx.Observer;
import rx.Subscription;
import rx.android.schedulers.AndroidSchedulers;

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
public class HomePresenter extends RxPresenter<HomeModel.View> implements HomeModel.Presenter<HomeModel.View> {
    public HomePresenter(HomeModel.View view){
        mView = view;
    }
    @Override
    public void getBannar(String deviceId, String mainland, String languageId, String version, String regionCode) {
        String key = StringUtils.creatAcacheKey("bannar", deviceId, mainland, languageId, version,regionCode);
        Observable<Bannar> fromNetWork = DayApi.getService().getBannar(deviceId, mainland, languageId, version,regionCode)
                .compose(RxUtil.<Bannar>rxCacheListHelper(key));

        //依次检查disk、network
        Subscription rxSubscription = Observable.concat(RxUtil.rxCreateDiskObservable(key, Bannar.class), fromNetWork)
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Observer<Bannar>() {
                    @Override
                    public void onCompleted() {
                        mView.complete();
                    }

                    @Override
                    public void onError(Throwable e) {
                        mView.showError();
                    }

                    @Override
                    public void onNext(Bannar list) {
                        mView.showBannar(list);
                    }
                });
        addSubscrebe(rxSubscription);
    }

    @Override
    public void getTopic(String deviceId, String mainland, String languageId, String version, String regionCode) {
        String key = StringUtils.creatAcacheKey("topic", deviceId, mainland, languageId, version,regionCode);
        Observable<HomeTopic> fromNetWork = DayApi.getService().getTopic(deviceId, mainland, languageId, version,regionCode)
                .compose(RxUtil.<HomeTopic>rxCacheListHelper(key));

        //依次检查disk、network
        Subscription rxSubscription = Observable.concat(RxUtil.rxCreateDiskObservable(key, HomeTopic.class), fromNetWork)
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Observer<HomeTopic>() {
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
                    public void onNext(HomeTopic list) {
                        Logger.e(list.toString());
                        mView.showTopic(list);
                    }
                });
        addSubscrebe(rxSubscription);
    }

    @Override
    public void getNew(String deviceId, String mainland, String languageId, String version, String regionCode, String curr, String pageSize) {
        String key = StringUtils.creatAcacheKey("homenew", deviceId, mainland, languageId, version,regionCode,curr,pageSize);
        Observable<HomeNew> fromNetWork = DayApi.getService().getNew(deviceId, mainland, languageId, version,regionCode,curr,pageSize)
                .compose(RxUtil.<HomeNew>rxCacheListHelper(key));

        //依次检查disk、network
        Subscription rxSubscription = Observable.concat(RxUtil.rxCreateDiskObservable(key, HomeNew.class), fromNetWork)
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Observer<HomeNew>() {
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
                    public void onNext(HomeNew list) {
                        Logger.e(list.toString());
                        mView.showNew(list);
                    }
                });
        addSubscrebe(rxSubscription);
    }
}
