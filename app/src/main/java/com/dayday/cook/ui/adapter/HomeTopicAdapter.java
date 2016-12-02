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
import com.dayday.cook.beans.HomeTopic;

import java.util.List;

/**
 * Created by fan on 2016/12/1.
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
public class HomeTopicAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    private LayoutInflater mLayoutInflater;
    private Context mContext;
    private List<HomeTopic> mHomeTopics;
    public HomeTopicAdapter(Context context, List<HomeTopic> topics) {
        mLayoutInflater = LayoutInflater.from(context);
        mContext = context;
        mHomeTopics = topics;
    }
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new ViewHolder(mLayoutInflater.inflate(R.layout.home_topic_item, parent, false));
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        if(holder instanceof ViewHolder){
            ((ViewHolder)holder).topic_text.setText(mHomeTopics.get(0).getThemeList().get(position).getTitle());
            ((ViewHolder)holder).topic_text1.setText(mHomeTopics.get(0).getThemeList().get(position).getDescription());
            Glide.with(mContext).load(mHomeTopics.get(0).getThemeList().get(position).getImage_url()).into(((ViewHolder)holder).mImageView);
        }
    }

    @Override
    public int getItemCount() {
        if (mHomeTopics.size() < 1) {
            return 0;
        } else {
            return mHomeTopics.get(0).getThemeList().size();
        }
    }


    public static class ViewHolder extends RecyclerView.ViewHolder {
        TextView topic_text;
        TextView topic_text1;
        ImageView mImageView;
        public ViewHolder(View itemView) {
            super(itemView);
            mImageView = (ImageView) itemView.findViewById(R.id.image_topic);
            topic_text = (TextView) itemView.findViewById(R.id.text_topic);
            topic_text1 = (TextView) itemView.findViewById(R.id.text_topic1);
        }
    }
}
