import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		String word = "Hangman";
		int lives = 5;
		
		
		
		for(char ch : word.toCharArray()) {
			System.out.print("_" + " " );
		}
		
		
		while(lives >= 1) {
			System.out.print("Guess: ");
			Scanner in = new Scanner(System.in);
			String input = in.next();
			char c = input.charAt(0);
			for(int i = 0; i < word.length(); i++) {
				if(c == word.charAt(i)) {
					
				}
			}
		}
		
		System.out.println("Hello");
		
		
		
		
		
		
		
		
		
		

	}

}
