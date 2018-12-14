package view;

import java.awt.event.ActionListener;
import java.util.Observable;
import java.util.Observer;

import javax.swing.JButton;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JToolBar;

import controller.ControllerAiDifficulty;
import controller.ControllerRestart;

import main.Jeu;

public class VueMenu extends JMenuBar implements Observer{

	private Jeu jeu;

	public VueMenu(Jeu j) {
		jeu = j;

		JMenu menu = new JMenu("pineapple");
		JMenuItem restart = new JMenuItem("Restart");
		restart.addActionListener(new ControllerRestart(jeu));
		menu.add(restart);
		
		JMenuItem difficulty = new JMenuItem("Difficulty");
		difficulty.addActionListener(new ControllerAiDifficulty(jeu));
		menu.add(difficulty);
		this.add(menu);
	}

	@Override
	public void update(Observable o, Object arg) {
		// TODO Auto-generated method stub
		
	}

}