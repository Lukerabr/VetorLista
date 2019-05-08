package exercicioVetorLista;
import java.util.Scanner;
public class Exercicio3 {

	public static void main(String[] args) {
		Scanner tc = new Scanner(System.in);
		
		int n = tc.nextInt();		
		int [] roleta = new int [37];
		int num;
		
		for(int i = 0; i < roleta.length; i++) {
			roleta[i] = 0;
		}
		
		while(n>0) {
			num = tc.nextInt();
				if(num == 37)
					num -=  1;
			roleta[num]++;
			n--;
		}
		
		for(int i = 0; i<roleta.length; i++) {
			System.out.printf("%d ", roleta[i]);
		}
		tc.close();
	}

}
