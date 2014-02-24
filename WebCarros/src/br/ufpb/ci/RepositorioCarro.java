package br.ufpb.ci;

import java.util.List;

public interface RepositorioCarro {
	  // Insere ou atualiza o carro
	  public boolean salvar(Carro carro);

	  // Deleta o carro
	  public boolean deletar(Carro carro);

	  // Busca o carro pelo id
	  public Carro getCarro(Long id);

	  // Retorna uma lista com todos os carros
	  public List<Carro> listarCarros();

	  // Busca o carro pelo nome
	  public Carro buscarCarroPorNome(String nome);
	}
