import java.util.Scanner;
	public class exer_1 {
		public static void main (String [] args) {
			Scanner in = new Scanner (System.in);
			int n;
			System.out.println("Digite um número");
			n = in.nextInt();
			potencia(n);
		}
		
		public static void potencia(int n) { 
			
			int p = n*n*n*n;
			System.out.println(p);
		}
		
	}		
		
	
