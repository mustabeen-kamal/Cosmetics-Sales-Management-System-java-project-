
package javateamproject;

import javateamproject.DatabaseConnection;
import javateamproject.Product;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;


public class ProductDAO {


public void insert(Product p) throws Exception {
Connection con = DatabaseConnection.getConnection();
String sql = "INSERT INTO products(name, category, price, quantity) VALUES(?,?,?,?)";
PreparedStatement pst = con.prepareStatement(sql);
pst.setString(1, p.getName());
pst.setString(2, p.getCategory());
pst.setDouble(3, p.getPrice());
pst.setInt(4, p.getQuantity());
pst.executeUpdate();
con.close();
}


public List<Product> getAll() throws Exception {
Connection con = DatabaseConnection.getConnection();
String sql = "SELECT * FROM products";
Statement st = con.createStatement();
ResultSet rs = st.executeQuery(sql);
List<Product> list = new ArrayList<>();


while(rs.next()){
list.add(new Product(
rs.getInt("id"),
rs.getString("name"),
rs.getString("category"),
rs.getDouble("price"),
rs.getInt("quantity")
));
}
con.close();
return list;
}
}
