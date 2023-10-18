package com.day12;

import javax.swing.JButton;
import javax.swing.JFrame;

public class LayoutDemo extends JFrame {
	public LayoutDemo() {
		this.setLayout(null); 		// Deactivate the LayoutManager
		
		JButton btnSave = new JButton(" Save ");
		btnSave.setBounds(300, 500, 120, 35);
		this.add(btnSave);
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setBounds(50, 50, 1000, 600);
		this.setVisible(true);
	}

	public static void main(String[] args) {
		new LayoutDemo();
	}

}
