public class OrdemInversa {
    public static void main(String[] args) {

        int[] vetor = {1, 8, 6, 7, -5, 4};
        int count = 0;

        // while(count < vetor.length ) {
        //     System.out.print(vetor[count] + "  ");
        //     count++;
        // }

        for(int i = (vetor.length - 1); i >= 0; i--) {
            System.out.print(vetor[i] + "  ");
        }
        
    }
}
