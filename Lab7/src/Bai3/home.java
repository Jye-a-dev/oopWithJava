package Bai3;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class home {
    static int x = 150;
    static int y = 150;
    static final int STEP = 10;
    static final int SIZE = 150;

    public static void main(String[] args) {
        controllingSquare();
    }

    public static void controllingSquare() {
        JFrame frame = new JFrame();
        JPanel square = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                g.setColor(Color.blue);
                g.fillRect(x, y, SIZE, SIZE);
            }
        };
        square.setBackground(Color.WHITE);

        KeyListener keyInput = new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) { }

            @Override
            public void keyReleased(KeyEvent e) { }

            @Override
            public void keyPressed(KeyEvent e) {
                int panelWidth = square.getWidth();
                int panelHeight = square.getHeight();

                switch (e.getKeyCode()) {
                    case KeyEvent.VK_A:
                        if (x - STEP >= 0) x -= STEP;
                        break;
                    case KeyEvent.VK_D:
                        if (x + SIZE + STEP <= panelWidth) x += STEP;
                        break;
                    case KeyEvent.VK_W:
                        if (y - STEP >= 0) y -= STEP;
                        break;
                    case KeyEvent.VK_S:
                        if (y + SIZE + STEP <= panelHeight) y += STEP;
                        break;
                }
                square.repaint();
            }
        };

        square.addKeyListener(keyInput);
        square.setFocusable(true);

        frame.add(square);
        frame.setSize(700, 700);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        square.requestFocusInWindow();
    }
}