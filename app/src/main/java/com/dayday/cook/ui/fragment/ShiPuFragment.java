package com.dayday.cook.ui.fragment;

import android.content.Context;
import android.os.AsyncTask;
import android.os.Build;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.ScrollView;

import com.dayday.cook.R;
import com.dayday.cook.base.BaseFragment;
import com.dayday.cook.beans.Bannar;
import com.dayday.cook.beans.HomeNew;
import com.dayday.cook.beans.HomeTopic;
import com.dayday.cook.ui.activity.MainActivity;
import com.dayday.cook.ui.adapter.ShiPuAdapter;
import com.dayday.cook.ui.adapter.ShiPuAdapterGrid;
import com.dayday.cook.ui.model.HomeModel;
import com.dayday.cook.ui.presenter.HomePresenter;
import com.handmark.pulltorefresh.library.PullToRefreshBase;
import com.handmark.pulltorefresh.library.PullToRefreshScrollView;
import com.handmark.pulltorefresh.library.ScrollViewListener;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.OnClick;

/**
 * Created by fan on 2016/12/2.
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
public class ShiPuFragment extends BaseFragment<HomePresenter> implements HomeModel.View {

    @BindView(R.id.toolbar_main)
    Toolbar mToolbarMain;
    @BindView(R.id.shipu_recyclerView)
    RecyclerView mShipuRecyclerView;
    @BindView(R.id.shipu)
    RelativeLayout mRelativeLayout;
    ShiPuAdapter mShiPuAdapter;
    ShiPuAdapterGrid mShiPuAdapterGrid;
    private List<HomeNew> mHomeNews = new ArrayList<>();
    @BindView(R.id.shipu_type)
    ImageView mImageView;
    private boolean type = false;
    @BindView(R.id.pull_refresh_scrollview)
    PullToRefreshScrollView mPullToRefreshScrollView;
    @BindView(R.id.fab)
    ImageView fabs;

    @OnClick(R.id.rela)
    public void changType() {
        type = !type;
        if (type) {
            if (mShiPuAdapter != null) {
                GridLayoutManager gridLayoutManager = new GridLayoutManager(this.getContext(), 2);
                mShipuRecyclerView.setLayoutManager(gridLayoutManager);
                mShipuRecyclerView.setAdapter(mShiPuAdapterGrid);
            }
            mImageView.setBackground(getResources().getDrawable(R.drawable.second_list));
        } else {
            if (mShiPuAdapter != null) {
                mShipuRecyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
                mShipuRecyclerView.setAdapter(mShiPuAdapter);
            }
            mImageView.setBackground(getResources().getDrawable(R.drawable.second_grid));
        }
    }

    private PullToRefreshScrollView.InternalScrollViewSDK9 mInternalScrollViewSDK9;

    @OnClick(R.id.fab)
    public void go() {
        mPullToRefreshScrollView.getRefreshableView().smoothScrollTo(0, 0);
    }

    private class GetDataTask extends AsyncTask<Void, Void, String[]> {

        @Override
        protected String[] doInBackground(Void... params) {
            // Simulates a background job.
            try {
                Thread.sleep(4000);
            } catch (InterruptedException e) {
            }
            return null;
        }

        @Override
        protected void onPostExecute(String[] result) {
            // Do some stuff here

            // Call onRefreshComplete when the list has been refreshed.
            mPullToRefreshScrollView.onRefreshComplete();

            super.onPostExecute(result);
        }
    }

    @Override
    protected void configView() {
        mShipuRecyclerView.setNestedScrollingEnabled(false);
        mInternalScrollViewSDK9 = (PullToRefreshScrollView.InternalScrollViewSDK9) mPullToRefreshScrollView.getRefreshableView();
        mInternalScrollViewSDK9.setScrollViewListener(new ScrollViewListener() {
            @Override
            public void onScrollChanged(ScrollView scrollView, int x, int y, int oldx, int oldy) {
                if (y > 500) {
                    fabs.setVisibility(View.VISIBLE);
                }else {
                    fabs.setVisibility(View.INVISIBLE);
                }
            }
        });
//        mToolbarMain.setNavigationIcon(getResources().getDrawable(R.drawable.second_grid));
        mShiPuAdapter = new ShiPuAdapter(getContext(), mHomeNews);
        mShiPuAdapterGrid = new ShiPuAdapterGrid(getContext(), mHomeNews);
        if (!type) {
            mShipuRecyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
            mShipuRecyclerView.setAdapter(mShiPuAdapter);
        } else {
            GridLayoutManager gridLayoutManager = new GridLayoutManager(this.getContext(), 2);
            mShipuRecyclerView.setLayoutManager(gridLayoutManager);
            mShipuRecyclerView.setAdapter(mShiPuAdapterGrid);
        }

        mPullToRefreshScrollView.setOnRefreshListener(new PullToRefreshBase.OnRefreshListener2<ScrollView>() {
            @Override
            public void onPullDownToRefresh(PullToRefreshBase<ScrollView> refreshView) {
                new GetDataTask().execute();
            }

            @Override
            public void onPullUpToRefresh(PullToRefreshBase<ScrollView> refreshView) {
                new GetDataTask().execute();
            }
        });
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT) {
            RelativeLayout.LayoutParams params = new RelativeLayout.LayoutParams(getScreenW(getContext()), MainActivity.statuBar);
            LayoutInflater inflater = (LayoutInflater) getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            View view = inflater.inflate(R.layout.stuate_bar, null);
            view.setLayoutParams(params);
            mRelativeLayout.addView(view, mRelativeLayout.getChildCount());
            mToolbarMain.setPadding(mToolbarMain.getPaddingLeft(), mToolbarMain.getPaddingTop() + MainActivity.statuBar,
                    mToolbarMain.getPaddingRight(), mToolbarMain.getPaddingBottom());
        }
        mPresenter = new HomePresenter(this);
        mPresenter.getNew("862744038984662", "1", "3", "2.3.2", "156", "0", "10");
    }

    @Override
    protected int getLayoutId() {
        return R.layout.shipu_fragment;
    }

    public int getScreenW(Context aty) {
        DisplayMetrics dm = aty.getResources().getDisplayMetrics();
        return dm.widthPixels;
    }

    @Override
    public void showBannar(Bannar bannar) {

    }

    @Override
    public void showTopic(HomeTopic homeTopic) {

    }

    @Override
    public void showNew(HomeNew homeNew) {
        mHomeNews.clear();
        mHomeNews.add(homeNew);
        mShiPuAdapter.notifyDataSetChanged();

    }


    @Override
    public void showError() {

    }

    @Override
    public void complete() {

    }
}
