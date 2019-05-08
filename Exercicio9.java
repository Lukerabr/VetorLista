package exercicioVetorLista;
import java.util.Scanner;
public class Exercicio9 {

	public static void main(String[] args) {
		Scanner tc = new Scanner(System.in);
		
		int m = tc.nextInt();
		int n = tc.nextInt();
		int i = 0;
		int x = 0;
		int j = 0;
		
		int [] vetorA = new int [m];
		int [] vetorB = new int [n];
		int [] vetorC = new int [vetorA.length + vetorB.length];
		
		for(int k = 0; k<vetorA.length; k++) {
			vetorA[k] = tc.nextInt();
		}
		
		for(int k = 0; k<vetorB.length; k++) {
			vetorB[k] = tc.nextInt();
		}
				
		while(i<vetorA.length) {
			while(j<vetorB.length) {
				if(vetorA[i]<vetorB[j]) {
					vetorC[x] = vetorC[i];
					i++;
				//if(vetorA[i] == vetorB[j]) 
				//	vetorC = vetorC.length - 1;
				if(vetorA[i]>vetorB[j]){
					j++;
				}
				}
			}
			
		}
		for(int k = 0; k<vetorA.length; k++) {
			System.out.println(vetorC[k]);
		}
	}

}
