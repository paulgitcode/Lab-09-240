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
    int rX; // move right
    int lX; // move left
    int uY; // move up
    int dY; // move down
    int increase; // value for increasing coordinate
    int decrease; // value for decreasing coordinate
    int xMax; // max value for x coordinate
    int yMax; // max value for y coordinate
    int xMin; // min value for x coordinate
    int yMin; // min value for y coordinate
    int scoreM; // max score
    int scoreF; // final score
    int timeC; // timer count
    String winText; // final text
    int timeDelay; // timer delay
    double randX; // random number for X coordinate
    double randY; // random number for Y coordinate
    double smoothM; // random number for smooth movement
    int smoothResult; // store result of smooth movement
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
            smoothResult = 0;
            increase = 30;
            decrease = -30;
            sWidth = 60;
            sHeight = 60;
            sX = 21;
            sY = 21;
            rX = increase;
            lX = decrease;
            uY = increase;
            dY = decrease;
            xMax = 580;
            xMin = 20;
            yMax = 440;
            yMin = 20;
            scoreM = 29; // max score
           
            timeDelay = 250;
            move = new Timer(timeDelay,this);
            move.start();
            timeC = 0;
            score = 0;
            scoreF = 0;
            bimg = new ImageIcon("images/giz.jpg");
            bimg1 = new ImageIcon("images/giz1.jpg");
            bimg2 = new ImageIcon("images/giz2.jpg");
            
            winText = " moves of the Shih Tzu";


            
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
              }
            
            if(score > scoreM)
            {
                scoreF = score;
                st1.removeActionListener(this);
                move.stop();
                st1.setIcon(bimg2);
                inScore.scoreB.setText(String.valueOf(scoreF) + " clicks in " + String.valueOf(timeC) + winText);
                
            }
           
           }
          
           
           if(obj == move)
           {
               
           randX = Math.random();
           randY = Math.random();
           smoothM = Math.random();
           timeC = timeC + 1;
           
               
           //sX = (int)(randX*580);
           //sY = (int)(randY*440);
           
           
           //sX = (int)(randX*580);
           //sY = (int)(randY*440);
           smoothResult = (int)(smoothM*8);
           
           if (smoothResult == 0)
           {
               if(sY < (yMax - increase) )
               {
                   sY = sY+uY;
               }
               
           }if(smoothResult == 1)
           {
               if((sY < (yMax - increase)) && (sX < (xMax - increase) ))
               {
               sY = sY+uY;
               sX = sX+rX;
               }
               
           }if(smoothResult == 2)
           {
               if(sX < (xMax - increase))
               {
                sX = sX+rX;
               }
                   
           }if(smoothResult == 3)
           {
               if((sX < (xMax - increase)) && (sY > (yMin - decrease)))
               {
               sX = sX+rX;
               sY = sY+dY;
               }
               
           }if(smoothResult == 4)
           {
               if(sY > (yMin - decrease))
               {
                   sY = sY+dY;
               }
               
           }if(smoothResult == 5)
           {
               if((sX > (xMin - decrease))&& (sY > (yMin - decrease)))
               {
                   sY = sY+dY;
                   sX = sX+lX;
                   
               }
               
           }if(smoothResult == 6)
           {
               if(sX > (xMin - decrease))
               {
                   sX = sX+lX;
               }
               
           }if(smoothResult == 7)
           {
               if((sX > (xMin - decrease)) && (sY < (yMax - increase)))
               {
               sX = sX+lX;
               sY = sY+uY;
               }
               
           }
           
            //st1.setBounds(sX,sY,sWidth,sHeight);
           
            if (sX < xMax && sX > xMin && sY < yMax && sY > yMin)
           {
               
               st1.setBounds(sX,sY,sWidth,sHeight);
            
           }
               
           }
        }

    

}
