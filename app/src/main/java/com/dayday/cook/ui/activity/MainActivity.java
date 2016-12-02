package com.dayday.cook.ui.activity;

import android.support.v4.app.FragmentTransaction;
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
    @Override
    protected void configViews() {
        statuBar = getStatusBarHeight();
        mJingXuan.setSelected(true);
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
        switch (resId) {
            case R.id.jingxuan:
                mJingXuan.setSelected(true);
                break;
            case R.id.shipu:
                mShiPu.setSelected(true);
                break;
            case R.id.faxian:
                mFaXian.setSelected(true);
                break;
            case R.id.me:
                mMe.setSelected(true);
                break;
        }
    }
    @Override
    protected int getLayoutId() {
        return R.layout.activity_main;
    }

}
