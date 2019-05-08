package exercicioVetorLista;
import java.util.Scanner;
public class Exercicio4 {

	public static void main(String[] args) {
		Scanner tc = new Scanner(System.in);
		
		int n = tc.nextInt();
		
		int [] vetorU = new int [n];
		int [] vetorV = new int [n];
		int [] soma = new int [n];
		int i, j, k;
		int produtoEscalar = 0;
		
		for(i = 0; i < vetorU.length; i++) {
			vetorU[i] = tc.nextInt();
		}
		
		for(j = 0; j < vetorV.length; j++) {
			vetorV[j] = tc.nextInt();
		}
		
		i = 0;
		j = 0;
		
		for(k = 0; k < vetorV.length; k++) {
			soma[k] = vetorU[i]*vetorV[j];
			produtoEscalar += soma[k];
			i++;
			j++;
			
		}
		
		if(produtoEscalar > 0) {
		System.out.println(produtoEscalar);
		System.out.println("Angulo agudo.");
		}
		
		else if(produtoEscalar < 0) {
			System.out.println(produtoEscalar);
			System.out.println("Angulo obtuso.");
			}
		else {
			System.out.println(produtoEscalar);
			System.out.println("Angulo reto.");
		}
		tc.close();
	}

}
