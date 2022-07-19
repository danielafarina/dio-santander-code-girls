import java.util.*;

public class Teste {

    public static void main(String[] args) {

        List<String> respostas = new ArrayList<>();
        
        Scanner scan = new Scanner(System.in);

        System.out.println("Telefonou para a vitima? (S/N)  ");
        String resposta = scan.next();
        respostas.add(resposta);
        System.out.println(resposta.getClass());

        if (resposta.equals("S")) System.out.println("A resposta foi um S!");

        // System.out.println("Esteve no local do crime? (S/N)  ");
        // resposta = scan.next();
        // respostas.add(resposta);

        
        
    }
    
}
