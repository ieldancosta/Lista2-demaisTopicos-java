/* | Ex 13 | 13. Faça um programa que leia uma senha (número inteiro). Em seguida, pergunte ao usuário
a senha informada, caso a senha esteja errada imprima “Senha incorreta, tente
novamente” e leia novamente a senha. Caso o usuário digite a senha correta, imprima
“Senha correta! Bem-vindo ao sistema”. */


// Bibliotecas
import java.util.Scanner;

public class Ex13
{
	public static void main(String[] args)
	{
		// Instância
		Scanner sc = new Scanner(System.in);
		
		
		// Variáveis e arrays 
		int senha, tentativa;
		
		
		// Entradas
		System.out.print("Crie uma senha de segurança: ");
		senha = sc.nextInt();
		
		
		// Processamento
		do
		{
		    System.out.print("Digite a senha para entrar: ");
		    tentativa = sc.nextInt();
		    
		    if (tentativa == senha)
		        System.out.println("Senha correta! Bem-vindo ao sistema!\n");
		    else
		        System.out.println("Senha incorreta, tente novamente!\n");
		}
		while (tentativa != senha);
		
		
		// Saída
		
		sc.close();
	}
}