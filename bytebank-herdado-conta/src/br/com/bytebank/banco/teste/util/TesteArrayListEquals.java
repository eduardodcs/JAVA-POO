package br.com.bytebank.banco.teste.util;

import java.util.ArrayList;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;

public class TesteArrayListEquals {

	public static void main(String[] args) {

//		Conta cc1 = new ContaCorrente(22, 33);
//		Conta cc2 = new ContaCorrente(22, 33);
//		
//		boolean igual = cc1.ehIgual(cc2);
//		System.out.println(igual);
		
		
		ArrayList<Conta> lista = new ArrayList<Conta>();
		
		Conta cc = new ContaCorrente(22, 54326);
		lista.add(cc);
		
		Conta cc2 = new ContaCorrente(22, 54326);
		lista.add(cc2);
		
		Conta cp = new ContaPoupanca(25, 67546);
		lista.add(cp);
		
		boolean existe = lista.contains(cc);
		
		System.out.println("Já existe? " + existe);
		

		
		for(Object o : lista) {
			System.out.println(o);
		}
		

	}

}
