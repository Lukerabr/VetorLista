package exercicioVetorLista;
import java.util.Scanner;
public class Exercicio1 {

	public static void main(String[] args) {
		Scanner tc = new Scanner(System.in);
		char [] gabarito = {'A', 'A', 'E', 'C', 'B', 'D', 'E', 'A', 'C', 'E', 'B', 'A', 'D', 'C', 'D', 'E', 'A', 'D', 'B', 'C'};
				
		int cont= 0;
		int n = tc.nextInt();
		
		for(int i = 0; i < n; i++) {
			cont = 0;
			char [] cartaoResposta = new char [20];
			
			for(int j = 0; j < 20; j++) {
				cartaoResposta[j] = tc.next().charAt(0);
				if(cartaoResposta[j] == gabarito[j]) {
					cont++;
				}
				
			}
			System.out.println(cont);
		}
			

		tc.close();
	}

}
