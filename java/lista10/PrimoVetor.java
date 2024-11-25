import java.util.Scanner;
public class PrimoVetor {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int i,a[],divisor = 0;
		final int TAM = 5;
		a = new int[TAM];
		for(i = 0; i < TAM; i++) {
			System.out.println("Insira o "+(i + 1)+" numero");
			a[i] = in.nextInt();
			divisor = 0;
			}	
		
		for(int j = 1; j<=a[i];j++) {
			if(a[i] % j == 0) {
					divisor++;
			}
			if(divisor == 2) {
				System.out.println("este numero é primo");
			}
			else {
				System.out.println(a[i]+"é primo");
				}			
				System.out.println("Numeros do vetor: ");
			for(i = 0; i<TAM;i++) {
				System.out.println(a[i] + " ");
				}
		}
			
		in.close();
	}
}