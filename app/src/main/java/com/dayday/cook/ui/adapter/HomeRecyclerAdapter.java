package com.dayday.cook.ui.adapter;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.dayday.cook.R;
import com.dayday.cook.beans.HomeNew;
import com.dayday.cook.beans.HomeTopic;
import com.dayday.cook.ui.activity.ChuYiActivity;
import com.dayday.cook.ui.activity.ShiPinXiangQingActivity;
import com.dayday.cook.ui.activity.ShiPinZhuanQuActivity;
import com.dayday.cook.ui.activity.XiangQingActivity;
import com.orhanobut.logger.Logger;

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
public class HomeRecyclerAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    public static enum ITEM_TYPE {
        ITEM_TYPE_SKS, ITEM_TYPE_NEW, ITEM_TYPE_HOT, ITEM_TYPE_TOPIC
    }

    private LayoutInflater mLayoutInflater;
    private Context mContext;
    private List<HomeTopic> mHomeTopic;
    private List<HomeNew> homeNews;

    public HomeRecyclerAdapter(Context context, List<HomeTopic> homeTopic, List<HomeNew> homeNews) {
        mLayoutInflater = LayoutInflater.from(context);
        mContext = context;
        mHomeTopic = homeTopic;
        this.homeNews = homeNews;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        Logger.e("onCreateViewHolder");
        if (viewType == ITEM_TYPE.ITEM_TYPE_SKS.ordinal()) {
            return new HomeSksyViewHolder(mLayoutInflater.inflate(R.layout.home_ksrk, parent, false),mContext);
        } else if (viewType == ITEM_TYPE.ITEM_TYPE_NEW.ordinal()) {
            return new HomeNewViewHolder(mLayoutInflater.inflate(R.layout.home_new, parent, false));
        } else if (viewType == ITEM_TYPE.ITEM_TYPE_HOT.ordinal()) {
            return new HomeHotViewHolder(mLayoutInflater.inflate(R.layout.home_hot, parent, false));
        } else {
            return new HomeTopicViewHolder(mLayoutInflater.inflate(R.layout.home_topic_item, parent, false));
        }
    }
    private HomeNewAdapter mHomeNewAdapter;
    private HomeHotAdapter mHomeHotAdapter;

    @Override
    public void onBindViewHolder(final RecyclerView.ViewHolder holder, final int position) {
        Logger.e("onBindViewHolder");
        if (holder instanceof HomeTopicViewHolder) {
            ((HomeTopicViewHolder) holder).topic_text.setText(mHomeTopic.get(0).getThemeList().get(position - 3).getTitle());
            ((HomeTopicViewHolder) holder).topic_text1.setText(mHomeTopic.get(0).getThemeList().get(position - 3).getDescription());
            Glide.with(mContext).load(mHomeTopic.get(0).getThemeList().get(position - 3).getImage_url()).into(((HomeTopicViewHolder) holder).mImageView);
            ((HomeTopicViewHolder) holder).mView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Logger.e(position-3+"**************************");
                    Intent intent = new Intent();
                    if(mHomeTopic.get(0).getThemeList().get(position - 3).getRecommend_type().equals("1")){
                        intent.setClass(mContext, ShiPinXiangQingActivity.class);
                        intent.putExtra(ShiPinXiangQingActivity.SHIPIN_ID,mHomeTopic.get(0).getThemeList().get(position - 3).getRecipe_id());
                    }else {
                        intent.setClass(mContext, XiangQingActivity.class);
                        intent.putExtra(XiangQingActivity.NOTV_ID,mHomeTopic.get(0).getThemeList().get(position - 3).getRecipe_id());
                    }
                    mContext.startActivity(intent);
                }
            });

        } else if (holder instanceof HomeNewViewHolder) {
            mHomeNewAdapter = new HomeNewAdapter(mContext, homeNews);
            LinearLayoutManager manager = new LinearLayoutManager(mContext, LinearLayoutManager.HORIZONTAL, false);
            if (homeNews.size() >= 1) {
                ((HomeNewViewHolder) holder).mRecyclerView.setLayoutParams(new LinearLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT));
            }
            ((HomeNewViewHolder) holder).mRecyclerView.setLayoutManager(manager);
            ((HomeNewViewHolder) holder).mRecyclerView.setAdapter(mHomeNewAdapter);
        } else if (holder instanceof HomeHotViewHolder) {
            mHomeHotAdapter = new HomeHotAdapter(mContext, mHomeTopic);
            LinearLayoutManager manager = new LinearLayoutManager(mContext, LinearLayoutManager.HORIZONTAL, false);
            if (mHomeTopic.size() >= 1) {
                ((HomeHotViewHolder) holder).mRecyclerView.setLayoutParams(new LinearLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT));
            }
            ((HomeHotViewHolder) holder).mRecyclerView.setLayoutManager(manager);
            ((HomeHotViewHolder) holder).mRecyclerView.setAdapter(mHomeHotAdapter);
        }
    }


    @Override
    public int getItemViewType(int position) {
        switch (position) {
            case 0:
                return ITEM_TYPE.ITEM_TYPE_SKS.ordinal();
            case 1:
                return ITEM_TYPE.ITEM_TYPE_NEW.ordinal();
            case 2:
                return ITEM_TYPE.ITEM_TYPE_HOT.ordinal();
            default:
                return ITEM_TYPE.ITEM_TYPE_TOPIC.ordinal();
        }
    }

    @Override
    public int getItemCount() {
        if (mHomeTopic.size() > 0) {
            return mHomeTopic.get(0).getThemeList().size() + 3;
        } else {
            return 3;
        }
    }

    public static class HomeSksyViewHolder extends RecyclerView.ViewHolder {
        RelativeLayout shipinzhuanqu,chuyitiaozhan;
        public HomeSksyViewHolder(View itemView, final Context context) {
            super(itemView);
            shipinzhuanqu = (RelativeLayout) itemView.findViewById(R.id.shipinzhuanqu);
            chuyitiaozhan = (RelativeLayout) itemView.findViewById(R.id.shipintiaozhan);
            shipinzhuanqu.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    context.startActivity(new Intent(context, ShiPinZhuanQuActivity.class));
                }
            });
            chuyitiaozhan.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    context.startActivity(new Intent(context, ChuYiActivity.class));
                }
            });
        }
    }

    public static class HomeNewViewHolder extends RecyclerView.ViewHolder {
        RecyclerView mRecyclerView;
        public HomeNewViewHolder(View itemView) {
            super(itemView);
            mRecyclerView = (RecyclerView) itemView.findViewById(R.id.home_new_recy);
        }
    }

    public static class HomeHotViewHolder extends RecyclerView.ViewHolder {
        RecyclerView mRecyclerView;

        public HomeHotViewHolder(View itemView) {
            super(itemView);
            mRecyclerView = (RecyclerView) itemView.findViewById(R.id.home_hot_recy);
        }
    }

    public static class HomeTopicViewHolder extends RecyclerView.ViewHolder {
        TextView topic_text;
        TextView topic_text1;
        ImageView mImageView;
        View mView;
        public HomeTopicViewHolder(View itemView) {
            super(itemView);
            mView = itemView;
            mImageView = (ImageView) itemView.findViewById(R.id.image_topic);
            topic_text = (TextView) itemView.findViewById(R.id.text_topic);
            topic_text1 = (TextView) itemView.findViewById(R.id.text_topic1);
        }
    }
}
