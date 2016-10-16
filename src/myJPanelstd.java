import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class myJPanelstd extends JPanel implements ActionListener
{
    student st1 = new student("Tom", "Jerry", 44);
    
	public myJPanelstd()
	{
            super();
            setBackground(Color.pink);
            setLayout(new BorderLayout());
            
            
	    //JButton jb1;
   	    //jb1 = new JButton();
//-------------------------------------------------------	    
// add buttons to JPanel		
//-------------------------------------------------------	    
		add(st1, "North");
                st1.setBackground(Color.gray);
                st1.setText(st1.getN());
                st1.addActionListener(this);
	}
       @Override 
        public void actionPerformed(ActionEvent e)
        {
           st1.setText(st1.getInfo());
           st1.setBackground(Color.lightGray);
        }

    

}
