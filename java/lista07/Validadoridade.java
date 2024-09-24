import java.util.Scanner;
public class Validadoridade {
	public static void main(String args[]) {
		Scanner ler = new Scanner(System.in);
		int i = 1,anonascimento, anoatual, idade;
			System.out.println("Valide a maioridade de até 6 pessoas");
		while(i<=6) {
			System.out.println("Insira o ano atual");
			anoatual = ler.nextInt();
			System.out.println("Insira o ano que a pessoa nasceu: ");
			anonascimento = ler.nextInt();
			idade = anoatual-anonascimento;
			System.out.println("A pessoa tem: " + idade + " anos.");
			if(idade<18) {
				System.out.println("Esta pessoa é menor de idade portanto não tem acesso a maioridade.");
			}
			else {
				System.out.println("Essa pessoa é maior de idade e tem acesso a maioridade.");
			}
		}
		ler.close();
	}	
}

