import java.awt.*;
import java.awt.event.*;

import javax.swing.BoxLayout;

import java.awt.color.*;


public class GameFrame extends Frame implements WindowListener, ActionListener{

	private Button btnPlay, btnOption, btnTutorial, btnExit;
	
	public GameFrame () {
		setLayout(new FlowLayout());		// We may need to change the type of layout. This arranges
										// components from left to right with in the Frame
		Panel menubtnDisplay = new Panel(new GridLayout(4,1));
		btnPlay = new Button("Play");
		menubtnDisplay.add(btnPlay);
		btnPlay.addActionListener(this);
		
		btnOption = new Button("Options");
		menubtnDisplay.add(btnOption);
		btnOption.addActionListener(this);
		
		btnTutorial = new Button("Tutorial");
		menubtnDisplay.add(btnTutorial);
		btnTutorial.addActionListener(this);
		
		btnExit = new Button("Exit");
		menubtnDisplay.add(btnExit);
		btnExit.addActionListener(this);
		
		setLayout(new GridBagLayout());
		GridBagConstraints gbc = new GridBagConstraints();
		gbc.gridwidth = GridBagConstraints.REMAINDER;
		gbc.fill = GridBagConstraints.HORIZONTAL;
		add(menubtnDisplay, gbc);
				
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize(); //This is the getting screen size
		int width = (int) screenSize.getWidth();
		int height = (int) screenSize.getHeight();
		
		addWindowListener(this);

		setTitle("Defend-Earth");
		setSize(width, height);
		setVisible(true);
	}
	
	public static void main (String[] args) {
		new GameFrame();
	}
	
	
	public void actionPerformed1(ActionEvent e) {
	
		if(e.getSource() == btnPlay) {
			System.out.print("Play was selected");
		}
		if(e.getSource() == btnOption) {
			System.out.print("Option was selected");
		}
		if(e.getSource() == btnTutorial) {
			System.out.print("Tutorial was selected");
		}
		if(e.getSource() == btnExit) {
			System.out.print("Exit was selected");
			System.exit(0);
		}
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

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
			}
			
}
