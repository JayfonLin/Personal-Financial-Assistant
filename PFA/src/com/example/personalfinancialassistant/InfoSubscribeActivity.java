package com.example.personalfinancialassistant;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.widget.TextView;

public class InfoSubscribeActivity extends Activity{
	TextView tv_shopping;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.info_subscribe_layout);
		tv_shopping = (TextView)findViewById(R.id.textView_shopping);
		tv_shopping.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Intent intent = new Intent(InfoSubscribeActivity.this, ShoppingSubscribeActivity.class);
				startActivity(intent);
			}
		});
	}
}
