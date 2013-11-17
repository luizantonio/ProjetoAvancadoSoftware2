package com.example.exercicio2;
import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class Exercicio2 extends Activity {
	
	private TextView saudacaoTextView;
	private String saudacao= "";
	private String hello = "Hello!";
	private String gby = "Goodbye!";
	private Button b1;
	private Button b2;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_exercicio2);
		
		//Activity direta
		this.saudacaoTextView = (TextView)
				findViewById(R.id.saudacaoTextView);
		
		this.b1 = (Button) findViewById(R.id.saudacaoButtonOla);
		this.b2 = (Button) findViewById(R.id.saudacaoButtonGoodBy);
		
		this.b1.setOnClickListener(new ClasseNomeada(this.hello,this));
		this.b2.setOnClickListener(new ClasseNomeada(this.gby,this));
		
	}
	public void setSaudacao(String texto){
		this.saudacaoTextView.setText(texto);
		Toast tempMessage = Toast.makeText(this, 
                texto, Toast.LENGTH_SHORT); 
                tempMessage.show();
	}
	/**
	 * métodos para abordagem Activity direta
	public void saudarUsuarioOla(View v) {
		String texto = "Hello!";
		String msg = saudacao + " " + texto;
		this.saudacaoTextView.setText(msg);
		
		Toast tempMessage = Toast.makeText(this, 
		                    texto, Toast.LENGTH_SHORT); 
		                    tempMessage.show();
	}
	
	public void saudarUsuarioGoodBy(View v) {
		String texto = "GoodBy!";
		String msg = saudacao + " " + texto;
		this.saudacaoTextView.setText(msg);
		
		Toast tempMessage = Toast.makeText(this, 
                            texto, Toast.LENGTH_SHORT); 
                            tempMessage.show();
	}
	**/
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.exercicio2, menu);
		return true;
	}
	
	public class ClasseNomeada implements OnClickListener{
		private String texto = "";
		private Exercicio2 e2 = new Exercicio2 ();
		public ClasseNomeada(String texto,Exercicio2 e2 ){
			this.texto = texto;
			this.e2 = e2;
		}
		@Override
		public void onClick(View v) {
			e2.setSaudacao(texto);
			
		}
		
	}
	

}
