package com.dayday.cook.ui.presenter;

import com.dayday.cook.api.DayApi;
import com.dayday.cook.base.RxPresenter;
import com.dayday.cook.beans.HotSearch;
import com.dayday.cook.ui.model.SearchModel;
import com.orhanobut.logger.Logger;

import java.util.List;

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
public class SearchPresenter extends RxPresenter<SearchModel.View> implements SearchModel.Presenter<SearchModel.View>{
    public SearchPresenter(SearchModel.View view){
        mView = view;
    }
    @Override
    public void getHotSearch(String deviceId, String mainland, String languageId, String version, String regionCode) {
        Subscription rxSubscription = DayApi.getService().getHotSearch(deviceId, mainland, languageId, version,regionCode)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Observer<List<HotSearch>>() {
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
                    public void onNext(List<HotSearch> list) {
                        mView.showHotSearch(list);
                    }
                });
        addSubscrebe(rxSubscription);
    }
}
