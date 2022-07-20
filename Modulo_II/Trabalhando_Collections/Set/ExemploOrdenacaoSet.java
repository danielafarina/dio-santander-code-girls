import java.util.*;

public class ExemploOrdenacaoSet {    

    public static void main(String[] args) {

        // Ordem aleatoria
        System.out.println("--- Ordem aleatoria ---");
        Set<Serie> minhasSeries = new HashSet<>(){{
            add(new Serie("stranger things", "fantasia", 90));
            add(new Serie("dark", "drama", 60));
            add(new Serie("severance", "ficcao cientifica", 60));
        }};
        for (Serie serie: minhasSeries) System.out.println(serie.getNome() + " - " + serie.getGenero() + " - " + serie.getTempoEpisodio());


        // Ordem insercao
        System.out.println("--- Ordem insercao ---");
        Set<Serie> minhasSeries1 = new LinkedHashSet<>(){{
            add(new Serie("stranger things", "fantasia", 90));
            add(new Serie("dark", "drama", 60));
            add(new Serie("severance", "ficcao cientifica", 60));
        }};
        for (Serie serie: minhasSeries1) System.out.println(serie.getNome() + " - " + serie.getGenero() + " - " + serie.getTempoEpisodio());


        // Ordem natural
        System.out.println("--- Ordem natural ---");
        Set<Serie> minhasSeries2 = new TreeSet<>(minhasSeries1);
        for (Serie serie: minhasSeries2) System.out.println(serie.getNome() + " - " + serie.getGenero() + " - " + serie.getTempoEpisodio());

        // Ordem nomeGeneroTempoEpisodio
        System.out.println("--- Ordem Nome/Genero/Tempo de episodio ---");
        Set<Serie> minhasSeries3 = new TreeSet<>(new ComparatorNomeGeneroTempoEpisodio()); // meu treeset está vazio, preciso adicionar elementos nele:
        minhasSeries3.addAll(minhasSeries); // quando for adicionada, será organizada por nome, gênero e tempo de episódio.
        for (Serie serie: minhasSeries3) System.out.println(serie.getNome() + " - " + serie.getGenero() + " - " + serie.getTempoEpisodio());

        
        
    }
}

class Serie implements Comparable<Serie> {

    private String nome;
    private String genero;
    private Integer tempoEpisodio;

    public Serie(String nome, String genero, Integer tempoEpisodio) {
        this.nome = nome;
        this.genero = genero;
        this.tempoEpisodio = tempoEpisodio;
    }

    public String getNome() {
        return nome;
    }

    public String getGenero() {
        return genero;
    }

    public Integer getTempoEpisodio() {
        return tempoEpisodio;
    }

    @Override
    public String toString() {
        return "{" + "nome='" + nome + "\'" + ", genero='" + genero + "\'" +", tempoEpisodio=" + tempoEpisodio + "}";
    }

    @Override
    public boolean equals(Object o) {
        if(this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Serie serie = (Serie) o;
        return nome.equals(serie.nome) && genero.equals(serie.genero) && tempoEpisodio.equals(serie.tempoEpisodio);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, genero, tempoEpisodio);
    }

    @Override
    public int compareTo(Serie serie) {
        int tempoEpisodio = Integer.compare(this.getTempoEpisodio(), serie.getTempoEpisodio());
        if (tempoEpisodio != 0) return tempoEpisodio; // se for diferente de zero, ou seja, tempos diferentes, retorne tempoEpisodio, se for igual a zero, ou seja, tempos iguais, segue pra linha debaixo:
        return this.getGenero().compareTo(serie.getGenero());

    }

}

class ComparatorNomeGeneroTempoEpisodio implements Comparator<Serie>{

    @Override
    public int compare(Serie s1, Serie s2) {
        int nome = s1.getNome().compareTo(s2.getNome());
        if (nome != 0) return nome; // se for iguais, ou seja, se retornar zero, segue pra novo critério de desempate:

        int genero = s1.getGenero().compareTo(s2.getGenero());
        if (genero != 0) return genero; // se for iguais, ou seja, se retornar zero, segue pra novo critério de desempate:

        return Integer.compare(s1.getTempoEpisodio(), s2.getTempoEpisodio());
    }

}
