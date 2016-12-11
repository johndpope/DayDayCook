package com.dayday.cook.ui.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.dayday.cook.R;
import com.dayday.cook.db.SearchHistory;

import java.util.List;

/**
 * Created by fan on 2016/12/7.
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
public class SearchAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder>{

    private MyItemClickListener mItemClickListener;
    public static enum ITEM_TYPE {
        ITEM_TYPE_FOO, ITEM_TYPE_NEW
    }
    private List<SearchHistory> mSearchHistories;
    private LayoutInflater mLayoutInflater;
    private Context mContext;
    public SearchAdapter(Context context, List<SearchHistory> mSearchHistories) {
        mLayoutInflater = LayoutInflater.from(context);
        mContext = context;
        this.mSearchHistories = mSearchHistories;
    }
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        if(viewType == ITEM_TYPE.ITEM_TYPE_NEW.ordinal()){
            return new ViewHolder(mLayoutInflater.inflate(R.layout.search_history_item, parent, false),mItemClickListener);
        }else {
            return new ViewHolderF(mLayoutInflater.inflate(R.layout.search_fotter, parent, false),mItemClickListener);
        }
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        if(holder instanceof ViewHolder){
            ((ViewHolder)holder).mTextView.setText(mSearchHistories.get(position).getText());
        }
    }

    @Override
    public int getItemViewType(int position) {
        if(position == mSearchHistories.size()){
            return ITEM_TYPE.ITEM_TYPE_FOO.ordinal();
        }else{
            return ITEM_TYPE.ITEM_TYPE_NEW.ordinal();
        }
    }

    @Override
    public int getItemCount() {
        if(mSearchHistories.size()>0){
            return mSearchHistories.size()+1;
        }else {
            return 0;
        }
    }

    public static class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
        TextView mTextView;
        private MyItemClickListener mListener;
        public ViewHolder(View itemView,MyItemClickListener myItemClickListener) {
            super(itemView);
            this.mListener = myItemClickListener;
            mTextView = (TextView) itemView.findViewById(R.id.text_history);
            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View view) {
            if (mListener != null) {
                mListener.onItemClick(view, getPosition());
            }
        }
    }
    public static class ViewHolderF extends RecyclerView.ViewHolder implements View.OnClickListener{
        private MyItemClickListener mListener;
        public ViewHolderF(View itemView,MyItemClickListener myItemClickListener) {
            super(itemView);
            this.mListener = myItemClickListener;
            itemView.setOnClickListener(this);
        }
        @Override
        public void onClick(View view) {
            if (mListener != null) {
                mListener.onItemClick(view, getPosition());
            }
        }
    }

    /**
     * 创建一个回调接口
     */
    public interface MyItemClickListener {
        void onItemClick(View view, int position);
    }

    public void setItemClickListener(MyItemClickListener myItemClickListener) {
        this.mItemClickListener = myItemClickListener;
    }
}
