package br.com.treinaweb.java.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

import br.com.treinaweb.java.collections.models.Pessoa;

public class Main {

	public static void main(String[] args) {
		List<Pessoa> pessoas = new ArrayList<Pessoa>();
		pessoas.add(new Pessoa(1, "TreinaWeb 1"));
		pessoas.add(new Pessoa(2, "TreinaWeb 2"));
		pessoas.add(new Pessoa(2, "TreinaWeb 3"));
		
		pessoas.remove(new Pessoa(1, "TreinaWeb 1"));
		
		System.out.println(pessoas.contains(new Pessoa(2, "TreinaWeb 2")));
		
		System.out.println(pessoas);
		// N1 --> N2 ---> N3
		
//		System.out.println("Com FOR: ");
//		for (int i = 0; i < pessoas.size(); i++) {
//			Pessoa p = pessoas.get(i);
//			System.out.println(p);
//		}
		
//		System.out.println("Com iterator: ");
		//       |                   
		// [p1, p2]
//		Iterator<Pessoa> iteratorPessoa = pessoas.iterator();
//		while (iteratorPessoa.hasNext()) {
//			Pessoa p = iteratorPessoa.next();
//			if (p.getId() == 1) {
////				pessoas.remove(p);
//				iteratorPessoa.remove();
//			}
//			System.out.println(p);
//		}
//		pessoas.removeIf(p -> p.getId() == 1);
//		System.out.println(pessoas);
				
		// For-each
//		System.out.println("For-each:");
//		for (Pessoa p : pessoas) {
//			System.out.println(p);
//		}
		
		System.out.println("FIM!");
	}

}
