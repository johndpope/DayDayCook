package com.dayday.cook.ui.activity;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.v4.app.FragmentTransaction;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.TextView;

import com.dayday.cook.R;
import com.dayday.cook.base.BaseActivity;
import com.dayday.cook.ui.fragment.FaXianFragment;
import com.dayday.cook.ui.fragment.JingXuanFragment;
import com.dayday.cook.ui.fragment.MeFragment;
import com.dayday.cook.ui.fragment.ShiPuFragment;

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
public class MainActivity extends BaseActivity {
    public static int statuBar = 0;
    public static int Height = 0;
    @BindView(R.id.jingxuan)
    TextView mJingXuan;
    @BindView(R.id.shipu)
    TextView mShiPu;
    @BindView(R.id.faxian)
    TextView mFaXian;
    @BindView(R.id.me)
    TextView mMe;
    private JingXuanFragment mJingXuanFragment = null;
    private ShiPuFragment mShiPuFragment = null;
    private FaXianFragment mFaXianFragment = null;
    private MeFragment mMeFragment = null;
    private int currentId = R.id.jingxuan;// 当前选中id,默认是主页

    public int getScreenH(Context aty) {
        DisplayMetrics dm = aty.getResources().getDisplayMetrics();
        return dm.widthPixels;
    }
    @Override
    protected void configViews() {
        statuBar = getStatusBarHeight();
        Height = getScreenH(this);
        mJingXuan.setSelected(true);
        Drawable drawable4= getResources().getDrawable(R.drawable.tab_btn_jingxuan_select);
        /// 这一步必须要做,否则不会显示.
        drawable4.setBounds(0, 0, drawable4.getMinimumWidth(), drawable4.getMinimumHeight());
        mJingXuan.setCompoundDrawables(null,drawable4,null,null);
        /**
         * 默认加载首页
         */
        mJingXuanFragment = new JingXuanFragment();
        getSupportFragmentManager().beginTransaction().add(R.id.main_container, mJingXuanFragment).commit();
        mJingXuan.setOnClickListener(tabClickListener);
        mShiPu.setOnClickListener(tabClickListener);
        mFaXian.setOnClickListener(tabClickListener);
        mMe.setOnClickListener(tabClickListener);
    }
    private View.OnClickListener tabClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            if (v.getId() != currentId) {//如果当前选中跟上次选中的一样,不需要处理
                    changeSelect(v.getId());//改变图标跟文字颜色的选中
                    changeFragment(v.getId());//fragment的切换
                    currentId = v.getId();//设置选中id
            }
        }
    };

    /**
     * 改变fragment的显示
     *
     * @param resId
     */
    private void changeFragment(int resId) {
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();//开启一个Fragment事务
        hideFragments(transaction);//隐藏所有fragment
        if (resId == R.id.jingxuan) {
            if (mJingXuanFragment == null) {
                mJingXuanFragment = new JingXuanFragment();
                transaction.add(R.id.main_container, mJingXuanFragment);
            } else {
                transaction.show(mJingXuanFragment);
            }
        } else if (resId == R.id.shipu) {
            if (mShiPuFragment == null) {
                mShiPuFragment = new ShiPuFragment();
                transaction.add(R.id.main_container, mShiPuFragment);
            } else {
                transaction.show(mShiPuFragment);
            }
        } else if (resId == R.id.faxian) {
            if (mFaXianFragment == null) {
                mFaXianFragment = new FaXianFragment();
                transaction.add(R.id.main_container, mFaXianFragment);
            } else {
                transaction.show(mFaXianFragment);
            }

        } else if (resId == R.id.me) {
            if (mMeFragment == null) {
                mMeFragment = new MeFragment();
                transaction.add(R.id.main_container, mMeFragment);
            } else {
                transaction.show(mMeFragment);
            }
        }
        transaction.commit();//一定要记得提交事务
    }

    /**
     * 显示之前隐藏所有fragment
     *
     * @param transaction
     */
    private void hideFragments(FragmentTransaction transaction) {
        if (mJingXuanFragment != null)//不为空才隐藏,如果不判断第一次会有空指针异常
            transaction.hide(mJingXuanFragment);
        if (mShiPuFragment != null)
            transaction.hide(mShiPuFragment);
        if (mFaXianFragment != null)
            transaction.hide(mFaXianFragment);
        if (mMeFragment != null)
            transaction.hide(mMeFragment);
    }

    /**
     * 改变TextView选中颜色
     *
     * @param resId
     */
    private void changeSelect(int resId) {
        mJingXuan.setSelected(false);
        mShiPu.setSelected(false);
        mFaXian.setSelected(false);
        mMe.setSelected(false);
        Drawable drawable= getResources().getDrawable(R.drawable.tab_jingxuan);
        /// 这一步必须要做,否则不会显示.
        drawable.setBounds(0, 0, drawable.getMinimumWidth(), drawable.getMinimumHeight());
        mJingXuan.setCompoundDrawables(null,drawable,null,null);
        Drawable drawable1= getResources().getDrawable(R.drawable.tab_shipu);
        /// 这一步必须要做,否则不会显示.
        drawable1.setBounds(0, 0, drawable1.getMinimumWidth(), drawable1.getMinimumHeight());
        mShiPu.setCompoundDrawables(null,drawable1,null,null);
        Drawable drawable2= getResources().getDrawable(R.drawable.tab_faxian);
        /// 这一步必须要做,否则不会显示.
        drawable2.setBounds(0, 0, drawable2.getMinimumWidth(), drawable2.getMinimumHeight());
        mFaXian.setCompoundDrawables(null,drawable2,null,null);
        Drawable drawable3= getResources().getDrawable(R.drawable.tab_me);
        /// 这一步必须要做,否则不会显示.
        drawable3.setBounds(0, 0, drawable3.getMinimumWidth(), drawable3.getMinimumHeight());
        mMe.setCompoundDrawables(null,drawable3,null,null);
        switch (resId) {
            case R.id.jingxuan:
                mJingXuan.setSelected(true);
                Drawable drawable4= getResources().getDrawable(R.drawable.tab_btn_jingxuan_select);
                /// 这一步必须要做,否则不会显示.
                drawable4.setBounds(0, 0, drawable4.getMinimumWidth(), drawable4.getMinimumHeight());
                mJingXuan.setCompoundDrawables(null,drawable4,null,null);
                break;
            case R.id.shipu:
                mShiPu.setSelected(true);
                Drawable drawable5= getResources().getDrawable(R.drawable.tab_btn_shipu_select);
                /// 这一步必须要做,否则不会显示.
                drawable5.setBounds(0, 0, drawable5.getMinimumWidth(), drawable5.getMinimumHeight());
                mShiPu.setCompoundDrawables(null,drawable5,null,null);
                break;
            case R.id.faxian:
                mFaXian.setSelected(true);
                Drawable drawable6= getResources().getDrawable(R.drawable.tab_btn_faxian_select);
                /// 这一步必须要做,否则不会显示.
                drawable6.setBounds(0, 0, drawable6.getMinimumWidth(), drawable6.getMinimumHeight());
                mFaXian.setCompoundDrawables(null,drawable6,null,null);
                break;
            case R.id.me:
                mMe.setSelected(true);
                Drawable drawable7= getResources().getDrawable(R.drawable.tab_btn_me_select);
                /// 这一步必须要做,否则不会显示.
                drawable7.setBounds(0, 0, drawable7.getMinimumWidth(), drawable7.getMinimumHeight());
                mMe.setCompoundDrawables(null,drawable7,null,null);
                break;
        }
    }
    @Override
    protected int getLayoutId() {
        return R.layout.activity_main;
    }

}
