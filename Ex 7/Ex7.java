/* | Ex 7 | Faça um algoritmo que receba o salário e um código correspondente ao cargo de um
funcionário e imprima seu cargo, o salário, e o valor do aumento segundo o percentual de
aumento ao qual este funcionário tem direito segundo a tabela a seguir e o valor do
aumento baseado no salário. Ao final, mostre o salário com o aumento. */


// Bibliotecas
import java.util.Scanner;

public class Ex7
{
	public static void main(String[] args)
	{
		// Instância
		Scanner sc = new Scanner(System.in);
		
		
		// Variáveis e arrays 
		int codigo;
		double salario, aumento;
		String cargo;
		
		aumento = 0;
		
		
		// Entradas
		System.out.print("Digite o seu código: ");
		codigo = sc.nextInt();
		
		System.out.print("Digite o seu salário: ");
		salario = sc.nextDouble();
		
		
		// Processamento
    	switch (codigo)
    	{
    	    case 1:
    	        cargo = "Escriturário";
    	        aumento = salario / 100.0 * 50.0;
    	        break;
	        case 2:
	            cargo = "Secretário";
	            aumento = salario / 100.0 * 35.0;
	            break;
	        case 3:
	            cargo = "Caixa";
	            aumento = salario / 100.0 * 20.0;
	            break;
	        case 4:
	            cargo = "Gerente";
	            aumento = salario / 100.0 * 10.0;
	            break;
	        case 5:
	            cargo = "Diretor";
	            aumento = 0.0;
	            break;
	        default:
	            System.out.println("O código digitado não é válido. Nenhum aumento foi concedido.");
	            cargo = "Inválido";
	   }


		// Saída
		System.out.println("\nCódigo: " + codigo + "\nCargo: " + cargo + "\nSalário: R$" + String.format("%.2f", salario));
		System.out.println("Aumento: R$" + String.format("%.2f", aumento) + "\nSalário com aumento: R$" + String.format("%.2f", salario + aumento));
		
		sc.close();
	}
}