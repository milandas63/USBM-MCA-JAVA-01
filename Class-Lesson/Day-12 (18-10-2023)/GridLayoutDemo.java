package com.day12;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class GridLayoutDemo extends JFrame {
	public GridLayoutDemo() {
		this.setLayout(new BorderLayout());
		
			JButton btnNorth = new JButton("NORTH");
			JButton btnWest = new JButton("WEST");
			JPanel pnlCenter = new JPanel(new GridLayout(6,7));
				JButton btnDummy;
				String[] days = {"Sun","Mon","Tue","Wed","Thu","Fri","Sat"};
				for(int i=0; i<days.length; i++) {
					btnDummy = new JButton(days[i]);
					btnDummy.setForeground(Color.BLUE);
					pnlCenter.add(btnDummy);
				}
				
				for(int i=1; i<=31; i++) {
					btnDummy = new JButton(String.valueOf(i));
					pnlCenter.add(btnDummy);
				}
			JButton btnEast = new JButton("EAST");
			JButton btnSouth = new JButton("SOUTH");

			btnNorth.setBackground(Color.RED);
			btnWest.setBackground(Color.YELLOW);
			btnEast.setBackground(Color.GREEN);
			btnSouth.setBackground(Color.BLUE);

			btnNorth.setOpaque(true);
			btnWest.setOpaque(true);
			btnEast.setOpaque(true);
			btnSouth.setOpaque(true);
			
			this.add(btnNorth, BorderLayout.NORTH);
			this.add(btnWest, BorderLayout.WEST);
			this.add(pnlCenter, BorderLayout.CENTER);
			this.add(btnEast, BorderLayout.EAST);
			this.add(btnSouth, BorderLayout.SOUTH);
			
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setBounds(50, 50, 1000, 600);
		this.setVisible(true);
	}

	public static void main(String[] args) {
		new GridLayoutDemo();
	}

}
