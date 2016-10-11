import java.awt.*;
import javax.swing.*;
public class myJPanelstd extends JPanel 
{
	public myJPanelstd()
	{
            super();
            setBackground(Color.pink);
	    JButton jb1;
   	    jb1 = new JButton("a real student-button should be here, not me, a simple JButton ...");
//-------------------------------------------------------	    
// add buttons to JPanel		
//-------------------------------------------------------	    
		add(jb1);
	}
}
