import java.util.*;
import java.util.function.Consumer;
import java.util.function.Function;

/*Dadas as seguintes informações  de id e contato, crie um dicionário e
ordene este dicionário exibindo (Nome id - Nome contato);
id = 1 - Contato = nome: Simba, numero: 2222;
id = 4 - Contato = nome: Cami, numero: 5555;
id = 3 - Contato = nome: Jon, numero: 1111;
*/
public class RefatoracaoOrdenacaoMap {

    public static void main(String[] args) {
        System.out.println("--\tOrdem aleatoria\t--");
        Map<Integer, Contato> agenda = new HashMap<>() {{
           put(1, new Contato("Simba", 5555));
           put(4, new Contato("Cami", 1111));
           put(3, new Contato("Jon", 2222));
        }};
        System.out.println(agenda);
        for (Map.Entry<Integer, Contato> entry: agenda.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue().getNome());
        }

        System.out.println("--\tOrdem Insercao\t--");
        Map<Integer, Contato> agenda1 = new LinkedHashMap<>() {{
            put(1, new Contato("Simba", 5555));
            put(4, new Contato("Cami", 1111));
            put(3, new Contato("Jon", 2222));
        }};
        System.out.println(agenda1);
        for (Map.Entry<Integer, Contato> entry: agenda1.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue().getNome());
        }

        System.out.println("--\tOrdem id\t--");
        Map<Integer, Contato> agenda2 = new TreeMap<>(agenda); // o treemap, por default, organiza o dicionário de acordo com as chaves
        System.out.println(agenda2);
        for (Map.Entry<Integer, Contato> entry: agenda2.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue().getNome());
        }

        System.out.println("--\tOrdem numero telefone\t--");
        // Fazendo com função anônima:
        // Set<Map.Entry<Integer, Contato>> set = new TreeSet<>(new Comparator<Map.Entry<Integer, Contato>>() {
        //     @Override
        //     public int compare(Map.Entry<Integer, Contato> cont1, Map.Entry<Integer, Contato> cont2) {
        //         // O getvalue() é para pegar os valores do set Map.Entry (chaves são os integers, values são os contatos: nomes com números)
        //         return Integer.compare(cont1.getValue().getNumero(), cont2.getValue().getNumero());
        //     }
        // });
        // set.addAll(agenda.entrySet());
        // for (Map.Entry<Integer, Contato> entry : set) {
        //     System.out.println(entry.getKey() + " - " + entry.getValue().getNumero() + ": " + entry.getValue().getNome());
        // }

        // Utilizando o método comparing do Comparator:
        // Set<Map.Entry<Integer, Contato>> set = new TreeSet<>(Comparator.comparing(new Function<Map.Entry<Integer, Contato>, Integer>() {
        //     @Override
        //     public Integer apply(Map.Entry<Integer, Contato> cont) {
        //         return cont.getValue().getNumero();
        //     }            
        // }));
        // set.addAll(agenda.entrySet());
        // for (Map.Entry<Integer, Contato> entry : set) {
        //     System.out.println(entry.getKey() + " - " + entry.getValue().getNumero() + ": " + entry.getValue().getNome());
        // }

        // Utilizando um lambda:
        // De um lado eu coloco a minha variável, e do outro lado da flechinha eu coloco o tipo do método que eu quero que seja comparado:
        Set<Map.Entry<Integer, Contato>> set = new TreeSet<>(Comparator.comparing(cont -> cont.getValue().getNumero()));
        set.addAll(agenda.entrySet());
        for (Map.Entry<Integer, Contato> entry : set) {
            System.out.println(entry.getKey() + " - " + entry.getValue().getNumero() + ": " + entry.getValue().getNome());
        }              
        
        
        System.out.println("--\tOrdem nome contato\t--");
        //precisamos organizar os valores. Logo:
        Set<Map.Entry<Integer, Contato>> set1 = new TreeSet<>(Comparator.comparing(cont -> cont.getValue().getNome()));
        set1.addAll(agenda.entrySet());
        //imprimindo usando forEach
        set1.forEach(entry -> System.out.println(entry.getKey() + " - " + entry.getValue().getNome()));
    }
}

