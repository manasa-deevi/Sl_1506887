package ex1;

import java.util.*;

public class Advice {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		Random random=new Random();
		
		String[] advices= {"Eat healthy",
				"Be happy",
				"Drink more water",
				"Exercise daily",
				"make use of tcs fit4life"
		};
		
		String userQuestion;
		do {
			System.out.println("Please ask a question to help");
			 userQuestion=scanner.nextLine();
			
			int randomAdvice=random.nextInt(advices.length);
			String finalAdvice=advices[randomAdvice];
			System.out.println("Advice to you is -->"+ finalAdvice);
			break;
			
		}while(userQuestion!=null);
		
		scanner.close();
		 
	}
}
