import java.awt.*;
import javax.swing.*;

public class myJFrame extends JFrame
{
	myJPanelstd mjp;
	public myJFrame ()
	{
		super ("My First Frame");
//------------------------------------------------------
// Create components
    	mjp = new myJPanelstd();
//------------------------------------------------------
// Choose a Layout for JFrame and 
// add Jpanel to JFrame according to layout    	
		getContentPane().setLayout(new BorderLayout());
		getContentPane().add(mjp,"Center");
//------------------------------------------------------
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize (640, 480);
		setVisible(true);
	}
}
