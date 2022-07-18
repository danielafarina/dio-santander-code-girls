import java.util.ArrayList;
import java.util.List;

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
        System.out.println("Exiba a menor nota: " + Collections.min(notas))

    }
}
