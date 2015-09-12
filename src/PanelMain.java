import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.BorderFactory;
import javax.swing.JPanel;


public class PanelMain extends JPanel{

	Color pnlBackgroundColor;
	Color bdrColor;
	
	public PanelMain()
	{	
		setUpRescources();
		this.setLayout(new BorderLayout());
		this.setBorder(BorderFactory.createEmptyBorder(20,20,20,20));
		this.setBackground(bdrColor);

		JPanel pnlCenter = new JPanel();
		pnlCenter.setLayout(new BorderLayout());
		pnlCenter.setPreferredSize(new Dimension(800,400));
		pnlCenter.setMaximumSize(new Dimension(800,400));  
		pnlCenter.setMinimumSize(new Dimension(800,400));
		pnlCenter.setBackground(pnlBackgroundColor); 
		pnlCenter.setBorder(BorderFactory.createEmptyBorder(20,20,20,20));
		
		this.add(pnlCenter,BorderLayout.CENTER);
	}
	
	//used to setup Images, Colors, Dimensions etc.
	public void setUpRescources()
	{
		pnlBackgroundColor = Color.lightGray;
		bdrColor = Color.white;
	}
}
