import java.util.*;

public class Lista {

    public static void main(String[] args) {

        List<Integer> lista = new ArrayList<>(Arrays.asList(1, 2, 5, 8, 3, 0));

        Iterator<Integer> i = lista.iterator();
        while(i.hasNext()) {
            Integer element = i.next();
            if (element < 7) System.out.print(element + " ");
        }
    }
    
}
