package com.dayday.cook.ui.activity;

import android.content.Context;
import android.os.Build;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.ScrollView;

import com.dayday.cook.R;
import com.dayday.cook.base.BaseActivity;
import com.dayday.cook.beans.ShiPinZhuanQu;
import com.dayday.cook.ui.adapter.ShiPinFenquAdapter;
import com.dayday.cook.ui.model.ShiPinZhuanQuModel;
import com.dayday.cook.ui.presenter.ShiPinPresenter;
import com.handmark.pulltorefresh.library.PullToRefreshBase;
import com.handmark.pulltorefresh.library.PullToRefreshScrollView;
import com.orhanobut.logger.Logger;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;

/**
 * Created by fan on 2016/12/8.
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
public class ShiPinZhuanQuActivity extends BaseActivity<ShiPinPresenter> implements ShiPinZhuanQuModel.View {
    @BindView(R.id.shipinzhuanqu_line)
    LinearLayout mLinearLayout;
    @BindView(R.id.recy_shi)
    RecyclerView mRecyclerView;
    @BindView(R.id.pull_refresh_scrollview)
    PullToRefreshScrollView mPullToRefreshScrollView;
    public static int height = 200;
    private List<ShiPinZhuanQu.Data> mDatas = new ArrayList<>();
    private ShiPinFenquAdapter mShiPinFenquAdapter;
    private int first = 0;
    @Override
    protected void configViews() {
        height = getScreenH(this);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT) {
            RelativeLayout.LayoutParams params = new RelativeLayout.LayoutParams(getScreenW(this), getStatusBarHeight());
            LayoutInflater inflater = (LayoutInflater) getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            View view = inflater.inflate(R.layout.stuate_bar, null);
            view.setLayoutParams(params);
            mLinearLayout.addView(view, 0);
        }
        mRecyclerView.setNestedScrollingEnabled(false);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        mShiPinFenquAdapter = new ShiPinFenquAdapter(this, mDatas);
        mRecyclerView.setAdapter(mShiPinFenquAdapter);
        mPullToRefreshScrollView.setOnRefreshListener(new PullToRefreshBase.OnRefreshListener2<ScrollView>() {
            @Override
            public void onPullDownToRefresh(PullToRefreshBase<ScrollView> refreshView) {
                first = 0;
                mDatas.clear();
                mPresenter.getShiPin("862744038984662", "1", "1", "3", "2.3.2", "156", "10");
            }
            @Override
            public void onPullUpToRefresh(PullToRefreshBase<ScrollView> refreshView) {
                first += 1;
                mDatas.clear();
                mPresenter.getShiPin("862744038984662",first+"", "1", "3", "2.3.2", "156","10");
            }
        });
        mPresenter = new ShiPinPresenter(this);
        mPresenter.getShiPin("862744038984662", "1", "1", "3", "2.3.2", "156", "10");
    }

    @Override
    protected int getLayoutId() {
        return R.layout.shipinzhuanqu;
    }

    @Override
    public void getShiPin(ShiPinZhuanQu shiPinZhuanQu) {
        Logger.e(shiPinZhuanQu.toString());
        mDatas.addAll(shiPinZhuanQu.mData);
        Logger.e(mDatas.size() + "**************************************************");
        mShiPinFenquAdapter.notifyDataSetChanged();
        mPullToRefreshScrollView.onRefreshComplete();
    }

    @Override
    public void showError() {
        mPullToRefreshScrollView.onRefreshComplete();
    }

    @Override
    public void complete() {

    }
}
