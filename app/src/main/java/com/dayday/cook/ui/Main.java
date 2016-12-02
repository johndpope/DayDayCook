package com.dayday.cook.ui;

import android.content.Context;
import android.os.Build;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;

import com.bumptech.glide.Glide;
import com.dayday.cook.R;
import com.dayday.cook.base.BaseActivity;
import com.dayday.cook.base.BaseRecyclerAdapter;
import com.dayday.cook.beans.Bannar;
import com.dayday.cook.beans.HomeNew;
import com.dayday.cook.beans.HomeTopic;
import com.dayday.cook.ui.adapter.HomeRecyclerAdapter;
import com.dayday.cook.ui.model.HomeModel;
import com.dayday.cook.ui.presenter.HomePresenter;
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
 * Created by fan on 2016/11/30.
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
public class Main extends BaseActivity<HomePresenter> implements HomeModel.View,OnBannerClickListener {
    Banner mBanner;
    @BindView(R.id.main_act)
    RelativeLayout mRelativeLayout;
    @BindView(R.id.toolbar_main)
    Toolbar mToolbar;
    @BindView(R.id.main_recycler)
    RecyclerView mRecyclerView;
    View header ;
    private BaseRecyclerAdapter<HomeRecyclerAdapter> mHomeRecyclerAdapter;
    private List<HomeTopic> mHomeTopic = new ArrayList<>();
    private List<HomeNew> mHomeNews = new ArrayList<>();
    @Override
    protected void configViews() {
        mHomeRecyclerAdapter = new BaseRecyclerAdapter<HomeRecyclerAdapter>(new HomeRecyclerAdapter(this,mHomeTopic,mHomeNews));
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        mRecyclerView.setAdapter(mHomeRecyclerAdapter);
        header= LayoutInflater.from(this).inflate(R.layout.home_banaer,null);
        mBanner = (Banner) header.findViewById(R.id.banner);
        mRecyclerView.setAdapter(mHomeRecyclerAdapter);

        mPresenter = new HomePresenter(this);
//        deviceId=862744038984662&mainland=1&languageId=3&version=2.3.2&regionCode=156
        mPresenter.getBannar("862744038984662","1","3","2.3.2","156");
        mPresenter.getTopic("862744038984662","1","3","2.3.2","156");
        mPresenter.getNew("862744038984662","1","3","2.3.2","156","0","10");
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT) {
            RelativeLayout.LayoutParams params = new RelativeLayout.LayoutParams(getScreenW(this), getStatusBarHeight());
            LayoutInflater inflater = (LayoutInflater) getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            View view = inflater.inflate(R.layout.stuate_bar, null);
            view.setLayoutParams(params);
            mRelativeLayout.addView(view, mRelativeLayout.getChildCount());
            mToolbar.setPadding(mToolbar.getPaddingLeft(),mToolbar.getPaddingTop()+getStatusBarHeight(),
                    mToolbar.getPaddingRight(),mToolbar.getPaddingBottom());
        }
    }

    @Override
    protected int getLayoutId() {
        return R.layout.main_test;
    }

    //如果你需要考虑更好的体验，可以这么操作
    @Override
    protected void onStart() {
        super.onStart();
        //开始轮播
         mBanner.startAutoPlay();
    }

    @Override
    protected void onStop() {
        super.onStop();
        //结束轮播
           mBanner.stopAutoPlay();
    }

    @Override
    public void OnBannerClick(int position) {
        Logger.e("**************"+position+"************");
    }
    public int getScreenH(Context aty) {
        DisplayMetrics dm = aty.getResources().getDisplayMetrics();
        return dm.heightPixels;
    }
    private List<String> mList = new ArrayList<>();
    @Override
    public void showBannar(Bannar bannar) {
        Logger.e(bannar.toString());
        mList.clear();
        for (Bannar.DataEntity entity:bannar.getData()){
            mList.add(entity.getPath());
        }
        header.setLayoutParams(new RecyclerView.LayoutParams(RecyclerView.LayoutParams.MATCH_PARENT,getScreenH(this)/3));
        mHomeRecyclerAdapter.addHeader(header);
        mHomeRecyclerAdapter.notifyDataSetChanged();
        mRecyclerView.scrollToPosition(0);
       // 设置图片加载器
        mBanner.setImageLoader(new GlideImageLoader(this));
        //设置时间
        mBanner.setDelayTime(3000);
        //设置指示器位置（当banner模式中有指示器时）
        mBanner.setIndicatorGravity(BannerConfig.CENTER);
        //设置点击事件
        mBanner.setOnBannerClickListener(this);
        mBanner.setImages(mList);
        mBanner.start();
    }

    @Override
    public void showTopic(HomeTopic homeTopic) {
        mHomeTopic.clear();
        mHomeTopic.add(homeTopic);
        mHomeRecyclerAdapter.notifyDataSetChanged();
    }

    @Override
    public void showNew(HomeNew homeNew) {
        Logger.e(homeNew.toString());
        mHomeNews.clear();
        mHomeNews.add(homeNew);
        mHomeRecyclerAdapter.notifyDataSetChanged();
    }

    @Override
    public void showError() {
        Logger.e("Error");
    }

    @Override
    public void complete() {
        Logger.e("操作完成");
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

    public int getScreenW(Context aty) {
        DisplayMetrics dm = aty.getResources().getDisplayMetrics();
        return dm.widthPixels;
    }
}
