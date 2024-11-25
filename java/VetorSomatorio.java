import java.util.Scanner;
public class VetorSomatorio {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int i,a[],b[],soma;
		final int TAM = 10;
		a = new int[TAM];
		b = new int[TAM];
		for(i = 0;i<TAM;i++) {
			System.out.println("Insira o "+(i + 1)+" numero");
			a[i] = ler.nextInt();
			soma = 0;
			for(int j = 0;j<=a[i];j++) {
				soma = j+soma;
			}
			b[i] = soma;
		}
		System.out.print("\nB = [");
		for(i = 0;i<TAM;i++) {
			System.out.print(b[i] + " ");
		}
		System.out.println("]");
		ler.close();
	}
}
