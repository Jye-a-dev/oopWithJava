package SwingP2;

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
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class danhSach {
    public static void main(String[] args) {
        listForm();
    }

    public static void listForm() {
        JFrame frame = new JFrame();

        JLabel lblSTT = new JLabel("Số thứ tự: ");
        JLabel lblName = new JLabel("Tên: ");
        JLabel lblClass = new JLabel("Lớp: ");
        JLabel lblDiem = new JLabel("Điểm: ");

        JTextField txtSTT = new JTextField(35);
        JTextField txtName = new JTextField(40);
        JTextField txtClass = new JTextField(40);
        JTextField txtDiem = new JTextField(35);

        JButton btnAdd = new JButton("Thêm");
        JButton btnSave = new JButton("Lưu");
        JButton btnDel = new JButton("Xoá");
        JButton btnShow = new JButton("Hiện");
        JLabel lblResult = new JLabel();

        String[] Cot = {"STT", "Tên", "Lớp", "Điểm"};
        DefaultTableModel model = new DefaultTableModel(Cot, 0);
        JTable list = new JTable(model);
        list.getTableHeader().setResizingAllowed(false);
        list.getTableHeader().setReorderingAllowed(false);
        JScrollPane TableList = new JScrollPane(list);

        frame.add(lblSTT);
        frame.add(txtSTT);
        frame.add(lblName);
        frame.add(txtName);
        frame.add(lblClass);
        frame.add(txtClass);
        frame.add(lblDiem);
        frame.add(txtDiem);

        frame.add(btnShow);
        frame.add(btnAdd);
        frame.add(btnSave);
        frame.add(btnDel);
        
        frame.add(lblResult);
        frame.add(TableList);
       
        frame.setLayout(new FlowLayout(FlowLayout.LEFT, 20, 30));
        frame.setSize(500, 700);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
        
        btnAdd.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String stt = txtSTT.getText();
                String name = txtName.getText();
                String lop = txtClass.getText();
                String diem = txtDiem.getText();
                if (!stt.isEmpty() && !name.isEmpty() && !lop.isEmpty() && !diem.isEmpty()) {
                    model.addRow(new Object[]{stt, name, lop, diem});
                    lblResult.setText("Thêm thành công!");
                } else {
                    lblResult.setText("Vui lòng nhập đủ dữ liệu!");
                }
            }
        });

        btnSave.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFileChooser fileChooser = new JFileChooser();
                int result = fileChooser.showSaveDialog(frame);
                
                if (result == JFileChooser.APPROVE_OPTION) {
                    File selectedFile = fileChooser.getSelectedFile();
                    try (BufferedWriter bw = new BufferedWriter(new FileWriter(selectedFile))) {
                        for (int i = 0; i < model.getRowCount(); i++) {
                            String stt = model.getValueAt(i, 0).toString();
                            String name = model.getValueAt(i, 1).toString();
                            String lop = model.getValueAt(i, 2).toString();
                            String diem = model.getValueAt(i, 3).toString();
                            bw.write(stt + "," + name + "," + lop + "," + diem);
                            bw.newLine();
                        }
                        lblResult.setText("Lưu file thành công!");
                    } catch (IOException ex) {
                        lblResult.setText("Không thể lưu file!");
                    }
                }
            }
        });

        btnDel.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int row = list.getSelectedRow();
                if (row != -1) {
                    model.removeRow(row);
                    lblResult.setText("Xoá thành công!");
                } else {
                    lblResult.setText("Chọn dòng cần xoá!");
                }
            }
        });

        btnShow.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFileChooser fileChooser = new JFileChooser();
                int result = fileChooser.showOpenDialog(frame);
                if (result == JFileChooser.APPROVE_OPTION) {
                    File selectedFile = fileChooser.getSelectedFile();
                    model.setRowCount(0);
                    try (BufferedReader br = new BufferedReader(new FileReader(selectedFile))) {
                        String line;
                        while ((line = br.readLine()) != null) {
                            String[] data = line.split(",");
                            if (data.length == 4) {
                                model.addRow(data);
                            }
                        }
                        lblResult.setText("Đọc file thành công!");
                    } catch (IOException ex) {
                        lblResult.setText("Không thể đọc file!");
                    }
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
            javax.swing.JOptionPane.showMessageDialog(null, builder.toString(), "Nội dung file", javax.swing.JOptionPane.INFORMATION_MESSAGE);
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