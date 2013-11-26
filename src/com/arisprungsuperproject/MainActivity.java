package com.arisprungsuperproject;

import com.arisprungsuperproject.facebook.FacebookLoginActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;


public class MainActivity extends Activity implements OnClickListener
{
	
	private Button but1;
	private Button but2;
	private Button but3;


	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		but1 = (Button)findViewById(R.id.button1);

		but2 = (Button)findViewById(R.id.button2);

		but3 = (Button)findViewById(R.id.button3);
		but1.setOnClickListener(this);
		but2.setOnClickListener(this);
		but3.setOnClickListener(this);
	}

//	@Override
//	public boolean onCreateOptionsMenu(Menu menu)
//	{
//		// Inflate the menu; this adds items to the action bar if it is present.
//		getMenuInflater().inflate(R.menu.main, menu);
//		return true;
//	}

	@Override
	public void onClick(View v)
	{
		int i = v.getId();

		switch (i)
		{
			case R.id.button1:
				Intent intent = new Intent(getApplicationContext(),GCMDemoActivity.class);
				startActivity(intent);
				break;
			case R.id.button2:
				Intent intent1 = new Intent(getApplicationContext(),FacebookLoginActivity.class);
				startActivity(intent1);
				
				break;
			case R.id.button3:

				break;

		}

	}

}
