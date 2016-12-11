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
import com.dayday.cook.beans.ChuYi;
import com.dayday.cook.ui.adapter.ChuYitiaozhanAdapter;
import com.dayday.cook.ui.model.ChuYiModel;
import com.dayday.cook.ui.presenter.ChuYiPresenter;
import com.handmark.pulltorefresh.library.PullToRefreshBase;
import com.handmark.pulltorefresh.library.PullToRefreshScrollView;

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
public class ChuYiActivity extends BaseActivity<ChuYiPresenter> implements ChuYiModel.View{
    @BindView(R.id.recy_chuyi)
    RecyclerView mRecyclerView;
    @BindView(R.id.chuyitiaozhan_line)
    LinearLayout mLinearLayout;
    @BindView(R.id.pull_refresh_scrollview)
    PullToRefreshScrollView mPullToRefreshScrollView;
    private List<ChuYi.DataEntity> mDataEntities = new ArrayList<>();
    ChuYitiaozhanAdapter mChuYitiaozhanAdapter;
    public static int height = 200;
    private int first = 1;

    @Override
    protected void configViews() {
        height = getScreenH(this);
        mRecyclerView.setNestedScrollingEnabled(false);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT) {
            RelativeLayout.LayoutParams params = new RelativeLayout.LayoutParams(getScreenW(this), getStatusBarHeight());
            LayoutInflater inflater = (LayoutInflater) getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            View view = inflater.inflate(R.layout.stuate_bar, null);
            view.setLayoutParams(params);
            mLinearLayout.addView(view, 0);
        }
        mChuYitiaozhanAdapter = new ChuYitiaozhanAdapter(this,mDataEntities);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        mRecyclerView.setAdapter(mChuYitiaozhanAdapter);
        mPullToRefreshScrollView.setOnRefreshListener(new PullToRefreshBase.OnRefreshListener2<ScrollView>() {
            @Override
            public void onPullDownToRefresh(PullToRefreshBase<ScrollView> refreshView) {
                first = 1;
                mDataEntities.clear();
                mPresenter.getChuYi("862744038984662",first+"", "1", "3", "2.3.2", "156","10");
            }
            @Override
            public void onPullUpToRefresh(PullToRefreshBase<ScrollView> refreshView) {
                first += 1;
                mPresenter.getChuYi("862744038984662",first+"", "1", "3", "2.3.2", "156", "10");
            }
        });
        mPresenter = new ChuYiPresenter(this);
        mPresenter.getChuYi("862744038984662","0", "1", "3", "2.3.2", "156","10");
    }

    @Override
    protected int getLayoutId() {
        return R.layout.chuyitiaozhan;
    }

    @Override
    public void showChuYi(ChuYi chuYi) {
        mDataEntities.addAll(chuYi.getData());
        mChuYitiaozhanAdapter.notifyDataSetChanged();
        mPullToRefreshScrollView.onRefreshComplete();
    }

    @Override
    public void showError() {
        mDataEntities.clear();
        mPullToRefreshScrollView.onRefreshComplete();
    }

    @Override
    public void complete() {
        mPullToRefreshScrollView.onRefreshComplete();
    }
}
