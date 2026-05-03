package Part_3;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Bai1 {
	public static void main(String[] args) {
		Frame();
	}

	public static void Frame() {
		JFrame frame = new JFrame("JLabel");

		
		JLabel lblA = new JLabel("Nhập số a: ");
		JLabel lblB = new JLabel("Nhập số b: ");

		JTextField txtInput1 = new JTextField(30);
		JTextField txtInput2 = new JTextField(30);

		JLabel lblKetQua = new JLabel("Kết quả: ");

		JButton btnGiai = new JButton("Giải");
		// ==========================================//
		frame.add(lblA);
		frame.add(txtInput1);
		
		frame.add(lblB);
		frame.add(txtInput2);

		frame.add(lblKetQua);
		frame.add(btnGiai);

		frame.setSize(500, 400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(new FlowLayout());
		frame.setVisible(true);
		// ===============================================//
		btnGiai.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				double a = Double.parseDouble(txtInput1.getText());
				double b = Double.parseDouble(txtInput2.getText());

				if (a == 0) {
					if (b == 0) {
						lblKetQua.setText("Vô số nghiệm");
					} else {
						lblKetQua.setText("Vô nghiệm");
					}
				} else {
					double x = -b / a;
					lblKetQua.setText("Kết quả: " + x);
				}

			}
		});
	}
}
