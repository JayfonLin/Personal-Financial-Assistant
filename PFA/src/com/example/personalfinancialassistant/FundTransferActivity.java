package com.example.personalfinancialassistant;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class FundTransferActivity extends Activity{
	private static final String[] m={"余额宝","支付宝","财付通","环讯支付",
		"易宝支付","快钱","银行卡","网银",};
	private Spinner  spinner1,spinner2;
	private ArrayAdapter<String> adapter;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.fund_transfer_layout);
		spinner1 = (Spinner) findViewById(R.id.spinner1);
		spinner2 = (Spinner) findViewById(R.id.spinner2);
		adapter = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item,m);
		adapter.setDropDownViewResource(android.R.layout.simple_dropdown_item_1line);
		spinner1.setAdapter(adapter);
		spinner2.setAdapter(adapter);
		spinner1.setVisibility(View.VISIBLE);
		spinner2.setVisibility(View.VISIBLE);
	}
	
}
