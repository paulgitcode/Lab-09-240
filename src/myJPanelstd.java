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
    
    
	public myJPanelstd()
	{
            super();
            setBackground(Color.pink);
            setLayout(null);
            sWidth = 20;
            sHeight = 20;
            sX = 21;
            sY = 21;
            xMax = 580;
            xMin = 20;
            yMax = 440;
            yMin = 20;
            move = new Timer(100,this);
            move.start();
            
	    //JButton jb1;
   	    //jb1 = new JButton();
//-------------------------------------------------------	    
// add buttons to JPanel		
//-------------------------------------------------------	    
		add(st1);
                st1.setBackground(Color.gray);
                st1.setText(st1.getFN());
                st1.addActionListener(this);
                st1.setBounds(sX,sY,sWidth,sHeight); // in null layout, setBound(x,y,width, height)
	}
       @Override 
        public void actionPerformed(ActionEvent e)
        {
           Object obj = e.getSource();
           
           if(obj == st1)
           {
           //st1.setText(st1.getFN());
           //st1.setBackground(Color.lightGray);
           
           }
          
           
           if(obj == move)
           {
               
           sX = sX+10;
           sY = sY+10;
           if (sX < xMax && sX > xMin && sY < yMax && sY > yMin)
           {
               
               st1.setBounds(sX,sY,sWidth,sHeight);
            
           }
               
           }
        }

    

}
