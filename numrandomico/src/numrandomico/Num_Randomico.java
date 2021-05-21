package numrandomico;

import java.util.Random;

public class Num_Randomico {

	public static void main(String[] args) {
		
		Random teste = new Random();
		int guardarandom[] = new int[10];
		int totalrandom = 10;
		
		for(int i=0; i<10; i++) {
			
			guardarandom[i] = teste.nextInt(i+1);
			
			System.out.print(guardarandom[i]+" ");
    		
			
		}

	}

}
