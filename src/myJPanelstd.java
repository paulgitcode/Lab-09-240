import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class myJPanelstd extends JPanel implements ActionListener
{
    student st1 = new student("Tom", "Jerry", 44);
    Timer move; // timer for movement
    int sWidth; // width of student button
    int sHeight; // height of student button
    int sX; // X coordinate of student button
    int sY; // Y coordinate of student button
    int xMax; // max value for x coordinate
    int yMax; // max value for y coordinate
    int xMin; // min value for x coordinate
    int yMin; // min value for y coordinate
    double randX; // random number for X coordinate
    double randY; // random number for Y coordinate
    int score; // holds player score
    myScoreP inScore; // holds the score panel menu
    ImageIcon bimg; // image for button
    ImageIcon bimg1;
    ImageIcon bimg2;
    
    
	public myJPanelstd(myScoreP informedScore)
	{
            super();
            inScore = informedScore;
            setBackground(Color.pink);
            setLayout(null);
            sWidth = 60;
            sHeight = 60;
            sX = 21;
            sY = 21;
            xMax = 580;
            xMin = 20;
            yMax = 440;
            yMin = 20;
            move = new Timer(1000,this);
            move.start();
            score = 0;
            bimg = new ImageIcon("images/giz.jpg");
            bimg1 = new ImageIcon("images/giz1.jpg");
            bimg2 = new ImageIcon("images/giz2.jpg");

            
	    //JButton jb1;
   	    //jb1 = new JButton();
	    
		add(st1);
                st1.setBackground(Color.gray);
                //st1.setText());
                st1.addActionListener(this);
                st1.setBounds(sX,sY,sWidth,sHeight); // in null layout, setBound(x,y,width, height)
                
                
                //inScore.scoreB.setText("Hello");
	}
        
       @Override 
        public void actionPerformed(ActionEvent e)
        {
           Object obj = e.getSource();
           
           if(obj == st1)
           {
           //st1.setText(st1.getFN());
           //st1.setBackground(Color.lightGray);
              score = score+1;
              inScore.scoreB.setText(String.valueOf(score));
              if(score < 10)
              {
                  st1.setIcon(bimg);
              }if (score > 10)
              {
                  st1.setIcon(bimg1);
              }if (score >30)
              {
                  st1.setIcon(bimg2);
              }
            
           
           }
          
           
           if(obj == move)
           {
               
           randX = Math.random();
           randY = Math.random();
               
           sX = (int)(randX*580);
           sY = (int)(randY*440);
           
            st1.setBounds(sX,sY,sWidth,sHeight);
           
            //if (sX < xMax && sX > xMin && sY < yMax && sY > yMin)
           //{
            //   
             //  
            //
           //}
               
           }
        }

    

}
