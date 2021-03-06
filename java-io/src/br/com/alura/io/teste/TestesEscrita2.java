package br.com.alura.io.teste;

import java.io.File;
import java.util.Locale;
import java.util.Scanner;

public class TestesEscrita2 {

	public static void main(String[] args) throws Exception {
		
		Scanner scanner = new Scanner(new File("contas.csv"), "UTF-8");

		while(scanner.hasNextLine()) {
			String linha = scanner.nextLine();
			//System.out.println(linha);
					
			Scanner linhasScanner = new Scanner(linha);
			linhasScanner.useLocale(Locale.US);
			linhasScanner.useDelimiter(";");
			
			String tipoConta = linhasScanner.next();
			int agencia = linhasScanner.nextInt();
			int numero = linhasScanner.nextInt();
			String titular = linhasScanner.next();
			double saldo = linhasScanner.nextDouble();
			
			String valorFormatado = String.format(new Locale("pt", "BR"),
					"%s - %04d-%06d - %20s %8.2f",
					tipoConta, agencia, numero, titular, saldo);
			
			System.out.println(valorFormatado);
			
//			String[] valores = linha.split(",");
//			System.out.println(Arrays.toString(valores));
			
			linhasScanner.close();
		}
	
		scanner.close();
		
	}

}
