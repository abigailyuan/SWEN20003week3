package week3;
import java.util.Scanner;

public class Program {

	public static void main(String[] args){
		int x1 = 3;
		int x2 = 5;
		
		if((x1 + x2 != 8 && 2 / 0 == 2) == false){
			
			System.out.println("hello");
		}
		
		if ((x1 == x2) == false){
			System.out.println("false");
		}
		
		double x3 = 1.2;
		double x4 = 1.2000000000005;
		
		if(Math.abs(x3 - x4) < 0.000000001){
			System.out.println("true");
		}
		
		String x5 = "hello";
		//x5 = "helllo";
		String x6 = new String("hello");
		//String x6 = "hello";
		
		if(x5.equals(x6)){
			System.out.println("true");
		}else{
			System.out.println("false");
		}
		
		Scanner scanner = new Scanner(System.in);
		
		int nChildren = scanner.nextInt();
		int nChocolates = scanner.nextInt();
		
		//Version 1
		int leftovers = nChocolates % nChildren;
		int total = nChocolates - leftovers;
		
		//Version 2
		total = nChocolates / nChildren;
		
		int x7 = 7;
		Integer x8 = new Integer(x7);
		
		//x8 = (Integer)x7;
		int x9 = (int)x8;
		
		int n = 10;
		int number = 7;
		int difference = n / 2;
		int opposite = (number + difference) % total;
	}
}
