
public class Main {

	public static void main(String[] args) {
		
		String word = "Hangman";
		int lives = 5;
		
		
		
		for(char ch : word.toCharArray()) {
			System.out.print("_" + " " );
		}
		
		
		while(lives >= 1) {
			System.out.print("Guess: ");
		}
		
		
		
		

	}

}
