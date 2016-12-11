package com.dayday.cook.ui.adapter;

import android.content.Context;
import android.content.Intent;
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
 * Created by fan on 2016/12/2.
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
public class HomeNewAdapter extends RecyclerView.Adapter<HomeNewAdapter.ViewHolder> {

    private LayoutInflater mLayoutInflater;
    private Context mContext;
    private List<HomeNew> mHomeNews;

    public HomeNewAdapter(Context context, List<HomeNew> mHomeNews) {
        mLayoutInflater = LayoutInflater.from(context);
        mContext = context;
        this.mHomeNews = mHomeNews;
    }

    @Override
    public HomeNewAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new ViewHolder(mLayoutInflater.inflate(R.layout.home_new_item, parent, false));
    }

    @Override
    public void onBindViewHolder(HomeNewAdapter.ViewHolder holder, final int position) {
        holder.topic_text.setText(mHomeNews.get(0).getData().get(position).getTitle());
        holder.new_text.setText(mHomeNews.get(0).getData().get(position).getDescription());
        holder.count.setText(mHomeNews.get(0).getData().get(position).getClickCount()+"");
        Glide.with(mContext).load(mHomeNews.get(0).getData().get(position).getImageUrl()).into(holder.mImageView);
        holder.item.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.setClass(mContext, ShiPinXiangQingActivity.class);
                intent.putExtra(ShiPinXiangQingActivity.SHIPIN_ID,mHomeNews.get(0).getData().get(position).getId());
                Logger.e(mHomeNews.get(0).getData().get(position).getId()+"");
                mContext.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        if (mHomeNews.size() < 1) {
            return 0;
        } else {
            return mHomeNews.get(0).getData().size();
        }
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        TextView topic_text;
        TextView new_text;
        ImageView mImageView;
        TextView count;
        View item;
        public ViewHolder(View itemView) {
            super(itemView);
            this.item = itemView;
            mImageView = (ImageView) itemView.findViewById(R.id.home_new_image);
            topic_text = (TextView) itemView.findViewById(R.id.text_new);
            new_text = (TextView) itemView.findViewById(R.id.text_new_t);
            count = (TextView) itemView.findViewById(R.id.new_count);
        }
    }
}
