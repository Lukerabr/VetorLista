package exercicioVetorLista;
import java.util.Scanner;
public class Exercicio2 {

	public static void main(String[] args) {
		Scanner tc = new Scanner(System.in);
		
		int n = tc.nextInt();
		int [] repeticoes = {0, 0, 0, 0, 0, 0};
		int num;
		while (n > 0) {
			num = tc.nextInt();
			repeticoes[num-1]++;
			n--;
		}
		
		for(int i =0; i<repeticoes.length; i++) {
			System.out.printf("%d ", repeticoes[i]);
		}
		tc.close();
	}

}
