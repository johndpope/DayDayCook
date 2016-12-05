package com.dayday.cook.ui.fragment;

import android.content.Context;
import android.os.Build;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.RelativeLayout;

import com.dayday.cook.R;
import com.dayday.cook.base.BaseFragment;
import com.dayday.cook.ui.activity.MainActivity;

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
public class MeFragment extends BaseFragment {
    @BindView(R.id.head)
    RelativeLayout mHead;
    @BindView(R.id.me)
    RelativeLayout mRelativeLayout;
    @Override
    protected void configView() {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT) {
            RelativeLayout.LayoutParams params = new RelativeLayout.LayoutParams(getScreenW(getContext()), MainActivity.statuBar);
            LayoutInflater inflater = (LayoutInflater) getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            View view = inflater.inflate(R.layout.stuate_bar, null);
            view.setLayoutParams(params);
            mRelativeLayout.addView(view, mRelativeLayout.getChildCount());
            mHead.setPadding(mHead.getPaddingLeft(),mHead.getPaddingTop()+ MainActivity.statuBar,
                    mHead.getPaddingRight(),mHead.getPaddingBottom());
        }
    }

    @Override
    protected int getLayoutId() {
        return R.layout.me_fragment;
    }
    public int getScreenW(Context aty) {
        DisplayMetrics dm = aty.getResources().getDisplayMetrics();
        return dm.widthPixels;
    }
}
