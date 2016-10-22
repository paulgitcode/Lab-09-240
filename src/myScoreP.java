
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
    String tText;
    
    public myScoreP()
    {
        super();
        setBackground(Color.white);
        //setLayout(null);
        tText = "Score: ";
        scoreB = new JButton();
        title = new JLabel();
        scoreB.setText("Try to click me!");
        add (title);
        add(scoreB);
        
    
    }
}
