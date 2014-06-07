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

public class BudgetActivity extends Activity{
	List<Map<String, Object>> data = new ArrayList<Map<String,Object>>();
	ListView tableListView;
	public void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.budget_layout);
		tableListView = (ListView)findViewById(R.id.table_listView);
        initData();
        SimpleAdapter adapter = new SimpleAdapter(BudgetActivity.this, data, 
        		R.layout.budget_item, 
          new String[]{ "time", "out", "in"}, 
          new int[] { R.id.time,R.id.out, R.id.in}
        );
        tableListView.setAdapter(adapter);
	}
	
	private void initData(){
		Map<String, Object> map;
		for (int i = 12; i > 0; i--){
			map = new HashMap<String, Object>();
			map.put("time", "2014/"+i);
			map.put("out", "300.00");
			map.put("in", "3000.00");
			data.add(map);
		}
		
		for (int i = 12; i > 0; i--){
			map = new HashMap<String, Object>();
			map.put("time", "2013/"+i);
			map.put("out", "200.00");
			map.put("in", "3000.00");
			data.add(map);
		}
	}
}
