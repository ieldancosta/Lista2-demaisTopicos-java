/* Ex 4 | Desenvolver um programa que calcule o salário bruto e o salário líquido de um funcionário.
• Dados de Entrada: Matrícula do funcionário (int); Quantidade de horas-extras
trabalhadas.
• Constantes: Salário Mínimo = R$ 788.00; Valor da Hora-Extra = R$ 10.00.
Sabe-se:
• Salário hora-extra = horas-extras * Valor da Hora-Extra;
• Salário bruto = 3 * Salário Mínimo + Salário hora-extra;
• Desconto INSS = 12 % do salário bruto, se salário bruto for maior que R$
1500,00;
• Desconto do Imposto de Renda = 20 % do Salário Bruto, se o mesmo for
maior que R$ 2000,00; • Salário líquido = salário bruto – deduções. */


// Bibliotecas
import java.util.Scanner;

public class Ex4
{
	public static void main(String[] args)
	{
	    // Instância de uma classe
	    Scanner sc = new Scanner(System.in);
	    
	    
	    // Variáveis e arrays
	    double salarioMinimo = 788.0;
	    double valorHoraExtra = 10.0;
	    
	    
	    // Entrada
	    System.out.print("Digite a sua matrícula: ");
	    int matricula = sc.nextInt();
	    
	    System.out.print("Digite quantas horas extras você trabalhou: ");
	    double horasExtrasTrabalhadas = sc.nextInt();
	    
	    
	    // Processamento
	    /* Salário de Horas Extras */
	    double salarioHoraExtra = horasExtrasTrabalhadas * valorHoraExtra;
	    
	    /* Salário Bruto */
	    double salarioBruto = 3.0 * salarioMinimo + salarioHoraExtra;
	    
	    /* Salário Líquido */
	    double salarioLiquido = salarioBruto - ((salarioBruto / 100 * 12 /* INSS */) + (salarioBruto / 100 * 20 /* Imposto de Renda */));
	    /* Nota: Todo salário bruto vai dar acima de R$2000, logo todos os descontos são aplicados */
	    
	    
	    // Saída
	    System.out.println("\nMatrícula: " + matricula + "\nSalário de horas extras: R$" + String.format("%.2f", salarioHoraExtra));
	    System.out.println("Salário Bruto: R$" + String.format("%.2f", salarioBruto) + "\nSalário Líquido: R$" + String.format("%.2f", salarioLiquido));
	    
	    sc.close();
	}
}
