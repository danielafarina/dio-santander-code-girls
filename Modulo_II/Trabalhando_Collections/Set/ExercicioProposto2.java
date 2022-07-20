import java.util.*;

public class ExercicioProposto2 {

    System.out.println("--- Ordem insercao ---");
    Set<LinguagemFavorita> linguagens = new LinkedHashSet<>(){{
        add(new LinguagemFavorita("java", 1991, "intellicode"));
        add(new LinguagemFavorita("python", 1990, "anaconda"));
        add(new LinguagemFavorita("C", 1969, "vsc"));
    }};
    System.out.println(linguagens);

    // System.out.println("--- Ordem natural (nome) ---");

    // System.out.println("--- Ordem natural (ide) ---");

    // System.out.println("--- Ordem natural (ano de criacao e nome) ---");

    // System.out.println("--- Ordem natural (nome, ano de criacao e ide) ---");




    
}

class LinguagemFavorita {
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

    

}

class ComparatorNomeAnoDeCriacaoIde implements Comparator<LinguagemFavorita> {

    @Override
    public int compare(LinguagemFavorita l1, LinguagemFavorita l2) {
        int nome = l1.getNome().compareTo(l2.getNome());
        if (nome != 0) return nome;

        int anoDeCriacao = Integer.compare(l1.getAnoDeCriacao(), l2.getAnoDeCriacao());
        if (anoDeCriacao != 0) return anoDeCriacao;

        return l1.getIde().compareTo(l2.getIde());
    }
}
