package com.example.personalfinancialassistant;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.widget.TextView;

public class PersonalFinancingActivity extends Activity{
	TextView shoppingManifest, shoppingCategory, budget;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.personal_financing_layout);
		shoppingManifest = (TextView)findViewById(R.id.shopping_manifest);
		shoppingManifest.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Intent intent = new Intent(PersonalFinancingActivity.this, ShoppingTableActivity.class);
				startActivity(intent);
			}
		});
		
		shoppingCategory = (TextView)findViewById(R.id.shopping_category);
		shoppingCategory.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Intent intent = new Intent(PersonalFinancingActivity.this, ShoppingCategoryActivity.class);
				startActivity(intent);
			}
		});
		
		budget = (TextView)findViewById(R.id.budget);
		budget.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Intent intent = new Intent(PersonalFinancingActivity.this, BudgetActivity.class);
				startActivity(intent);
			}
		});
	}
}
