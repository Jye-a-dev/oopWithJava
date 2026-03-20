package Bai2;

import java.awt.FlowLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Home {
    public static void main(String[] args) {
        checkBox();
    }

    public static void checkBox() {
        JFrame frame = new JFrame();
        JLabel thongBao = new JLabel("Đã chọn: ");
        JCheckBox box1 = new JCheckBox("C#");
        JCheckBox box2 = new JCheckBox("Java");
        JCheckBox box3 = new JCheckBox("Typescript / Javascript");
        JCheckBox box4 = new JCheckBox("PHP");
        JCheckBox box5 = new JCheckBox("Python");

        ItemListener clicked = new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                String text = "Đã chọn:";
                if (box1.isSelected()) text += " C#";
                if (box2.isSelected()) text += " Java";
                if (box3.isSelected()) text += " Typescript / Javascript";
                if (box4.isSelected()) text += " PHP";
                if (box5.isSelected()) text += " Python";
                thongBao.setText(text);
            }
        };

        box1.addItemListener(clicked);
        box2.addItemListener(clicked);
        box3.addItemListener(clicked);
        box4.addItemListener(clicked);
        box5.addItemListener(clicked);

        frame.add(box1);
        frame.add(box2);
        frame.add(box3);
        frame.add(box4);
        frame.add(box5);
        frame.add(thongBao);

        frame.setLayout(new FlowLayout(FlowLayout.LEFT, 20, 30));
        frame.setSize(500, 700);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
    }
}