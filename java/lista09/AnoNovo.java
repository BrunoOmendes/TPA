import java.util.Scanner;
public class AnoNovo {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int anonascimento,anoatual,idade, idadevelho = 0,idadenovo = 1000;
		for(int i=1; i <= 10; i++) {
			System.out.println("Insira o ano atual: ");
			anoatual = ler.nextInt();
			System.out.println("Insira o seu ano de nascencia: ");
			anonascimento = ler.nextInt();
			idade = anoatual - anonascimento;
			System.out.println("Essa pessoa tem "+idade+" anos de idade.");
			idadevelho = idade;
			idadenovo = idade;
			}
		if(idade<idadenovo) {
			idadevelho = idadenovo;
		}
		else if(idade>idadevelho) {
			idadenovo = idadevelho;
		}
		System.out.println("A pessoa mais nova possui"+idadenovo+" anos, e o mais velho possui"+idadevelho+" anos");
	}
}
