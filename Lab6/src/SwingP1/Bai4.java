package SwingP1;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JOptionPane;

public class Bai4 {
    public static void main(String[] args) {
        infoForm();
    }

    public static void infoForm() {
        JFrame frame = new JFrame();
        JTextField txtTen = new JTextField(30);
        JTextField txtMa = new JTextField(30);
        JTextField txtLop = new JTextField(35);

        JLabel lblTen = new JLabel("Nhập tên");
        JLabel lblMa = new JLabel("Nhập mã sinh viên");
        JLabel lblLop = new JLabel("Nhập lớp");

        JButton btnSave = new JButton("Save");
        JButton btnShow = new JButton("Show");

        JLabel lblResult = new JLabel("Kết quả sẽ hiển thị ở đây");

        frame.add(lblTen);
        frame.add(txtTen);
        frame.add(lblMa);
        frame.add(txtMa);
        frame.add(lblLop);
        frame.add(txtLop);
        frame.add(btnSave);
        frame.add(btnShow);
        frame.add(lblResult);

        frame.setLayout(new FlowLayout(FlowLayout.LEFT, 20, 30));
        frame.setSize(500, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);

        Bai4 bai4 = new Bai4();
        String fileName = "sinhvien.txt";

        btnSave.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String content = "Tên: " + txtTen.getText() + " " +
                                 "\nMã SV: " + txtMa.getText() + " " +
                                 "\nLớp: " + txtLop.getText();
                bai4.Write(fileName, content);
                JOptionPane.showMessageDialog(frame, "Đã lưu thông tin vào file!");
            }
        });

        btnShow.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
                    StringBuilder builder = new StringBuilder();
                    String line;
                    while ((line = br.readLine()) != null) {
                        builder.append(line).append("\n");
                    }
                    lblResult.setText(builder.toString());
                } catch (IOException ex) {
                    lblResult.setText("Không thể đọc file!");
                }
            }
        });
    }

    public void create(String fileName) {
        try {
            File f = new File(fileName);
            f.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public class Check_File {
        public boolean check(String fileName) {
            File f = new File(fileName);
            return f.exists();
        }
    }

    public void read(String fileName) {
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            StringBuilder builder = new StringBuilder();
            String line;
            while ((line = br.readLine()) != null) {
                builder.append(line).append("\n");
            }
            JOptionPane.showMessageDialog(null, builder.toString(), "Nội dung file", JOptionPane.INFORMATION_MESSAGE);
        } catch (IOException e) {
        }
    }

    public void Write(String fileName, String Content) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(fileName))) {
            bw.write(Content);
            bw.newLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}