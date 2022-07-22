import java.util.*;

public class ExercicioProposto {    
    public static void main(String[] args) {

        // Crie um dicionario e relacione os estados e suas populacoes:
        System.out.println("Crie um dicionario e relacione os estados e suas populacoes: ");
        Map<String, Long> estadosNordeste = new HashMap<>() {{
            put("PE",9616621L);
            put("AL", 3351543L);
            put("CE", 9187103L);
            put("RN", 3534265L);
        }};
        System.out.println(estadosNordeste.toString());
        // Imprimindo bonitinho com os números formatados:
        Set<Map.Entry<String, Long>> entries = estadosNordeste.entrySet();
        for (Map.Entry<String, Long> entry : entries) {
            System.out.print(entry.getKey() + " : ");
            System.out.format("%,9d%n", entry.getValue());
        }

        // Substitua a populacao do RN por 3.534.165:
        System.out.println("Substitua a populacao do RN por 3.534.165: ");
        estadosNordeste.put("RN", 3534165L);
        for (Map.Entry<String, Long> entry : entries) {
            System.out.print(entry.getKey() + " : ");
            System.out.format("%,9d%n", entry.getValue());
        }

        // Confira se o estado da Paraiba esta dentro do dicionario, caso nao, adicione: PB:  4.039.277
        System.out.println("Confira se o estado da Paraiba esta dentro do dicionario, caso nao, adicione: " + estadosNordeste.containsKey("PB"));
        if (!estadosNordeste.containsKey("PB")) estadosNordeste.put("PB", 4039277L);
        for (Map.Entry<String, Long> entry : entries) {
            System.out.print(entry.getKey() + " : ");
            System.out.format("%,9d%n", entry.getValue());
        }

        // Exiba a populacao de PE:
        System.out.print("Exiba a populacao de PE: " );
        System.out.format("%,9d%n", estadosNordeste.get("PE"));

        // Exiba na ordem em que foram informados:
        System.out.println("Exiba na ordem em que foram informados: ");
        Map<String, Long> estadosNordeste1 = new LinkedHashMap<>() {{
            put("PE",9616621L);
            put("AL", 3351543L);
            put("CE", 9187103L);
            put("RN", 3534265L);
            put("PB", 4039277L);
        }};
        Set<Map.Entry<String, Long>> entries1 = estadosNordeste1.entrySet();
        for (Map.Entry<String, Long> entry : entries1) {
            System.out.print(entry.getKey() + " : ");
            System.out.format("%,9d%n", entry.getValue());
        }
        

        // Exiba em ordem alfabetica:
        System.out.println("Exiba na ordem alfabetica: ");
        // TreeMap organiza de acordo com as chaves:
        Map<String, Long> estadosNordeste3 = new TreeMap<>(estadosNordeste1);
        Set<Map.Entry<String, Long>> entries3 = estadosNordeste3.entrySet();
        for (Map.Entry<String, Long> entry : entries3) {
            System.out.print(entry.getKey() + " : ");
            System.out.format("%,9d%n", entry.getValue());
        }


        // Exiba o estado com menor populacao e sua quantidade:
        System.out.println("Exiba o estado com menor populacao e sua quantidade: ");
        Long min = Collections.min(estadosNordeste.values());
        String estadoMin = "";
        for (Map.Entry<String, Long> entry : entries) {
            if (entry.getValue().equals(min)) {
                estadoMin = entry.getKey();
            }            
        }
        System.out.print(estadoMin + " : ");
        System.out.format("%,9d%n", min);

        // Exiba o estado com maior populacao e sua quantidade:
        System.out.println("Exiba o estado com maior populacao e sua quantidade: ");
        Long max = Collections.max(estadosNordeste.values());
        String estadoMax = "";
        for (Map.Entry<String, Long> entry : entries) {
            if (entry.getValue().equals(max)) {
                estadoMax = entry.getKey();
            }            
        }
        System.out.print(estadoMax + " : ");
        System.out.format("%,9d%n", max);

        // Exiba a soma da populacao desses estados
        System.out.println("Exiba a soma da populacao desses estados: ");
        Long soma = 0L;
        for (Map.Entry<String, Long> entry : entries) {
               soma += entry.getValue();
        }
        System.out.format("%,9d%n", soma);

        // Exiba a media da populacao desses estados
        System.out.println("Exiba a media da populacao desses estados: ");
        Long media = soma/estadosNordeste.size();        
        System.out.format("%,9d%n", media);

        // Remova os estados com a população menor que 4.000.000:
        System.out.println("Remova os estados com a populacao menor que 4.000.000: ");
        Iterator<Long> iterator = estadosNordeste.values().iterator();
        while(iterator.hasNext()) {
            if(iterator.next() < 4000000L) 
            iterator.remove();
        }
        // Set<Map.Entry<String, Long>> entries4= estadosNordeste.entrySet();
        for (Map.Entry<String, Long> entry : entries) {
            System.out.print(entry.getKey() + " : ");
            System.out.format("%,9d%n", entry.getValue());
        }

        // Apague o dicionario de carros
        System.out.println("Apague o dicionario de estados: ");
        estadosNordeste.clear();

        // Confira se o dicionario esta vazio
        System.out.println("Confira se o dicionario esta vazio: " + estadosNordeste.isEmpty());
        
        
    }
}

