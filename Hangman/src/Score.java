package Old;

/**
 * Project name: Hangman
 * Team names: Ikraam, Alejandro, Eric
 * Contributing Team member: Eric
 * 
 * Class Operation: 
 * Creates linked list for correct words guessed adding a word at the end of 
 * the list after each win and prints out score if they win, else it prints 
 * score and a message when they lose.
 */


public class Score 
{
    private class Node        // Node class for linked list combined with the head class below
    {                         // Being the Score class, helps have less java classes than needed.
        public String value; 
        private Node next;

        public Node() 
        {
            value = "";
            next = null;
        }

        public Node(String data) 
        {
            value = data;
            next = null;
        }

        public void printNode() 
        {
            System.out.print(value + "  ");
        }
    }
////////////////////////////////////////////////////////////////////////////////
    // Start of Score class code to create linked list
    public int points;
    private Node head;
    static String AllCorrectWords = "";
    
    // Constructor 
    public Score()                         
    {
        head = null;
        points = 0;
    }
    
    // Prints out the linked list and Score
    public void printCorrect()   
    {
        if (head == null)                                // This indicates if list is empty
        {
            System.out.println("Score = " + points);     // Prints out if no word is added,
            System.out.println("Try harder next time");  //// so when they lose this prints out
        }
        else                                             // Here a everytime a word is correct it prints out list
        {                                                // Updating each time
            AllCorrectWords="";
            System.out.println("Score = " + points);     
            System.out.print("Correct Words: ");         // Front of list
            Node current = head;
            while(current != null)
            {
                
                current.printNode();                     // prints node out
                AllCorrectWords = AllCorrectWords + " " + current.value;
                        
                current = current.next;                  // Accesses the next node until the end of list
                System.out.print("");                  // End of list but we want just a space
            }
            System.out.println();
        }
    }
    
    // Adds words at the end of the list
    public void insertEnd(String data) 
    {
        Node newNode = new Node(data);
        if (head == null)                 // This indicates if list is empty
        {
            head = newNode;               // This accepts the first word correct to the list
            points ++;                    // since list was first empty which is why 
        }                                 // incremented points is needed
        else 
        {                                 // Here a word is added with a list that is not empty 
            Node current = head;          // Accesses head node then adds new nodes being
            points ++;                    // the next correct words
            while (current.next != null)  
            {
                current = current.next;     
            }
            current.next = newNode;
        }
    }
}
