import java.util.Scanner;

public class exercicio02 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um numero inteiro : ");
        int numero = scanner.nextInt();
        numero %= 2;

        if(numero == 0){
            System.out.println("PAR");
        }else{
            System.out.println("IMPAR");
        }
        scanner.close();
    }
}
