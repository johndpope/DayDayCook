package com.dayday.cook.ui.activity;

import android.content.Context;
import android.database.Cursor;
import android.os.Build;
import android.support.design.widget.Snackbar;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

import com.dayday.cook.R;
import com.dayday.cook.application.MyApplication;
import com.dayday.cook.base.BaseActivity;
import com.dayday.cook.beans.HotSearch;
import com.dayday.cook.db.SearchHistory;
import com.dayday.cook.db.SearchHistoryDao;
import com.dayday.cook.ui.adapter.SearchAdapter;
import com.dayday.cook.ui.adapter.TagAdapter;
import com.dayday.cook.ui.model.SearchModel;
import com.dayday.cook.ui.presenter.SearchPresenter;
import com.dayday.cook.widget.ClearEditText;
import com.dayday.cook.widget.FlowTagLayout;
import com.dayday.cook.widget.OnTagClickListener;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.OnClick;
import de.greenrobot.dao.query.Query;

/**
 * Created by fan on 2016/12/7.
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
public class SearchActivity extends BaseActivity<SearchPresenter> implements SearchModel.View {
    @BindView(R.id.flow_tag)
    FlowTagLayout mFlowTag;
    @BindView(R.id.search_line)
    LinearLayout mLinearLayout;
    @BindView(R.id.edit_query)
    ClearEditText mClearEditText;
    @BindView(R.id.cancel_action)
    Button mButton;
    @BindView(R.id.rela)
    RecyclerView mRecyclerView;
    private SearchAdapter mSearchAdapter;
    List<SearchHistory> mSearchHistories = new ArrayList<>();
    private Cursor cursor;
    @Override
    protected void configViews() {


        String textColumn = SearchHistoryDao.Properties.Text.columnName;
        String orderBy = textColumn + " COLLATE LOCALIZED ASC";
        cursor = MyApplication.getDaoSession().getDatabase()
                .query(MyApplication.getDaoSession().getSearchHistoryDao().getTablename(),
                        MyApplication.getDaoSession().getSearchHistoryDao().getAllColumns(),
                        null, null, null, null, orderBy);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT) {
            LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(getScreenW(this), getStatusBarHeight());
            LayoutInflater inflater = (LayoutInflater) getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            View view = inflater.inflate(R.layout.stuate_bar, null);
            view.setLayoutParams(params);
            mLinearLayout.addView(view, 0);
        }
        mSearchAdapter = new SearchAdapter(this,mSearchHistories);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        mRecyclerView.setAdapter(mSearchAdapter);
        Notifi();
        mSearchAdapter.setItemClickListener(new SearchAdapter.MyItemClickListener() {
            @Override
            public void onItemClick(View view, int position) {
                if(position==mSearchHistories.size()){
                    deleteAll();
                }else {
                    Snackbar.make(mRecyclerView,mSearchHistories.get(position).getText(),Snackbar.LENGTH_SHORT).show();
                }
            }
        });

        mSizeTagAdapter = new TagAdapter<>(this);
        mFlowTag.setAdapter(mSizeTagAdapter);
        mPresenter = new SearchPresenter(this);
        mFlowTag.setOnTagClickListener(new OnTagClickListener() {
            @Override
            public void onItemClick(FlowTagLayout parent, View view, int position) {
                Snackbar.make(mRecyclerView,dataSource.get(position),Snackbar.LENGTH_SHORT).show();
            }
        });

        mPresenter.getHotSearch("862744038984662", "1", "3", "2.3.2", "156");
        mClearEditText.addTextChangedListener(new TextWatcher() {
            private CharSequence temp;

            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                temp = charSequence;
            }
            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }
            @Override
            public void afterTextChanged(Editable editable) {
                if (temp.length() > 0) {
                    mButton.setText("搜索");
                } else {
                    mButton.setText("取消");
                }
            }
        });
    }

    @OnClick(R.id.cancel_action)
    public void can() {
        if (mButton.getText().equals("搜索")) {
            goSearch();
        } else {
            finish();
        }
    }

    /**
     * 去搜索
     */
    private void goSearch(){
        List<SearchHistory> notes = search();
        // 在 QueryBuilder 类中内置两个 Flag 用于方便输出执行的 SQL 语句与传递参数的值
        if(notes.size() <= 0) {
            String noteText = mClearEditText.getText().toString();
            // 插入操作，简单到只要你创建一个 Java 对象
            SearchHistory note = new SearchHistory(null, noteText);
            MyApplication.getDaoSession().getSearchHistoryDao().insert(note);
            cursor.requery();
            Notifi();
        }
    }

    /**
     * 查询数据库是否有这个数据
     * @return
     */
    private List<SearchHistory> search(){
        Query query = MyApplication.getDaoSession().getSearchHistoryDao().queryBuilder()
                .where(SearchHistoryDao.Properties.Text.eq(mClearEditText.getText().toString()))
                .build();
        List<SearchHistory> notes = query.list();
        return notes;
    }

    /**
     * 查询全部
     * @return
     */
    private List<SearchHistory> searchAll(){
        Query query = MyApplication.getDaoSession().getSearchHistoryDao().queryBuilder()
                .build();
        List<SearchHistory> notes = query.list();
        return notes;
    }

    /**
     * 删除全部
     */
    private void deleteAll(){
        MyApplication.getDaoSession().getSearchHistoryDao().deleteAll();
        Notifi();
    }

    /**
     * 更新RecyclerView
     */
    private void Notifi(){
        List<SearchHistory> mList = searchAll();
        mSearchHistories.clear();
        mSearchHistories.addAll(mList);
        mSearchAdapter.notifyDataSetChanged();
    }

    @Override
    protected int getLayoutId() {
        return R.layout.search_activity;
    }

    private TagAdapter<String> mSizeTagAdapter;
    List<String> dataSource = new ArrayList<>();
    private void initData(List<HotSearch> search) {
        dataSource.clear();
        for (HotSearch m : search) {
            dataSource.add(m.htagname);
        }
        mSizeTagAdapter.onlyAddAll(dataSource);
    }

    @Override
    public void showHotSearch(List<HotSearch> search) {
        initData(search);
    }

    @Override
    public void showError() {

    }

    @Override
    public void complete() {

    }
}
