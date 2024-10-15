/* | Ex 14 | Faça um programa que receba 2 notas (valide as notas, onde 0.0 ≤ nota ≤ 10) de um
número indeterminado de alunos. Calcule e mostre:
a. A média aritmética das 2 notas lidas;
b. Uma mensagem de acordo com as regras: Até 3 (Reprovado); Entre 3 e 7
(Exame); de 7 para cima (Aprovado);
c. O total de alunos;
d. Quantidade de alunos Aprovados, Reprovados e de Exame.
e. A Média da classe.
f. O nome e a média dos Alunos com a maior e menor média da classe. */


// Bibliotecas
import java.util.Scanner;

public class Ex14
{
	public static void main(String[] args)
	{
		// Instância
		Scanner sc = new Scanner(System.in);
		
		
		// Variáveis e arrays 
		double nota1, nota2, media, mediaTotal, mediaMaior, mediaMenor;
		int quantidadeAlunos, quantidadeAprovado, quantidadeExame, quantidadeReprovado, continuar;
		String condicao, nome, nomeMaiorMedia, nomeMenorMedia;
		
		nota1 = 0;
		nota2 = 0;
		media = 0;
		mediaTotal = 0;
		quantidadeAlunos = 0;
		quantidadeAprovado = 0;
		quantidadeExame = 0;
		quantidadeReprovado = 0;
		mediaMaior = 0;
		mediaMenor = 11;
		nomeMaiorMedia = null;
		nomeMenorMedia = null;
		
		
		continuar = 0;
		
		/* mediaTotal = (mediaTotal + media + media + ...) / quantidadeAlunos */
		
		
		// Entradas
		do
		{
		    System.out.print("Nome do aluno: ");
		    nome = sc.nextLine();
		    
		    do
		    {
		        System.out.print("Nota N1: ");
		        nota1 = sc.nextDouble();
		        
		        if (nota1 < 0 || nota1 > 10)
		            System.out.println("Digite uma nota válida! Insira novamente. \n");
		        
		    }
		    while (nota1 < 0 || nota1 > 10);
		    
		    
		    do
		    {
		        System.out.print("Nota N2: ");
		        nota2 = sc.nextDouble();
		        
		        if (nota2 < 0 || nota2 > 10)
		            System.out.println("Digite uma nota válida! Insira novamente. \n");
		        
		    }
		    while (nota2 < 0 || nota2 > 10);
		    
		    /* Limpar buffer */
		    sc.nextLine();
		    
		    
		    media = (nota1 + nota2) / 2;
		    mediaTotal = mediaTotal + media;
		    
		    
		    if (media < mediaMenor)
		    {
		        mediaMenor = media;
		        nomeMenorMedia = nome;
		    }
		    
		    if (media > mediaMaior)
		    {
		        mediaMaior = media;
		        nomeMaiorMedia = nome;
		    }
		    
		    
		    quantidadeAlunos++;
		    
		    
		    if (media <= 3)
		    {
		        condicao = "Reprovado";
		        quantidadeReprovado++;
		    }
		    else if (media < 7)
		    {
		        condicao = "Exame";
		        quantidadeExame++;
		    }
		    else
		    {
		        condicao = "Aprovado";
		        quantidadeAprovado++;
		    }
		    
		    
		    System.out.println("\nNome do aluno: " + nome + "\nMédia aritmética: " + String.format("%.2f", media));
		    System.out.println("Condição: " + condicao);
		    
		    
		    System.out.println("\nDeseja continuar ou encerrar o programa?\n0 - Continuar\n1 - Encerrar");
		    continuar = sc.nextInt();
		    
		    System.out.print("\n");
		    
		    /* Limpar buffer */
		    sc.nextLine();
		}
		while (continuar == 0);
		
		
		mediaTotal = mediaTotal / quantidadeAlunos;
		
		
		System.out.println("A quantidade total de alunos é: " + quantidadeAlunos);
		System.out.println("A média da classe é: " + String.format("%.2f", mediaTotal));
		System.out.println("Quantidade de alunos reprovados: " + quantidadeReprovado);
		System.out.println("Quantidade de alunos para o exame: " + quantidadeExame);
		System.out.println("Quantidade de alunos aprovados: " + quantidadeAprovado);
		
		System.out.println("\nNome do aluno com a maior média: " + nomeMaiorMedia);
		System.out.println("Média do aluno com a maior média: " + mediaMaior);
		System.out.println("Nome do aluno com a menor média: " + nomeMenorMedia);
		System.out.println("Média do aluno com a menor média: " + mediaMenor);
		
		
		// Processamento
		
		
		// Saída
		
		sc.close();
	}
}