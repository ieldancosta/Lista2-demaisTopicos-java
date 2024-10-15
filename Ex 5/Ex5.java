/* | Ex 5 | Escrever um programa que leia o número de identificação, as 3 notas obtidas por um
aluno nas 3 verificações e a média dos exercícios que fazem parte da avaliação. Valide
para que todas as entradas sejam 0 ≤ nota ≤ 10. Calcule a média de aproveitamento do
aluno, usando a fórmula: ... */


// Bibliotecas
import java.util.Scanner;

public class Ex5
{
	public static void main(String[] args)
	{
		// Instância
		Scanner sc = new Scanner(System.in);
		
		
		// Variáveis e arrays
		int identificacao;
		double nota1, nota2, nota3, mediaExercicios, media;
		char conceito;
		String mensagem;
		
		
		// Entradas
		System.out.print("Digite a sua identificação: ");
		identificacao = sc.nextInt();
		
		do
		{
		    System.out.print("\nDigite a sua primeira nota: ");
		    nota1 = sc.nextDouble();
		    
		    if (nota1 <= 0 || nota1 >= 11)
		    {
		        System.out.println("Por favor, digite um valor válido.\n");
		    }
		}
		while (nota1 <= 0 || nota1 >= 11);
		
		do
		{
		    System.out.print("Digite a sua segunda nota: ");
		    nota2 = sc.nextDouble();
		    
		    if (nota2 <= 0 || nota2 >= 11)
		    {
		        System.out.println("Por favor, digite um valor válido.\n");
		    }
		}
		while (nota2 <= 0 || nota2 >= 11);
		
		do
		{
		    System.out.print("Digite a sua terceira nota: ");
		    nota3 = sc.nextDouble();
		    
		    if (nota3 <= 0 || nota3 >= 11)
		    {
		        System.out.println("Por favor, digite um valor válido.\n");
		    }
		}
		while (nota3 <= 0 || nota3 >= 11);
		
		do
		{
		    System.out.print("\nDigite a sua média dos exercícios: ");
		    mediaExercicios = sc.nextDouble();
		    
		    if (mediaExercicios <= 0 || mediaExercicios >= 11)
		    {
		        System.out.println("Por favor, digite um valor válido.");
		    }
		}
		while (mediaExercicios <= 0 || mediaExercicios >= 11);
		
		
		// Processamento
		media = (nota1 + nota2 * 2 + nota3 * 3 + mediaExercicios) / 7;
		conceito = media < 4 ? 'E' : media < 6 ? 'D' : media < 7.5 ? 'C' : media < 9 ? 'B' : 'A';
		mensagem = conceito == 'A' || conceito == 'B' || conceito == 'C' ? "APROVADO" : "REPROVADO";
		/* Nota: Daria pra fazer a mensagem baseado nas notas também. */
		/* APROVADO | media >= 6 e <= 10 | A B C */
		/* REPROVADO | media < 6 | D E */
		
		
		// Saída
		System.out.println("\nIdentificação: " + identificacao + "\nNota 1: " + nota1 + "\nNota 2: " + nota2 + "\nNota 3: " + nota3);
		System.out.println("Média dos exercícios: " + mediaExercicios + "\nMédia Total: " + String.format("%.1f", media));
		System.out.println("\nConceito: " + conceito + "\nMensagem: " + mensagem);
		
		sc.close();
	}
}