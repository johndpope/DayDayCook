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
import com.dayday.cook.beans.ShipinXiangQing;

import java.util.List;

/**
 * Created by fan on 2016/12/9.
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
public class BuZhouAdapter extends RecyclerView.Adapter<BuZhouAdapter.ViewHolder>{
    private List<ShipinXiangQing.DataEntity.StepsEntity> mStepsEntities;
    private Context mContext;
    private LayoutInflater mLayoutInflater;
    public BuZhouAdapter(Context context, List<ShipinXiangQing.DataEntity.StepsEntity> mStepsEntities) {
        mLayoutInflater = LayoutInflater.from(context);
        mContext = context;
        this.mStepsEntities = mStepsEntities;
    }
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new ViewHolder(mLayoutInflater.inflate(R.layout.buzhou_item,parent,false));
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        holder.mText.setText(mStepsEntities.get(position).getContent());
        holder.mTitle.setText("烹饪步骤："+mStepsEntities.get(position).getStepNo()+"/"+mStepsEntities.size());
        Glide.with(mContext).load(mStepsEntities.get(position).getImageUrl()).into(holder.mImageView);
    }

    @Override
    public int getItemCount() {
        return mStepsEntities.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        ImageView mImageView;
        TextView mTitle,mText;
        public ViewHolder(View itemView) {
            super(itemView);
            mImageView = (ImageView) itemView.findViewById(R.id.buzhou_image);
            mTitle = (TextView) itemView.findViewById(R.id.top_text);
            mText = (TextView) itemView.findViewById(R.id.buzhou_text);
        }
    }
}
