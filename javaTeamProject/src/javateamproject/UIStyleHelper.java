package javateamproject;

import javax.swing.*;
import javax.swing.table.JTableHeader;
import java.awt.*;

public class UIStyleHelper {

    // ألوان جاهزة
    public static final Color LIGHT_GRAY = new Color(248, 249, 250);
    public static final Color WHITE = Color.WHITE;
    public static final Font FONT_LABEL = new Font("Segoe UI", Font.BOLD, 12);

    // تزيين البانل
    public static void stylePanel(JPanel panel, Color color) {
        panel.setBackground(color);
    }

    // تزيين TextField
    public static void styleTextField(JTextField tf) {
        tf.setBackground(Color.WHITE);
        tf.setFont(new Font("Segoe UI", Font.PLAIN, 14));
        tf.setBorder(BorderFactory.createLineBorder(Color.PINK, 2)); // استخدمي لون وردي
    }

    // تزيين ComboBox
    public static void styleComboBox(JComboBox<?> comboBox) {
        comboBox.setFont(new Font("Segoe UI", Font.PLAIN, 14));
    }

    // تزيين الأزرار الرئيسية
    public static void stylePrimaryButton(JButton btn) {
        btn.setBackground(new Color(225, 48, 108)); // وردي غامق
        btn.setForeground(Color.WHITE);
        btn.setFocusPainted(false);
    }

    public static void styleEditButton(JButton btn) {
        btn.setBackground(new Color(40, 167, 69)); // أخضر
        btn.setForeground(Color.WHITE);
        btn.setFocusPainted(false);
    }

    public static void styleDeleteButton(JButton btn) {
        btn.setBackground(new Color(220, 53, 69)); // أحمر
        btn.setForeground(Color.WHITE);
        btn.setFocusPainted(false);
    }

    // تزيين الجدول
    public static void styleTable(JTable table) {
        table.setFillsViewportHeight(true);
        table.setRowHeight(25);
        table.setFont(new Font("Segoe UI", Font.PLAIN, 14));
        JTableHeader header = table.getTableHeader();
        header.setBackground(new Color(225, 48, 108));
        header.setForeground(Color.WHITE);
        header.setFont(new Font("Segoe UI", Font.BOLD, 14));
    }
}
