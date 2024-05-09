package ex1;


import java.util.Scanner;

public class NumberSeries {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter starting number");
		int start=scanner.nextInt();
		System.out.println("Enter ending number");
		int end=scanner.nextInt();
		
		for(int i=start;i<=end;i++)
		{
			System.out.print(i+" ");
		}
		
		scanner.close();
	}

}
