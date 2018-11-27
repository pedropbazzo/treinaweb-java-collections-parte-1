package br.com.treinaweb.java.collections;

import java.util.ArrayList;
import java.util.List;

import br.com.treinaweb.java.collections.models.Pessoa;

public class Main {

	public static void main(String[] args) {
		List<Pessoa> pessoas = new ArrayList<Pessoa>();
		pessoas.add(new Pessoa(1, "TreinaWeb 1"));
		pessoas.add(new Pessoa(2, "TreinaWeb 2"));
		System.out.println(pessoas.toString());
	}

}
