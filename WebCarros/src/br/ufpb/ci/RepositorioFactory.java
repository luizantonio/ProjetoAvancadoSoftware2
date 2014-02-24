package br.ufpb.ci;
/** Fabrica singleton */
public class RepositorioFactory {

	  private static RepositorioCarro repositorio;

	  public static RepositorioCarro getRepositorioCarro() {
	    if (repositorio == null) {
	      repositorio = new RepositorioCarroFake();
	    }
	    return repositorio;
	  }
	}