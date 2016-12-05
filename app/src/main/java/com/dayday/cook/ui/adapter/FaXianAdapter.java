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
import com.dayday.cook.beans.FaXian;
import com.dayday.cook.ui.activity.MainActivity;

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
public class FaXianAdapter extends RecyclerView.Adapter<FaXianAdapter.ViewHolder> {
    private LayoutInflater mLayoutInflater;
    private Context mContext;
    private List<FaXian> mFaXien;

    public FaXianAdapter(Context context, List<FaXian> mFaXien) {
        mLayoutInflater = LayoutInflater.from(context);
        mContext = context;
        this.mFaXien = mFaXien;
    }

    @Override
    public FaXianAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new FaXianAdapter.ViewHolder(mLayoutInflater.inflate(R.layout.faxian_item, parent, false));
    }

    @Override
    public void onBindViewHolder(FaXianAdapter.ViewHolder holder, int position) {
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.WRAP_CONTENT,
                MainActivity.Height / 2);
        layoutParams.setMargins(2, 2, 2, 2);
        holder.image.setLayoutParams(layoutParams);
        switch (position) {
            case 0:
                holder.mTextView.setText("#" + mFaXien.get(0).one.get(0).getLocationName());
                Glide.with(mContext).load(mFaXien.get(0).one.get(0).getImage_url()).into(holder.image);
                break;
            case 1:
                holder.mTextView.setText("#" + mFaXien.get(0).two.get(0).getLocationName());
                Glide.with(mContext).load(mFaXien.get(0).two.get(0).getImage_url()).into(holder.image);
                break;
            case 2:
                holder.mTextView.setText("#" + mFaXien.get(0).three.get(0).getLocationName());
                Glide.with(mContext).load(mFaXien.get(0).three.get(0).getImage_url()).into(holder.image);
                break;
            case 3:
                holder.mTextView.setText("#" + mFaXien.get(0).four.get(0).getLocationName());
                Glide.with(mContext).load(mFaXien.get(0).four.get(0).getImage_url()).into(holder.image);
                break;
            case 4:
                holder.mTextView.setText("#" + mFaXien.get(0).five.get(0).getLocationName());
                Glide.with(mContext).load(mFaXien.get(0).five.get(0).getImage_url()).into(holder.image);
                break;
            case 5:
                holder.mTextView.setText("#" + mFaXien.get(0).six.get(0).getLocationName());
                Glide.with(mContext).load(mFaXien.get(0).six.get(0).getImage_url()).into(holder.image);
                break;
            case 6:
                holder.mTextView.setText("#" + mFaXien.get(0).seven.get(0).getLocationName());
                Glide.with(mContext).load(mFaXien.get(0).seven.get(0).getImage_url()).into(holder.image);
                break;
            case 7:
                holder.mTextView.setText("#" + mFaXien.get(0).eight.get(0).getLocationName());
                Glide.with(mContext).load(mFaXien.get(0).eight.get(0).getImage_url()).into(holder.image);
                break;

        }
    }

    @Override
    public int getItemCount() {
        if (mFaXien.size() < 1) {
            return 0;
        } else {
            return 8;
        }
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        ImageView image;
        TextView mTextView;

        public ViewHolder(View itemView) {
            super(itemView);
            image = (ImageView) itemView.findViewById(R.id.faxian_image);
            mTextView = (TextView) itemView.findViewById(R.id.faxian_text);
        }
    }

    public static class ViewHolder1 extends RecyclerView.ViewHolder {
        public ViewHolder1(View itemView) {
            super(itemView);
        }
    }
}
