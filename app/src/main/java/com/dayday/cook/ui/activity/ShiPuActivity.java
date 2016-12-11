package com.dayday.cook.ui.activity;

import android.content.Context;
import android.os.Build;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.RelativeLayout;

import com.dayday.cook.R;
import com.dayday.cook.base.BaseActivity;
import com.dayday.cook.beans.Date;
import com.dayday.cook.beans.Item;
import com.dayday.cook.beans.ShiPuGroup;
import com.dayday.cook.ui.adapter.LeftListAdapter;
import com.dayday.cook.ui.adapter.MainSectionedAdapter;
import com.dayday.cook.ui.model.ShipuFenLeiModel;
import com.dayday.cook.ui.presenter.ShiPuPresenter;
import com.dayday.cook.widget.PinnedHeaderListView;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;

/**
 * Created by fan on 2016/12/8.
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
public class ShiPuActivity extends BaseActivity<ShiPuPresenter> implements ShipuFenLeiModel.View {
    @BindView(R.id.left_listview)
    ListView leftListview;
    @BindView(R.id.pinnedListView)
    PinnedHeaderListView pinnedListView;
    @BindView(R.id.shipu_line)
    LinearLayout mLinearLayout;
    private boolean isScroll = true;
    private LeftListAdapter adapter;

    private boolean[] flagArray = {true, false, false, false, false, false, false, false, false};
    private List<ShiPuGroup> mShiPuGroups = new ArrayList<>();
    MainSectionedAdapter sectionedAdapter;
    @Override
    protected void configViews() {

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT) {
            RelativeLayout.LayoutParams params = new RelativeLayout.LayoutParams(getScreenW(this), getStatusBarHeight());
            LayoutInflater inflater = (LayoutInflater) getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            View view = inflater.inflate(R.layout.stuate_bar, null);
            view.setLayoutParams(params);
            mLinearLayout.addView(view, 0);
        }
        mPresenter = new ShiPuPresenter(this);
        mPresenter.getDate("862744038984662", "1", "3", "2.3.2", "156");

        sectionedAdapter = new MainSectionedAdapter(this, mShiPuGroups);
        pinnedListView.setAdapter(sectionedAdapter);
        adapter = new LeftListAdapter(this, mShiPuGroups, flagArray);
        leftListview.setAdapter(adapter);
        leftListview.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> arg0, View view, int position, long arg3) {
                isScroll = false;

                for (int i = 0; i < mShiPuGroups.size(); i++) {
                    if (i == position) {
                        flagArray[i] = true;
                    } else {
                        flagArray[i] = false;
                    }
                }
                adapter.notifyDataSetChanged();
                int rightSection = 0;
                for (int i = 0; i < position; i++) {
                    rightSection += sectionedAdapter.getCountForSection(i) + 1;
                }
                pinnedListView.setSelection(rightSection);

            }

        });

        pinnedListView.setOnScrollListener(new AbsListView.OnScrollListener() {
            @Override
            public void onScrollStateChanged(AbsListView arg0, int scrollState) {
                switch (scrollState) {
                    // 当不滚动时
                    case AbsListView.OnScrollListener.SCROLL_STATE_IDLE:
                        // 判断滚动到底部
                        if (pinnedListView.getLastVisiblePosition() == (pinnedListView.getCount() - 1)) {
                            leftListview.setSelection(ListView.FOCUS_DOWN);
                        }

                        // 判断滚动到顶部
                        if (pinnedListView.getFirstVisiblePosition() == 0) {
                            leftListview.setSelection(0);
                        }

                        break;
                }
            }

            int y = 0;
            int x = 0;
            int z = 0;

            @Override
            public void onScroll(AbsListView view, int firstVisibleItem, int visibleItemCount, int totalItemCount) {
                if (isScroll) {
                    for (int i = 0; i < mShiPuGroups.size(); i++) {
                        if (i == sectionedAdapter.getSectionForPosition(pinnedListView.getFirstVisiblePosition())) {
                            flagArray[i] = true;
                            x = i;
                        } else {
                            flagArray[i] = false;
                        }
                    }
                    if (x != y) {
                        adapter.notifyDataSetChanged();
                        y = x;
                        if (y == leftListview.getLastVisiblePosition()) {
//                            z = z + 3;
                            leftListview.setSelection(z);
                        }
                        if (x == leftListview.getFirstVisiblePosition()) {
//                            z = z - 1;
                            leftListview.setSelection(z);
                        }
                        if (firstVisibleItem + visibleItemCount == totalItemCount - 1) {
                            leftListview.setSelection(ListView.FOCUS_DOWN);
                        }
                    }
                } else {
                    isScroll = true;
                }
            }
        });
    }

    @Override
    protected int getLayoutId() {
        return R.layout.shipu;
    }

    @Override
    public void showDate(Date search) {
        mShiPuGroups.clear();
        ShiPuGroup shiPuGroup = new ShiPuGroup();
        shiPuGroup.mItems = new ArrayList<>();
        shiPuGroup.headimageUrl = search.mData.mCatalogHot.imageUrl;
        shiPuGroup.head = search.mData.mCatalogHot.name;
        shiPuGroup.headClickImage = search.mData.mCatalogHot.imageClickUrl;
        for (int i = 0; i < search.mData.mCatalogHot.children.size(); i++) {
            Item item = new Item();
            item.cataloId = search.mData.mCatalogHot.children.get(i).catalogId;
            item.imageUrl = search.mData.mCatalogHot.children.get(i).imageUrl;
            shiPuGroup.mItems.add(item);
        }
        mShiPuGroups.add(shiPuGroup);
        for(int i = 0;i<search.mData.mCatalogShows.size();i++){
            ShiPuGroup shiPuGroup1 = new ShiPuGroup();
            shiPuGroup1.mItems = new ArrayList<>();
            shiPuGroup1.headimageUrl = search.mData.mCatalogShows.get(i).imageUrl;
            shiPuGroup1.head = search.mData.mCatalogShows.get(i).name;
            shiPuGroup1.headClickImage = search.mData.mCatalogShows.get(i).imageClickUrl;
            for(int j = 0;j<search.mData.mCatalogShows.get(i).mChildrens.size();j++){
                Item item = new Item();
                item.cataloId = search.mData.mCatalogShows.get(i).mChildrens.get(j).catalogId;
                item.imageUrl = search.mData.mCatalogShows.get(i).mChildrens.get(j).imageUrl;
                shiPuGroup1.mItems.add(item);
            }
            mShiPuGroups.add(shiPuGroup1);
        }
        sectionedAdapter.notifyDataSetChanged();
        adapter.notifyDataSetChanged();
    }

    @Override
    public void showError() {

    }

    @Override
    public void complete() {

    }
}
