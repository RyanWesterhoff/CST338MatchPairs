/*Ryan Westerhoff
 *CST 338
 *Final
 *This program is a simple pair
 *matching game with a timer
 */

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Random;

import javax.swing.Timer;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;

public class Main{
   
   public static final int NUM_BUTTONS = 16;
   
   //Controls interface interactions
   public static boolean canInteract = true;

   //Keeps track of when a tile has been selected
   public static boolean tileClicked = false;
  
   //Keeps track of the value of the selected button
   public static String selectedVal = "";
   public static JButton selectedButton = null;
   
   //initialize scores
   public static int score = 0;
   public static int misses = 0;

   
   public static void main(String[] args) 
   {
      
               String words[] = {"Apple", "Orange", "Lemon", "Pineapple", "Kiwi", "Banana", "Grape", "Strawberry"};
               String tileValues[] = new String[NUM_BUTTONS];
               
               
               for(int i = 0; i < NUM_BUTTONS; i++)
               {
                  tileValues[i] = words[i % (NUM_BUTTONS / 2)];
               }
               
               shuffleArray(tileValues);

               MainWindow frame = new MainWindow();
               frame.lblScore.setText("Score: " + String.valueOf(score));
               frame.lblMisses.setText("Misses: " + String.valueOf(misses));
               
               ImageIcon otter = new ImageIcon("src/otter.png");
               frame.lblLogo.setIcon(otter);
               
               GameTimer timer = new GameTimer(frame.lblTimer);
               timer.start();
               
               
             //add action listeners
               
               frame.buttons.get(0).addActionListener(new ActionListener()
               { 
                @Override
                public void actionPerformed(ActionEvent e) 
                {
                  checkButtonValues(frame.buttons.get(0), tileValues[0], frame, timer); 
                }
               });
               
               frame.buttons.get(1).addActionListener(new ActionListener()
               { 
                @Override
                public void actionPerformed(ActionEvent e) 
                {
                  checkButtonValues(frame.buttons.get(1), tileValues[1], frame, timer); 
                }
               });
               
               frame.buttons.get(2).addActionListener(new ActionListener()
               { 
                @Override
                public void actionPerformed(ActionEvent e) 
                {
                  checkButtonValues(frame.buttons.get(2), tileValues[2], frame, timer); 
                }
               });
               
               frame.buttons.get(3).addActionListener(new ActionListener()
               { 
                @Override
                public void actionPerformed(ActionEvent e) 
                {
                  checkButtonValues(frame.buttons.get(3), tileValues[3], frame, timer); 
                }
               });
               
               frame.buttons.get(4).addActionListener(new ActionListener()
               { 
                @Override
                public void actionPerformed(ActionEvent e) 
                {
                  checkButtonValues(frame.buttons.get(4), tileValues[4], frame, timer); 
                }
               });
               
               frame.buttons.get(5).addActionListener(new ActionListener()
               { 
                @Override
                public void actionPerformed(ActionEvent e) 
                {
                  checkButtonValues(frame.buttons.get(5), tileValues[5], frame, timer); 
                }
               });
               
               frame.buttons.get(6).addActionListener(new ActionListener()
               { 
                @Override
                public void actionPerformed(ActionEvent e) 
                {
                  checkButtonValues(frame.buttons.get(6), tileValues[6], frame, timer); 
                }
               });
               
               frame.buttons.get(7).addActionListener(new ActionListener()
               { 
                @Override
                public void actionPerformed(ActionEvent e) 
                {
                  checkButtonValues(frame.buttons.get(7), tileValues[7], frame, timer); 
                }
               });
               
               frame.buttons.get(8).addActionListener(new ActionListener()
               { 
                @Override
                public void actionPerformed(ActionEvent e) 
                {
                  checkButtonValues(frame.buttons.get(8), tileValues[8], frame, timer); 
                }
               });
               
               frame.buttons.get(9).addActionListener(new ActionListener()
               { 
                @Override
                public void actionPerformed(ActionEvent e) 
                {
                  checkButtonValues(frame.buttons.get(9), tileValues[9], frame, timer); 
                }
               });
               
               frame.buttons.get(10).addActionListener(new ActionListener()
               { 
                @Override
                public void actionPerformed(ActionEvent e) 
                {
                  checkButtonValues(frame.buttons.get(10), tileValues[10], frame, timer); 
                }
               });
               
               frame.buttons.get(11).addActionListener(new ActionListener()
               { 
                @Override
                public void actionPerformed(ActionEvent e) 
                {
                  checkButtonValues(frame.buttons.get(11), tileValues[11], frame, timer); 
                }
               });
               
               frame.buttons.get(12).addActionListener(new ActionListener()
               { 
                @Override
                public void actionPerformed(ActionEvent e) 
                {
                  checkButtonValues(frame.buttons.get(12), tileValues[12], frame, timer); 
                }
               });
               
               frame.buttons.get(13).addActionListener(new ActionListener()
               { 
                @Override
                public void actionPerformed(ActionEvent e) 
                {
                  checkButtonValues(frame.buttons.get(13), tileValues[13], frame, timer); 
                }
               });
               
               frame.buttons.get(14).addActionListener(new ActionListener()
               { 
                @Override
                public void actionPerformed(ActionEvent e) 
                {
                  checkButtonValues(frame.buttons.get(14), tileValues[14], frame, timer); 
                }
               });
               
               frame.buttons.get(15).addActionListener(new ActionListener()
               { 
                @Override
                public void actionPerformed(ActionEvent e) 
                {
                  checkButtonValues(frame.buttons.get(15), tileValues[15], frame, timer); 
                }
               });
               
               frame.glass.addMouseListener(new MouseListener() {
                  
                  @Override
                  public void mouseReleased(MouseEvent e) {
                  }
                  
                  @Override
                  public void mousePressed(MouseEvent e) {
                  }
                  
                  @Override
                  public void mouseExited(MouseEvent e) {
                  }
                  
                  @Override
                  public void mouseEntered(MouseEvent e) {
                  }
                  
                  @Override
                  public void mouseClicked(MouseEvent e) {
                     if(canInteract == false)
                     {  
                        //Do nothing
                     } 
                  }
               });
   }
   
