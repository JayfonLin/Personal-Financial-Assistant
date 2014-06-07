package com.example.personalfinancialassistant;

import android.app.Activity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.Window;
import android.widget.TextView;

public class TendencyAnalysisActivity extends Activity{
	TextView body;
	public void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.tendency_analysis);
		body = (TextView)findViewById(R.id.body_textview);
		body.setMovementMethod(ScrollingMovementMethod.getInstance());
	}
}
