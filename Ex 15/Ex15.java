/* | Ex 15 | Escreva um programa que apresente quatro opções: (a) consulta saldo, (b) saque e
(c)depósito e (d) sair. O saldo deve iniciar em R$ 0,00. A cada saque ou depósito o valor
do saldo deve ser atualizado.
Exemplo: */


// Bibliotecas
import java.util.Scanner;

public class Ex15
{
	public static void main(String[] args)
	{
		// Instância
		Scanner sc = new Scanner(System.in);
		
		
		// Variáveis e arrays 
		char alternativa;
		double saldo, valor;
		
		saldo = 0;
		
		
		// Entradas
		do
		{
		    System.out.print("Opções:\n(a) Consulta rápida\n(b) Saque\n(c) Depósito\n> ");
		    alternativa = sc.next().charAt(0);
		    
		    switch (alternativa)
		    {
		        case 'a':
		            System.out.println("\nSaldo: " + saldo);
		            break;
		        case 'b':
		            do
		            {
		                do
		                {
		                    System.out.print("\nValor (ou 0 para cancelar): ");
		                    valor = sc.nextDouble();
		                    
		                    if (valor < 0)
		                        System.out.println("Digite um valor válido positivo! Insira novamente.\n");
		                }
		                while (valor < 0);
		                
		                if (saldo - valor < 0)
		                    System.out.println("O valor digitado é superior ao do seu saldo, por favor, digite novamente.");
		                else
		                    System.out.println("Saque concluído com sucesso.\n");
		            }
		            while (saldo - valor < 0);
		            saldo = saldo - valor;
		            break;
		        case 'c':
		            do
		            {
		                System.out.print("\nValor (ou 0 para cancelar): ");
		                valor = sc.nextDouble();
		                
		                if (valor < 0)
		                    System.out.println("Digite um valor válido positivo! Insira novamente.");
		            }
		            while (valor < 0);
		            saldo = saldo + valor;
		            System.out.println("Depósito concluído com sucesso.\n");
		            break;
		    }
		    System.out.print("\n");
		}
		while (true);
		
		
		// Processamento
		
		
		// Saída
		
		/* sc.close(); */
	}
}