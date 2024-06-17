package aplicacao;

import dominio.Pessoa;

public class Programa {

	public static void main(String[] args) {
		
		Pessoa ps = new Pessoa(1, "Bruno", "bruno@gmail.com");
		Pessoa ps2 = new Pessoa(2, "Roberto", "roberto@gmail.com");
		Pessoa ps3 = new Pessoa(3, "Laura", "laura@gmail.com");
		System.out.println(ps);
		System.out.println(ps2);
		System.out.println(ps3);

	}

}
