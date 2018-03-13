import java.awt.*;
import java.awt.event.*;

public class GameFrame extends Frame implements WindowListener{

	
	
	public GameFrame () {
		setLayout(new FlowLayout());		// We may need to change the type of layout. This arranges
										// components from left to right with in the Frame
		addWindowListener(this);
		setTitle("Defend-Earth");
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		int width = (int) screenSize.getWidth();
		int height = (int) screenSize.getHeight();
		setSize(width, height);
		setVisible(true);
	}
	
	public static void main (String[] args) {
		new GameFrame();
	}
	
	@Override
	public void windowClosing(WindowEvent evt) {
		System.exit(0);
	}
		//Below is needed for above to compile
			@Override public void windowOpened(WindowEvent evt) {}
			@Override public void windowClosed(WindowEvent evt) {}
			@Override public void windowIconified(WindowEvent evt) {}
			@Override public void windowDeiconified(WindowEvent evt) {}
			@Override public void windowActivated(WindowEvent evt) {}
			@Override public void windowDeactivated(WindowEvent evt) {}
			
}
