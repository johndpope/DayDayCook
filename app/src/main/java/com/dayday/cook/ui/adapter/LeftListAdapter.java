package com.dayday.cook.ui.adapter;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.dayday.cook.R;
import com.dayday.cook.beans.ShiPuGroup;

import java.util.List;


/**
 * 基本功能：左侧Adapter
 * 创建：王杰
 * 创建时间：16/4/14
 * 邮箱：w489657152@gmail.com
 */
public class LeftListAdapter extends BaseAdapter {
    private  List<ShiPuGroup> leftStr;
    boolean[] flagArray;
    private Context context;

    public LeftListAdapter(Context context, List<ShiPuGroup> leftStr, boolean[] flagArray) {
        this.leftStr = leftStr;
        this.context = context;
        this.flagArray = flagArray;
    }

    @Override
    public int getCount() {
        return leftStr.size();
    }

    @Override
    public Object getItem(int arg0) {
        return leftStr.get(arg0);
    }

    @Override
    public long getItemId(int arg0) {
        return arg0;
    }

    @Override
    public View getView(int arg0, View arg1, ViewGroup arg2) {
        Holder holder = null;
        if (arg1 == null) {
            holder = new Holder();
            arg1 = LayoutInflater.from(context).inflate(R.layout.left_list_item, null);
            holder.left_list_item = (TextView) arg1.findViewById(R.id.left_list_item);
            holder.line_left = (LinearLayout) arg1.findViewById(R.id.line_left);
            holder.mImageView = (ImageView) arg1.findViewById(R.id.image);
            arg1.setTag(holder);
        } else {
            holder = (Holder) arg1.getTag();
        }
        holder.updataView(arg0);
        return arg1;
    }

    private class Holder {
        private TextView left_list_item;
        private LinearLayout line_left;
        private ImageView mImageView;
        public void updataView(final int position) {
            left_list_item.setText(leftStr.get(position).head);
            Glide.with(context).load(leftStr.get(position).headimageUrl).into(mImageView);
            if (flagArray[position]) {
                Glide.with(context).load(leftStr.get(position).headClickImage).into(mImageView);
                line_left.setBackgroundColor(Color.RED);
            } else {
                line_left.setBackgroundColor(Color.TRANSPARENT);
            }
        }

    }
}
