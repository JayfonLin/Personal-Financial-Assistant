package com.example.personalfinancialassistant;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.SimpleAdapter;

public class FinanceTendencyActivity extends Activity{
	ListView l1;
	private List<Map<String, Object>> d1 = new ArrayList<Map<String, Object>>(); 
	LinearLayout tendency_ll;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.finance_tendency_layout);
		tendency_ll = (LinearLayout)findViewById(R.id.tendency);
		l1 = (ListView)findViewById(R.id.ranking_listview);
		setData();
		SimpleAdapter a1 = new SimpleAdapter(this,
				d1, R.layout.ranking_item,
				new String[]{"product", "bank", "interest", "risk"},
				new int[] {R.id.product, R.id.bank, R.id.interest, R.id.risk});
		l1.setAdapter(a1);
		tendency_ll.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Intent intent = new Intent(FinanceTendencyActivity.this, TendencyAnalysisActivity.class);
				startActivity(intent);
			}
		});
	}
	
	private void setData(){
		Map<String, Object> map;
		map = new HashMap<String, Object>();
		map.put("product", "\"金葵花\"焦点联动系列之黄金表现联动理财计划(133天)(104333)");
		map.put("bank", "招商银行");
		map.put("interest", "8.00%");
		map.put("risk", "较高");
		d1.add(map);
		
		map = new HashMap<String, Object>();
		map.put("product", "2014年\"君享百合\"系列6006号个人理财产品(91天)");
		map.put("bank", "兰州银行");
		map.put("interest", "6.20%");
		map.put("risk", "低");
		d1.add(map);
		
		map = new HashMap<String, Object>();
		map.put("product", "长江聚利2014年第2期理财产品(177天)");
		map.put("bank", "重庆银行");
		map.put("interest", "6.10%");
		map.put("risk", "低");
		d1.add(map);

		map = new HashMap<String, Object>();
		map.put("product", "个人专项理财产品2014年第80期尊享盈计划(私银专属)2301146280");
		map.put("bank", "浦发银行");
		map.put("interest", "6.00%");
		map.put("risk", "较低");
		d1.add(map);

		map = new HashMap<String, Object>();
		map.put("product", "2014年利多多公司理财计划14HH094期2301140094(91天)(答谢款)");
		map.put("bank", "浦发银行");
		map.put("interest", "6.00%");
		map.put("risk", "低");
		d1.add(map);

	}
}
