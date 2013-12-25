package com.example.spinner;

import java.util.Arrays;
import java.util.List;
import android.os.Bundle;
import android.app.Activity;
import android.graphics.Color;
import android.view.Menu;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class SpinnerActivity extends Activity {
	/** 
	 * Aula 05 - Widgets2 - Utilizando a Abordagem XML -  Questão 1.1
	 * Aula 05 - Widgets2 - Utilizando a Abordagem Java - Questão 1.2
	 * @author LUIZ
	 * @since 2013
	 * **/
	private String mItemSelectedMessageTemplate; 
	                                   // Instancia variável da mensagem
	private TextView mColorRegion;     //Instancia variavel do texto 'hello word!'
	private Spinner spinner1;           // Instancia da Variável para o spinner
	private Spinner spinner2;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_spinner);
		
		this.mItemSelectedMessageTemplate = getString(R.string.spinner_message_template);
		//Seta o TextView'
		this.mColorRegion = (TextView) findViewById(R.id.textView1);
		//Seta o Spinner
		this.spinner1 = (Spinner)findViewById(R.id.spinner1);
		//modifica o spinner selecionado passando a Activity na classe interna nomeada
		this.spinner1.setOnItemSelectedListener(new SpinnerInfo());
		this.spinner2 = (Spinner)findViewById(R.id.spinner2);
		//recupera a lista de nomes de cores no método  getColorsNames() abaixo...
		List<String> entriesColorsNames = getColorsNames();
		// Constroi a lista de opções da spinner		
		ArrayAdapter<String> spinner2Adapter= 
				new	ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, 
						entriesColorsNames);
		//seta o prompt do spinner
		spinner2Adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        this.spinner2.setAdapter(spinner2Adapter);
        this.spinner2.setPrompt("Selecione Opção de Cor");
        this.spinner2.setOnItemSelectedListener(new SpinnerInfo());
		
	}
	/**
	 * Retorna uma lista de colorsNames
	 * */
	private List<String> getColorsNames(){
		String[] entries = {"Verde","Azul", "Amarelo","Vermelho"};
		List<String> namesList = Arrays.asList(entries);
		//Collections.shuffle(namesList); // embaralha os objetos
		return (namesList);
	}
	
	//Metodo usado para modificar a cor do texto
	public void setRegionColor(int color){
		this.mColorRegion.setTextColor(color);
	
	}
	// método para exibir a Menssagem Toast
	public void showToast (String text){
		Toast.makeText(SpinnerActivity.this, text, Toast.LENGTH_SHORT).show();
	}
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.spinner, menu);
		return true;
	}
	// classe interna nomeada
	private class SpinnerInfo implements OnItemSelectedListener{
		
		private boolean isFirst = true;
		
		public SpinnerInfo(){}
		
		@Override
		public void onItemSelected(AdapterView<?> spinner, View selectedView,
				int selectedIndex, long id) {
			
			if(isFirst){
				isFirst = false;
			} else {
				// string para toast
				String selection = 
						spinner.getItemAtPosition(selectedIndex).toString();
				String message = 
						String.format(mItemSelectedMessageTemplate, selection);
				showToast(message);
			}
			
			switch(selectedIndex){
			case 0: 
				//modifica cor  do texto
				setRegionColor(Color.BLACK);
				mColorRegion.setBackgroundColor(Color.GREEN);
				break;
			case 1: 
				//modifica cor  do texto
				setRegionColor(Color.BLACK);	
				mColorRegion.setBackgroundColor(Color.BLUE);
				break;
			case 2: 
				//modifica cor  do texto
				setRegionColor(Color.BLACK);
				mColorRegion.setBackgroundColor(Color.YELLOW);
				break;
			case 3: 
				//modifica cor  do texto
				setRegionColor(Color.BLACK);
				mColorRegion.setBackgroundColor(Color.RED);
				break;
			default:
				mColorRegion.setBackgroundColor(Color.WHITE);
				break;
			}
		}
		
		@Override
		public void onNothingSelected(AdapterView<?> arg0) {
			// TODO Auto-generated method stub
			
		}
		
	}// fim class SpinnerInfo

}
