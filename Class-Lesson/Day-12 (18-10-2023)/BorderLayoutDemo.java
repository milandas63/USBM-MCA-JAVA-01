package com.day12;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;

public class BorderLayoutDemo extends JFrame {
	public BorderLayoutDemo() {
		this.setLayout(new BorderLayout());
		
			JButton btnNorth = new JButton("NORTH");
			JButton btnWest = new JButton("WEST");
			JButton btnCenter = new JButton("CENTER");
			JButton btnEast = new JButton("EAST");
			JButton btnSouth = new JButton("SOUTH");

			btnNorth.setBackground(Color.RED);
			btnWest.setBackground(Color.YELLOW);
			btnCenter.setBackground(Color.GRAY);
			btnEast.setBackground(Color.GREEN);
			btnSouth.setBackground(Color.BLUE);

			btnNorth.setOpaque(true);
			btnWest.setOpaque(true);
			btnCenter.setOpaque(true);
			btnEast.setOpaque(true);
			btnSouth.setOpaque(true);
			
			this.add(btnNorth, BorderLayout.NORTH);
			this.add(btnWest, BorderLayout.WEST);
			this.add(btnCenter, BorderLayout.CENTER);
			this.add(btnEast, BorderLayout.EAST);
			this.add(btnSouth, BorderLayout.SOUTH);
			
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setBounds(50, 50, 1000, 600);
		this.setVisible(true);
	}

	public static void main(String[] args) {
		new BorderLayoutDemo();
	}

}
