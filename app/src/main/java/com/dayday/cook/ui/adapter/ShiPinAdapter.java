package com.dayday.cook.ui.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.dayday.cook.R;
import com.dayday.cook.beans.ShiPinZhuanQu;
import com.dayday.cook.ui.activity.ShiPinZhuanQuActivity;

import java.util.List;

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
public class ShiPinAdapter  extends RecyclerView.Adapter<ShiPinAdapter.ViewHolder>{
    private List<ShiPinZhuanQu.Data.VideosEntity> mDatas;
    private LayoutInflater mLayoutInflater;
    private Context mContext;
    public ShiPinAdapter(Context context, List<ShiPinZhuanQu.Data.VideosEntity> mDatas) {
        mLayoutInflater = LayoutInflater.from(context);
        mContext = context;
        this.mDatas = mDatas;
    }
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new ViewHolder(mLayoutInflater.inflate(R.layout.shipin_item,parent,false));
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        holder.shipin_content.setLayoutParams(new RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.MATCH_PARENT, ShiPinZhuanQuActivity.height/5));
        Glide.with(mContext).load(mDatas.get(position+1).getIndexUrl()).into(holder.zuixin);
        holder.date.setText(mDatas.get(position+1).getVideoLength());
        holder.shipin_title.setText(mDatas.get(position+1).getTitle());
        holder.jianjie.setText(mDatas.get(position+1).getDescription());
    }

    @Override
    public int getItemCount() {
        return mDatas.size()-1;
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        ImageView zuixin;
        TextView date,shipin_title,jianjie;
        RelativeLayout shipin_content;
        public ViewHolder(View itemView) {
            super(itemView);
            shipin_content = (RelativeLayout)itemView.findViewById(R.id.shipin_content);
            zuixin = (ImageView) itemView.findViewById(R.id.zuixin);
            date = (TextView) itemView.findViewById(R.id.date);
            shipin_title = (TextView) itemView.findViewById(R.id.shipin_title);
            jianjie = (TextView) itemView.findViewById(R.id.jianjie);
        }
    }
}
