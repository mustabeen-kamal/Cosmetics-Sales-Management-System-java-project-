package javateamproject;


import javax.swing.*;
import java.awt.*;


public class MainFrame extends JFrame {
public MainFrame() {
setTitle("Sports Shoes Management");
setSize(900, 600);
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
setLayout(new BorderLayout());


JTabbedPane tabs = new JTabbedPane();
tabs.add("Products", new ProductPanel());
tabs.add("Users", new UserPanel());


add(tabs, BorderLayout.CENTER);
}
}