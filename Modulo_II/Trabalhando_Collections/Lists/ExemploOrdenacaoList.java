import java.util.*;
import java.util.ArrayList;

public class ExemploOrdenacaoList {
    public static void main(String[] args) {

        List<Gato> meusGatos = new ArrayList<>() {{
            add(new Gato("Jon", 18, "preto"));
            add(new Gato("Simba", 10,"branco"));
            add(new Gato("Mufasa", 12, "amarelo"));
        }};

        System.out.println("---  Ordem de Insercao  ---");
        System.out.println(meusGatos);    

        System.out.println("---  Ordem Aleatoria  ---");
        Collections.shuffle(meusGatos);
        System.out.println(meusGatos);  
        
        System.out.println("---  Ordem Natural  ---");
        Collections.sort(meusGatos);
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
