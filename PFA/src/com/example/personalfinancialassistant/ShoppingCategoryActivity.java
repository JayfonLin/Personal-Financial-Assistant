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

public class ShoppingCategoryActivity extends Activity{
	List<Map<String, Object>> data = new ArrayList<Map<String,Object>>();
	ListView tableListView;
	public void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.shopping_category);
		tableListView = (ListView)findViewById(R.id.table_listView);
        initData();
        SimpleAdapter adapter = new SimpleAdapter(ShoppingCategoryActivity.this, data, 
        		R.layout.category_item, 
          new String[]{ "category", "goods"}, 
          new int[] { R.id.category,R.id.goods}
        );
        tableListView.setAdapter(adapter);
	}
	
	private void initData(){
		Map<String, Object> map;
		for (int i = 1; i < 20; i++){
			map = new HashMap<String, Object>();
			map.put("category", "分类"+i);
			map.put("goods", "物品"+i);
			data.add(map);
		}
		
	}
}
