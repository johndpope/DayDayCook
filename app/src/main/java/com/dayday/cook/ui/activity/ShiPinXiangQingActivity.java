package com.dayday.cook.ui.activity;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.dayday.cook.R;
import com.dayday.cook.api.DayApi;
import com.dayday.cook.base.BaseActivity;
import com.dayday.cook.beans.CaiLiao;
import com.dayday.cook.beans.ShipinXiangQing;
import com.dayday.cook.ui.adapter.BuZhouAdapter;
import com.dayday.cook.ui.adapter.CaiLiaoAdapter;
import com.dayday.cook.util.LinkedMultiValueMap;
import com.dayday.cook.util.MultiValueMap;
import com.handmark.pulltorefresh.library.PullToRefreshScrollView;
import com.orhanobut.logger.Logger;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

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
public class ShiPinXiangQingActivity extends BaseActivity {
    public static final String SHIPIN_ID = "shipin_id";
    @BindView(R.id.image_food)
    ImageView mImageFood;
    @BindView(R.id.food_name)
    TextView mFoodName;
    @BindView(R.id.food_count)
    TextView mFoodCount;
    @BindView(R.id.det)
    TextView mDet;
    @BindView(R.id.pengrenshijian)
    TextView mPengrenshijian;
    @BindView(R.id.shicai_image)
    ImageView mShicaiImage;
    @BindView(R.id.buzhou_recy)
    RecyclerView mRecyclerView;
    @BindView(R.id.cailiao_recy)
    RecyclerView cailiao_recy;
    @BindView(R.id.pull_refresh_scrollview)
    PullToRefreshScrollView mPullRefreshScrollview;
    @BindView(R.id.bofang)
    ImageView bofang;
    @BindView(R.id.xiangqing_video)
    RelativeLayout mRelativeLayout;
    @BindView(R.id.toolbar_main)
    Toolbar mToolbar;
    private List<CaiLiao> mCaiLiaos = new ArrayList<>();
    private CaiLiaoAdapter mCaiLiaoAdapter;
    private List<ShipinXiangQing.DataEntity.StepsEntity> mStepsEntities = new ArrayList<>();
    private BuZhouAdapter mBuZhouAdapter;

    @Override
    protected void configViews() {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT) {
            RelativeLayout.LayoutParams params = new RelativeLayout.LayoutParams(getScreenW(this), MainActivity.statuBar);
            LayoutInflater inflater = (LayoutInflater) getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            View view = inflater.inflate(R.layout.stuate_bar, null);
            view.setLayoutParams(params);
            mRelativeLayout.addView(view, mRelativeLayout.getChildCount());
            mToolbar.setPadding(mToolbar.getPaddingLeft(), mToolbar.getPaddingTop() + MainActivity.statuBar,
                    mToolbar.getPaddingRight(), mToolbar.getPaddingBottom());
        }
        mImageFood.setLayoutParams(new RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.MATCH_PARENT, getScreenH(this) / 2));
        mBuZhouAdapter = new BuZhouAdapter(this, mStepsEntities);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        mRecyclerView.setNestedScrollingEnabled(false);
        mRecyclerView.setAdapter(mBuZhouAdapter);

        mCaiLiaoAdapter = new CaiLiaoAdapter(this, mCaiLiaos);
        cailiao_recy.setLayoutManager(new LinearLayoutManager(this));
        cailiao_recy.setNestedScrollingEnabled(false);
        cailiao_recy.setAdapter(mCaiLiaoAdapter);

        DayApi.getService().getShipinXiangQing("862744038984662", getId(), "1", "3", "2.3.3", "156", "2.4.1")
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Observer<ShipinXiangQing>() {
                    @Override
                    public void onCompleted() {
                    }

                    @Override
                    public void onError(Throwable e) {
                        Logger.e(e.toString());
                    }

                    @Override
                    public void onNext(ShipinXiangQing list) {
                        Logger.e(list.toString());
                        show(list);
                        mStepsEntities.clear();
                        mStepsEntities.addAll(list.getData().getSteps());
                        mBuZhouAdapter.notifyDataSetChanged();

                        mCaiLiaos.clear();
                        MultiValueMap<String, String> stringMultiValueMap = new LinkedMultiValueMap<>();
                        for (int i = 0; i < list.getData().getIngredients().size(); i++) {
                            stringMultiValueMap.add(list.getData().getIngredients().get(i).getTypeName(), list.getData().getIngredients().get(i).getName() + "/" + list.getData().getIngredients().get(i).getCnt() + list.getData().getIngredients().get(i).getUnit());
                        }
                        Set<String> keySet = stringMultiValueMap.keySet();
                        for (String a : keySet) {
                            CaiLiao caiLiao = new CaiLiao();
                            caiLiao.group = a;
                            caiLiao.child = new ArrayList<String>();
                            caiLiao.child.addAll(stringMultiValueMap.getValues(a));
                            mCaiLiaos.add(caiLiao);
                        }
                        mCaiLiaoAdapter.notifyDataSetChanged();
                    }
                });
    }

    private void show(final ShipinXiangQing list) {
        if (!list.getData().getDetailsUrl().isEmpty()) {
            bofang.setVisibility(View.VISIBLE);
        } else {
            bofang.setVisibility(View.INVISIBLE);
        }
        bofang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.setClass(ShiPinXiangQingActivity.this,TVActivity.class);
                intent.putExtra(TVActivity.mUrl,list.getData().getDetailsUrl());
                startActivity(intent);
            }
        });
        Glide.with(this).

                load(list.getData()

                        .

                                getImageUrl()

                ).

                into(mImageFood);

        Glide.with(this).

                load(list.getData()

                        .

                                getIngredientImageUrl()

                ).

                into(mShicaiImage);

        mFoodCount.setText(list.getData().

                getClickCount()

                + "");
        mDet.setText(list.getData().

                getDescription()

        );
        mFoodName.setText(list.getData().

                getTitle()

        );
        mPengrenshijian.setText("烹饪时间：  " + list.getData().

                getMaketime()

        );
    }

    private String getId() {
        Intent intent = getIntent();
        int id = intent.getIntExtra(SHIPIN_ID, 0);
        Logger.e(id + "");
        return id + "";
    }

    @Override
    protected int getLayoutId() {
        return R.layout.xiangqing_video;
    }


}
