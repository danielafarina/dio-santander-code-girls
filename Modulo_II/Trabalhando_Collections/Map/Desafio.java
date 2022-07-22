import java.util.*;
import java.util.concurrent.ThreadLocalRandom;

public class Desafio {
    public static void main(String[] args) {

        // Criando o dicionário com as chaves 0 a 6 e os valores sendo a quantidade de vezes que o dado rolou aquele número:
        Map<Integer, Integer> lancamentosDado = new HashMap<>() {{
            put(1, 0);
            put(2, 0);
            put(3, 0);
            put(4, 0);
            put(5,0);
            put(6,0);
        }};

        int vezes = 0;

        while(vezes < 100) {
            int randomNum = ThreadLocalRandom.current().nextInt(1, 7);
            lancamentosDado.put(randomNum, lancamentosDado.get(randomNum) + 1);            
            vezes++;
        }
        
        Set<Map.Entry<Integer, Integer>> entries = lancamentosDado.entrySet();

        for (Map.Entry<Integer, Integer> entry : entries) {
            System.out.println("O valor " + entry.getKey() + " foi inserido " + entry.getValue() + " vezes");
        }

        // System.out.println(lancamentosDado);
        
    }
    
}
