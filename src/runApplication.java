import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JFrame;


public class runApplication {

	public static void main(String args[])
	{
		PanelMain pnl = new PanelMain();
		
		JFrame f = new JFrame();
		f.setSize(800,400);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.add(pnl);
		f.setTitle("Final Year Project");
		f.setVisible(true);

		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		double width = (screenSize.getWidth())/4;
		double height = (screenSize.getHeight())/4;
		
		f.setLocation((int) width, (int) height);
	}
}
