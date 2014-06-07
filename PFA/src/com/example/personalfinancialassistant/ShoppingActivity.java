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

public class ShoppingActivity extends Activity{
	ListView l1;
	private List<Map<String, Object>> d1 = new ArrayList<Map<String, Object>>(); 
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		super.onCreate(savedInstanceState);
		setContentView(R.layout.shopping);
		l1 = (ListView)findViewById(R.id.shopping_listview);
		setData();
		SimpleAdapter a1 = new SimpleAdapter(this,
				d1, R.layout.shopping_item,
				new String[]{"logo", "name"},
				new int[] {R.id.logo, R.id.name});
		l1.setAdapter(a1);
	}
	
	private void setData(){
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("logo", R.drawable.taobao);
		map.put("name", "淘宝网");
		d1.add(map);
		
		map = new HashMap<String, Object>();
		map.put("logo", R.drawable.yihaodian);
		map.put("name", "1号店");
		d1.add(map);
		
		map = new HashMap<String, Object>();
		map.put("logo", R.drawable.juhuasuan);
		map.put("name", "聚划算");
		d1.add(map);
		
		map = new HashMap<String, Object>();
		map.put("logo", R.drawable.nuomituan);
		map.put("name", "糯米团");
		d1.add(map);
		
		map = new HashMap<String, Object>();
		map.put("logo", R.drawable.tianmao);
		map.put("name", "天猫");
		d1.add(map);
		
		map = new HashMap<String, Object>();
		map.put("logo", R.drawable.yamaxun);
		map.put("name", "亚马逊");
		d1.add(map);
		
		map = new HashMap<String, Object>();
		map.put("logo", R.drawable.yixun);
		map.put("name", "易迅");
		d1.add(map);
		
		map = new HashMap<String, Object>();
		map.put("logo", R.drawable.jingdong);
		map.put("name", "京东");
		d1.add(map);
		
		map = new HashMap<String, Object>();
		map.put("logo", R.drawable.fankechengpin);
		map.put("name", "凡客诚品");
		d1.add(map);
		
		map = new HashMap<String, Object>();
		map.put("logo", R.drawable.weipinhui);
		map.put("name", "唯品会");
		d1.add(map);
	}

}
