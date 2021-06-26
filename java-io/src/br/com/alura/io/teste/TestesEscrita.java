package br.com.alura.io.teste;

import java.io.IOException;
import java.io.PrintStream;

public class TestesEscrita {

	public static void main(String[] args) throws IOException {

		//BufferedWriter bw = new BufferedWriter(new FileWriter("Lorem2.txt"));
		
		PrintStream ps = new PrintStream("Lorem2.txt");
		
		ps.println("fsdfsd, fds fsdfdsfdfsd23  23432 4543 5345 43");
		ps.println();
		ps.println("fdsf 2r 2d f23 rrwd 2 rfdsfds fds 2 ");
		
		
		ps.close();
		
	}

}
