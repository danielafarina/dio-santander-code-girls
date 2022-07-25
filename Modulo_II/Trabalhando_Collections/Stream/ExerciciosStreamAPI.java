import java.util.*;
import java.util.function.Function;
import java.util.function.ToIntFunction;
import java.util.stream.Collectors;

import javax.sql.rowset.Predicate;

public class ExerciciosStreamAPI {
    public static void main(String[] args) {
        List<String> numerosAleatorios = Arrays.asList("1", "0", "4", "1", "2", "3", "9", "9", "6", "5");

// *****************************************************************************************        

        System.out.println("Imprima todos os elementos dessa lista de String: ");        
        // numerosAleatorios.stream().forEach(new Consumer<String>() {
        //     @Override
        //     // Utilizando o método accept, sem nenhum retorno (void)
        //     public void accept(String s) {
        //         System.out.println(s);

        //     }            
        // });

        // Utilizando lambda:
        // numerosAleatorios.stream().forEach(s -> System.out.println(s));
        // numerosAleatorios.forEach(s -> System.out.println(s));
        numerosAleatorios.forEach(System.out :: println);


// *****************************************************************************************        

        System.out.println("Pegue os 5 primeiros e coloque dentro de um Set: ");
        numerosAleatorios.stream()
                .limit(5)
                .collect(Collectors.toSet())
                .forEach(System.out::println);

// *****************************************************************************************        

        System.out.println("Transforme esta Lista de String em uma lista de numeros inteiros: ");
            //numerosAleatorios.stream() // Stream<String>
            //     // .map(s -> Integer.parseInt(s));
            //     .map(Integer :: parseInt) // Stream<Integer>
            //     .collect(Collectors.toList()) // List<Integer>
            //     .forEach(System.out :: println);

            // Ou, façamos assim:
        List<Integer> numerosAleatoriosInteger = numerosAleatorios.stream()
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        System.out.println(numerosAleatoriosInteger);

// *****************************************************************************************        

        System.out.println("Pegue os numeros pares e maiores que 2 e coloque em uma lista: ");
        // Essa forma aqui não rodou:
        // List<Integer> listParesMaioresQue2 = numerosAleatorios.stream()
        //     .map(Integer :: parseInt)
        //     .filter(new Predicate<Integer>() {
        //         @Override
        //         public boolean test(Integer i) {
        //             if (i % 2 == 0 && i > 2) return true;
        //             return false;
        //         }
        //     }).collect(Collectors.toList());
        // System.out.println(listParesMaioresQue2);

        // Outra forma:
        List<Integer> listParesMaioresQue2 = numerosAleatorios.stream()
            .map(Integer :: parseInt)
            .filter(i -> i % 2 == 0 && i > 2) 
            .collect(Collectors.toList());
        System.out.println(listParesMaioresQue2);
        
        
// *****************************************************************************************        

    System.out.println("Mostre a media dos numeros: ");
            numerosAleatorios.stream()
            .mapToInt(Integer :: parseInt)
            .average()
            .ifPresent(System.out :: println);

// *****************************************************************************************        

    System.out.println("Remova os valores impares: ");
    numerosAleatoriosInteger.removeIf(i -> i % 2 != 0);
    System.out.println(numerosAleatoriosInteger);



// *****************************************************************************************        




    }
}
