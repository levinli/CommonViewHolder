package com.levinlee.commonviewholder;

import java.util.List;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

public abstract class CommonBaseAdapter<T> extends BaseAdapter {
	
	protected Context mContext;
	protected List<T> mList;
	protected int mLayoutId;
	
	public CommonBaseAdapter(Context context, List<T> mList, int layoutId) {
        super();
        this.mContext = context;
        this.mList = mList;
        this.mLayoutId = layoutId;
    }
	
	@Override
	public int getCount() {
		return mList.size();
	}

	@Override
	public T getItem(int position) {
		return mList.get(position);
	}

	@Override
	public long getItemId(int position) {
		return position;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		CommonViewHolder viewHolder = CommonViewHolder.get(mContext, convertView, parent, mLayoutId, position);
		convert(viewHolder,getItem(position));
		return viewHolder.getConvertView();
	}
	
	public abstract void convert(CommonViewHolder viewHolder,T t);

}
