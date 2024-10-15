/* | Ex 9 | Escreva um programa que receba dois números x e y e calcule x elevado a y. Sem utilizar a biblioteca Math. */


// Bibliotecas
import java.util.Scanner;

public class Ex9
{
	public static void main(String[] args)
	{
		// Instância
		Scanner sc = new Scanner(System.in);
		
		
		// Variáveis e arrays 
		int x, y, z, resultado;
		
		resultado = 1;
		
		// Entradas
		System.out.print("Digite um valor para x: ");
		x = sc.nextInt();
		
		System.out.print("Digite um valor para y: ");
		y = sc.nextInt();
		
		
		// Processamento
		for (z = 0; z < y; z++)
		{
		    resultado = resultado * x;
		}
		
		// Saída
		System.out.println("\nx: " + x + "\ny: " + y + "\nresultado: " + resultado);
		
		sc.close();
	}
}