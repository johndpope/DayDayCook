package com.dayday.cook.ui.fragment;

import android.content.Context;
import android.os.AsyncTask;
import android.os.Build;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.ScrollView;

import com.bumptech.glide.Glide;
import com.dayday.cook.R;
import com.dayday.cook.base.BaseFragment;
import com.dayday.cook.base.BaseRecyclerAdapter;
import com.dayday.cook.beans.FaXian;
import com.dayday.cook.ui.activity.MainActivity;
import com.dayday.cook.ui.adapter.FaXianAdapter;
import com.dayday.cook.ui.model.FaXianModel;
import com.dayday.cook.ui.presenter.FaXianPresenter;
import com.dayday.cook.widget.FullyGridLayoutManager;
import com.handmark.pulltorefresh.library.PullToRefreshBase;
import com.handmark.pulltorefresh.library.PullToRefreshScrollView;
import com.orhanobut.logger.Logger;
import com.youth.banner.Banner;
import com.youth.banner.BannerConfig;
import com.youth.banner.listener.OnBannerClickListener;
import com.youth.banner.loader.ImageLoader;

import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;

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
public class FaXianFragment extends BaseFragment<FaXianPresenter> implements FaXianModel.View, OnBannerClickListener {
    @BindView(R.id.rela)
    RelativeLayout mRelativeLayout;
    @BindView(R.id.toolbar_main)
    Toolbar mToolbar;
    @BindView(R.id.faxian_recy)
    RecyclerView mRecyclerView;
    @BindView(R.id.test)
    LinearLayout mLinearLayout;
    FullyGridLayoutManager gridLayoutManager;
    private List<FaXian> mFaXien = new ArrayList<>();
    BaseRecyclerAdapter mBaseRecyclerAdapter;
    private View header;
    Banner mBanner;
    @BindView(R.id.pull_refresh_scrollview)
    PullToRefreshScrollView mPullToRefreshScrollView;
    @Override
    protected void configView() {

        mPullToRefreshScrollView.setOnRefreshListener(new PullToRefreshBase.OnRefreshListener<ScrollView>() {
            @Override
            public void onRefresh(PullToRefreshBase<ScrollView> refreshView) {
                    new GetDataTask().execute();
            }
        });
        mBaseRecyclerAdapter = new BaseRecyclerAdapter<FaXianAdapter>(new FaXianAdapter(getContext(), mFaXien));
        gridLayoutManager = new FullyGridLayoutManager(this.getContext(), 2);
        mRecyclerView.setLayoutManager(gridLayoutManager);
        mRecyclerView.setAdapter(mBaseRecyclerAdapter);
        mRecyclerView.setNestedScrollingEnabled(false);
        mRecyclerView.setHasFixedSize(true);
        header = LayoutInflater.from(getContext()).inflate(R.layout.home_banaer, null);
        mBanner = (Banner) header.findViewById(R.id.banner);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT) {
            RelativeLayout.LayoutParams params = new RelativeLayout.LayoutParams(getScreenW(getContext()), MainActivity.statuBar);
            LayoutInflater inflater = (LayoutInflater) getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            View view = inflater.inflate(R.layout.stuate_bar, null);
            view.setLayoutParams(params);
            mRelativeLayout.addView(view, mRelativeLayout.getChildCount());
            mToolbar.setPadding(mToolbar.getPaddingLeft(), mToolbar.getPaddingTop() + MainActivity.statuBar,
                    mToolbar.getPaddingRight(), mToolbar.getPaddingBottom());
        }
        mPresenter = new FaXianPresenter(this);
        mPresenter.getFaXian("862744038984662", "1", "3", "2.3.2", "156");
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
    protected int getLayoutId() {
        return R.layout.faxian_fragment;
    }

    @Override
    public void onHiddenChanged(boolean hidden) {
        super.onHiddenChanged(hidden);
        mToolbar.setFocusableInTouchMode(true);
        mToolbar.requestFocus();
    }

    @Override
    public void onStop() {
        super.onStop();
        //结束轮播
        mBanner.stopAutoPlay();
    }

    @Override
    public void OnBannerClick(int position) {
        Logger.e("**************" + position + "************");
    }

    @Override
    public void onResume() {
        super.onResume();
        Logger.e("onResume");
    }

    public int getScreenH(Context aty) {
        DisplayMetrics dm = aty.getResources().getDisplayMetrics();
        return dm.heightPixels;
    }

    private List<String> mList = new ArrayList<>();

    @Override
    public void showFaXian(FaXian faXian) {
        Logger.e(faXian.toString());
        mList.clear();
        for (FaXian.One one : faXian.nine) {
            mList.add(one.getImage_url());
        }
        Logger.e(mList.toString());
        mLinearLayout.addView(header, 0);
//        mBanner.setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, getScreenH(getContext()) / 3));
        // 设置图片加载器
        mBanner.setImageLoader(new GlideImageLoader(getContext()));
        //设置时间
        mBanner.setDelayTime(3000);
        //设置指示器位置（当banner模式中有指示器时）
        mBanner.setIndicatorGravity(BannerConfig.CENTER);
        //设置点击事件
        mBanner.setOnBannerClickListener(this);
        mBanner.setImages(mList);
        mBanner.start();
        mFaXien.clear();
        mFaXien.add(faXian);
        mBaseRecyclerAdapter.notifyDataSetChanged();

    }

    @Override
    public void showError() {

    }

    @Override
    public void complete() {

    }

    private static final class GlideImageLoader extends ImageLoader {
        WeakReference<Context> mContextWeakReference;

        public GlideImageLoader(Context context) {
            mContextWeakReference = new WeakReference<Context>(context);
        }

        @Override
        public void displayImage(Context context, Object path, ImageView imageView) {
            //具体方法内容自己去选择，次方法是为了减少banner过多的依赖第三方包，所以将这个权限开放给使用者去选择
            Glide.with(mContextWeakReference.get()).load(path).into(imageView);
        }
    }
}