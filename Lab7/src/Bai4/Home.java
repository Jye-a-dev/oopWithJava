package Bai4;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Home {
	public static void main(String[] args) {
		Clicking();
	}
	static int n = 0;

	public static void Clicking() {
		JFrame frame = new JFrame();
		JLabel thongBao = new JLabel("Click: ");
		
		
		MouseListener click = new MouseListener() {
			
			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseClicked(MouseEvent e) {
				n++;
				thongBao.setText("Click: " + n + " lần" );
				
			}
		};
		
		frame.add(thongBao);
		frame.addMouseListener(click);
		
		frame.setSize(300, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
	}
}
