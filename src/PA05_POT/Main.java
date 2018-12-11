package PA05_POT;

import java.util.Scanner;

public class Main {
	public static void main (String[] args) {
		int a = 0, b = 0;
		Scanner scanner = new Scanner(System.in);
		int numbers= scanner.nextInt();
		int [] result = new int[numbers];
		for (int i = 0; i <numbers; i++) {
		      a =scanner.nextInt();
		      b = scanner.nextInt(); 
		      result[i] = (int)Math.pow(a%10, b%4 + 4) %10;
		}	
		
		for(int x: result) {  
			System.out.println(x);
		}
			
	}		
}

