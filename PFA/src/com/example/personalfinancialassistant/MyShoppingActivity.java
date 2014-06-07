package com.example.personalfinancialassistant;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.widget.Button;
import android.widget.TextView;

public class MyShoppingActivity extends Activity{
	TextView myshoppingBtn, shoppingCart;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.myshopping);
		myshoppingBtn = (TextView)findViewById(R.id.myshopping_button);
		myshoppingBtn.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Intent intent = new Intent(MyShoppingActivity.this, ShoppingActivity.class);
				startActivity(intent);
			}
		});
		shoppingCart = (TextView)findViewById(R.id.shopping_cart_textview);
		shoppingCart.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Intent intent = new Intent(MyShoppingActivity.this, ShoppingCartActivity.class);
				startActivity(intent);
			}
		});
	}
}
