import java.util.Scanner;
public class Tabuada {
	public static void main(String[] args) {
		float n,r;
		int i = 1;
		Scanner ler = new Scanner(System.in);
		System.out.println("Coloque o numero a ser multiplicado");
		n = ler.nextInt();
		while(i<11) {	
			r = n * i;
			System.out.println(n + " x " + i +" = " + r);
			i = i+1;
		}
		ler.close();
	}
}