package com.dayday.cook.widget;

import android.content.Context;
import android.support.design.widget.CoordinatorLayout;
import android.support.v4.view.ViewCompat;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;

/**
 * Created by fan on 2016/11/27.
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
public class FabBehavior extends CoordinatorLayout.Behavior<View> {
    ImageView mActionButtonPlus;
    int dy = 0;

    public FabBehavior(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    //判断滑动方向，因为我们只要垂直滑动，所以用nestedScrollAxes去&ViewCompat.SCROLL_AXIS_VERTICAL，如果不为0，就是垂直
    @Override
    public boolean onStartNestedScroll(CoordinatorLayout coordinatorLayout, View child, View directTargetChild, View target, int nestedScrollAxes) {
        return (nestedScrollAxes & ViewCompat.SCROLL_AXIS_VERTICAL) != 0;
    }

    //根据滑动距离，显示隐藏。
    @Override
    public void onNestedPreScroll(CoordinatorLayout coordinatorLayout, View child, View target, int dx, int dy, int[] consumed) {
        if (mActionButtonPlus == null) {
            mActionButtonPlus = (ImageView) child;
        }
        this.dy += dy;
        if (dy > 500) {
            mActionButtonPlus.setVisibility(View.VISIBLE);
        }else {
            mActionButtonPlus.setVisibility(View.INVISIBLE);
        }
    }
}
