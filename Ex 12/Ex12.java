/* | Ex 12 | Faça um programa que Leia o Nome e duas notas de uma pessoa e ao final, o programa
deve calcular a média aritmética entre as duas notas. O programa deve ser capaz de validar
se a nota informada é válida (0.0 ≤ nota ≤ 10), caso contrário o sistema deve informar ao
usuário o erro e pedir para ler novamente. Usar um laço Faça-Enquanto na leitura das
notas, e gerar uma saída conforme o exemplo de tela de saída abaixo: */


// Bibliotecas
import java.util.Scanner;

public class Ex12
{
	public static void main(String[] args)
	{
		// Instância
		Scanner sc = new Scanner(System.in);
		
		
		// Variáveis e arrays 
		String nome;
		double nota1, nota2;
		int continuar = 0;
		
		
		// Entradas
		do
		{
		    System.out.print("Digite o nome no aluno: ");
		    nome = sc.nextLine();
		   
		   
		    do  
		    {
		        System.out.print("Digite a sua primeira nota: ");
		        nota1 = sc.nextDouble();
		        
		        if (nota1 < 0 || nota1 > 10)
		            System.out.println("Nota 1 inválida, digite um número entre 0 e 10.\n");
		    }
		    while (nota1 < 0 || nota1 > 10);
		    
		    
		    do
		    {
		        System.out.print("Digite a sua segunda nota: ");
		        nota2 = sc.nextDouble();
		        
		        if (nota2 < 0 || nota2 > 10)
		            System.out.println("Nota 2 inválida, digite um número entre 0 e 10.\n");
		    }
		    while (nota2 < 0 || nota2 > 10);
		    
		    /* Limpar buffer */
		    sc.nextLine();
		    
		    double media = (nota1 + nota2) / 2;
		    
		   
		    System.out.println("\nO aluno " + nome + " tem uma média: " + media);
		    
		    
		    System.out.println("\nDeseja continuar?\n0 - Sim\n1 - Não");
		    continuar = sc.nextInt();
		    System.out.println("\n");
		    
		    /* Limpar buffer */
		    sc.nextLine();
		}
		while (continuar == 0);
		
		
		// Processamento
		
		
		// Saída
		
		sc.close();
	}
}