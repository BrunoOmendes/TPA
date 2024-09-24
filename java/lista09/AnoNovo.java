import java.util.Scanner;
public class AnoNovo {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int anoatual, anonascimento, idade, idadenovo = 1000, idadevelho = 0;
        for (int i = 1; i <= 10; i++) {
            System.out.println("Insira o ano atual: ");
            anoatual = ler.nextInt();
            System.out.println("Insira o seu ano de nascimento: ");
            anonascimento = ler.nextInt();
            idade = anoatual - anonascimento;

            System.out.println("Essa pessoa tem " + idade + " anos de idade.");
            if (idade < idadenovo) {
                idadenovo = idade;
            }
            if (idade > idadevelho) {
            	idadevelho = idade;
            }
        }
        System.out.println("A pessoa mais nova possui " + idadenovo + " anos, e o mais velho possui " + idadevelho + " anos");
        ler.close();	
    }
}