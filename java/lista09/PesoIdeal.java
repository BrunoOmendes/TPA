import java.util.Scanner;
public class PesoIdeal {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		double altura,f,m;
		String sexo;
		int resposta;
		do {
			System.out.println("Insira seu sexo entre masculino (M) ou feminino(F): ");
			sexo = ler.next();		
			if(sexo.equalsIgnoreCase("m")) {
				System.out.println("Coloque sua altura, em centiímetros, para o calculo do seu peso ideal: ");
				altura =  ler.nextDouble();
				m =  52 + (0.75 * (altura - 152.4));
				System.out.println("Seu peso ideal seria de: "+Math.ceil(m)+" Kilos");
			}
			else if(sexo.equalsIgnoreCase("f")) {
				System.out.println("Coloque sua altura, em centiímetros, para o calculo do seu peso ideal: ");
				altura =  ler.nextDouble();
				f = 52 + (0.67*(altura - 152.4));
				System.out.println("Seu peso ideal seria de: "+Math.ceil(f)+" Kilos");
				}
			else {
				System.out.println("Por favor, Insira um sexo válido.");
			}
				System.out.println("Se quiser continuar a verificar o seu peso ideal, insira: 1, se não quiser, insira: 2");
				resposta = ler.nextInt();			
		}while(resposta == 1);
		ler.close();
	}
}