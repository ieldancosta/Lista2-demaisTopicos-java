/* Ex 2 | Crie um algoritmo que peça a idade do eleitor e o mesmo informe se o eleitor é facultativo
(entre 16 e 17 anos) ou obrigatório (entre 18 a 65) ou dispensado (acima de 65). */


// Bibliotecas
import java.util.Scanner;

public class Ex2
{
	public static void main(String[] args)
	{
	    // Instância
    	Scanner sc = new Scanner(System.in);
    	
    	
    	// Variáveis e arrays
    	String condition;
    	
    	
    	// Entrada
    	System.out.print("Digite a sua idade: ");
    	int idade = sc.nextInt();
    	
    	
    	// Processamento
    	/*if (idade < 16)
    	{
    	    condition = "Não tem a idade mínima"
    	}
    	else if (idade <= 17)
    	{
    	    condition = "Facultativo"
    	}
    	else if (idade <=)*/
    	
    	/* Operador Ternário */
    	condition = idade < 16 ? "Não tem a idade mínima" : idade <= 17 ? "Facultativo" : idade <= 65 ? "Obrigatório" : "Dispensado";
	    
	    
    	// Saída
    	System.out.println("\nA sua condição é: " + condition);
    	
    	sc.close();
	}
}
