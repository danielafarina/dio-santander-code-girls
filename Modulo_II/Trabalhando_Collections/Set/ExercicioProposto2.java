import java.util.*;

public class ExercicioProposto2 {

    public static void main(String[] args) {

        // A
        System.out.println("--- Ordem insercao ---");
        Set<LinguagemFavorita> linguagens = new LinkedHashSet<>(){{
        add(new LinguagemFavorita("java", 1991, "intellij"));
        add(new LinguagemFavorita("python", 1990, "anaconda"));
        add(new LinguagemFavorita("YC", 1969, "vsc"));
        add(new LinguagemFavorita("Ficticia", 1969, "eclipse"));
        add(new LinguagemFavorita("Ficticia", 1969, "vsc"));
        add(new LinguagemFavorita("Ficticia", 1980, "intellij"));
        }};
        System.out.println(linguagens);

        // B
        System.out.println("--- Ordem natural (nome) ---");
        // Preciso implementar a interface Comparable para a TreeSet funcionar.
        Set<LinguagemFavorita> linguagens1 = new TreeSet<>(linguagens);
        for (LinguagemFavorita linguagem : linguagens1) System.out.println(linguagem.getNome() + " - " + linguagem.getAnoDeCriacao() + " - " + linguagem.getIde());

        // C
        System.out.println("--- Ordem natural (ide) ---");
        // Preciso implementar a interface Comparator e passar esse critério de ordenação como parâmetro da função TreeSet.
        Set<LinguagemFavorita> linguagens2 = new TreeSet<>(new ComparatorIde());
        // Vamos preencher o TreeSet, que até então está vazio. Quando um elemento for adicionado, será organizado por ide.
        linguagens2.addAll(linguagens);
        for (LinguagemFavorita linguagem : linguagens2) System.out.println(linguagem.getNome() + " - " + linguagem.getAnoDeCriacao() + " - " + linguagem.getIde());


        // D
        System.out.println("--- Ordem natural (ano de criacao e nome) ---");
        // Preciso passar esses dois criterios de ordenação através de uma interface Comparator.
        Set<LinguagemFavorita> linguagens3 = new TreeSet<>(new ComparatorAnoDeCriacaoNome());
        // Vamos povoar a TreeSet com esse critério de ordenação:
        linguagens3.addAll(linguagens);
        for (LinguagemFavorita linguagem : linguagens3) System.out.println(linguagem.getNome() + " - " + linguagem.getAnoDeCriacao() + " - " + linguagem.getIde());



        // E
        System.out.println("--- Ordem natural (nome, ano de criacao e ide) ---");
        // Agora eu vou passar três critérios de ordenação:
        Set<LinguagemFavorita> linguagens4 = new TreeSet<>(new ComparatorNomeAnoDeCriacaoIde());
        // Vamos povoar a TreeSet:
        linguagens4.addAll(linguagens);
        for (LinguagemFavorita linguagem : linguagens4) System.out.println(linguagem.getNome() + " - " + linguagem.getAnoDeCriacao() + " - " + linguagem.getIde());

        
    }
    
}

class LinguagemFavorita implements Comparable<LinguagemFavorita> {
    private String nome;
    private Integer anoDeCriacao;
    private String ide;

    public LinguagemFavorita(String nome, Integer anoDeCriacao, String ide) {
        this.nome = nome;
        this.anoDeCriacao = anoDeCriacao; 
        this.ide = ide;
    }

    public String getNome() {
        return nome;
    }

    public Integer getAnoDeCriacao() {
        return anoDeCriacao;
    }

    public String getIde() {
        return ide;
    }

    @Override
    public String toString() {
        return "{" + "nome='" + nome + "\'" + ", ano de criacao='" + anoDeCriacao + ", ide='" + ide + "\'";
    }

    @Override
    public int compareTo(LinguagemFavorita linguagem) {
        return this.getNome().compareToIgnoreCase(linguagem.getNome());
    }
    

}

class ComparatorNomeAnoDeCriacaoIde implements Comparator<LinguagemFavorita> {

    @Override
    public int compare(LinguagemFavorita l1, LinguagemFavorita l2) {
        int nome = l1.getNome().compareToIgnoreCase(l2.getNome());
        if (nome != 0) return nome;

        int anoDeCriacao = Integer.compare(l1.getAnoDeCriacao(), l2.getAnoDeCriacao());
        if (anoDeCriacao != 0) return anoDeCriacao;

        return l1.getIde().compareToIgnoreCase(l2.getIde());
    }
}

class ComparatorIde implements Comparator<LinguagemFavorita> {

    @Override
    public int compare(LinguagemFavorita l1, LinguagemFavorita l2) {
        return l1.getIde().compareToIgnoreCase(l2.getIde());
    }

}

class ComparatorAnoDeCriacaoNome implements Comparator<LinguagemFavorita> {

    @Override
    public int compare(LinguagemFavorita l1, LinguagemFavorita l2) {
        int anoDeCriacao = Integer.compare(l1.getAnoDeCriacao(), l2.getAnoDeCriacao());
        if (anoDeCriacao != 0) return anoDeCriacao;
        return l1.getNome().compareToIgnoreCase(l2.getNome());
    }
}
