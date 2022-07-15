import java.util.Scanner;

public class ParEImpar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite a quantidade de numeros: ");
        int N = scan.nextInt();

        int numero;
        int pares = 0;
        int impares = 0;
        int count = 0;

        do {
            System.out.println("Numero: ");
            numero = scan.nextInt();
            count++;
            if (numero%2 == 0) pares++;
            else impares++; 
        } while (count < N);

        System.out.println("Quantidade de pares: " + pares);
        System.out.println("Quantidade de impares: " + impares);

        
    }
}
