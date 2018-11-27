package br.com.treinaweb.java.collections;

import java.util.HashSet;
import java.util.Set;

import br.com.treinaweb.java.collections.models.Pessoa;

public class MainSet {

	public static void main(String[] args) {
		Set<Pessoa> set = new HashSet<Pessoa>();
		set.add(new Pessoa(1, "TreinaWeb 1"));
		set.add(new Pessoa(2, "TreinaWeb 2"));
		System.out.println(set);
		set.add(new Pessoa(2, "TreinaWeb 2"));
		System.out.println(set);
		// ********
		//| Chave | Valor                       |
		//---------------------------------------
		//| 123   | new Pessoa(1, "TreinaWeb 1")|
	}

}
