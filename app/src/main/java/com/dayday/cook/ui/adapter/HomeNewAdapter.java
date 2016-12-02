package com.dayday.cook.ui.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.dayday.cook.R;
import com.dayday.cook.beans.HomeNew;

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
    public void onBindViewHolder(HomeNewAdapter.ViewHolder holder, int position) {
        holder.topic_text.setText(mHomeNews.get(0).getData().get(position).getTitle());
        holder.new_text.setText(mHomeNews.get(0).getData().get(position).getDescription());
        holder.count.setText(mHomeNews.get(0).getData().get(position).getClickCount()+"");
        Glide.with(mContext).load(mHomeNews.get(0).getData().get(position).getImageUrl()).into(holder.mImageView);
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
        public ViewHolder(View itemView) {
            super(itemView);
            mImageView = (ImageView) itemView.findViewById(R.id.home_new_image);
            topic_text = (TextView) itemView.findViewById(R.id.text_new);
            new_text = (TextView) itemView.findViewById(R.id.text_new_t);
            count = (TextView) itemView.findViewById(R.id.new_count);
        }
    }
}