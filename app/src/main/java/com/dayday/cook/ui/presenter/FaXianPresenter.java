package com.dayday.cook.ui.presenter;

import com.dayday.cook.api.DayApi;
import com.dayday.cook.base.RxPresenter;
import com.dayday.cook.beans.FaXian;
import com.dayday.cook.ui.model.FaXianModel;
import com.dayday.cook.util.RxUtil;
import com.dayday.cook.util.StringUtils;
import com.orhanobut.logger.Logger;

import rx.Observable;
import rx.Observer;
import rx.Subscription;
import rx.android.schedulers.AndroidSchedulers;

/**
 * Created by fan on 2016/12/3.
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
public class FaXianPresenter extends RxPresenter<FaXianModel.View> implements FaXianModel.Presenter<FaXianModel.View>{
    public FaXianPresenter(FaXianModel.View view){
        mView = view;
    }

    @Override
    public void getFaXian(String deviceId, String mainland, String languageId, String version, String regionCode) {
        String key = StringUtils.creatAcacheKey("faxian", deviceId, mainland, languageId, version,regionCode);
        Observable<FaXian> fromNetWork = DayApi.getService().getFaXian(deviceId, mainland, languageId, version,regionCode)
                .compose(RxUtil.<FaXian>rxCacheListHelper(key));

        //依次检查disk、network
        Subscription rxSubscription = Observable.concat(RxUtil.rxCreateDiskObservable(key, FaXian.class), fromNetWork)
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Observer<FaXian>() {
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
                    public void onNext(FaXian list) {
                        Logger.e(list.one.toString());
                        mView.showFaXian(list);
                    }
                });
        addSubscrebe(rxSubscription);
    }
}
