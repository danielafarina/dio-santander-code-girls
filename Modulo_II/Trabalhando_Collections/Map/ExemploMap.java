import java.util.*;


public class ExemploMap {
    public static void main(String[] args) {

        // Crie um dicionario que relacione os modelos e seus respectivos consumos
        System.out.println("Crie um dicionario que relacione os modelos e seus respectivos consumos: ");
        Map<String, Double> carrosPopulares = new HashMap<>() {{
            put("gol", 14.4);
            put("uno", 15.6);
            put("mobi", 16.1);
            put("hb20", 14.5);
            put("kwid", 15.6);
            put("ficticio", 16.1);
        }};
        System.out.println(carrosPopulares.toString());

        // Substitua o consumo do gol por 15,2 km/l:
        System.out.println("Substitua o consumo do gol por 15,2 km/l: ");
        carrosPopulares.put("gol", 14.2);
        System.out.println(carrosPopulares.toString());

        // Confira se o modelo fucson está no dicionário
        System.out.println("Confira se o modelo fucson esta no dicionario: " + carrosPopulares.containsKey("fucson"));
        
        // Exiba o consumo do uno
        System.out.println("Exiba o consumo do uno: " + carrosPopulares.get("uno"));

        // Exiba o terceiro modelo adicionado:
        // Não existe

        // Exiba os modelos
        System.out.println("Exiba os modelos: ");
        Set<String> modelos = carrosPopulares.keySet();
        System.out.println(modelos);

        // Exiba os consumos
        System.out.println("Exiba os consumos: ");
        Collection<Double> consumos = carrosPopulares.values();
        System.out.println(consumos);

        // Exiba o modelo mais econômico
        System.out.println("Exiba o modelo mais economico: " );
        Double max = Collections.max(carrosPopulares.values());
        Set<Map.Entry<String, Double>> entries = carrosPopulares.entrySet();
        String modeloMax = "";
        for (Map.Entry<String, Double> entry : entries) {
            if (entry.getValue().equals(max)) {
                modeloMax = entry.getKey();  
                System.out.println(modeloMax); // se botar essa linha fora do if, ele vai imprimir somente um dos resultados. Aqui ele imprime os dois resultados (que no caso estão empatados)
            }                      
        }
        


        // Exiba o modelo menos econômico
        System.out.println("Exiba o modelo menos economico: " );
        Double min = Collections.min(carrosPopulares.values());
        String modeloMin = "";
        for (Map.Entry<String, Double> entry : carrosPopulares.entrySet()) {
            if (entry.getValue().equals(min)) {
                modeloMin = entry.getKey();   
                System.out.println(modeloMin);
            }                     
        }
        
        // Exiba a soma  dos consumos
        System.out.println("Exiba a soma  dos consumos: " );
        Iterator<Double> iterator = carrosPopulares.values().iterator();
        Double soma = 0d;
        while(iterator.hasNext()) {
            soma += iterator.next();
        }
        System.out.println(soma);

        // Exiba a média dos consumos
        System.out.println("Exiba a media  dos consumos: " + (soma/carrosPopulares.size()) );

        // Remova os modelos com o consumo igual a 15,6 km/l
        System.out.println("Antes: " + carrosPopulares);
        System.out.println("Remova os modelos com o consumo igual a 15,6 km/l: " );
        Iterator<Double> iterator1 = carrosPopulares.values().iterator();
        while(iterator1.hasNext()) {
            if (iterator1.next().equals(15.6)) iterator1.remove();
        }
        System.out.println("Depois: " + carrosPopulares);

        // Exiba na ordem em que foram informados
        System.out.println("Exiba na ordem em que foram informados: ");
        Map<String, Double> carrosPopulares1 = new LinkedHashMap<>() {{
            put("gol", 14.4);
            put("uno", 15.6);
            put("mobi", 16.1);
            put("hb20", 14.5);
            put("kwid", 15.6);
            put("ficticio", 16.1);
        }};
        System.out.println(carrosPopulares1.toString()); // perceba que a ordem aqui é diferente da ordem do dicionário lá no começo.

        // Exiba o dicionário ordenado pelo modelo
        System.out.println("Exiba o dicionario ordenado pelo modelo: ");
        Map<String, Double> carrosPopulares2 = new TreeMap<>(carrosPopulares1);
        System.out.println(carrosPopulares2.toString());
        

        // Apague o dicionario de carros
        System.out.println("Apague o dicionario de carros: ");
        carrosPopulares.clear();

        // Confira se o dicionario esta vazio
        System.out.println("Confira se o dicionario esta vazio: " + carrosPopulares.isEmpty());

        
    }
}
