package Sach;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class QuanLySach extends JFrame {
    private ArrayList<Sach> danhSachSach;
    private DefaultListModel<String> model;
    private JList<String> list;

    public QuanLySach() {
        danhSachSach = new ArrayList<>();
        model = new DefaultListModel<>();
        list = new JList<>(model);

        setTitle("Quản lý sách");
        setSize(500, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());

        JButton btnThem = new JButton("Thêm sách");
        btnThem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String maSach = JOptionPane.showInputDialog("Nhập mã sách:");
                String tenSach = JOptionPane.showInputDialog("Nhập tên sách:");
                String namTaiBan = JOptionPane.showInputDialog("Nhập năm tái bản:");
                String nhaXuatBan = JOptionPane.showInputDialog("Nhập nhà xuất bản:");
                String tacGia = JOptionPane.showInputDialog("Nhập tác giả:");

                Sach sach = new Sach(maSach, tenSach, namTaiBan, nhaXuatBan, tacGia);
                danhSachSach.add(sach);
                model.addElement(sach.toString());
            }
        });

        JButton btnSua = new JButton("Sửa sách");
        btnSua.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int index = list.getSelectedIndex();
                if (index != -1) {
                    Sach sach = danhSachSach.get(index);
                    sach.setMaSach(JOptionPane.showInputDialog("Sửa mã sách:", sach.getMaSach()));
                    sach.setTenSach(JOptionPane.showInputDialog("Sửa tên sách:", sach.getTenSach()));
                    sach.setNamTaiBan(JOptionPane.showInputDialog("Sửa năm tái bản:", sach.getNamTaiBan()));
                    sach.setNhaXuatBan(JOptionPane.showInputDialog("Sửa nhà xuất bản:", sach.getNhaXuatBan()));
                    sach.setTacGia(JOptionPane.showInputDialog("Sửa tác giả:", sach.getTacGia()));

                    model.set(index, sach.toString());
                } else {
                    JOptionPane.showMessageDialog(null, "Vui lòng chọn sách để sửa!");
                }
            }
        });

        JButton btnXoa = new JButton("Xóa sách");
        btnXoa.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int index = list.getSelectedIndex();
                if (index != -1) {
                    danhSachSach.remove(index);
                    model.remove(index);
                } else {
                    JOptionPane.showMessageDialog(null, "Vui lòng chọn sách để xóa!");
                }
            }
        });

        JButton btnLuu = new JButton("Lưu sách");
        btnLuu.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                luuSachVaoFile("sach.txt");
            }
        });

        JButton btnThoat = new JButton("Thoát");
        btnThoat.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(1, 5));
        buttonPanel.add(btnThem);
        buttonPanel.add(btnSua);
        buttonPanel.add(btnXoa);
        buttonPanel.add(btnLuu);
        buttonPanel.add(btnThoat);

        panel.add(new JScrollPane(list), BorderLayout.CENTER);
        panel.add(buttonPanel, BorderLayout.SOUTH);

        add(panel);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    private void luuSachVaoFile(String tenFile) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(tenFile))) {
            for (Sach sach : danhSachSach) {
                writer.write(sach.getMaSach() + "," + sach.getTenSach() + "," + sach.getNamTaiBan() + ","
                        + sach.getNhaXuatBan() + "," + sach.getTacGia());
                writer.newLine();
            }
            JOptionPane.showMessageDialog(null, "Lưu sách thành công vào file " + tenFile);
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Lỗi khi lưu sách: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        new QuanLySach();
    }
}

