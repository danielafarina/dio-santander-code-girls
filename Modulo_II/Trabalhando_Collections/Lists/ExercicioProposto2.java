import java.util.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class ExercicioProposto2 {

    public static void main(String[] args) {

        List<String> respostas = new ArrayList<>();
        
        Scanner scan = new Scanner(System.in);

        System.out.println("Telefonou para a vitima? (S/N)  ");
        String resposta = scan.next();
        respostas.add(resposta);

        System.out.println("Esteve no local do crime? (S/N)  ");
        resposta = scan.next();
        respostas.add(resposta);

        System.out.println("Mora perto da vitima? (S/N)  ");
        resposta = scan.next();
        respostas.add(resposta);

        System.out.println("Devia para a vitima? (S/N)  ");
        resposta = scan.next();
        respostas.add(resposta);

        System.out.println("Ja trabalhou com a vitima? (S/N)  ");
        resposta = scan.next();
        respostas.add(resposta);

        Iterator<String> iterator = respostas.iterator();
        int count = 0;
        while(iterator.hasNext()) {
            String next = iterator.next();
            System.out.println(next);
            if (next == "S") {
                count++;
            } 
        }

        System.out.println("count = " + count);

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
