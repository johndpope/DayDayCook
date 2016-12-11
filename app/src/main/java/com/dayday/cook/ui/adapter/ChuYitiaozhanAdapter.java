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
import com.dayday.cook.beans.ChuYi;
import com.dayday.cook.ui.activity.ChuYiActivity;
import com.dayday.cook.util.GlideRoundTransform;

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
public class ChuYitiaozhanAdapter extends RecyclerView.Adapter<ChuYitiaozhanAdapter.ViewHolder>{
    private List<ChuYi.DataEntity> mDate;
    private LayoutInflater mLayoutInflater;
    private Context mContext;
    public ChuYitiaozhanAdapter(Context context, List<ChuYi.DataEntity> mDate) {
        mLayoutInflater = LayoutInflater.from(context);
        mContext = context;
        this.mDate = mDate;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new ViewHolder(mLayoutInflater.inflate(R.layout.chuyi_item,parent,false));
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        holder.mImageView.setLayoutParams(new RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.MATCH_PARENT, ChuYiActivity.height/4));
        Glide.with(mContext).load(mDate.get(position).getLargeImgUrl()).bitmapTransform(new GlideRoundTransform(mContext, 10)).crossFade(1000).into(holder.mImageView);
        holder.mDengji.setText(mDate.get(position).getLevelInfo());
        holder.mCount.setText("已有"+mDate.get(position).getParticipantCount()+"人挑战");
        holder.mTitle.setText(mDate.get(position).getTitle());
    }

    @Override
    public int getItemCount() {
        return mDate.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        ImageView mImageView;
        TextView mTitle,mCount,mDengji;
        public ViewHolder(View itemView) {
            super(itemView);
            mImageView = (ImageView) itemView.findViewById(R.id.chuyi_image);
            mTitle = (TextView) itemView.findViewById(R.id.title);
            mCount = (TextView) itemView.findViewById(R.id.count);
            mDengji = (TextView) itemView.findViewById(R.id.dengji);
        }
    }
}
