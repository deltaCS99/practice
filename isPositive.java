package text;

import java.util.Scanner;

public class Test{
	
	private static boolean isPositive(double number) {
		
		return(number>0.0);
	}
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		while(in.hasNext()) {
			double num = in.nextDouble();
			if(isPositive(num))
				System.out.println("Its positive ");
			else {
				System.out.println("Its negative ");
			}
		}
		
	}
}
