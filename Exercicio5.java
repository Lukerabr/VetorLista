package exercicioVetorLista;
import java.util.Scanner;
public class Exercicio5 {

	public static void main(String[] args) {
		Scanner tc = new Scanner(System.in);
				
		int grau = 0;
		int i = 0;
		int j = 0;
		int k = 1;
		int x = 1;
		int soma;
		
		grau = tc.nextInt();
		int [] polinomio = new int [grau];
		
		while (i<polinomio.length) {
			polinomio[i] = tc.nextInt();			
			i++;			
		}
		
		k = tc.nextInt();
		
		while(x<=k){			
			i = 0;
			soma = 0;
		
			while (i<polinomio.length) {
				int exp = 1;
				for(j = 1; j<=i; j++) {
					exp *= x;
				}
				soma += polinomio[i] * exp;
				i++;
			}		
		System.out.println(soma);
		x++;
		}
		tc.close();
	}
}
