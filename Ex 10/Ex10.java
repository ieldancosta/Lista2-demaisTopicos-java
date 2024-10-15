/* | Ex 10 | Escreva um programa que calcule o fatorial de um número inteiro N fornecido pelo
usuário. Cuidado com valores inválidos! */


// Bibliotecas
import java.util.Scanner;

public class Ex10
{
	public static void main(String[] args)
	{
		// Instância
		Scanner sc = new Scanner(System.in);
		
		
		// Variáveis e arrays 
		int numero, fatorial;
		
		fatorial = 1;
		
		
		// Entradas
		System.out.print("Digite um número para obter o seu fatorial: ");
		numero = sc.nextInt();
		
		if (numero < 0)
		{
		    System.out.println("O número digitado é inválido. É permitido apenas números naturais (ℕ)");
		    System.exit(0);
		}
		else if (numero > 0)
		{
		    fatorial = numero;
		}
		
		
		// Processamento
		/* Escrita pt. 1*/
		System.out.print("\n!" + numero + " = ");
		
		/* Cálculo do Fatorial | Escrita pt. 2 */
		for (int x = numero; x > 1; x--)
		{
		    fatorial = fatorial * (x - 1);
		    System.out.print(x + " x ");
		}
		
		/* Escrita pt. 3 */
		if (numero == 0)
		{
		    /* Esse é o motivo pelo qual !0 é 1 */
		    System.out.print("!1 / 1 = " + fatorial);
		}
		else
		{
		    System.out.print("1 = " + fatorial);
		}
		
		
		// Saída
		System.out.println("\n\nNúmero: " + numero + "\nFatorial: " + fatorial);
		
		sc.close();
	}
}