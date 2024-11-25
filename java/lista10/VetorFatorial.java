import java.util.Scanner;
public class VetorFatorial {
	static public void main(String []args) {
		Scanner ler = new Scanner(System.in);
		int a[],b[],res = 1,i;
		a = new int[15];
		b = new int[15];
		for(i = 0; i < 15;i++) {
			System.out.println("Insira o " + (i + 1) +" numero");
			a[i] = ler.nextInt();
			res = 1;			
			for(int j = 1;j<=a[i];j++) {
			res *= j;			
		}
			b[i] = res;
		}
		System.out.println("\nB = [ ");
		for(i = 0;i < 15;i++) {
			System.out.print(b[i] + " ");
		}
		System.out.println("]");
		ler.close();
	}
}
