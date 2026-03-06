package SwingP1;

import java.awt.FlowLayout;
import javax.swing.*;

public class Bai3 {
    static boolean clearNext = false;

    public static void main(String[] args) {
        caculatorForm();
    }

    public static void caculatorForm() {
        JFrame frame = new JFrame("Calculator");
        JTextField inputTxt = new JTextField(45);
        JLabel outputLbl = new JLabel();
        frame.add(inputTxt);

        for (int i = 0; i < 10; i++) {
            JButton btn = new JButton(String.valueOf(i));
            btn.addActionListener(e -> {
                if (clearNext) {
                    inputTxt.setText("");
                    clearNext = false;
                }
                inputTxt.setText(inputTxt.getText() + btn.getText());
            });
            frame.add(btn);
        }

        String[] dau = {"+", "-", "*", "/", "**"};
        for (String Dau : dau) {
            JButton btn = new JButton(Dau);
            btn.addActionListener(e -> inputTxt.setText(inputTxt.getText() + Dau));
            frame.add(btn);
        }

        JButton btnBang = new JButton("=");
        btnBang.addActionListener(e -> {
            String result = tinhToan(inputTxt.getText());
            outputLbl.setText("Kết quả: " + result);
            clearNext = true;
        });
        frame.add(btnBang);
        frame.add(outputLbl);

        frame.setLayout(new FlowLayout(FlowLayout.CENTER, 20, 30));
        frame.setSize(500, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
    }

    public static String tinhToan(String s) {
        try {
            if (s.contains("**")) {
                String[] p = s.split("\\*\\*");
                return String.valueOf(Math.pow(Double.parseDouble(p[0].trim()), Double.parseDouble(p[1].trim())));
            } else if (s.contains("*")) {
                String[] p = s.split("\\*");
                return String.valueOf(Double.parseDouble(p[0].trim()) * Double.parseDouble(p[1].trim()));
            } else if (s.contains("/")) {
                String[] p = s.split("/");
                double a = Double.parseDouble(p[0].trim()), b = Double.parseDouble(p[1].trim());
                return b == 0 ? "Lỗi: chia cho 0" : String.valueOf(a / b);
            } else if (s.contains("+")) {
                String[] p = s.split("\\+");
                return String.valueOf(Double.parseDouble(p[0].trim()) + Double.parseDouble(p[1].trim()));
            } else if (s.contains("-")) {
                int idx = s.indexOf("-");
                return String.valueOf(Double.parseDouble(s.substring(0, idx).trim()) - Double.parseDouble(s.substring(idx + 1).trim()));
            }
            return s;
        } catch (Exception e) {
            return "Lỗi biểu thức!";
        }
    }
}