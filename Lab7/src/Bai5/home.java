package Bai5;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.Timer;

public class home {
	static int s = 0;
	static Timer timer;

	public static void main(String[] args) {
		clock();
	}

	public static void clock() {
		JFrame frame = new JFrame();
		JButton btnStop = new JButton("Stop");
		JButton btnStart = new JButton("Start");
		JLabel time = new JLabel("Time: 0");

		timer = new Timer(1000, new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				s++;
				time.setText("Time: " + s);
			}
		});

		btnStart.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				timer.start();
			}
		});

		btnStop.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				timer.stop();
			}
		});

		frame.setLayout(new FlowLayout());
		frame.add(time);
		frame.add(btnStart);
		frame.add(btnStop);

		frame.setSize(300, 150);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
	}
}