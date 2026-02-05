package Swing;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Test extends JFrame {
	public Test() {
		setTitle("Test Swing trong Java");
		setSize(500,600);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public static void main(String[] args) {
		Test frame = new Test();
		JLabel label = new JLabel("Form điền");
		JTextField field = new JTextField(20);
		JButton button = new JButton("Nộp");
		
		frame.add(label);
		frame.add(field);
		frame.add(button);
		
		button.addActionListener((ActionEvent e) -> {
                    JOptionPane.showMessageDialog(null, "Đã nộp!");
                });
		
		
		frame.setLayout(new FlowLayout());
		frame.setVisible(true);
	}
}
