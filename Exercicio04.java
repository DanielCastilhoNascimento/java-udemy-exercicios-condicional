import java.util.Scanner;

public class Exercicio04 {
    /*
     * Leia a hora inicial e a hora final de um jogo. A seguir
     * calcule a duração do jogo, sabendo que o mesmo pode começar
     * em um dia e terminar em outro, tendo uma duração mínima de 
     * 1 hora e máxima de 24 horas
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite a hora inicial e final (em inteiros):");
        int horaInicial = scanner.nextInt();
        int horaFinal = scanner.nextInt();

        if(horaInicial < horaFinal){
            System.out.printf("O jogo durou %d horas", (horaFinal - horaInicial));
        } else {
            System.out.printf("O jogo durou %d horas", (24 - horaInicial + horaFinal));
        }


        scanner.close();
    }

}
