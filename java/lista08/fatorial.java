import java.util.Scanner;
public class fatorial {
	public static void main(String []args) {
		Scanner ler = new Scanner(System.in);
		int n,i = 1,res = 1;
		System.out.println("Insira o numero final da fatorial desejada: ");
		n = ler.nextInt();
			while(i<n+1) {
				res = res*i;
				i++;
				System.out.println(res);
			}
		ler.close();
	}
}