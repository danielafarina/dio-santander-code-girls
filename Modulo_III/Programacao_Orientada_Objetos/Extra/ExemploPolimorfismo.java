public class ExemploPolimorfismo {
    public static void main(String[] args) {
        Produto p1 = new Produto();
        p1.mostraDados();
        System.out.println("***************\n");
    
        Produto p2 = new Livro(); //tem polimorfismo
        p2.mostraDados();
        System.out.println("***************\n");

    
        Livro l1 = new Livro(); // não tem polimorfismo, tem a sobrescrita pura
        l1.mostraDados();
        l1.mostraAutor();
        System.out.println("***************");

        
    }
   

}

