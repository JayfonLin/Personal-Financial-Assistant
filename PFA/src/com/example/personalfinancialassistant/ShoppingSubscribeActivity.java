package com.example.personalfinancialassistant;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import android.app.Activity;
import android.os.Bundle;
import android.view.Window;
import android.widget.ListView;
import android.widget.SimpleAdapter;

public class ShoppingSubscribeActivity extends Activity{
	ListView l1;
	private List<Map<String, Object>> d1 = new ArrayList<Map<String, Object>>(); 
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.shopping_subscribe);
		l1 = (ListView)findViewById(R.id.listView_subscribe);
		setData();
		SimpleAdapter a1 = new SimpleAdapter(this,
				d1, R.layout.subscribe_item,
				new String[]{"goods"},
				new int[] {R.id.subscribe_textview});
		l1.setAdapter(a1);
	}
	
	private void setData(){
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("goods", "男女服饰");
		d1.add(map);
		
		map = new HashMap<String, Object>();
		map.put("goods", "鞋包配件");
		d1.add(map);
		
		map = new HashMap<String, Object>();
		map.put("goods", "运动户外");
		d1.add(map);
		
		map = new HashMap<String, Object>();
		map.put("goods", "珠宝配饰");
		d1.add(map);
		
		map = new HashMap<String, Object>();
		map.put("goods", "手机数码");
		d1.add(map);
		
		map = new HashMap<String, Object>();
		map.put("goods", "家电办公");
		d1.add(map);
		
		map = new HashMap<String, Object>();
		map.put("goods", "护肤彩妆");
		d1.add(map);
		
		map = new HashMap<String, Object>();
		map.put("goods", "母婴用品");
		d1.add(map);
		
		map = new HashMap<String, Object>();
		map.put("goods", "家居家纺");
		d1.add(map);
		
		map = new HashMap<String, Object>();
		map.put("goods", "家装建材");
		d1.add(map);
		
		map = new HashMap<String, Object>();
		map.put("goods", "美食特产");
		d1.add(map);
		
		map = new HashMap<String, Object>();
		map.put("goods", "日用百货");
		d1.add(map);
		
		map = new HashMap<String, Object>();
		map.put("goods", "花鸟文娱");
		d1.add(map);
		
		map = new HashMap<String, Object>();
		map.put("goods", "汽车摩托");
		d1.add(map);
	}
	
}
