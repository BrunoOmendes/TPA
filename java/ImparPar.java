import java.util.Scanner;
public class ImparPar {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int  a[],b[],i,j = 0;
		final int TAM = 6;
		a = new int[TAM];
		b = new int[TAM];
		int k = TAM -1;
		for(i = 0;i < TAM;i++) {
			System.out.println("Insira o"+ (1+i) + "numeros.");
			b[i] = ler.nextInt();
			if(b[i] % 2 == 0 ) {
				a[j] = b[i];
				j++;
			}
			else {
				a[k] = b[i];
				k--;
			}
		}
		System.out.print("\nA = [ ");
		for(i = 0;i < TAM; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println("]");
		ler.close();
	}
}
