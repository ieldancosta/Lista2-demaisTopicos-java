/* Ex 1 | Crie um programa para determinar se um número inteiro A é divisível por outro número
B. Os valores devem ser fornecidos pelo usuário. */


// Bibliotecas
import java.util.Scanner;

public class Ex1
{
	public static void main(String[] args)
	{
	    // Instância
	    Scanner sc = new Scanner(System.in);
    	
    	
    	// Variáveis e arrays
    	
    	
    	// Entrada
    	System.out.print("Digite um número A: ");
    	int numeroA = sc.nextInt();
    	
    	System.out.print("Digite um número B: ");
    	int numeroB = sc.nextInt();
    	
    	
    	// Processamento
    	
    	
    	// Saída
    	if (numeroA % numeroB == 0)
    	{
    	    System.out.println("\nO número " + numeroA + " é divisível por " + numeroB);
    	}
    	else
    	{
    	    System.out.println("\nO número " + numeroA + " não é divisível por " + numeroB);    
    	}
	    
    	sc.close();
	}
}
