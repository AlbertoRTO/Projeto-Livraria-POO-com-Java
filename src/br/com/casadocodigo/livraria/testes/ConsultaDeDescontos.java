package br.com.casadocodigo.livraria.testes;

import java.util.HashSet;


public class ConsultaDeDescontos {

	public static void main(String[] args) {
		
		GerenciadorDeCupons gerenciador = new GerenciadorDeCupons();
		
		Double desconto = gerenciador.validaCupom("CUP74");
		
		if(desconto != null){
			System.out.println("Cupom de desconto valido.");
			System.out.println("Valor "+ desconto);
		} else {
			System.out.println("Esse cupom não existe.");
		}
		
		
		HashSet<String> set = new HashSet<String>();
		set.add("N�o há repetic�o em Conjuntos");
		set.add("N�o há repetic�o em Conjuntos");
		set.add("N�o há repetic�o em Conjuntos");
		set.add("N�o há repetic�o em Conjuntos");
		set.add("N�o há repetic�o em Conjuntos");
		System.out.println(set.size());
	}
}
