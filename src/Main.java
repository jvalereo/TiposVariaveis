import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		//Treinamento - Aula14, tipos primitivos, string,char,int, double
		//Jonas Valereo - T�cnico em Inform�tica
		
		//declarando as variaveis tipo string,char, int, double
		
		String x; 
		int y; 
		double j; 
		char v;
		
		
		//declarando criar o objeto do tipo scanner
		
		Scanner pri = new Scanner(System.in);
		
		x = pri.nextLine(); 
		y = pri.nextInt();
		j = pri.nextDouble();
		v = pri.next().charAt(0);
		
		
		//imprimir saida de dados no console, concatena��o
		
		System.out.println("Resposta = " + x);
		System.out.println("Respota = " + y);
		System.out.println("Resposta = " + j);
		System.out.println("Resposta = " + v);
		
		
		// saida do objeto Scanner
		
		pri.close();
		
		
		//saida da aplica��o
		
		System.exit(0);
		
		
		//fim do program

	}

}
