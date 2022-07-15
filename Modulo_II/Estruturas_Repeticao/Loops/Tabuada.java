import java.util.Scanner;

public class Tabuada {
    public static void main(String[ ] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Deseja ver a tabuada de qual numero? ");
        int numero = scan.nextInt();    
        int resultado; 
        
        for (int i = 0; i < 10; i++){
            resultado = numero * (i+1);
            System.out.println(numero + " X " + (i + 1) + " = " + resultado);

        }

    }
    
}
