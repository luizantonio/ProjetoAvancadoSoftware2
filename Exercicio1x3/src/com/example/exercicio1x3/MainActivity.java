package com.example.exercicio1x3;

import java.util.Random;
import android.os.Bundle;
import android.app.Activity;
import android.graphics.Color;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity {
	
	private int qtdeB1 = 0;
	private int qtdeB2 = 0;	
	private Button b1;
	private Button b2;
	private TextView qtdeButton1;
	private TextView qtdeButton2;	
	private TextView mColorRegion;
	private int[] mColorchoices = 
		   {Color.BLACK, Color.BLUE,        Color.CYAN,   Color.DKGRAY, 
			Color.GRAY,  Color.GREEN,       Color.LTGRAY, Color.MAGENTA,
			Color.RED,   Color.TRANSPARENT, Color.WHITE,  Color.YELLOW};
 
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);		
		//Modifica a cor do bacground do elemento com id 'color_region'
		this.mColorRegion = (TextView) findViewById(R.id.color_region);
		//variaveis de quantidade de cliks
		this.qtdeButton1 = (TextView) findViewById(R.id.qtdeButton1);
		this.qtdeButton2 = (TextView) findViewById(R.id.qtdeButton2);		
		//Primeiro Botão para alterar a cor
		this.b1 = (Button) findViewById(R.id.button1);		
		//Segundo Botão para alterar a cor
		this.b2 = (Button) findViewById(R.id.button2);
	}
	//Metodo usado para modificar a cor do texto
	public void setRegionColor(int color){
		mColorRegion.setTextColor(color);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	
	public void clickButton1(View v) {
		//Seleciona cor randomicamente
		Random generator = new Random();
		int index = generator.nextInt(mColorchoices.length);
		//modifica cor  do texto
		setRegionColor(mColorchoices[index]);
		//modifica cor  do botão
		this.b1.setTextColor(mColorchoices[index]);
		//contador - coloca numa string
		String qtde = (String) " "+ (this.qtdeB1 = qtdeB1 + 1);
		String msg = "Quantidade de Click me: " + " " +qtde ;
		//modifica o valor do elemento
		this.qtdeButton1.setText(msg);

	}
	
	public void clickButton2(View v) {
		//Seleciona cor randomicamente
		Random generator = new Random();
		int index = generator.nextInt(mColorchoices.length);
		//modifica cor  do texto
		setRegionColor(mColorchoices[index]);
		//modifica cor  do botão
		this.b2.setTextColor(mColorchoices[index]);
		//contador - coloca numa string
		String qtde =  (String)" "+(this.qtdeB2 = qtdeB2 + 1);
		String msg = "Quantidade de Push me: " + " " + qtde;
		//modifica o valor do elemento
		this.qtdeButton2.setText(msg);
			
	}
}


