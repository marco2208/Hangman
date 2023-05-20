package Old;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Project name: Hangman
 **Team names: Ikraam, Alejandro, Eric
 * Contributing Team member: Ikraam Mulla and Eric (Just a little)
 * 
 * WordChecker Class Operation:
 * This code is the logic of the game in WordChecker method from the Hangman game
 * I decided to attach my body of code to to my other group members Get_Word
 * class as it logically made sense to have our code together.
 */
public class WordChecker 
           
        
{ public static int x; // This is a global variable being acessible in all classes
                       // Used for loop statement and if statement to handle win or lose situstions
    public void Game(String Secret_Text,HangmanGUI TheGUI,Score myScore, int HighScore)
    {
        
        
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Guess the Word: ");
        
        List<Character> WordGuess = new ArrayList<>();// list of characters

        int incorrectGuesses = 0; // Added functionality to keep count of guesses and lives for future use
        int maxGuesses = 6;//Gave the man 6 lives for now, we will need to determine the correct number later 
        boolean isWordGuessed = false;
        
        String WordToBeGuessed;
        

        while (!isWordGuessed && incorrectGuesses < maxGuesses) {
            isWordGuessed = true;
            
            TheGUI.SetScore(myScore.points);
            
            TheGUI.DisplayHighScore(HighScore);
            if(myScore.points >= HighScore)
            {
                HighScore = myScore.points;
                
            }
            
            WordToBeGuessed = "";
            for (int i = 0; i < Secret_Text.length(); i++) { // cyclces through the secret word

                if (WordGuess.contains(Secret_Text.charAt(i))) { // if the character we pick is in the rand word we
                    // generated we print out that char

                    System.out.print(Secret_Text.charAt(i));
                    WordToBeGuessed = WordToBeGuessed + Secret_Text.charAt(i);
                    
                } else {

                    System.out.print("-"); // else we print out the dash if the char doesent match the guess
                    WordToBeGuessed = WordToBeGuessed + "-";
                    isWordGuessed = false;
                }
            }
            
            TheGUI.SetWordLabel(WordToBeGuessed);

            if (isWordGuessed) {
                System.out.println("\nYou win!");// (Eric) Everytime you win, insertEnd method is used
                x = 1;                           // from Score class, the correct guessed word is added
                TheGUI.SetScore(myScore.points);
                break;                           // to list and printed out with score
            }                                    

            System.out.println("\nGuesses left: " + (maxGuesses - incorrectGuesses));//keep count of my guesses left
            TheGUI.SetImage(incorrectGuesses);
            
            
            
            /*************/
            
            System.out.println("Please enter a letter ");
            String LetterGuess = input.nextLine(); // input for the the letter
             
            
            
            /*************/
            
            
            
            char guess = LetterGuess.charAt(0);//gets the first char from keyboard input 

            if (!WordGuess.contains(guess)) {//checks if secret word contains users letter 
                WordGuess.add(guess);

                if (!Secret_Text.contains(LetterGuess)) {//increments if this isnt the case 
                    incorrectGuesses++;
                }
            } else {
                System.out.println("You already guessed that letter. Try again.");
            }
            
            
            
        }
        
        
        
        // (Eric) Losing just prints out the score and appropriate message depending if list is empty or not                       
        if (!isWordGuessed) {
            System.out.println("\nYou lose! The word was: " + Secret_Text); 
            x = -1;     // (Eric) This number exits out the while loop in the Main class
            TheGUI.SetImage(incorrectGuesses);
            TheGUI.SetLoseLabel();
        }
    }
}
