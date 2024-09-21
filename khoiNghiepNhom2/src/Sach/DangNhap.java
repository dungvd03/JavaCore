package Sach;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class DangNhap extends JFrame {
    private JTextField txtUser;
    private JPasswordField txtPassword;
    private JButton btnDangNhap;

    public DangNhap() {
        setTitle("Đăng nhập");
        setSize(300, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel(new GridLayout(3, 2));

        JLabel lblUser = new JLabel("Tài khoản:");
        JLabel lblPassword = new JLabel("Mật khẩu:");

        txtUser = new JTextField();
        txtPassword = new JPasswordField();

        btnDangNhap = new JButton("Đăng nhập");
        btnDangNhap.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String user = txtUser.getText();
                String password = new String(txtPassword.getPassword());

                if (user.equals("admin") && password.equals("123")) {
                    JOptionPane.showMessageDialog(null, "Đăng nhập thành công!");
                    new QuanLySach();
                    dispose();
                } else {
                    JOptionPane.showMessageDialog(null, "Tài khoản hoặc mật khẩu không đúng!");
                }
            }
        });

        panel.add(lblUser);
        panel.add(txtUser);
        panel.add(lblPassword);
        panel.add(txtPassword);
        panel.add(btnDangNhap);

        add(panel);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        new DangNhap();
    }
}
