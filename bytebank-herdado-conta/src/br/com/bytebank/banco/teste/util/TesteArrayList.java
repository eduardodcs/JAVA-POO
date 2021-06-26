package br.com.bytebank.banco.teste.util;

import java.util.ArrayList;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;

public class TesteArrayList {

	public static void main(String[] args) {
		ArrayList<Conta> lista = new ArrayList<Conta>();
		
		Conta cc = new ContaCorrente(22, 54326);
		Conta cp = new ContaPoupanca(25, 67546);
		
		lista.add(cc);
		lista.add(cp);
		
		System.out.println("Tamanho: " + lista.size());
		
		System.out.println(lista.get(0));
		Conta ref = (Conta) lista.get(0);
		ref.deposita(500);
		System.out.println(ref.getSaldo());
		
		System.out.println("Tamanho: " + lista.size());
		
		Conta ref2 = (Conta) lista.get(0);
		ref2.deposita(500);
		System.out.println(ref2.getSaldo());
		
		
		for(int a = 0; a < lista.size(); a++) {
			Conta oRef = (Conta) lista.get(a);
			System.out.println("Número Conta: " + oRef.getNumero());
		}
		
		System.out.println("-------------");
		
		for(Object o : lista) {
			System.out.println(o);
		}
		

	}

}
