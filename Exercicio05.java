import java.util.Scanner;

public class Exercicio05 {
public static void main(String[] args) {
    
Scanner scanner = new Scanner(System.in);
System.out.println("Digite o código do lanche e a quantidade: ");
System.out.println("1 - Cachorro quente - R$ 4,00");
System.out.println("2 - X-salada        - R$ 4,50");
System.out.println("3 - X-bacon         - R$ 5,00");
System.out.println("4 - Torrada Simples - R$ 2,00");
System.out.println("5 - Refrigerante    - R$ 1,50");

int lanche = scanner.nextInt();
int qtde = scanner.nextInt();
double total = 0;

if(lanche == 1){
    total = qtde * 4;
} else if(lanche == 2){
    total = qtde * 4.5;
} else if(lanche == 3){
    total = qtde * 5;
} else if(lanche == 4){
    total = qtde * 2;
} else if(lanche == 5){
    total = qtde * 1.5;
} 

System.out.println("Total: " + total);

scanner.close();
}





}
