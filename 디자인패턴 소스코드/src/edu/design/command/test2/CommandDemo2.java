package edu.design.command.test2;


import java.awt.Component;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.Icon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;

class ExitCommand extends AbstractAction {
	private Component target;

	public ExitCommand(String name, Icon icon, Component target) {
		putValue(Action.NAME, name);
		this.target = target;
	}

	public void actionPerformed(ActionEvent evt) {
		int answer = JOptionPane.showConfirmDialog(target, "종료를 원하시나요? ", "확인창", JOptionPane.YES_NO_OPTION);
		if (answer == JOptionPane.YES_OPTION) {
			System.exit(0);
		}
	}
}

class SubmitCommand extends AbstractAction {
	private Component target;

	public SubmitCommand(String name, Icon icon, Component target) {
		putValue(Action.NAME, name);
		this.target = target;
	}

	public void actionPerformed(ActionEvent event) {
		JOptionPane.showMessageDialog(target, "submit action이 클릭되었네요. ");
	}
}

class CommandDemo2 extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	CommandDemo2() {
		Action exitAction = new ExitCommand("Exit", null, this);
		Action submitAction = new SubmitCommand("Submit", null, this);

		JMenuBar menuBar = new JMenuBar();
		JMenu menu = new JMenu("File");
		JMenuItem exitMenu = new JMenuItem(exitAction);
		JMenuItem submitMenu = new JMenuItem(submitAction);

		menu.add(submitMenu);
		menu.add(exitMenu);
		menuBar.add(menu);
		setJMenuBar(menuBar);

		final JPopupMenu pop = new JPopupMenu("PopMenu");
		pop.add(submitAction);
		pop.add(exitAction);
		addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				showPopup(e);
			}

			public void mouseReleased(MouseEvent e) {
				showPopup(e);
			}

			private void showPopup(MouseEvent e) {
				if (e.isPopupTrigger()) {
					pop.show(e.getComponent(), e.getX(), e.getY());
				}
			}
		});
		JPanel jp = new JPanel();
		JButton subbtn = new JButton(submitAction);
		JButton exitbtn = new JButton(exitAction);
		jp.add(subbtn);
		jp.add(exitbtn);

		Container con = getContentPane();
		con.add(jp, "South");

		setTitle("Command pattern 예제");
		setSize(400, 200);
		setVisible(true);
	}

	public static void main(String[] args) {
		new CommandDemo2();
	}
}
