
public class Tabuadas {
	public static void main(String[] args) {
		int n=1,i=1,r;
		while(i<=10) {
			while(n<=10) {
				r = n*i;
				System.out.println( i + " x " + n + " = " + r);
				n++;
			}
			i++;
			n = 1;
		}
	}
}


