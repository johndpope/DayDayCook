package com.dayday.cook.ui.adapter;

import android.content.Context;
import android.support.v7.widget.GridLayoutManager;
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
public class ShiPinFenquAdapter extends RecyclerView.Adapter<ShiPinFenquAdapter.ViewHolder> {
    private List<ShiPinZhuanQu.Data> mDatas;
    private LayoutInflater mLayoutInflater;
    private Context mContext;

    public ShiPinFenquAdapter(Context context, List<ShiPinZhuanQu.Data> mDatas) {
        mLayoutInflater = LayoutInflater.from(context);
        mContext = context;
        this.mDatas = mDatas;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new ViewHolder(mLayoutInflater.inflate(R.layout.shipinzhuanqu_item, parent, false));
    }
    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        if (mDatas.get(position + 1).getVideos().size() > 5) {
            holder.head.setLayoutParams(new RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.MATCH_PARENT, ShiPinZhuanQuActivity.height / 3));
            Glide.with(mContext).load(mDatas.get(position + 1).getVideos().get(0).getIndexUrl()).into(holder.head);
            Glide.with(mContext).load(mDatas.get(position + 1).getIcon_url()).into(holder.icon_shipin);
            holder.icon_title.setText(mDatas.get(position + 1).getName());
            holder.time.setText(mDatas.get(position + 1).getVideos().get(0).getVideoLength());
            holder.jianjie.setText(mDatas.get(position + 1).getVideos().get(0).getDescription());
            holder.shipin_title.setText(mDatas.get(position + 1).getVideos().get(0).getTitle());
            holder.mRecyclerView.setLayoutManager(new GridLayoutManager(mContext,2));
            holder.mRecyclerView.setNestedScrollingEnabled(false);
            holder.mRecyclerView.setAdapter(new ShiPinAdapter(mContext,mDatas.get(position+1).getVideos()));
        }
    }

    @Override
    public int getItemCount() {
        return mDatas.size() - 1;
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        ImageView head, icon_shipin;
        TextView icon_title, time, jianjie, shipin_title;
        RecyclerView mRecyclerView;
        public ViewHolder(View itemView) {
            super(itemView);
            head = (ImageView) itemView.findViewById(R.id.head);
            icon_title = (TextView) itemView.findViewById(R.id.title_icon);
            icon_shipin = (ImageView) itemView.findViewById(R.id.icon_shipin);
            time = (TextView) itemView.findViewById(R.id.time);
            jianjie = (TextView) itemView.findViewById(R.id.jianjie);
            shipin_title = (TextView) itemView.findViewById(R.id.shipin_title);
            mRecyclerView = (RecyclerView) itemView.findViewById(R.id.shipin_item_recy);
        }
    }
}
