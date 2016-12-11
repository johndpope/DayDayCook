package com.dayday.cook.ui.activity;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.webkit.JavascriptInterface;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.dayday.cook.R;
import com.dayday.cook.api.DayApi;
import com.dayday.cook.base.BaseActivity;
import com.dayday.cook.beans.XiangQing;
import com.handmark.pulltorefresh.library.PullToRefreshScrollView;
import com.orhanobut.logger.Logger;

import butterknife.BindView;
import rx.Observer;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

/**
 * Created by fan on 2016/12/9.
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
@SuppressLint({"JavascriptInterface", "SetJavaScriptEnabled","HandlerLeak"})
public class XiangQingActivity extends BaseActivity {
    public static final String NOTV_ID = "notv_id";
    @BindView(R.id.webView)
    WebView mWebView;
    @BindView(R.id.shipu_type)
    ImageView mShipuType;
    @BindView(R.id.rela)
    RelativeLayout mRela;
    @BindView(R.id.image_food)
    ImageView mImageFood;
    @BindView(R.id.food_name)
    TextView mFoodName;
    @BindView(R.id.food_count)
    TextView mFoodCount;
    @BindView(R.id.pull_refresh_scrollview)
    PullToRefreshScrollView mPullRefreshScrollview;
    @BindView(R.id.notv_layout)
    RelativeLayout mRelativeLayout;
    @BindView(R.id.toolbar_main)
    Toolbar mToolbar;
    @Override
    protected void configViews() {
        mImageFood.setLayoutParams(new RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.MATCH_PARENT,getScreenH(this)/2));
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT) {
            RelativeLayout.LayoutParams params = new RelativeLayout.LayoutParams(getScreenW(this), MainActivity.statuBar);
            LayoutInflater inflater = (LayoutInflater) getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            View view = inflater.inflate(R.layout.stuate_bar, null);
            view.setLayoutParams(params);
            mRelativeLayout.addView(view, mRelativeLayout.getChildCount());
            mToolbar.setPadding(mToolbar.getPaddingLeft(), mToolbar.getPaddingTop() + MainActivity.statuBar,
                    mToolbar.getPaddingRight(), mToolbar.getPaddingBottom());
        }
        DayApi.getService().getXiangQing("862744038984662", getId(), "1", "3", "2.3.3", "156", "2.4.1")
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Observer<XiangQing>() {
                    @Override
                    public void onCompleted() {
                    }

                    @Override
                    public void onError(Throwable e) {
                        Logger.e(e.toString());
                    }

                    @Override
                    public void onNext(XiangQing list) {
                        Logger.e(list.toString());
                        show(list);
                        mWebView.getSettings().setJavaScriptEnabled(true);
                        mWebView.loadUrl(list.getData().getLoadContent());
                        mWebView.addJavascriptInterface(this, "myJsf");
                        mFoodCount.setText(list.getData().getClickCount()+"");
                        mFoodName.setText(list.getData().getTitle());
                    }
                });
    }

    private void show(XiangQing list) {
        Glide.with(this).load(list.getData().getImageUrl()).into(mImageFood);
    }
    private String getId(){
        Intent intent = getIntent();
        int id = intent.getIntExtra(NOTV_ID,0);
        return id+"";
    }
    @Override
    protected int getLayoutId() {
        return R.layout.xiangqing_notv;
    }

    @JavascriptInterface
    public void linkRecipeDtl(String id){
        Logger.e("**********************"+id);
    }

    @JavascriptInterface
    public void linkRecipeDtl(int id){
        Logger.e("**********************"+id);
    }
}
