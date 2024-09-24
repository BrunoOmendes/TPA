import java.util.Scanner;
public class fibonacci {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int ante = 0,atual = 1,prox,n,i = 1, temp;
		System.out.println("Insira o termo que definir a sequencia de fibonacci");
		n = ler.nextInt();
		while(i<= n) {
			System.out.println(atual);
			temp = atual;
			atual = ante + atual;
			ante = temp;
			i++;
					
		}
	}
}
