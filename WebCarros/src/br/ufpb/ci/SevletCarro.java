package br.ufpb.ci;

import java.io.IOException;
import java.io.PrintWriter;
import java.lang.annotation.Target;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 * Servlet implementation class SevletCarro
 */
@WebServlet("/carro")
public class SevletCarro extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SevletCarro() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		out.println("WebServlet Carros.");
		String inputString = request.getParameter("dadosCarro");
		/**long id = 1;*/
		String nome = "Monza";
		String placa = "MOA2549";
		int ano = 1995;
		RepositorioCarroFake rep = new RepositorioCarroFake();
		List<Carro> lista = (List<Carro>)rep.listarCarros();
		PrintWriter listOut = response.getWriter();
		/*JSONObject objson = new JSONObject(lista); 
		  System.out.println( objson);		
		  listOut.println( objson);	*/
		/**
		 * Data: 22-02-2014 
		 * Abordagem adotada para retornar um vetor de objetos, 
		 * pois com o JSONObject  retornava a lista vazia.
		 */
		JSONArray objson;
		try {
			objson = new JSONArray(lista.toArray());
			System.out.println( objson);
			listOut.println( objson);
		} catch (JSONException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		try{
			JSONObject inputValues = new JSONObject(inputString);
			/**id = inputValues.getLong("id");*/
			nome = inputValues.getString("nome");
			placa = inputValues.getString("placa");
			ano = inputValues.getInt("ano");
			System.out.println(inputValues);
		}catch(Exception e){
			System.err.println("//NullPointerException and JSONException " + e);
		}
		Carro info = new Carro(nome, placa, ano);
		PrintWriter pout = response.getWriter();
		pout.println(new JSONObject(info));
	}
	
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
