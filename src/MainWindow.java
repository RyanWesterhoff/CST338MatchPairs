import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JLabel;


//a class that generates a suitable window for a
//matching pairs game.
public class MainWindow{
   JFrame f = new JFrame("Match Game");

   public ArrayList<JButton> buttons = new ArrayList<JButton>();
   private JPanel contentPane;
   
   public final JPanel glass = (JPanel) f.getGlassPane();
   
   //title labels
   JLabel lblLogo= new JLabel();
   JLabel lblScore = new JLabel("Score:");
   JLabel lblMisses = new JLabel("Misses:");
   JLabel lblTimer = new JLabel("Timer:");
   
   JLabel winLabel = new JLabel("YOU WIN!");
  

   public MainWindow() {
      f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      f.setResizable(false);
      JFrame.setDefaultLookAndFeelDecorated(true);
      f.setBounds(100, 100, 450, 450);
      contentPane = new JPanel();
      contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
      f.setContentPane(contentPane);
      contentPane.setLayout(new GridLayout(5, 4, 0, 0));
      
      //add title row
      contentPane.add(lblLogo);
      contentPane.add(lblScore);
      contentPane.add(lblMisses);
      contentPane.add(lblTimer);
      
      //add buttons
      for(int i = 0; i < 16; i++)
      {
         String btnName = "btn" + i;
         JButton btn = new JButton("?");
         btn.setName(btnName);
         buttons.add(btn);
         contentPane.add(btn);
      }
      
      f.setVisible(true);
   }
   
   public void winText()
   {
      //To be called when win conditions are met
      winLabel.setFont(new Font("Serif", Font.BOLD, 32));
      glass.add(winLabel, BorderLayout.CENTER);
      glass.setVisible(true);
   }
}

