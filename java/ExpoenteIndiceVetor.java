import java.util.Scanner;
public class ExpoenteIndiceVetor {
	static public void main(String []args) {
		Scanner ler = new Scanner(System.in);
		int a[],i;
		final int TAM = 11;
		a = new int[TAM];
		for(i = 0;i<TAM;i++) {
			System.out.println("Insira o" + (i+1)+ " expoente");
			a[i] = ler.nextInt();
		}for(i = 0;i<TAM;i++) {
			a[i] = (int) Math.pow(2, a[i]);
			}
		System.out.print("\nA = [ ");
		for(i = 0; i<TAM;i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println("]");
		ler.close();
	}
}
