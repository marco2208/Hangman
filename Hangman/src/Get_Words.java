package Old;

/**
 * Project name: Hangman
 * Team names: Ikraam, Alejandro, Eric
 * Contributing Team member: Eric
 * 
 * Class Operation: 
 * Obtains a random word from a text file, which is in the files of project, and
 * will be passed in the main so other classes could use it.
 */

import java.io.File;
import java.util.Scanner;
import java.util.ArrayList;

public class Get_Words 
{
    ArrayList<String> words;
    String Secret_Text;

    // Reads file and gets and stores random word
    public void Read(String fileName) throws Exception 
    {
        File Dictionary = new File(fileName);    // Stores file in variable
        
        Scanner scan = new Scanner(Dictionary);  // Reads file of Words.txt
        
        words = new ArrayList<>();               // Makes a ArrayList of type string
        while (scan.hasNextLine()) 
        {
            words.add(scan.nextLine());          // Adds each word to list one by one
        }
    }
    
    public String GetWord(String S) // Helps pass secret word to other classes
    {
        // Obatains Random Word and Stores in variable
        Secret_Text = words.get((int)(Math.random() * words.size()));
        S = Secret_Text;  
        return S; 
    }
}