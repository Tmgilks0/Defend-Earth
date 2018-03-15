import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

import java.awt.color.*;


public class GameFrame extends Frame implements WindowListener, ActionListener{

	private Button btnPlay, btnOption, btnTutorial, btnExit;
	
	private Label title;
	
	private Frame mainframe;
	
	public GameFrame () {
		setLayout(new FlowLayout()); // We may need to change the type of layout. This arranges
									// components from left to right with in the Frame
		

		Panel menubtnDisplay = new Panel(new GridLayout(5,1));
		
		title= new Label("Defend Earth",SwingConstants.TOP);
		title.setForeground(Color.orange);
		title.setFont(new Font("Sans Serif",Font.BOLD, 70));
		menubtnDisplay.add(title);
		
		btnPlay = new Button("Play");
		menubtnDisplay.add(btnPlay);
		btnPlay.setPreferredSize(new Dimension(300,50));
		btnPlay.setFont(new Font("Sans Serif", Font.BOLD, 28));
		btnPlay.setForeground(Color.orange);
		btnPlay.setBackground(Color.black);
		btnPlay.addActionListener(this);
		
		btnOption = new Button("Options");
		menubtnDisplay.add(btnOption);
		btnOption.setPreferredSize(new Dimension(300,50));
		btnOption.setFont(new Font("Sans Serif", Font.BOLD, 28));
		btnOption.setForeground(Color.orange);
		btnOption.setBackground(Color.black);
		btnOption.addActionListener(this);
		
		btnTutorial = new Button("Tutorial");
		menubtnDisplay.add(btnTutorial);
		btnTutorial.setPreferredSize(new Dimension(300,50));
		btnTutorial.setFont(new Font("Sans Serif", Font.BOLD, 28));
		btnTutorial.setForeground(Color.orange);
		btnTutorial.setBackground(Color.black);
		btnTutorial.addActionListener(this);
		
		btnExit = new Button("Exit");
		menubtnDisplay.add(btnExit);
		btnExit.setPreferredSize(new Dimension(300,50));
		btnExit.setFont(new Font("Sans Serif", Font.BOLD, 28));
		btnExit.setForeground(Color.orange);
		btnExit.setBackground(Color.black);
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
		setBackground(Color.black);
		setSize(1000,600);
		setVisible(true);
	}
	
	public static void main (String[] args) {
		new GameFrame();
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
	
		if(e.getSource() == btnPlay) {
			System.out.println("Play was selected");
		}
		if(e.getSource() == btnOption) {
			System.out.println("Option was selected");
		}
		if(e.getSource() == btnTutorial) {
			System.out.println("Tutorial was selected");
		}
		if(e.getSource() == btnExit) {
			System.out.println("Exit was selected");
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
			
}
