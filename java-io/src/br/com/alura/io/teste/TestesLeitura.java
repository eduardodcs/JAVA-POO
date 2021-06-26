package br.com.alura.io.teste;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;

public class TestesLeitura {

	public static void main(String[] args) throws IOException {


		//FLuxo de saida com arquivo
		OutputStream fos = new FileOutputStream("lorem2.txt");
		Writer osw = new OutputStreamWriter(fos);
		BufferedWriter bw = new BufferedWriter(osw);
		
		bw.write("Este é um novo arquivo gerado");
		bw.newLine();
		bw.newLine();
		bw.write("Uma nova linha do texto.");
		

		
		bw.close();
		
	}

}
