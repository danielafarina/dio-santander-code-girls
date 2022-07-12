public class Main {
    public static void main(String[ ] args) {
        int i;
        int I;
        int _1a; // não é boa prática
        int $aq; // não é boa prática

        i = 5;
        I = 10;
        _1a = 2;
        $aq = 3;

        final int j = 15;
        // j = 20; não posso fazer isso, pois é final

        System.out.println(j);

    }
}