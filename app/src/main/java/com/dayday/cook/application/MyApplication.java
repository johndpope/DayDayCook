package com.dayday.cook.application;

import android.app.Application;
import android.database.sqlite.SQLiteDatabase;

import com.dayday.cook.db.DaoMaster;
import com.dayday.cook.db.DaoSession;
import com.dayday.cook.util.AppUtils;
import com.dayday.cook.util.SharedPreferencesUtil;
import com.orhanobut.logger.Logger;

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
public class MyApplication extends Application {
    private static MyApplication sInstance;
    private static SQLiteDatabase db;
    private static DaoMaster daoMaster;
    private static DaoSession daoSession;
    @Override
    public void onCreate() {
        super.onCreate();
        Logger.init();
        AppUtils.init(this);
        initDataBase();
        SharedPreferencesUtil.init(getApplicationContext(),"dayday_cook",MODE_PRIVATE);
    }
    public static MyApplication getsInstance() {
        return sInstance;
    }
    private void initDataBase(){
        DaoMaster.DevOpenHelper helper = new DaoMaster.DevOpenHelper(this, "notes-db", null);
        db = helper.getWritableDatabase();
        daoMaster = new DaoMaster(db);
        daoSession = daoMaster.newSession();
    }
    public static DaoSession getDaoSession(){
        return daoSession;
    }
}
