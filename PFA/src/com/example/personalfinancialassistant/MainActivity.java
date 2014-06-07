package com.example.personalfinancialassistant;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;

public class MainActivity extends Activity {
	TextView fontier,shopping,tendency,subscribe,transfer,personal;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main_layout);
		fontier = (TextView) findViewById(R.id.financial_frontier_button);
		shopping = (TextView) findViewById(R.id.myshopping_button);
		tendency = (TextView) findViewById(R.id.finance_tendency_button);
		subscribe = (TextView) findViewById(R.id.info_subscribe_button);
		transfer = (TextView) findViewById(R.id.fund_transfer_button);
		personal = (TextView) findViewById(R.id.personal_financing_button);
		
		fontier.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent = new Intent(MainActivity.this,FrontierActivity.class);
				startActivity(intent);
			}
		});
		
		shopping.setOnClickListener(new OnClickListener() {
					
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent = new Intent(MainActivity.this,MyShoppingActivity.class);
				startActivity(intent);
			}
		});
		
		tendency.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent = new Intent(MainActivity.this,FinanceTendencyActivity.class);
				startActivity(intent);
			}
		});
		
		subscribe.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent = new Intent(MainActivity.this,InfoSubscribeActivity.class);
				startActivity(intent);
			}
		});
		
		transfer.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent = new Intent(MainActivity.this,FundTransferActivity.class);
				startActivity(intent);
			}
		});
		
		personal.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent = new Intent(MainActivity.this,PersonalFinancingActivity.class);
				startActivity(intent);
			}
		});
		
	}
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
