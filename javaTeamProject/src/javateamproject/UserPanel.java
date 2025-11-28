package javateamproject;


import javax.swing.*;
import java.awt.*;


public class UserPanel extends JPanel {
public UserPanel() {
setLayout(new BorderLayout());


JTable table = new JTable();
add(new JScrollPane(table), BorderLayout.CENTER);


JPanel form = new JPanel(new GridLayout(3,2));
form.add(new JLabel("Username:")); form.add(new JTextField());
form.add(new JLabel("Role:")); form.add(new JComboBox<>(new String[]{"Manager", "Cashier"}));
form.add(new JButton("Add User"));


add(form, BorderLayout.SOUTH);
}
}