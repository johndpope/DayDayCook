package com.dayday.cook.ui.adapter;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.dayday.cook.R;
import com.dayday.cook.beans.ShiPuGroup;

import java.util.List;

/**
 * 基本功能：右侧Adapter
 * 创建：王杰
 * 创建时间：16/4/14
 * 邮箱：w489657152@gmail.com
 */
public class MainSectionedAdapter extends SectionedBaseAdapter {

    private Context mContext;
    private List<ShiPuGroup> mShiPuGroups;

    public MainSectionedAdapter(Context context, List<ShiPuGroup> mShiPuGroups) {
        this.mContext = context;
        this.mShiPuGroups = mShiPuGroups;

    }

    @Override
    public Object getItem(int section, int position) {
        return mShiPuGroups.get(section).mItems.get(position);
    }

    @Override
    public long getItemId(int section, int position) {
        return position;
    }

    @Override
    public int getSectionCount() {
        return mShiPuGroups.size();
    }

    @Override
    public int getCountForSection(int section) {
        if (mShiPuGroups.get(section).mItems.size() % 2 == 0) {
            return mShiPuGroups.get(section).mItems.size() / 2;
        } else {
            return mShiPuGroups.get(section).mItems.size() / 2 + 1;
        }
    }
    @Override
    public View getItemView(final int section, final int position, View convertView, ViewGroup parent) {
        LinearLayout layout = null;
        if (convertView == null) {
            LayoutInflater inflator = (LayoutInflater) parent.getContext()
                    .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            layout = (LinearLayout) inflator.inflate(R.layout.right_list_item, null);
        } else {
            layout = (LinearLayout) convertView;
        }
        if (position == 0) {
            ((TextView) layout.findViewById(R.id.textItem_item)).setText(mShiPuGroups.get(section).mItems.get(position).name);
            Glide.with(mContext).load(mShiPuGroups.get(section).mItems.get(position).imageUrl).into((ImageView) layout.findViewById(R.id.imageItem));
            ((TextView) layout.findViewById(R.id.textItem1_item)).setText(mShiPuGroups.get(section).mItems.get(position + 1).name);
            Glide.with(mContext).load(mShiPuGroups.get(section).mItems.get(position + 1).imageUrl).into((ImageView) layout.findViewById(R.id.imageItem1));
        } else {
            ((TextView) layout.findViewById(R.id.textItem_item)).setText(mShiPuGroups.get(section).mItems.get(position*2).name);
            Glide.with(mContext).load(mShiPuGroups.get(section).mItems.get(position *2).imageUrl).into((ImageView) layout.findViewById(R.id.imageItem));
            if (position*2 +1 < (mShiPuGroups.get(section).mItems.size())/2+1){
                ((TextView) layout.findViewById(R.id.textItem1_item)).setText(mShiPuGroups.get(section).mItems.get(position *2+1).name);
                Glide.with(mContext).load(mShiPuGroups.get(section).mItems.get(position *2+1).imageUrl).into((ImageView) layout.findViewById(R.id.imageItem1));
            }else {

            }
        }
        layout.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View arg0) {
            }
        });
        return layout;
    }

    @Override
    public View getSectionHeaderView(int section, View convertView, ViewGroup parent) {
        LinearLayout layout = null;
        if (convertView == null) {
            LayoutInflater inflator = (LayoutInflater) parent.getContext()
                    .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            layout = (LinearLayout) inflator.inflate(R.layout.header_item, null);
        } else {
            layout = (LinearLayout) convertView;
        }
        layout.setClickable(false);
        ((TextView) layout.findViewById(R.id.textItem)).setText(mShiPuGroups.get(section).head);

        return layout;
    }

}
