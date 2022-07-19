import java.util.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class ExercicioProposto2 {

    public static void main(String[] args) {

        List<Integer> respostas = new ArrayList<>();
        
        Scanner scan = new Scanner(System.in);

        System.out.println("Telefonou para a vitima? (0 - Nao/1 - Sim)  ");
        int resposta = scan.nextInt();
        respostas.add(resposta);

        System.out.println("Esteve no local do crime? (0 - Nao/1 - Sim)  ");
        resposta = scan.nextInt();
        respostas.add(resposta);

        System.out.println("Mora perto da vitima? (0 - Nao/1 - Sim)  ");
        resposta = scan.nextInt();
        respostas.add(resposta);

        System.out.println("Devia para a vitima? (0 - Nao/1 - Sim)  ");
        resposta = scan.nextInt();
        respostas.add(resposta);

        System.out.println("Ja trabalhou com a vitima? (0 - Nao/1 - Sim)  ");
        resposta = scan.nextInt();
        respostas.add(resposta);

        Iterator<Integer> iterator = respostas.iterator();
        int count = 0;
        while(iterator.hasNext()) {
            Integer next = iterator.next();
            if (next == 1) {
                count++;
            } 
        }


        switch (count) {
            case 2:
                System.out.println("Suspeita");
                break;
            case 3:
            case 4:
                System.out.println("Cumplice");
                break;
            case 5:
                System.out.println("Assassina");
                break;
            default:
                System.out.println("Livre de suspeitas!");
                break;
        }


    }
    
}
