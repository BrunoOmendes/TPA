import java.util.Scanner;
public class OrdenadorVetor {
	static public void main(String  args[]) {
		Scanner ler = new Scanner(System.in);
		int i,a[],b[];
		final int TAM = 10;
		a = new int[TAM];
		b = new int[TAM];
		for(i = 0;i<TAM;i++) {
			System.out.println("Insira o " + (i+1) + " numero");
			a[i] = ler.nextInt();
			
		}
		int k = TAM - 1;
			for(i = 0;i<TAM;i++) {
				b[k] = a[i];
				k--;
			}
		for(i = 0;i<TAM;i++) {
			System.out.print(b[i]);
		}
	}
}
