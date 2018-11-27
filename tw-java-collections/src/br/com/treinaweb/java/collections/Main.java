package br.com.treinaweb.java.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import br.com.treinaweb.java.collections.models.Pessoa;

public class Main {

	public static void main(String[] args) {
		List<Pessoa> pessoas = new LinkedList<Pessoa>();
		pessoas.add(new Pessoa(1, "TreinaWeb 1"));
		pessoas.add(new Pessoa(2, "TreinaWeb 2"));
		System.out.println("Com FOR: ");
		for (int i = 0; i < pessoas.size(); i++) {
			Pessoa p = pessoas.get(i);
			System.out.println(p);
		}
		System.out.println("Com iterator: ");
		//       |                   
		// [p1, p2]
		Iterator<Pessoa> iteratorPessoa = pessoas.iterator();
		while (iteratorPessoa.hasNext()) {
			Pessoa p = iteratorPessoa.next();
			System.out.println(p);
		}
		System.out.println("FIM!");
	}

}
