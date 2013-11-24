package com.example.exerciciowidgetum;

import android.os.Bundle;
import android.app.Activity;
import android.graphics.Color;
import android.view.Menu;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.ToggleButton;

public class MainActivity extends Activity {

	private ImageButton ib1;          //variavel do Imagebutton 1
	private ImageButton ib2;          //variavel do Imagebutton 2
	private TextView mColorRegion;    //variavel do texto 'this is test!'
	private int red  = Color.RED;     //variavel da cor vermelha
	private int blue = Color.BLUE;    //variavel da cor azul
	private int yellow = Color.YELLOW;//variavel da cor amarela
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		//Questão 1
		//Modifica a cor do elemento com id 'color_region'
		this.mColorRegion = (TextView) findViewById(R.id.textView1);
	}

	//Metodo usado para modificar a cor do texto
	public void setRegionColor(int color){
		mColorRegion.setTextColor(color);
	}
	// Questão 1
	// ImageButton
	public void showImageButton1(View v) {
		//modifica cor  do texto
		setRegionColor(this.red);	
	}
	public void showImageButton2(View v) {
		//modifica cor  do texto
		setRegionColor(this.blue);
	}	
	
	// Questão 2
	// 1ª linha de RadioButton
	public void showRadioButton1(View v) {
		//modifica cor  do texto
		setRegionColor(this.red);
	}
	public void showRadioButton2(View v) {
		//modifica cor  do texto
		setRegionColor(this.blue);	
	}
	public void showRadioButton3(View v) {
		//modifica cor  do texto
		setRegionColor(this.yellow); 
	}
	// Questão 3
	// Togglebutton RED
	public void showToggleButton1(View clickedToogleButton) { // android:id="@+id/toggleButton1"

		ToggleButton tb = (ToggleButton) clickedToogleButton;
		//String status;
		//modifica cor  do texto
		if(tb.isChecked()){
			setRegionColor(Color.BLACK);
			mColorRegion.setBackgroundColor(Color.RED);
			//status = "ON";
		}else{
			setRegionColor(Color.BLACK);
			mColorRegion.setBackgroundColor(Color.WHITE);
			//status = "OFF";
		}
	}
	// Togglebutton BLUE
	public void showToggleButton2(View clickedToogleButton) {// android:id="@+id/toggleButton2"			

		ToggleButton tb = (ToggleButton) clickedToogleButton;
		//String status;
		//modifica cor  do texto
		if(tb.isChecked()){
			setRegionColor(Color.BLACK);
			mColorRegion.setBackgroundColor(Color.BLUE);
			//status = "ON";
		}else{
			setRegionColor(Color.BLACK);
			mColorRegion.setBackgroundColor(Color.WHITE);
			//status = "OFF";
		}
	}
	// Togglebutton YELLOW
	public void showToggleButton3(View clickedToogleButton) { // android:id="@+id/toggleButton3"
		
		ToggleButton tb = (ToggleButton) clickedToogleButton;
		//String status;
		//modifica cor  do texto
		if(tb.isChecked()){
			setRegionColor(Color.BLACK);
			mColorRegion.setBackgroundColor(Color.YELLOW);
			//status = "ON";
		}else{
			setRegionColor(Color.BLACK);
			mColorRegion.setBackgroundColor(Color.WHITE);
			//status = "OFF";
		}

	}	
	// Questão 4
	// 2ª linha de RadioButton
	// RadioButton RED
	public void showRadioButton4(View v) {
		//modifica cor  do texto
		setRegionColor(Color.BLACK);
		mColorRegion.setBackgroundColor(Color.RED);
	}
	// RadioButton BLUE
	public void showRadioButton5(View v) {
		//modifica cor  do texto
		setRegionColor(Color.BLACK);	
		mColorRegion.setBackgroundColor(Color.BLUE);
	}
	// RadioButton YELLOW
	public void showRadioButton6(View v) {
		//modifica cor  do texto
		setRegionColor(Color.BLACK);
		mColorRegion.setBackgroundColor(Color.YELLOW);
	}
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
