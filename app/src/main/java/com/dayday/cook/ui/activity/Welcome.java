package com.dayday.cook.ui.activity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.RelativeLayout;

import com.dayday.cook.R;
import com.dayday.cook.util.SharedPreferencesUtil;

import java.lang.ref.WeakReference;

import butterknife.BindView;
import butterknife.ButterKnife;

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
public class Welcome extends AppCompatActivity {
    @BindView(R.id.welcome_content)
    RelativeLayout mRelativeLayout;
    Animation alphaAnimation;
    private Boolean isFirst = false;
    private static final int First = 100;
    private static final int NotFirst = 101;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT && Build.VERSION.SDK_INT <= Build.VERSION_CODES.LOLLIPOP) {
            getWindow().setFlags(
                    WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS,
                    WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
        }
        if (Build.VERSION.SDK_INT > Build.VERSION_CODES.LOLLIPOP) {
            Window window = getWindow();
            window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS
                    | WindowManager.LayoutParams.FLAG_TRANSLUCENT_NAVIGATION);
            window.getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN
                    | View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION
                    | View.SYSTEM_UI_FLAG_LAYOUT_STABLE);
            window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
            window.setStatusBarColor(Color.TRANSPARENT);
            window.setNavigationBarColor(Color.TRANSPARENT);
        }
        setContentView(R.layout.welcome);
        ButterKnife.bind(this);
        alphaAnimation = AnimationUtils.loadAnimation(this, R.anim.welcome);
        mRelativeLayout.startAnimation(alphaAnimation);
        isFirst = SharedPreferencesUtil.getInstance().getBoolean("isFirst");
        Message msg = new Message();
        if(!isFirst){
            msg.what = First;
        }else {
            msg.what = NotFirst;
        }
        mHandler.sendMessageDelayed(msg,1000);
    }
    private final Handler mHandler = new MyHandle(this);

    /**
     * 防止Handle产生内存泄漏
     * 使用弱引用来引用context
     */
    private static class MyHandle extends Handler {
        private final WeakReference<Welcome> mContextWeakReference;

        public MyHandle(Welcome context) {
            mContextWeakReference = new WeakReference<Welcome>(context);
        }

        @Override
        public void handleMessage(Message msg) {
            switch (msg.what) {
                case First:
                    mContextWeakReference.get().startActivity(new Intent(mContextWeakReference.get(), SplashActivity.class));
                    mContextWeakReference.get().finish();
                    break;
                case NotFirst:
                    mContextWeakReference.get().startActivity(new Intent(mContextWeakReference.get(), MainActivity.class));
                    mContextWeakReference.get().finish();
                    break;
            }
        }
    }
}
