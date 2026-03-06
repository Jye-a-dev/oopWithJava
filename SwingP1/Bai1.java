package SwingP1;

import java.awt.FlowLayout;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Bai1 {
	public static void main(String[] args) {
		FrameTime();
	}
	
	public static void FrameTime () {
		JFrame frame = new JFrame("JLabel");
		JLabel label = new JLabel("");
		
		LocalTime time = LocalTime.now();
		DateTimeFormatter format = DateTimeFormatter.ofPattern("HH:mm:ss");
		String newTime = time.format(format);
		
		label.setText("Thời gian hiện tại: " + newTime + " UTC + 7");
		frame.add(label);
		
		
		frame.setSize(500, 400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(new FlowLayout());
		frame.setVisible(true);
	}
}
