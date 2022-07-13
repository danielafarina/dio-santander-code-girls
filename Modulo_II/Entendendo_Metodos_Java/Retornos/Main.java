public class Main {

    public static void main(String[ ] args) {

        // Quadrilátero
        System.out.println("Exercício retornos: ");
        
        double areaQuadrado = Quadrilatero.area(3); // agora podemos armazenar em variáveis pois as funções retornam alguma coisa
        System.out.println("Area do quadrado: " + areaQuadrado);

        double areaRetangulo = Quadrilatero.area(3,4); 
        System.out.println("Area do retangulo: " + areaRetangulo);

        double areaTrapezio = Quadrilatero.area(4,3,2); 
        System.out.println("Area do quadrado: " + areaTrapezio);

        float areaLosango = Quadrilatero.area(5F,5F);
        System.out.println("Area do losango: " + areaLosango); // quem mostra a msg agora não é mais o método da área, e sim os sistemas que estão nessa classe Main

       
    }

}