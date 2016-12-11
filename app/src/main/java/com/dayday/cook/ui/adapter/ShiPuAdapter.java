package com.dayday.cook.ui.adapter;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.dayday.cook.R;
import com.dayday.cook.beans.HomeNew;
import com.dayday.cook.ui.activity.MainActivity;
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
public class ShiPuAdapter  extends RecyclerView.Adapter<ShiPuAdapter.ViewHolder>  {
    private LayoutInflater mLayoutInflater;
    private Context mContext;
    private List<HomeNew.DataEntity> mHomeNews;

    public ShiPuAdapter(Context context, List<HomeNew.DataEntity> mHomeNews) {
        mLayoutInflater = LayoutInflater.from(context);
        mContext = context;
        this.mHomeNews = mHomeNews;
    }
    @Override
    public ShiPuAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new ShiPuAdapter.ViewHolder(mLayoutInflater.inflate(R.layout.shipu_list_item, parent, false));
    }

    @Override
    public void onBindViewHolder(ShiPuAdapter.ViewHolder holder, final int position) {
        Glide.with(mContext).load(mHomeNews.get(position).getImageUrl()).into(holder.mImageView);
        holder.shipu_rela.setLayoutParams(new ViewGroup.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, MainActivity.Height));
        holder.mTextView.setText(mHomeNews.get(position).getTitle());
        holder.mView.setText(mHomeNews.get(position).getDescription());
        holder.time.setText(mHomeNews.get(position).getMaketime());
        holder.share.setText(mHomeNews.get(position).getShareCount()+"");
        holder.eye.setText(mHomeNews.get(position).getClickCount()+"");
        String date = mHomeNews.get(position).getReleaseDate();
        String[] s = date.split("-");
        if(s.length>=3) {
            holder.date.setText(s[1] + "/" + s[2]);
        }
        holder.mView1.setOnClickListener(new View.OnClickListener() {
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
        ImageView mImageView;
        RelativeLayout shipu_rela;
        TextView mTextView,mView,time,share,eye,date;
        View mView1;
        public ViewHolder(View itemView) {
            super(itemView);
            mView1 = itemView;
            mImageView = (ImageView) itemView.findViewById(R.id.image_shipu);
            shipu_rela = (RelativeLayout) itemView.findViewById(R.id.shipu_rela);
            mTextView = (TextView) itemView.findViewById(R.id.title);
            mView = (TextView) itemView.findViewById(R.id.text_new_t);
            time = (TextView) itemView.findViewById(R.id.time);
            share = (TextView) itemView.findViewById(R.id.share);
            eye = (TextView) itemView.findViewById(R.id.eye);
            date = (TextView) itemView.findViewById(R.id.date);
        }
    }
}
