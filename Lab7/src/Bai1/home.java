package Bai1;

import java.awt.FlowLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class home {
	public static void main(String[] args) {
		toaDo();
	}

	public static void toaDo() {
		JFrame frame = new JFrame();
		JLabel coordinate = new JLabel("Toạ độ: ");
		MouseMotionListener mouse = new MouseMotionListener() {
			
			@Override
			public void mouseMoved(MouseEvent e) {
				coordinate.setText("Toạ độ: X: " + e.getX()+ " Y: " + e.getY());
			}
			
			@Override
			public void mouseDragged(MouseEvent e) {
				// TODO Auto-generated method stub
			}
		};
		
		frame.add(coordinate);
		frame.addMouseMotionListener(mouse);
		
		frame.setLayout(new FlowLayout(FlowLayout.LEFT, 20, 30));
		frame.setSize(500, 700);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		frame.setLocationRelativeTo(null);	
	}
}
