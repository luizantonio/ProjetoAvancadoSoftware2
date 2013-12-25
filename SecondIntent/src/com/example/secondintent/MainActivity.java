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

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		execActivity1();
		irParaAtividade2();
		
	}
	public void irParaAtividade2(){
		Button irPara = (Button)findViewById(R.id.button_ir_para_activity2);
		irPara.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				startActivity(new Intent(MainActivity.this,SecondActivity.class));
			}
		});
	}
	public void execActivity1(){
		
		Button atividade1 = (Button) findViewById(R.id.atividade1);
		atividade1.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				TextView text = (TextView)findViewById(R.id.textView1);
				text.setBackgroundColor(Color.GREEN);
				text.setTextColor(Color.BLACK);
				Toast.makeText(MainActivity.this, "Primeira activity", Toast.LENGTH_LONG).show();
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
