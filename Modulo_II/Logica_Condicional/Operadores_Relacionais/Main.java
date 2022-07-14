public class Main {

    public static void main(String[ ] args) {

        int i1 = 10;
        int i2 = 20;
        float f1 = 4.5F;
        float f2 = 3.5F;
        char c1 = 'x';
        char c2 = 'y';
        String s1 = "Fulano";
        String s2 = "Cicrano";
        boolean b1 = true;
        boolean b2 = false;

        // System.out.println(s1 >= s2); // vai dar erro, não pode ser usado com strings
        System.out.println(b1 == b2);
        System.out.println(c2 >= c1);
        System.out.println(i1 < f1); // embora tipos diferentes, ainda são numéricos, então vai dar certo
        
    }
}