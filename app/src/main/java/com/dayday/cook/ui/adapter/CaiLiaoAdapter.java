package com.dayday.cook.ui.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.dayday.cook.R;
import com.dayday.cook.beans.CaiLiao;

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
public class CaiLiaoAdapter extends RecyclerView.Adapter<CaiLiaoAdapter.ViewHolder>{
    private List<CaiLiao> mCaiLiaos;
    private Context mContext;
    private LayoutInflater mLayoutInflater;
    public CaiLiaoAdapter(Context context, List<CaiLiao> mCaiLiaos) {
        mLayoutInflater = LayoutInflater.from(context);
        mContext = context;
        this.mCaiLiaos = mCaiLiaos;
    }
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new ViewHolder(mLayoutInflater.inflate(R.layout.cailiao_item,parent,false));
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        holder.mTitle.setText(mCaiLiaos.get(position).group);
        for(int i = 0;i<mCaiLiaos.get(position).child.size();i++) {
            View view = mLayoutInflater.inflate(R.layout.text_item, null);
            ((TextView) view.findViewById(R.id.text)).setTextSize(11);
            ((TextView) view.findViewById(R.id.text)).setText(mCaiLiaos.get(position).child.get(i));
            LinearLayout.LayoutParams param = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT,LinearLayout.LayoutParams.WRAP_CONTENT);
            param.setMargins(0,15,0,0);
            param.gravity = Gravity.CENTER;  //必须要加上这句，setMargins才会起作用，而且此句还必须在setMargins下面
            view.setLayoutParams(param);
            holder.cailiao_layout.addView(view);
        }
    }

    @Override
    public int getItemCount() {
        return mCaiLiaos.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        TextView mTitle;
        LinearLayout cailiao_layout;
        public ViewHolder(View itemView) {
            super(itemView);
            mTitle = (TextView) itemView.findViewById(R.id.cailiao_title);
            cailiao_layout = (LinearLayout) itemView.findViewById(R.id.cailiao_layout);
        }
    }
}
