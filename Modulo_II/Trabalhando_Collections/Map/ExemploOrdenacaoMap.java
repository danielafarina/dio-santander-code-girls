import java.util.*;

public class ExemploOrdenacaoMap {
    public static void main(String[] args) {

        // Ordem aleatoria
        System.out.println("-- Ordem Aleatoria --");
        Map<String, Livro> meusLivros = new HashMap() {{
            put("Hawking, Stephen", new Livro("Uma breve historia do tempo", 288));
            put("Nahari, Yuval Noah", new Livro("21 licoes", 150));
            put("Duhigg, Charles", new Livro("O poder do habito", 408));
        }};
        System.out.println(meusLivros);
        // Quero imprimir cada um em uma linha, vendo apenas o nome do autor e o nome do livro, por isso preciso de trabalhar com o elemento separadamente, usando o método entrySet:
        for(Map.Entry<String, Livro> livro : meusLivros.entrySet()) System.out.println(livro.getKey() + " - " + livro.getValue().getNome());


        // Ordem insercao
        System.out.println("-- Ordem Insercao --");
        Map<String, Livro> meusLivros1 = new LinkedHashMap(meusLivros);
        //  {{
        //     put("Hawking, Stephen", new Livro("Uma breve historia do tempo", 288));
        //     put("Duhigg, Charles", new Livro("O poder do habito", 408));
        //     put("Nahari, Yuval Noah", new Livro("Uma breve historia do tempo", 150));
        // }};
        for(Map.Entry<String, Livro> livro : meusLivros1.entrySet()) System.out.println(livro.getKey() + " - " + livro.getValue().getNome());
        

        // Ordem alfabetica
        System.out.println("-- Ordem Alfabetica Autores --");
        Map<String, Livro> meusLivros2 = new TreeMap<>(meusLivros1);
        for(Map.Entry<String, Livro> livro : meusLivros2.entrySet()) System.out.println(livro.getKey() + " - " + livro.getValue().getNome());


        // Ordem alfabetica dos livros
        System.out.println("-- Ordem Alfabetica Nomes dos Livros --");
        // nomes dos livros são os valores do dicionário então eu preciso trabalhar com o TreeSet e preciso passar o comparator
        Set<Map.Entry<String, Livro>> meusLivros3 = new TreeSet<>(new ComparatorNome());
        System.out.println(meusLivros3); // vai imprimir vazio, pq eu só iniciei.
        meusLivros3.addAll(meusLivros.entrySet());
        for(Map.Entry<String, Livro> livro : meusLivros3) System.out.println(livro.getKey() + " - " + livro.getValue().getNome());


        // Ordem do numero de paginas
        System.out.println("-- Ordem Numero de pagina --");
        Set<Map.Entry<String, Livro>> meusLivros4 = new TreeSet<>(new ComparatorPaginas());
        meusLivros4.addAll(meusLivros.entrySet());
        for(Map.Entry<String, Livro> livro : meusLivros4) System.out.println(livro.getKey() + " - " + livro.getValue().getNome() + " - " + livro.getValue().getPaginas());

    }
}

class Livro {
    private String nome;
    private Integer paginas;

    // Aqui eu crio o construtor:
    public Livro(String nome, Integer paginas) {
        this.nome = nome;
        this.paginas = paginas;
    }

    // Aqui eu crio os getter:
    public String getNome() {
        return nome;
    }

    public Integer getPaginas() {
        return paginas;
    }

    // Como eu vou trabalhar com TreeMap, HashMap e LinkedHashMap, eu vou sobrescrever os métodos equals e hashcode:
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Livro livro = (Livro) o;
        return nome.equals(livro.nome) && paginas.equals(livro.paginas);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, paginas);
    }

    // Agora eu vou sobrescrever o método toString para não aparecer o endereço de memória:
    @Override
    public String toString() {
        return "Livro{" + "nome='" + nome + "'" + ", paginas=" + paginas + "}";
    }


}

class ComparatorNome implements Comparator<Map.Entry<String, Livro>> {
    @Override
    public int compare(Map.Entry<String, Livro> l1, Map.Entry<String, Livro> l2) {
        return l1.getValue().getNome().compareToIgnoreCase(l2.getValue().getNome());
    }
}


class ComparatorPaginas implements Comparator<Map.Entry<String, Livro>> {
    @Override
    public int compare(Map.Entry<String, Livro> l1, Map.Entry<String, Livro> l2) {
        return Integer.compare(l1.getValue().getPaginas(), l2.getValue().getPaginas());
    }
}
