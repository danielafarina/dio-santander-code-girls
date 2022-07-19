import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;
import java.util.Collections;
import java.util.LinkedHashSet;

public class ExemploSet {

    public static void main(String[] args) {

        System.out.println("Crie um conjunto e adicione as notas: ");
        Set<Double> notas = new HashSet<>(Arrays.asList(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6)); // note que o elemento 7d só vai entrar uma vez!
        System.out.println(notas);

        // System.out.println("Exiba a posicao da nota 5.0");  // não tenho o método get pra pegar posição
        
        // System.out.println("Adicione a nota 8d na posição 4");  // não consigo trabalhar com posição dentro do set

        // System.out.println("Substitua a nota 5d pela 6d"); // só se fosse list que dava certo
        
        System.out.println("Confira se a nota 5.0 esta no conjunto: " + notas.contains(5d));

        // System.out.println("Exiba a terceira nota adicionada"); // também não consigo pois não tenho o método get

        System.out.println("Exiba a menor nota: " + Collections.min(notas));

        System.out.println("Exiba a maior nota: " + Collections.max(notas));

        System.out.println("Exiba a soma dos elementos: ");
        Iterator<Double> iterator = notas.iterator();
        Double soma = 0d;
        while(iterator.hasNext()) {
            soma += iterator.next();
        }
        System.out.println(soma);

        System.out.println("Exiba a media: " + soma/notas.size());

        System.out.println("Remova a nota 0d: " );
        notas.remove(0d);
        System.out.println(notas);

        // System.out.println("Exiba a nota na posição 0: " ); // não dá pra fazer

        System.out.println("Remova as notas menores que 7 e exiba a lista: " );
        Iterator<Double> iterator1 = notas.iterator();
        while(iterator1.hasNext()) {
            if (iterator1.next() < 7) iterator1.remove(); // dúvida
        }
        System.out.println(notas);

        System.out.println("Exiba as notas na ordem que foram informadas: " ); // teria que usar o LinkedHashSet
        Set<Double> notas2 = new LinkedHashSet<>(); // a professora resolveu adicionar 1 por 1, diferentemente do HashSet anterior
        notas2.add(7d);
        notas2.add( 8.5d);
        notas2.add( 9.3);
        notas2.add(5d);
        notas2.add(7d);
        notas2.add(0d);
        notas2.add(3.6d); 
        System.out.println(notas2);

        System.out.println("Exiba todas as notas na ordem crescente: ");
        Set<Double> notas3 = new TreeSet<>(notas2); // só consigo fazer isso porque o notas2 tem o comparable. Se fosse uma classe sem comparable, e que eu não passasse o comparator, não ia dar certo isso aqui.
        System.out.println(notas3); // poderia fazer um laço e imprimir com for

        System.out.println("Apague todo o conjunto: " );
        notas.clear();

        System.out.println("Confira se o conjunto 2 esta vazio: " + notas2.isEmpty());






    }
    
}
