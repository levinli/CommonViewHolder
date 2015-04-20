package com.levinlee.commonviewholder;

import android.content.Context;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Space;

public class CommonViewHolder {
	
	private SparseArray<View> mViews;
	private int mPosition;
	private View mConvertView;
	
	public CommonViewHolder(Context context,ViewGroup parent,int layoutId,int position){
		this.mPosition = mPosition;
		this.mViews = new SparseArray<View>();
		this.mConvertView = LayoutInflater.from(context).inflate(layoutId, null);
		this.mConvertView.setTag(this);
	}
	
	public static CommonViewHolder get(Context context,View convertView,ViewGroup parent,int layoutId,int position){
		if(convertView ==null){
			return new CommonViewHolder(context, parent, layoutId, position);
		}else{
			CommonViewHolder holder = (CommonViewHolder) convertView.getTag();
			holder.mPosition = position;
			return holder;
		}
	}
	
	public View getConvertView(){
		return mConvertView;
	}
	
	/**
	 * 通过viewId 获取控件
	 * @param viewId
	 * @return
	 */
	public <T extends View>  T getView(int viewId){
		View view = mViews.get(viewId);
		if(view ==null){
			view = mConvertView.findViewById(viewId);
			mViews.put(viewId, view);
		}
		return (T) view;
	}
	
}
