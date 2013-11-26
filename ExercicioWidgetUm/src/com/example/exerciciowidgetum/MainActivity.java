package com.example.exerciciowidgetum;

import android.os.Bundle;
import android.app.Activity;
import android.graphics.Color;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;
import android.widget.ToggleButton;

public class MainActivity extends Activity {

	private ImageButton ib1;          //Instância variavel do Imagebutton 1
	private ImageButton ib2;          //Instância variavel do Imagebutton 2
	private Button button;             /**Instância variavel do button que 
                                          interage com o radioGroup. */
	private RadioGroup radioGroup ;    /**Instância variavel do radioGroup.*/
	private RadioButton radioButton;   /**Instância da variável a ser 
    selecionada no radioGroup. */
	private String alerta = "Selecione uma opção de cor."; /**Menssage of alert, 
                                                              no color select*/
	private TextView mColorRegion;    /**Instância variavel do texto 'this is test!'*/
	private int red  = Color.RED;     /**Instância variavel da cor vermelha*/
	private int blue = Color.BLUE;    /**Instância variavel da cor azul*/
	private int yellow = Color.YELLOW;/**Instância variavel da cor amarela*/
	private int black = Color.BLACK;  /**Instância variavel da cor black*/
	private int white= Color.WHITE;   /**Instância variavel da cor white*/
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		//Questão 1
		//Modifica a cor do elemento com id 'color_region'
		this.mColorRegion = (TextView) findViewById(R.id.textView1);
		
		/** Questão 4 */
		radioGroup = (RadioGroup)findViewById(R.id.radio_group_alterar);
		// Recebe o id do button
		this.button = (Button)findViewById(R.id.button_alterar);
		// Verifica o estado do button
        this.button.setOnClickListener(new OnClickListener() {
               @Override
               public void onClick(View v) {
            	   
            	   int selectedId = radioGroup.getCheckedRadioButtonId(); /** variável para armazenaer o id 
            	                                                              do radioButton selecionado.*/
            	   
            	   if(selectedId >= 1){ /** trata um possível erro  se não tiver algum 
            		                        radioButton selecionado.*/
            		   
            		   // Procura o radioButton para retornar id
            		   radioButton = (RadioButton) findViewById(selectedId);
            	   }
                   if (selectedId == -1){
                    	Toast.makeText(MainActivity.this,
                              alerta, Toast.LENGTH_SHORT).show();
                   }else if (radioButton.getId() == R.id.radioButton4){		
       					setRegionColor(Color.BLACK);//modifica cor  do texto
       					mColorRegion.setBackgroundColor(Color.RED);//modifica cor  do background 
       				}else if (radioButton.getId() == R.id.radioButton5){
       					setRegionColor(Color.BLACK);//modifica cor  do texto
       					mColorRegion.setBackgroundColor(Color.BLUE);//modifica cor  do background 
       				}else if (radioButton.getId() == R.id.radioButton6){
       					setRegionColor(Color.BLACK);//modifica cor  do texto
       					mColorRegion.setBackgroundColor(Color.YELLOW);//modifica cor  do background 
       				}   					
               }
          });
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
		//modifica cor  do texto
		if(tb.isChecked()){
			setRegionColor(this.black);
			mColorRegion.setBackgroundColor(this.red);
		}else{
			setRegionColor(this.black);
			mColorRegion.setBackgroundColor(this.white);
		}
	}
	// Togglebutton BLUE
	public void showToggleButton2(View clickedToogleButton) {// android:id="@+id/toggleButton2"			

		ToggleButton tb = (ToggleButton) clickedToogleButton;
		
		//modifica cor  do texto
		if(tb.isChecked()){
			setRegionColor(this.black);
			mColorRegion.setBackgroundColor(this.blue);
			
		}else{
			setRegionColor(this.black);
			mColorRegion.setBackgroundColor(this.white);
		}
	}
	// Togglebutton YELLOW
	public void showToggleButton3(View clickedToogleButton) { // android:id="@+id/toggleButton3"
		
		ToggleButton tb = (ToggleButton) clickedToogleButton;
		//modifica cor  do texto
		if(tb.isChecked()){
			setRegionColor(this.black);
			mColorRegion.setBackgroundColor(this.yellow);
		}else{
			setRegionColor(this.black);
			mColorRegion.setBackgroundColor(this.white);
		}

	}	

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
