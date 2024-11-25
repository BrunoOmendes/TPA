import java.util.Scanner;
public class PrimoVetor {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        final int TAM = 10;
        int[] a = new int[TAM];
        for (int i = 0; i < TAM; i++) {
            System.out.println("Insira o " + (i + 1) + "º número:");
            a[i] = in.nextInt();
        }
        for (int i = 0; i < TAM; i++) {
            int divisor = 0;
            for (int j = 1; j <= a[i]; j++) {
                if (a[i] % j == 0) {
                    divisor++;
                }
            }
            if (divisor == 2) {
                System.out.println(a[i] + " é primo.");
            } else {
                System.out.println(a[i] + " não é primo.");
            }
        }
        
        System.out.println("Números no vetor:");
        System.out.print("\nA = [ ");
        for (int i = 0; i < TAM; i++) {
            System.out.print(a[i] + " ");
        }	
        	System.out.println("]");
        in.close();
    }
}