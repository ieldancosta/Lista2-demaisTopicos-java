/* | Ex 11 | Escrever um programa que calcule todos os números inteiros divisíveis por um certo valor
indicado pelo usuário, e compreendidos em um intervalo também especificado pelo
usuário. O usuário deve entrar com um primeiro valor correspondente ao divisor e após
ele vai fornecer o valor inicial do intervalo, seguido do valor final deste intervalo.
Exemplo: Valor do divisor: 3;
Inicio do Intervalo: 17;
Fim do Intervalo: 29;
Saída-> Números divisíveis por 3 no intervalo de 17 a 29: 18, 21, 24, 27. */


// Bibliotecas
import java.util.Scanner;

public class Ex11
{
	public static void main(String[] args)
	{
		// Instância
		Scanner sc = new Scanner(System.in);
		
		
		// Variáveis e arrays 
		int divisor, inicioIntervalo, fimIntervalo;
		
		
		// Entradas
		System.out.print("Valor do divisor: ");
		divisor = sc.nextInt();
		
		System.out.print("Início do intervalo: ");
		inicioIntervalo = sc.nextInt();
		
		System.out.print("Fim do intervalo: ");
		fimIntervalo = sc.nextInt();
		
		
		// Processamento
		/* Escrita pt. 1 */
		System.out.print("\nNúmeros divísiveis por " + divisor + " no intervalo de " + inicioIntervalo + " a " + fimIntervalo + ": ");
		
		/* Verificando quais números do intervalo são divisíveis por divisor | Escrita pt. 2 */
		for (int x = inicioIntervalo; x <= fimIntervalo; x++)
		{
		    if (x % divisor == 0)
		    {
		        System.out.print(x + " ");
		    }
		}
		
		
		// Saída
		/* A saída ficou desenvolvida na parte de Processamento */
		System.out.print("\n");
		
		sc.close();
	}
}