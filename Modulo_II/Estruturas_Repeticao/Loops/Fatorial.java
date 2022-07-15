import java.util.Scanner;

public class Fatorial {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Deseja ver fatorial de qual numero? ");
        int numero = scan.nextInt();
        int resultado = 1;

        while (numero!= 1) {
            resultado *= numero;
            numero--;
        };

        System.out.println("Fatorial: " + resultado);
    }
}