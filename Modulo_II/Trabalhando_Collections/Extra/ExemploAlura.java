import java.util.*;

public class ExemploAlura {

    public static void main(String[] args) {

        Conta conta1 = new Conta(5452, "Philip Lahm");
        Conta conta2 = new Conta(1234, "Lucas Podolski");
        Conta conta3 = new Conta(3145, "Arne Friedrich");

        List<Conta> lista = new ArrayList<>();
        lista.add(conta1);
        lista.add(conta2);
        lista.add(conta3);

        System.out.println("---  Ordem de Insercao  ---");
        System.out.println(lista);


        System.out.println("---  Ordem Natural (Numero da Conta)  ---");
        Collections.sort(lista);
        System.out.println(lista);
        

        System.out.println("---  Ordem Alfabetica (Titular da conta)  ---");
        // A função sort() é sobrecarregada, recebendo um segundo parâmetro como critério de ordenação:
        Collections.sort(lista, new TitularComparator());
        System.out.println(lista);

    }

}

class Conta implements Comparable<Conta> {

    private Integer numero;
    private String titular;  

    public Conta(Integer numero, String titular) {
        this.numero = numero;
        this.titular = titular;
    }

    public Integer getNumero() {
        return numero;
    }

    public String getTitular() {
        return titular;
    }


    // Visualização das listas:
    @Override
    public String toString() {
        return "Conta{" + "numero=" + numero + ", titular='" + titular + "\'" + "}";
    }

    // Criando a ordenação natural por número da conta
    @Override
    public int compareTo(Conta outraConta) {
        if (this.numero < outraConta.numero) {
            return -1;
        }
        if (this.numero > outraConta.numero) {
            return 1;
        }
        return 0;
    }    

    

}

// Criando uma ordenação extra por nome do titular
class TitularComparator implements Comparator<Conta> {
    @Override
    public int compare(Conta conta, Conta outraConta) {
        return conta.getTitular().compareToIgnoreCase(outraConta.getTitular());
    }

}