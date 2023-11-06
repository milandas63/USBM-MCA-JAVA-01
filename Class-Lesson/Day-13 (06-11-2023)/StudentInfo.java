package com.day13;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Vector;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class StudentInfo extends JFrame {
	JTextField tfRollNo;
	JTextField tfName;
	JTextField tfFather;
	JRadioButton rbMale;
	JRadioButton rbFemale;
	JRadioButton rbOther;
	JTextField tfDob;
	JComboBox cbCourse;
	JComboBox cbDepartment;
	
	JButton btnSave;
	JButton btnClear;
	JButton btnExit;
	
	public StudentInfo() {
		this.setLayout(new BorderLayout());
		this.setTitle("Student Information System");
		
		JLabel lblTitle = new JLabel("Student Information System",JLabel.CENTER);
		lblTitle.setFont(new Font("Arial", Font.BOLD, 20));
		lblTitle.setBackground(Color.blue);
		lblTitle.setForeground(Color.yellow);
		lblTitle.setOpaque(true);
		this.add(lblTitle, BorderLayout.NORTH);
		
		JPanel pnlWest = new JPanel(new GridLayout(12,1));
		this.add(pnlWest, BorderLayout.WEST);
			JLabel lblRoll = new JLabel("Roll-No: ", JLabel.RIGHT);
			JLabel lblName = new JLabel("Student Name: ", JLabel.RIGHT);
			JLabel lblFather = new JLabel("Father's Name: ", JLabel.RIGHT);
			JLabel lblGender = new JLabel("Gender: ", JLabel.RIGHT);
			JLabel lblDob = new JLabel("Date of Birth: ", JLabel.RIGHT);
			JLabel lblCourse = new JLabel("Course: ", JLabel.RIGHT);
			JLabel lblDepart = new JLabel("Department: ", JLabel.RIGHT);
			pnlWest.add(new JLabel(""));
			pnlWest.add(new JLabel(""));
			pnlWest.add(lblRoll);
			pnlWest.add(lblName);
			pnlWest.add(lblFather);
			pnlWest.add(lblGender);
			pnlWest.add(lblDob);
			pnlWest.add(lblCourse);
			pnlWest.add(lblDepart);
			pnlWest.add(new JLabel(""));
			pnlWest.add(new JLabel(""));
			pnlWest.add(new JLabel(""));

		JPanel pnlCenter = new JPanel(new GridLayout(12,1));
		this.add(pnlCenter, BorderLayout.CENTER);
			tfRollNo = new JTextField();
			tfName = new JTextField();
			tfFather = new JTextField();
			rbMale = new JRadioButton("Male");
			rbFemale = new JRadioButton("Female");
			rbOther = new JRadioButton("Other");
			ButtonGroup bgGender = new ButtonGroup();
				bgGender.add(rbMale);
				bgGender.add(rbFemale);
				bgGender.add(rbOther);
			JPanel pnlGender = new JPanel(new GridLayout(1,3));
				pnlGender.add(rbMale);
				pnlGender.add(rbFemale);
				pnlGender.add(rbOther);
			tfDob = new JTextField();
			cbCourse = new JComboBox<String>(addCourses());
			cbDepartment = new JComboBox<String>(addDepartment());

			pnlCenter.add(new JLabel(""));
			pnlCenter.add(new JLabel(""));
			pnlCenter.add(tfRollNo);
			pnlCenter.add(tfName);
			pnlCenter.add(tfFather);
			pnlCenter.add(pnlGender);
			pnlCenter.add(tfDob);
			pnlCenter.add(cbCourse);
			pnlCenter.add(cbDepartment);
			pnlCenter.add(new JLabel(""));
			pnlCenter.add(new JLabel(""));
			pnlCenter.add(new JLabel(""));

		JPanel pnlButton = new JPanel(new GridLayout(1,3));
		this.add(pnlButton, BorderLayout.SOUTH);
			btnSave = new JButton("Save");
			btnClear = new JButton("Clear");
			btnExit = new JButton("Exit");
			btnSave.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					String rollno = tfRollNo.getText();
					String name = tfName.getText();

					System.out.println(rollno+", "+name);
				}
			});
			btnClear.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					tfRollNo.setText("");
					tfName.setText("");
					tfFather.setText("");
					bgGender.clearSelection();
					
					//tfRollNo.setFocus
					
				}
			});
			btnExit.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent arg0) {
					System.exit(0);
				}
			});
			pnlButton.add(btnSave);
			pnlButton.add(btnClear);
			pnlButton.add(btnExit);
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setBounds(200,150,550,550);
		this.setVisible(true);
	}

	private Vector<String> addCourses() {
		Vector<String> vCourses = new Vector<String>();
		vCourses.add("BCA");
		vCourses.add("BBA");
		vCourses.add("MCA");
		vCourses.add("MBA");
		return vCourses;
	}

	private Vector<String> addDepartment() {
		Vector<String> vDepartment = new Vector<String>();
		vDepartment.add("Master in Computer Application");
		vDepartment.add("Master in Business Administration");
		return vDepartment;
	}

	@Override
	public Insets getInsets() {
		return new Insets(5,25,5,25);
	}

	public static void main(String[] args) {
		new StudentInfo();
	}

}
