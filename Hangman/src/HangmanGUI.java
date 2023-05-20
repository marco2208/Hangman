package Old;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;



public class HangmanGUI extends JFrame { 
        //Images Are Loaded in
        ImageIcon ImageSix = new ImageIcon("Hangman6.png");
        ImageIcon ImageFive = new ImageIcon("Hangman5.png");
        ImageIcon ImageFour = new ImageIcon("Hangman4.png");
        ImageIcon ImageThree = new ImageIcon("Hangman3.png");
        ImageIcon ImageTwo = new ImageIcon("Hangman2.png");
        ImageIcon ImageOne = new ImageIcon("Hangman1.png");
        
        //lose game image 
        ImageIcon ImageZero = new ImageIcon("Hangman0.png");
    
        static char Letter;

    
    public HangmanGUI() {
        initComponents();
        myInitcomponents();
        LoseLabel.setVisible(false);
        
        
    }
    
    String Hidden;
    JButton[] btnLetters = new JButton[26];
    public void myInitcomponents()
    {
        Hidden = "";
        
        int i = 0;
        for (char letter = 'a'; letter <= 'z'; letter++, i++) {
            btnLetters[i] = new JButton("" + letter);
            btnLetters[i].addActionListener((ActionEvent e) -> {
                for (int i1 = 0; i1 < btnLetters.length; i1++) {
                    JButton clickedButton = (JButton) e.getSource();
                    Letter = clickedButton.getText().charAt(0);
                    
                     
                }
            });
            jPanel1.setLayout(new GridLayout(3, 10));
            jPanel1.add(btnLetters[i]);
        }
        
    }
    
    
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        WordsCorrect = new javax.swing.JTextPane();
        PictureLabel = new javax.swing.JLabel();
        ScoreLabel = new javax.swing.JLabel();
        ScoreNumber = new javax.swing.JLabel();
        HighScoreLabel = new javax.swing.JLabel();
        HighScoreNumber = new javax.swing.JLabel();
        WordToGuess = new javax.swing.JLabel();
        WordToGuessJLabel = new javax.swing.JLabel();
        LoseLabel = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("HangmanFrame");
        setAutoRequestFocus(false);
        setBackground(new java.awt.Color(51, 51, 255));
        setSize(new java.awt.Dimension(1650, 1080));

        WordsCorrect.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jScrollPane1.setViewportView(WordsCorrect);

        PictureLabel.setText("jLabel1");

        ScoreLabel.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        ScoreLabel.setText("Score:");

        ScoreNumber.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        ScoreNumber.setText("Score #");

        HighScoreLabel.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        HighScoreLabel.setText("High Score:");

        HighScoreNumber.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        HighScoreNumber.setText("High Score #");

        WordToGuess.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        WordToGuess.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        WordToGuess.setText("Word To Guess");

        WordToGuessJLabel.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        WordToGuessJLabel.setText("Word To Guess:");

        LoseLabel.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        LoseLabel.setText("LoseLabel");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 553, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 274, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 525, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(WordToGuessJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 218, Short.MAX_VALUE)
                        .addComponent(LoseLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 355, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(53, 53, 53)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(PictureLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(HighScoreLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(HighScoreNumber))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(ScoreLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ScoreNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(WordToGuess, javax.swing.GroupLayout.PREFERRED_SIZE, 399, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 386, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(PictureLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(HighScoreNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(HighScoreLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(WordToGuessJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(466, 466, 466)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(ScoreLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(ScoreNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 200, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(325, 325, 325)
                                .addComponent(LoseLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                        .addComponent(WordToGuess, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)))
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        WordToGuess.getAccessibleContext().setAccessibleDescription("");

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    
   public char ReturnCharacter(char Character)
   {
       return Character;
   }
  
   
   public void SetWordLabel(String TheHiddenWord)
   {
       WordToGuess.setText(TheHiddenWord);
   }
   
   public void SetLoseLabel(){
       LoseLabel.setText("YOU LOST!!!");
       LoseLabel.setVisible(true);
   }
    public void SetScore(int Score)
   {
       ScoreNumber.setText(Score + "");
   }
   
   public void DisplayWordsCorrect(String words)
   {
       WordsCorrect.setText(words);
   }
   
   public void DisplayHighScore(int Highscore)
   {
       HighScoreNumber.setText(Highscore + "");
   }
   
   public void ResetAllBtns()
   {    
       for(int i = 0; i < 26;i++)
       {
           btnLetters[i].setEnabled(true);
       }
   }
   
   public void SetImage(int Lives)
   {
       switch(Lives){
           case 0:
               PictureLabel.setText("");
               PictureLabel.setIcon(ImageSix);
               break;
           case 1:
               PictureLabel.setText("");
               PictureLabel.setIcon(ImageFive);
               break;
           case 2:
               PictureLabel.setText("");
               PictureLabel.setIcon(ImageFour);
               break;
           case 3:
               PictureLabel.setText("");
               PictureLabel.setIcon(ImageThree);
               break;
           case 4:
               PictureLabel.setText("");
               PictureLabel.setIcon(ImageTwo);
               break;
           case 5:
               PictureLabel.setText("");
               PictureLabel.setIcon(ImageOne);
               break;
           case 6:
               PictureLabel.setText("");
               PictureLabel.setIcon(ImageZero);
               break;
           default:
               System.out.println("No Image");   
       }
   }
   
  
   
   
   
   
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try
        {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels())
            {
                if ("Nimbus".equals(info.getName()))
                {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex)
        {
            java.util.logging.Logger.getLogger(HangmanGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex)
        {
            java.util.logging.Logger.getLogger(HangmanGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex)
        {
            java.util.logging.Logger.getLogger(HangmanGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex)
        {
            java.util.logging.Logger.getLogger(HangmanGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HangmanGUI().setVisible(true);
                

            }
        });
        
    }



    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel HighScoreLabel;
    private javax.swing.JLabel HighScoreNumber;
    private javax.swing.JLabel LoseLabel;
    private javax.swing.JLabel PictureLabel;
    private javax.swing.JLabel ScoreLabel;
    private javax.swing.JLabel ScoreNumber;
    public javax.swing.JLabel WordToGuess;
    private javax.swing.JLabel WordToGuessJLabel;
    private javax.swing.JTextPane WordsCorrect;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
