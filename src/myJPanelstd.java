import java.awt.*;
import java.awt.event.ActionListener;
import javax.swing.*;

public class myJPanelstd extends JPanel implements ActionListener
{
	public myJPanelstd()
	{
            super();
            setBackground(Color.pink);
            
            student st1 = new student("Tom", "Jerry", 44);
            
	    //JButton jb1;
   	    //jb1 = new JButton();
//-------------------------------------------------------	    
// add buttons to JPanel		
//-------------------------------------------------------	    
		add(st1);
                st1.setBackground(Color.gray);
                st1.setText(st1.getN());
	}
        
        public void actionPerformed(ActionEvent e)
        {
            
        }
}
