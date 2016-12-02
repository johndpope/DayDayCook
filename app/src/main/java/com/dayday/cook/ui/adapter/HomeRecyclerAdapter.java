package com.dayday.cook.ui.adapter;

import android.content.Context;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import com.dayday.cook.R;
import com.dayday.cook.beans.HomeNew;
import com.dayday.cook.beans.HomeTopic;
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
            return new HomeSksyViewHolder(mLayoutInflater.inflate(R.layout.home_ksrk, parent, false));
        } else if (viewType == ITEM_TYPE.ITEM_TYPE_NEW.ordinal()) {
            return new HomeNewViewHolder(mLayoutInflater.inflate(R.layout.home_new, parent, false));
        } else if (viewType == ITEM_TYPE.ITEM_TYPE_HOT.ordinal()) {
            return new HomeHotViewHolder(mLayoutInflater.inflate(R.layout.home_hot, parent, false));
        } else {
            return new HomeTopicViewHolder(mLayoutInflater.inflate(R.layout.home_topic, parent, false));
        }
    }
    private HomeTopicAdapter adapter;
    private HomeNewAdapter mHomeNewAdapter;
    private HomeHotAdapter mHomeHotAdapter;

    @Override
    public void onBindViewHolder(final RecyclerView.ViewHolder holder, int position) {
        Logger.e("onBindViewHolder");
        if(holder instanceof HomeTopicViewHolder){
            adapter = new HomeTopicAdapter(mContext,mHomeTopic);
            LinearLayoutManager manager = new LinearLayoutManager(mContext);
            if(homeNews.size()>=1){
                ((HomeTopicViewHolder)holder).mRecyclerView.setLayoutParams(new LinearLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT));
            }
            ((HomeTopicViewHolder)holder).mRecyclerView.setLayoutManager(manager);
            ((HomeTopicViewHolder)holder).mRecyclerView.setAdapter(adapter);
        }else if(holder instanceof HomeNewViewHolder){
            mHomeNewAdapter = new HomeNewAdapter(mContext,homeNews);
            LinearLayoutManager manager = new LinearLayoutManager(mContext,LinearLayoutManager.HORIZONTAL,false);
            if(homeNews.size()>=1){
                ((HomeNewViewHolder)holder).mRecyclerView.setLayoutParams(new LinearLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT));
            }
            ((HomeNewViewHolder)holder).mRecyclerView.setLayoutManager(manager);
            ((HomeNewViewHolder)holder).mRecyclerView.setAdapter(mHomeNewAdapter);
        } else if(holder instanceof HomeHotViewHolder){
            mHomeHotAdapter = new HomeHotAdapter(mContext,mHomeTopic);
            LinearLayoutManager manager = new LinearLayoutManager(mContext,LinearLayoutManager.HORIZONTAL,false);
            if(mHomeTopic.size()>=1){
                ((HomeHotViewHolder)holder).mRecyclerView.setLayoutParams(new LinearLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT));
            }
            ((HomeHotViewHolder)holder).mRecyclerView.setLayoutManager(manager);
            ((HomeHotViewHolder)holder).mRecyclerView.setAdapter(mHomeHotAdapter);
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
            case 3:
                return ITEM_TYPE.ITEM_TYPE_TOPIC.ordinal();
            default:
                return 0;
        }
    }

    @Override
    public int getItemCount() {
        return 4;
    }

    public static class HomeSksyViewHolder extends RecyclerView.ViewHolder {

        public HomeSksyViewHolder(View itemView) {
            super(itemView);
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
        RecyclerView mRecyclerView;
        public HomeTopicViewHolder(View itemView) {
            super(itemView);
            mRecyclerView = (RecyclerView) itemView.findViewById(R.id.topic_recycler);
        }
    }
}
