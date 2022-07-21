import java.util.ArrayList;
import java.util.Arrays;

public class Remover {

    public static void main(String[] args) {

        ArrayList<String> cores = new ArrayList<>(Arrays.asList("vermelho", "laranja", "amarelo", "verde", "azul", "azul-escuro", "violeta"));
        ArrayList<String> coresNaoV = new ArrayList<>();

        System.out.println("Cores antes: " + cores);
        System.out.println("Cores NaoV: " + coresNaoV);


        for (String cor : cores) {
            char first =cor.charAt(0);
            if (first != 'v') coresNaoV.add(cor);
            
        }

         System.out.println("Cores depois: " + coresNaoV);


    }
    
}
