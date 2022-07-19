import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ExercicioProposto {

    public static void main(String[] args) {

        System.out.println("Armazene a temperatura média dos 6 primeiros meses do ano em uma lista: ");

        List<Float> temperaturas = new ArrayList<>();
        temperaturas.add(24.5f);
        temperaturas.add(23f);
        temperaturas.add(23.5f);
        temperaturas.add(22.5f);
        temperaturas.add(21.7f);

        // Média semestral
        System.out.println("Exiba a media semestral das temperaturas: ");
        Iterator<Float> iterator = temperaturas.iterator();
        Float soma = 0f;
        while(iterator.hasNext()) {
            Float next = iterator.next();
            soma += next;
        }
        Float media = soma / temperaturas.size();
        System.out.println(media);

        // Acima da média
        System.out.println("Exiba todas as temperaturas acima da media: ");
        Iterator<Float> iterator1 = temperaturas.iterator();
        while(iterator1.hasNext()) {
            Float next = iterator1.next();
            if (next > media) {
                System.out.print(next + " ");
            } 
        }        
    }
    
}
