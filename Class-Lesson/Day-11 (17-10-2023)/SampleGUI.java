package com.day11;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JSplitPane;

public class SampleGUI {
	public SampleGUI() {
		JFrame f = new JFrame("College Management System");
		JMenuBar mbar = new JMenuBar();
		f.setJMenuBar(mbar);
			JMenu file = new JMenu("File");
			file.setMnemonic('F');			//	Short-cut key activated with Alt key 
			mbar.add(file);
				JMenuItem fileNew = new JMenuItem("New");
				fileNew.setMnemonic('N');
				file.add(fileNew);
				file.addSeparator();
				JMenuItem fileOpen = new JMenuItem("Open");
				file.add(fileOpen);
				file.addSeparator();
				JMenuItem fileClose = new JMenuItem("Close");
				file.add(fileClose);
				file.addSeparator();
				JMenuItem fileExit = new JMenuItem("Exit");
				file.add(fileExit);
			JMenu edit = new JMenu("Edit");
			mbar.add(edit);
				JMenuItem editCut = new JMenuItem("Cut");
				edit.add(editCut);

		JSplitPane split = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT, false, buttonPanel(), new JPanel());
		f.add(split);
				
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setBounds(350, 100, 600, 300);
		f.setVisible(true);
	}

	public JPanel buttonPanel() {
		JPanel btnPanel = new JPanel(new GridLayout(10,1));
		JButton btnAdmission = new JButton("Admission");
		JButton btnRegistration = new JButton("Registration");
		JButton btnPayment = new JButton("Payment");
		JButton btnClassAllot = new JButton("Class Allotment");
		JButton btnHostelAllot = new JButton("Hostel Allotment");
		btnPanel.add(btnAdmission);
		btnPanel.add(btnRegistration);
		btnPanel.add(btnPayment);
		btnPanel.add(btnClassAllot);
		btnPanel.add(btnHostelAllot);
		return btnPanel;
	}
	
	public static void main(String[] args) {
		new SampleGUI();
	}

}
