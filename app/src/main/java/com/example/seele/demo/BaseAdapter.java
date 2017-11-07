package com.example.seele.demo;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

/**
 * Created by SEELE on 2017/11/3.
 */

public class BaseAdapter extends RecyclerView.Adapter<BaseAdapter.ViewHolder> {
    private List<String> list;

    public BaseAdapter(List<String> mList) {
        this.list = mList;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        View view;
        TextView mTvBg;
        TextView mTvTextName;

        public ViewHolder(View itemView) {
            super(itemView);
            view = itemView;
            mTvBg = view.findViewById(R.id.tv_bg);
            mTvTextName = view.findViewById(R.id.tv_item_name);
        }
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item, parent, false);
        RecyclerView.ViewHolder viewHolder = new ViewHolder(view);
        return (ViewHolder) viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        holder.mTvTextName.setText(list.get(position));
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

}
