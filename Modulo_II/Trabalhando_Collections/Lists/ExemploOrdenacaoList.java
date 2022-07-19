import java.util.*;

public class ExemploOrdenacaoList {
    public static void main(String[] args) {

        List<Gato> meusGatos = new ArrayList<>() {{
            add(new Gato("Jon", 18, "preto"));
            add(new Gato("Simba", 10,"branco"));
            add(new Gato("Mufasa", 12, "amarelo"));
            add(new Gato("Mufasa", 6, "cinza"));
        }};

        System.out.println("---  Ordem de Insercao  ---");
        System.out.println(meusGatos);    

        System.out.println("---  Ordem Aleatoria  ---");
        Collections.shuffle(meusGatos);
        System.out.println(meusGatos);  
        
        System.out.println("---  Ordem Natural  ---");
        Collections.sort(meusGatos);
        System.out.println(meusGatos);  

        System.out.println("---  Ordem Idade  ---");
        Collections.sort(meusGatos, new ComparatorIdade() ); // posso chamar a função sort de Collections sobrecarregando-a com o critério de ordenação como segundo parâmetro.
        // meusGatos.sort(new ComparatorIdade()); // posso chamar a função sort dentro da minha lista dizendo qual o critério de ordenação
        System.out.println(meusGatos);  

        System.out.println("---  Ordem Cor  ---");
        Collections.sort(meusGatos, new ComparatorCor() );
        System.out.println(meusGatos);  

        System.out.println("---  Ordem Nome/Cor/Idade  ---");
        Collections.sort(meusGatos, new ComparatorTriplo() );
        System.out.println(meusGatos);  


}

}

class Gato implements Comparable<Gato> {
    private String nome;
    private Integer idade;
    private String cor;

    public Gato(String nome, Integer idade, String cor) {
        this.nome = nome;
        this.idade = idade;
        this.cor = cor;
    }

    public String getNome() {
        return nome;
    }

    public Integer getIdade() {
        return idade;       
    }

    public String getCor() {
        return cor;
    }

    // se eu mandar imprimir meusGatos, vai imprimir o endereço de memória, então devo fazer assim:
    @Override
    public String toString() {
        return "Gato{" +
            "nome='" + nome +  '\'' +
            ", idade = " + idade +
            ", cor ='" + cor + '\'' +
            "}";            
    }

    @Override
    public int compareTo(Gato gato) {
        return this.getNome().compareToIgnoreCase(gato.getNome()); 
    }

}

class ComparatorIdade implements Comparator<Gato> {
    @Override
    public int compare(Gato g1, Gato g2) {
        return Integer.compare(g1.getIdade(), g2.getIdade()); // o próprio integer já tem um método dentro dele
    }

}

class ComparatorCor implements Comparator<Gato> {
    @Override
    public int compare(Gato g1, Gato g2) {
        return g1.getCor().compareToIgnoreCase(g2.getCor()); // se as cores forem iguais, retorna 0. Se g1 > g2, retorna 1 e se g1 < g2 retorna -1. De acordo com esses 0, 1 e -1 é que vai sendo organizado.
    }

}

class ComparatorTriplo implements Comparator<Gato> {
    @Override
    public int compare(Gato g1, Gato g2) {
        int nome = g1.getNome().compareToIgnoreCase(g2.getNome());
        if (nome != 0) return nome; // se o retorno for -1 ou 1, ordene por nome. Se for 0, passe para o critério de desempate a seguir:
        int cor = g1.getCor().compareToIgnoreCase(g2.getCor());
        if (cor != 0) return cor;

        return Integer.compare(g1.getIdade(), g2.getIdade());

    }

}
