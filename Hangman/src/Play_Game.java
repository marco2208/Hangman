package Old;

/**
 * Testing Area.
 */

public class Play_Game 
{

    
    public static void main(String[] args) throws Exception 
    {
        HangmanGUI TheGUI = new HangmanGUI();
        TheGUI.setVisible(true);
        
        // Creates Object referenced by variables
        Get_Words Secret = new Get_Words();    // Secret is of type Get_Words allowing use of its methods from class
        WordChecker Play = new WordChecker();  // Same here but Play references WordChecker to be able to use its methods
        Score myScore = new Score();
        
        String Hidden = "";                    // Initializes variable as a empty string
        
        Secret.Read("Words.txt");              // Reads file
        
        int HighScore = 0;
        
        // start of loop
        do 
        {
            Hidden = Secret.GetWord(Hidden);  // Gets Secret Word
            System.out.println(Hidden);       // Outputs word to make testing easier will take off in the future
            Play.Game(Hidden, TheGUI, myScore, HighScore);                // Obtains secret word and is used for Game() method in WordChecker class
            
            
            if (WordChecker.x == 1)           // Using x variable from WordChecker class
            {                                 // If you win x is equal to 1 and performs
                myScore.insertEnd(Hidden);    // following methods
                myScore.printCorrect();
                TheGUI.DisplayWordsCorrect(myScore.AllCorrectWords);
                TheGUI.ResetAllBtns();
            }
            else                              // This is if you lose which will just print out the list 
                myScore.printCorrect();       // either being empty or not
            
            
        }
        while (WordChecker.x != -1);
    }
}
    

