/* | Ex 8 | Faça um programa que leia um código, x e y e calcule f(x,y) de acordo com as equações
abaixo: ... */


// Bibliotecas
import java.util.Scanner;

public class Ex8
{
	public static void main(String[] args)
	{
		// Instância
		Scanner sc = new Scanner(System.in);
		
		
		// Variáveis e arrays 
		int codigo;
		double x, y, equacao;
		
		// Entradas
		System.out.print("Digite o código: ");
		codigo = sc.nextInt();
		
		System.out.print("Digite um valor para x: ");
		x = sc.nextDouble();
		
		System.out.print("Digite um valor para y: ");
		y = sc.nextDouble();
		
		
		// Processamento
		switch (codigo)
		{
		    case 1:
		        equacao = Math.sqrt(Math.pow(x, 3) + (x * (2.0 * y - x)) / Math.pow(y, 2));
		        break;
		    case 2:
		        equacao = Math.sqrt((Math.pow(x, 3) + Math.pow(y, 3)) + (Math.pow(x, 3) - Math.pow(y, 3))) / x * y;
		        break;
		    case 3:
		        equacao = 2 * x + Math.sqrt(x * y);
		        break;
		    case 4:
		        equacao = Math.sin(x) + Math.cos(y);
		        break;
		    default:
		        System.out.println("O código digitado é inválido, nenhuma operação será feita.");
		        equacao = 0.0;
		}
		
		
		// Saída
		System.out.println("\nCódigo: " + codigo + "\nx = " + x + "\ny = " + y);
		System.out.println("f(x, y) = " + String.format("%.1f", equacao));
		
		sc.close();
	}
}