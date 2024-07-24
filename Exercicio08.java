import java.util.Locale;
import java.util.Scanner;

/* Leia um valor com duas casas decimais, equivalente ao salário. 
 * Em seguida, calcule e mostre o valor que esta pessoa deve pagar de Imposto 
 * de Renda, segundo a tabela abaixo
 * 
 * RENDA            Imposto
 * 0 - 2000         Isento
 * 2000.01 - 3000      8%
 * 3000.01 - 4500     18%
 * acima              28%
 * 
 * Em um salário for R$ 3002.00, a taxa que incide é de 8% sobre R$ 1000.00, 
 * pois a faixa de salário que fica de R$ 0.00 até R$ 2000.00 é isenta de Imposto. 
 * No exemplo fornecido (abaixo), a taxa é de 8% sobre R$ 1000.00 + 18% sobre R$ 2.00, 
 * o que resulta em R$ 80.36 no total. O valor deve ser impresso com duas casas decimais
 * 
 */

public class Exercicio08 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
    
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o salário: ");
        double salario = scanner.nextDouble();

        if(salario <= 2000){
            System.out.println("Isento");
        }else if(salario <= 3000){
            System.out.printf("Imposto: %.2f", (salario - 2000) * 0.08);
        }else if(salario <= 4500){
            System.out.printf("Imposto: %.2f", (salario - 3000) * 0.18 + 1000.0 * 0.08);
        }else {
            System.out.printf("Imposto: %.2f", (salario - 4500) * 0.28 + 1500.0 * 0.18 + 1000.0 * 0.08);
        }

        scanner.close();
    }

}
