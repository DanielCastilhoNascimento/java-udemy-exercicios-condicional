import java.util.Scanner;

public class exercicio01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um numero inteiro : ");
        int numero = scanner.nextInt();
        if(numero < 0){
            System.out.println("Negativo");
        } else {
            System.out.println("Não negativo");
        }
        scanner.close();
    }
}
