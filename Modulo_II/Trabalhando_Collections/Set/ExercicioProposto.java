import java.util.*;

public class ExercicioProposto {

    public static void main(String[] args) {

        // A
        System.out.println("Crie um conjunto contendo as cores do arco-iris: ");
        Set<String> cores = new HashSet<>(Arrays.asList("vermelho", "laranja", "amarelo", "verde", "azul", "azul-escuro", "violeta"));        
        for (String cor : cores) {
            System.out.println(cor);            
        }

        // B
        System.out.println("Exiba a quantidade de cores que o arco-iris tem: " + cores.size());

        // C
        System.out.println("Exiba as cores em ordem alfabetica: ");
        Set<String> cores1 = new LinkedHashSet<>();
        cores1.add("vermelho");
        cores1.add("laranja");
        cores1.add("amarelo");
        cores1.add("verde");
        cores1.add("azul");
        cores1.add("azul-escuro");
        cores1.add("violeta");        
        Set<String> cores2 = new TreeSet<>(cores1);
        System.out.println(cores2);

        // D
        System.out.println("Exiba as cores na ordem inversa em que foram informadas: "); // preciso converter o LinkedHashSet em ArrayList e usar Collections.reverse()
        ArrayList<String> cores3 = new ArrayList<>(cores1);
        Collections.reverse(cores3);
        System.out.println(cores3);

 
        // E
        System.out.println("Exiba todas as cores que comecam com a letra 'v': ");
        for (String cor : cores) {
            char first = cor.charAt(0);
            if (first == 'v') System.out.print(cor + " ");            
        }
        System.out.println(); 

         // F
         System.out.println("Remova todas as cores que nao comecam com a letra 'v': ");
        ArrayList<String> coresV = new ArrayList<>();
         for (String cor : cores3) {
            char first = cor.charAt(0);
            if (first == 'v') coresV.add(cor);
         }
         System.out.println(coresV);

         // G
         System.out.println("Limpe o conjunto: ");
         cores.clear();
         System.out.println(cores);


        // H
        System.out.println("Confira se o conjunto esta vazio: " + cores.isEmpty());

    }
    
}

// class Cor implements Comparable<Cor> {
//     private String cor;

//     public Cor(String cor) {
//         this.cor = cor;
//     }

//     public String getCor() {
//         return cor;
//     }

//     @Override
//     public int compareTo(Cor cor) {
//         return this.getCor().compareToIgnoreCase(cor.getCor());
//     }

// }
