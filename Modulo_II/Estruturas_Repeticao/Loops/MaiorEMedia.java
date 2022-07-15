import java.util.Scanner;

public class MaiorEMedia {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numero;
        int count = 0; 
        int maior = 0;
        int soma = 0;   
        float media;    

        do {
            System.out.println("Numero: ");
            numero = scan.nextInt();
            count++;
            soma += numero;
            if (numero > maior) maior = numero;            
        } while(count < 5);

        media = soma / 5;

        System.out.println("Maior: " + maior);
        System.out.println("Media: " + media);
        
    }
}
