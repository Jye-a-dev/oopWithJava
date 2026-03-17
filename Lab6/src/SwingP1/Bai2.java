package SwingP1;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Bai2 {
	public static void main(String[] args) {
		PrimeForm();
	}
	
	public static void PrimeForm() {
		JFrame frame = new JFrame();
		JButton resultBtn = new JButton("Result");
		JButton clearBtn = new JButton("Clear");
		JTextField inputTxt = new JTextField(10);
		JLabel outputLbl = new JLabel();
		JLabel textLbl = new JLabel();

		
		frame.setLayout(new FlowLayout(FlowLayout.CENTER,10,20));
		
		textLbl.setText("Nhập vào số cần kiểm tra nguyên tố");
		frame.add(textLbl);
		frame.add(inputTxt);
		
		frame.add(clearBtn);
		frame.add(resultBtn);
		frame.add(outputLbl);
		
		frame.setSize(500, 400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		frame.setLocationRelativeTo(null);
		
		resultBtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				int a = Integer.parseInt(inputTxt.getText());
				if(checkPrime(a) == false) {
					outputLbl.setText("Là 1 số nguyên tố");
				} else {
					outputLbl.setText("Không phải là 1 số nguyên tố");
				}
			}
		});
		
		clearBtn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				inputTxt.setText("");
				outputLbl.setText("");
			}
		});
	}

	public static boolean checkPrime(int a) {
		if (a%2 == 0 || a%3 == 0 || a%5 == 0 || a%7 == 0) {
			return true;
		} else if(a == 2 || a== 3 || a == 5 || a == 7) {
			return true;
		}
		return false;
	}
}
