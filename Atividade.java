package br.com.banco2m.banco.teste.util;

import java.util.ArrayList;
import java.util.Iterator;

import br.com.banco2m.banco.modelo.Estados;
import br.com.banco2m.banco.modelo.Pais;

public class Atividade {

	public static void main(String[] args) {
		
		ArrayList<Pais> listaPais = new ArrayList<>();
		
		Pais pais = new Pais();
		
		pais.setNome("Brasil");
		pais.setContinente("America");
		
		Pais pais3 = new Pais();
		
		pais3.setNome("Espanha");
		pais3.setContinente("Europa");
		
		Estados estado = new Estados();
		
		estado.setNomeEstado("Minas gerais");
		estado.setCapital("Belo Horizonte");
		estado.setRegiao("Sudeste");
		
		Estados estado2 = new Estados();
		
		estado2.setNomeEstado("Barcelona");
		estado2.setCapital("el godic");
		estado2.setRegiao("norte");
		
		pais.setEstado(estado);
		pais3.setEstado(estado2);
		listaPais.add(pais);
		listaPais.add(pais3);
	
		for (Pais paises : listaPais) {
			System.out.println("PAÍS: " + paises.getNome());
			System.out.println("Continente: " + paises.getContinente());
			System.out.println("Nome Estado: " + paises.getEstado().getNomeEstado());
			System.out.println("Região: " + paises.getEstado().getRegiao());
			System.out.println("Capital: " + paises.getEstado().getCapital());
			System.out.println("-------------------------------");
		}
		
		System.out.println();
	}
}
