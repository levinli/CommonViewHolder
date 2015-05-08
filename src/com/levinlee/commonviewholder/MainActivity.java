package com.levinlee.commonviewholder;

import java.util.ArrayList;
import java.util.List;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ListView;
import android.widget.TextView;

import com.levinleecommonviewholder.R;

public class MainActivity extends Activity {
	
	private ListView mListView;
	
	private List<Person> mDatas;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		mListView = (ListView) findViewById(R.id.listview);
		mDatas = new ArrayList<Person>();
		mDatas.add(new Person("加多宝", 5, "加多宝创立于1995年,是集原材料种植、饮料生产及销售于一体的大型企业.1996年加多宝推出了红罐凉茶,为凉茶行业注入了新生命力.目前加多宝旗下产品包括红色罐装、瓶装加多宝和昆仑山雪山矿泉水."));
		mDatas.add(new Person("王老吉", 35, "王老吉凉茶创立于清道光年间(1828年),至今已经有将近两百年历史,被公认为凉茶始祖.凉茶起源于广东,经过王老吉不懈努力与科技创新,将凉茶文化从岭南一隅推广至全国乃至全世界,深受消费者厚爱."));
		mDatas.add(new Person("天地一号", 3, "“天地壹号”，又被戏称为“领导壹号”（英文名TIANDI No.1 apple vinegar)。十多年前，天地壹号企业负责人受国家某领导人在广东视察时宴会上选择雪碧勾兑陈醋新颖喝法的启发，组织营养专家采用优质山西老陈醋，蜂蜜和营养维生素BT-左旋肉碱科学研配出健康佐餐醋饮料—天地壹号，开创中国醋饮料的先河。"));
		mDatas.add(new Person("百草一号", 2, "百草壹号，汇集植物天然成分，浓缩百草精华，不寒凉，不燥热，不加防腐剂。 百草壹号提取山楂、罗汉果、白茅、仙草、菊花等多种植物的天然成分，汇集百草精华，是居家生活、休闲旅行必备的佳饮。"));
		
		mListView.setAdapter(new CommonBaseAdapter<Person>(MainActivity.this,mDatas,R.layout.listview_item) {

			@Override
			public void convert(CommonViewHolder viewHolder, Person t) {
			((TextView)(viewHolder.getView(R.id.name))).setText(t.getName());
			((TextView)(viewHolder.getView(R.id.age))).setText(t.getAge()+"");
			((TextView)(viewHolder.getView(R.id.des))).setText(t.getDes());
			}
		});
	}
	
	
	

}
