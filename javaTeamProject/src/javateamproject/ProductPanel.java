package javateamproject;


import javax.swing.*;
import java.awt.*;


public class ProductPanel extends JPanel {
public ProductPanel() {
setLayout(new BorderLayout());


JTable table = new JTable();
add(new JScrollPane(table), BorderLayout.CENTER);


JPanel form = new JPanel(new GridLayout(5,2));
form.add(new JLabel("Name:")); form.add(new JTextField());
form.add(new JLabel("Category:")); form.add(new JTextField());
form.add(new JLabel("Price:")); form.add(new JTextField());
form.add(new JLabel("Quantity:")); form.add(new JTextField());
form.add(new JButton("Add Product"));
form.add(new JButton("Refresh"));


add(form, BorderLayout.SOUTH);
}
}