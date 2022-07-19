import java.util.ArrayList;
import java.util.List;
import java.util.*;

public class ExemploList {
    public static void main(String[] args) {
        System.out.println("Crie uma lista e adicione as sete notas: ");

        List<Double> notas = new ArrayList<Double>();
        
        notas.add(7D);
        notas.add(8.5D);
        notas.add(9.3D);
        notas.add(5D);
        notas.add(7D);
        notas.add(0D);
        notas.add(3.6D);
        // System.out.println(notas);
        System.out.println(notas.toString());

        // Acessar uma posição:
        System.out.println("Exiba a posição da nota 5.0: " + notas.indexOf(5d));

        // Posição:
        System.out.println("Adicione na lista a nota 8.0 na posição 4.0: ");
        notas.add(4, 8d);        
        System.out.println(notas);

        // Substituição
        System.out.println("Substitua a nota 5.0 pela nota 6.0:");
        notas.set(notas.indexOf(5D), 6.0);
        System.out.println(notas);

        // Conferir
        System.out.println("Confira se a nota 5.0 está na lista: " + notas.contains(5D));

        // Exibir na hora em que foram informados
        System.out.println("Exiba todas as notas na ordem em que foram informadas: ");
        for (Double nota : notas) System.out.println(nota);

        // Ordem de adição na lista
        System.out.println("Exiba a terceira nota adicionada: " + notas.get(2));
        System.out.println(notas);

        // Menor nota
        System.out.println("Exiba a menor nota: " + Collections.min(notas));

        // Maior nota
        System.out.println("Exiba a maior nota: " + Collections.max(notas));

        // Soma dos valores
        System.out.println("Exiba a soma dos valores da lista: ");
        Iterator<Double> iterator = notas.iterator();
        Double soma = 0D;
        while(iterator.hasNext()){ // imagine o mouse passando em cima da lista. Quando tá no primeiro elemento, ele pergunta: Tem o próximo? Sim, então faz o que tá dentro do while
            Double next = iterator.next();
            soma += next;
        }
        System.out.println("Exiba a soma dos valores: " + soma);

        // Quantidade de elementos dentro da list
        System.out.println("Tamanho da lista: " + notas.size());

        // Remover elemento
        System.out.println("Remova a nota 0.0 ");
        notas.remove(0d); // se eu não colocar o "d", ele vai remover da POSIÇÃO zero.
        System.out.println(notas);

        // Remover elemento
        System.out.println("Remova a nota 0.0 ");
        notas.remove(0); // se eu não colocar o "d", ele vai remover da POSIÇÃO zero.
        System.out.println(notas);

        // Remova determinadas notas
        System.out.println("Remova as notas menores que 7 e exiba a lista: ");
        Iterator<Double> iterator1 = notas.iterator();
        while(iterator1.hasNext()) {
            Double next = iterator1.next();
            if(next < 7) iterator1.remove();
        }
        System.out.println(notas);

        // apagar toda a lista
        System.out.println("Apague toda a lista: ");
        notas.clear();
        System.out.println(notas);

        // Verificar se está vazia
        System.out.println("A lista está vazia? " + notas.isEmpty());
    }
}
