/* | Ex 6 | Escreva um algoritmo que leia o código de um determinado produto e mostre a sua
classificação de acordo com a tabela apresentada a seguir: ... */


// Bibliotecas
import java.util.Scanner;

public class Ex6
{
	public static void main(String[] args)
	{
		// Instância
		Scanner sc = new Scanner(System.in);
		
		
		// Variáveis e arrays 
		int codigo;
		String classificacao;
		
		
		// Entradas
		System.out.print("Digite o código do produto: ");
		codigo = sc.nextInt();
		
		
		// Processamento
	    switch (codigo)
	    {
		    case 1:
		        classificacao = "Alimento não-perecível";
		        break;
		    case 2:
		    case 3:
		    case 4:
		        classificacao = "Alimento perecível";
		        break;
		    case 5:
		    case 6:
		        classificacao = "Vestuário";
		        break;
		    case 7:
		        classificacao = "Higiene pessoal";
		        break;
		    case 8:
		    case 9:
		    case 10:
		    case 11:
		    case 12:
		    case 13:
		    case 14:
		    case 15:
		        classificacao = "Limpeza e utensílios domésticos";
		        break;
		    default:
		        classificacao = "Inválido";
	    }
	    
	    /* Nota: Tem como fazer de outras formas também; vou deixar abaixo o primeiro jeito que eu fiz (e abandonei pra você não ter que ler tudo em uma linha só) */
	    /* classificacao = codigo == 1 ? "Alimento não-perecível" : codigo >= 2 && codigo <= 4 ? "Alimento perecível" : codigo == 5 || codigo == 6 ? "Vestuário" : codigo == 7 ? "Higiene pessoal" : codigo >= 8 && codigo <= 15 ? "Limpeza e utensílios domésticos" : "Inválido"; */ 
		
		
		// Saída
		System.out.println("\nCódigo digitado: " + codigo + "\nClassificação: " + classificacao);
		
		sc.close();
	}
}