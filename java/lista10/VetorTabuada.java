import java.util.Scanner;
public class VetorTabuada {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int i,j,res,a[];
		a = new int[5];
		for(j=0;j<5;j++) {
			System.out.println("Digite um número para obter sua tabuada: ");
			a[j] = in.nextInt();
			for(i=1;i<=10;i++) {
				res = i*a[j];
				System.out.println(a[j]+"x"+i+"="+res);
			}
		}
		in.close();
	}
}