   public static void checkButtonValues(JButton btnPushed, String btnVal, MainWindow frame, GameTimer timer)
   {   
      if(tileClicked == true)
      {
         //player has selected a card
         if(selectedVal.equals(btnVal))
         {
            //player matches card
            score += 1;
            frame.lblScore.setText("Score: " + String.valueOf(score));
            btnPushed.setEnabled(false);
            btnPushed.setText(btnVal);
            selectedButton.setBackground(null);
            selectedButton = null;
            tileClicked = false;
            
            if(score == (NUM_BUTTONS/2))
            {
               frame.winText();
               timer.guiTimer.stop();
            }
         }
         else
         {
            //player does not match card
            
            //Timer to trigger Glass Pane and disable clicks
            Timer paneTimer = new Timer(0, new ActionListener() {
               @Override
               public void actionPerformed(ActionEvent e) {
                  canInteract = false;
                  frame.glass.setVisible(true);
               }
            });
            paneTimer.setRepeats(false);
            paneTimer.start();
            
            misses += 1;
            frame.lblMisses.setText("Misses: " + String.valueOf(misses));
            btnPushed.setText(btnVal);
            btnPushed.setEnabled(false);
                  
            //timer to display both tiles flipped for 1 sec
            Timer flipTimer = new Timer(1000, new ActionListener() {
               @Override
               public void actionPerformed(ActionEvent e) {
                  frame.glass.setVisible(false);
                  btnPushed.setText("?");
                  btnPushed.setEnabled(true);
                  btnPushed.setBackground(null);
                  selectedButton.setEnabled(true);
                  selectedButton.setBackground(null);
                  selectedButton.setText("?");
                  selectedButton = null;
               }
            });
            flipTimer.setRepeats(false);
            flipTimer.start();
            tileClicked = false;
         }
      }
      else
      {
         //player has not selected a card
         selectedVal = btnVal;
         btnPushed.setText(btnVal);
         selectedButton = btnPushed;
         btnPushed.setEnabled(false);
         tileClicked = true;
      }
      if(score != (NUM_BUTTONS/2)) frame.glass.setVisible(false);
   }
   
   static void shuffleArray(String[] array)
   {
     
     Random rng = new Random();
     for (int i = array.length - 1; i > 0; i--)
     {
       int index = rng.nextInt(i + 1);
       
       String a = array[index];
       array[index] = array[i];
       array[i] = a;
     }
   }
   
}

class GameTimer extends Thread
{
   //Timer that takes a JLabel and 
   // implements on it
   int time = 0;
   JLabel label;
   
   GameTimer(JLabel label)
   {
      this.label = label;
      label.setText("Time: " + String.valueOf(time));
      
      
   }
   
   Timer guiTimer = new Timer(1000, new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
         label.setText("Time: " + String.valueOf(time));
         time++;
      }
   });

   
   public void run()
   {
      guiTimer.start();
   }
   
}
