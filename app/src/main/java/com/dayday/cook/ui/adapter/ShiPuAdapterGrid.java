package com.dayday.cook.ui.adapter;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.CardView;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.dayday.cook.R;
import com.dayday.cook.beans.HomeNew;
import com.dayday.cook.ui.activity.ShiPinXiangQingActivity;
import com.orhanobut.logger.Logger;

import java.util.List;

/**
 * Created by fan on 2016/12/3.
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
public class ShiPuAdapterGrid  extends RecyclerView.Adapter<ShiPuAdapterGrid.ViewHolder>  {
    private LayoutInflater mLayoutInflater;
    private Context mContext;
    private List<HomeNew.DataEntity> mHomeNews;

    public ShiPuAdapterGrid(Context context, List<HomeNew.DataEntity> mHomeNews) {
        mLayoutInflater = LayoutInflater.from(context);
        mContext = context;
        this.mHomeNews = mHomeNews;
    }
    @Override
    public ShiPuAdapterGrid.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new ShiPuAdapterGrid.ViewHolder(mLayoutInflater.inflate(R.layout.home_new_item, parent, false));
    }

    @Override
    public void onBindViewHolder(ShiPuAdapterGrid.ViewHolder holder, final int position) {
        GridLayoutManager.LayoutParams layoutParams = new GridLayoutManager.LayoutParams(GridLayoutManager.LayoutParams.WRAP_CONTENT,
                holder.card.getLayoutParams().height);
        layoutParams.setMargins(10,10,10,10);
        holder.card.setLayoutParams(layoutParams);
        holder.topic_text.setText(mHomeNews.get(position).getTitle());
        holder.new_text.setText(mHomeNews.get(position).getDescription());
        holder.count.setText(mHomeNews.get(position).getClickCount()+"");
        Glide.with(mContext).load(mHomeNews.get(position).getImageUrl()).into(holder.mImageView);
        holder.mView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.setClass(mContext, ShiPinXiangQingActivity.class);
                intent.putExtra(ShiPinXiangQingActivity.SHIPIN_ID,mHomeNews.get(position).getId());
                Logger.e(mHomeNews.get(position).getId()+"");
                mContext.startActivity(intent);
            }
        });
    }
    @Override
    public int getItemCount() {
        if (mHomeNews.size() < 1) {
            return 0;
        } else {
            return mHomeNews.size();
        }
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        TextView topic_text;
        TextView new_text;
        ImageView mImageView;
        CardView card;
        TextView count;
        View mView;
        public ViewHolder(View itemView) {
            super(itemView);
            mView = itemView;
            mImageView = (ImageView) itemView.findViewById(R.id.home_new_image);
            topic_text = (TextView) itemView.findViewById(R.id.text_new);
            new_text = (TextView) itemView.findViewById(R.id.text_new_t);
            count = (TextView) itemView.findViewById(R.id.new_count);
            card =(CardView) itemView.findViewById(R.id.card);
        }
    }
}
