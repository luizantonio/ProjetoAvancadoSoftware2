package com.example.secondintent;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class SecondActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_second);
		execActivity2();
		irParaAtividade1();
		
	}
	public void irParaAtividade1(){
		Button irPara = (Button)findViewById(R.id.button1_ir_para_activity1);
		irPara.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				startActivity(new Intent(SecondActivity.this,MainActivity.class));
			}
		});
	}
	public void execActivity2(){
		
		Button atividade1 = (Button) findViewById(R.id.atividade2);
		atividade1.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				TextView text = (TextView)findViewById(R.id.textView1);
				text.setBackgroundColor(Color.BLACK);
				text.setTextColor(Color.YELLOW);
				Toast.makeText(SecondActivity.this, "Second activity", Toast.LENGTH_LONG).show();
			}
		});
		
	}
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.second, menu);
		return true;
	}

}
