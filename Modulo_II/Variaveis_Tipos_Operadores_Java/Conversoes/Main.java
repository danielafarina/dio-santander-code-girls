public class Main {

    public static void main(String[ ] args) {

        // downcast com perda de info
        byte b1;
        short s1 = 1000;
        b1 = (byte) s1;

        System.out.println("b1: " + b1);

        // upcast
        long l1;
        int i1 = 10;
        l1 = i1;

        System.out.println("l1: " + l1);

        // downcast com perda de info
        int i2; 
        long l2 = 1000000000000000L;
        i2 = (int) l2;

        System.out.println("i2: " + i2);

        // downcast sem perda de informação
        int i3;
        long l3 = 10000L;
        i3 = (int) l3;

        System.out.println("i3: " + i3);

        // upcast
        double d1;
        float f1 = 10.5F;
        d1 = f1;

        System.out.println("d1: " + d1);

        // downcast sem e com perda de informação
        float f2;
        float f3;
        double d2 = 10000.58D;
        f2 = (float) d2;
        double d3 = 10000.58888888888888888888888888888888888888888888888888888888888888888888888D;
        f3 = (float) d3;

        System.out.println("f2 e f3:" + f2 + "  " + f3);

        // downcast com perda de info
        int i4;
        float f4 = 11.5697F;
        i4 = (int) f4;

        System.out.println("i4: " + i4);

    }
    
}
