import java.awt.*;
import javax.swing.*;

public class myJFrame extends JFrame
{
	myJPanelstd mjp;
        myScoreP msp;
	public myJFrame ()
	{
		super ("My First Frame");
//------------------------------------------------------
// Create components
                msp = new myScoreP();
                mjp = new myJPanelstd(msp);
        
//------------------------------------------------------
// Choose a Layout for JFrame and 
// add Jpanel to JFrame according to layout    	
		getContentPane().setLayout(new BorderLayout());
		getContentPane().add(mjp,"Center");
                getContentPane().add(msp,"North");
//------------------------------------------------------
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize (700, 540); // setSize(width, height)
		setVisible(true);
	}
}
