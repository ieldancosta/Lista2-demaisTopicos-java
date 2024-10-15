/* Ex 3 | Escreva um programa que leia o valor da compra e imprima o valor da venda de acordo com a
tabela a seguir. Cuidado com valor inválido de compra: */


// Bibliotecas
import java.util.Scanner;

public class Ex3
{
	public static void main(String[] args)
	{
	    // Instância
	    Scanner sc = new Scanner(System.in);
    	
    	
    	// Variáveis e arrays
    	double valorCompra, valorVenda;
    	
    	
    	// Entrada
    	System.out.print("Digite o valor de compra: ");
    	valorCompra = sc.nextDouble();
    	
    	
    	// Processamento
    	if (valorCompra < 10.0)
    	{
    	    valorVenda = valorCompra * (170.0 / 100.0);
    	}
    	else if (valorCompra <= 30.0)
    	{
    	    valorVenda = valorCompra * (150.0 / 100.0);
    	}
    	else if (valorCompra <= 50.0)
    	{
    	    valorVenda = valorCompra * (140.0 / 100.0);
    	}
    	else
    	{
    	    valorVenda = valorCompra * (130.0 / 100.0);
    	}
    	
    	
    	// Saída
    	System.out.println("\nValor de Compra: " + valorCompra + "\nValor de Venda: " + valorVenda);
    	
    	sc.close();
	}
}
