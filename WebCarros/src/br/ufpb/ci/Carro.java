package br.ufpb.ci;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

import javax.swing.plaf.basic.BasicIconFactory;

import oracle.jrockit.jfr.events.Bits;
public class Carro {

	  private long id;
	  private String nome;
	  private String placa;
	  private int ano;
	  

	  public Carro() {}

	  public Carro(String nome, String placa, int ano) {
	    super();
	    this.nome = nome;
	    this.placa = placa;
	    this.ano = ano;
	  }

	  public void deserialize(DataInputStream in) throws IOException {
	    id = in.readLong();

	    nome = in.readUTF();
	    placa = in.readUTF();
	    ano = in.readInt();

	    
	  }

	  /**
	   * Serializa o carro, escrevendo na OutputStream
	   * 
	   * @param out
	   * @throws IOException
	   */
	  public void serialize(DataOutputStream out) throws IOException {
	    out.writeLong(id == 0 ? 0 : id);
	    out.writeUTF(nome);
	    out.writeUTF(placa);
	    out.writeInt(ano);
	    
	  }

	 


	  public Long getId() {
	    return id;
	  }

	  public void setId(Long id) {
	    this.id = id;
	  }

	  public String getNome() {
	    return nome;
	  }

	  public void setNome(String nome) {
	    this.nome = nome;
	  }

	  public String getPlaca() {
	    return placa;
	  }

	  public void setPlaca(String placa) {
	    this.placa = placa;
	  }

	  public int getAno() {
	    return ano;
	  }

	  public void setAno(int ano) {
	    this.ano = ano;
	  }

	  

	  @Override
	  public String toString() {
	    return "Nome: " + nome + ", Placa: " + placa + ", Ano: " + ano;
	  }
	}
