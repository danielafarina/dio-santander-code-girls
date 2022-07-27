public class RodarClasseMae {
    public static void main(String[] args) {

        ClasseMae[] classes = new ClasseMae[]{new ClasseFilha1(), new ClasseFilha2(), new ClasseMae()};

        for (ClasseMae classe: classes) { // acontece polimorfismo nos dois primeiros elementos, pois vc tem objetos diferentes.
            classe.metodo1();
        }

        System.out.println("");

        for (ClasseMae classe: classes) { // no primeiro elemento, não acontece, pois ele vai chamar o metodo da ClasseMae; no segundo tem; no terceiro não tem pq é a própria classe.
            classe.metodo2();
        }

        System.out.println("");

        ClasseFilha2 classeFilha2 = new ClasseFilha2(); // aqui não teve polimorfismo, teve a SOBRESCRITA PURA
        classeFilha2.metodo2();
        
    }
}
