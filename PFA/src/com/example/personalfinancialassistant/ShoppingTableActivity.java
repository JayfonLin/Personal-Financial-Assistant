package com.example.personalfinancialassistant;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import android.app.Activity;
import android.os.Bundle;
import android.view.Window;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.SimpleAdapter;

public class ShoppingTableActivity extends Activity{
	List<Map<String, Object>> data = new ArrayList<Map<String,Object>>();
	ListView tableListView;
	public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.shopping_table);
        tableListView = (ListView)findViewById(R.id.table_listView);
        initData();
        SimpleAdapter adapter = new SimpleAdapter(ShoppingTableActivity.this, data, 
        		R.layout.list_item_shopping_table, 
          new String[]{ "goods","source","amount", "date"}, 
          new int[] { R.id.goods,R.id.source,R.id.amount, R.id.date}
        );
        tableListView.setAdapter(adapter);
    }
	
	private void initData(){
		Map<String, Object> map;
		for (int i = 1; i < 20; i++){
			map = new HashMap<String, Object>();
			map.put("goods", "物品"+i);
			map.put("source", "京东商城");
			map.put("amount", "30.00");
			map.put("date", "2014/05/20");
			data.add(map);
		}
		
	}
}
