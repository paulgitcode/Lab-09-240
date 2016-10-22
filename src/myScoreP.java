
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Paul
 */
public class myScoreP extends JPanel
{
    JButton scoreB;
    JLabel title;
    JLabel title2;
    String tText;
    String tText2;
    
    public myScoreP()
    {
        super();
        setBackground(Color.white);
        //setLayout(null);
        tText = "Score: ";
        tText2 = "Click on the Shih Tzu!     |    ";
        scoreB = new JButton();
        title = new JLabel();
        title2 = new JLabel();
        scoreB.setText(" ");
        title.setText(tText);
        title2.setText(tText2);
        add(title2);
        add (title);
        add(scoreB);
        
    
    }
}
