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
		mDatas.add(new Person("�Ӷ౦", 5, "�Ӷ౦������1995��,�Ǽ�ԭ������ֲ������������������һ��Ĵ�����ҵ.1996��Ӷ౦�Ƴ��˺������,Ϊ������ҵע������������.Ŀǰ�Ӷ౦���²�Ʒ������ɫ��װ��ƿװ�Ӷ౦������ɽѩɽ��Ȫˮ."));
		mDatas.add(new Person("���ϼ�", 35, "���ϼ����贴������������(1828��),�����Ѿ��н�����������ʷ,������Ϊ����ʼ��.������Դ�ڹ㶫,�������ϼ���иŬ����Ƽ�����,�������Ļ�������һ���ƹ���ȫ������ȫ����,���������ߺ�."));
		mDatas.add(new Person("���һ��", 3, "�����Ҽ�š����ֱ�Ϸ��Ϊ���쵼Ҽ�š���Ӣ����TIANDI No.1 apple vinegar)��ʮ����ǰ�����Ҽ����ҵ�������ܹ���ĳ�쵼���ڹ㶫�Ӳ�ʱ�����ѡ��ѩ�̹��ҳ´���ӱ�ȷ�����������֯Ӫ��ר�Ҳ�������ɽ���ϳ´ף����ۺ�Ӫ��ά����BT-��������ѧ������������ʹ����ϡ����Ҽ�ţ������й������ϵ��Ⱥӡ�"));
		mDatas.add(new Person("�ٲ�һ��", 2, "�ٲ�Ҽ�ţ��㼯ֲ����Ȼ�ɷ֣�Ũ���ٲݾ������������������ȣ����ӷ������� �ٲ�Ҽ����ȡɽ髡��޺�������é���ɲݡ��ջ��ȶ���ֲ�����Ȼ�ɷ֣��㼯�ٲݾ������ǾӼ�����������бر��ļ�����"));
		
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
