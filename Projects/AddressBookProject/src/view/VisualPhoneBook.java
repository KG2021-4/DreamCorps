package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controller.Controller;

import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.FlowLayout;
import javax.swing.SwingConstants;
import java.awt.Point;
import java.awt.Rectangle;
import javax.swing.JTextField;

public class VisualPhoneBook extends JFrame {

	private JPanel contentPane;
	private JButton btnNewButton;
	private JTextField txtPhoneNumber;
	private JTextField txtLastName;
	private JTextField txtFirstName;
	private Controller c;
	

	/**
	 * Create the frame.
	 */
	public VisualPhoneBook(Controller c) {
		this.setC(c);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 699, 627);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JLabel lblNewLabel = new JLabel("New Contact");
		contentPane.add(lblNewLabel, BorderLayout.NORTH);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		FlowLayout flowLayout = (FlowLayout) panel.getLayout();
		flowLayout.setAlignment(FlowLayout.RIGHT);
		contentPane.add(panel, BorderLayout.SOUTH);
		
		btnNewButton = new JButton("Add");
        btnNewButton.addActionListener(getC());
        panel.add(btnNewButton);

		JButton btnNewButton_1 = new JButton("Cancel");
		panel.add(btnNewButton_1);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLocation(new Point(100, 0));
		panel_1.setBackground(Color.WHITE);
		contentPane.add(panel_1, BorderLayout.CENTER);
		
		JLabel lblNewLabel_1 = new JLabel("First Name");
		panel_1.add(lblNewLabel_1);
		
		txtFirstName = new JTextField();
		panel_1.add(txtFirstName);
		txtFirstName.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Last Name");
		panel_1.add(lblNewLabel_2);
		
		txtLastName = new JTextField();
		panel_1.add(txtLastName);
		txtLastName.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Phone Number");
		panel_1.add(lblNewLabel_3);
		
		txtPhoneNumber = new JTextField();
		panel_1.add(txtPhoneNumber);
		txtPhoneNumber.setColumns(10);
	}


	public Controller getC() {
		return c;
	}


	public void setC(Controller c) {
		this.c = c;
	}


	public JButton getBtnNewButton() {
		return btnNewButton;
	}


	public JTextField getTxtPhoneNumber() {
		return txtPhoneNumber;
	}


	public JTextField getTxtLastName() {
		return txtLastName;
	}


	public JTextField getTxtFirstName() {
		return txtFirstName;
	}

}
