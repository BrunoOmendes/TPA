import java.util.Scanner;
public class Potencia {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int expoente = 1,base,res = 1,i = 1;
		System.out.println("Insira a base: ");
		base = ler.nextInt();
		System.out.println("Insira o expoente: ");
		expoente = ler.nextInt();
		while(i<=expoente) {
			res = res*base;
			i++;
		}
		System.out.println(res);
		ler.close();
	}
}