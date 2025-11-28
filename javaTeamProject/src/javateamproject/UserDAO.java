package javateamproject;


import java.sql.*;
import java.util.ArrayList;
import java.util.List;


public class UserDAO {


public void insert(User u) throws Exception {
Connection con = DatabaseConnection.getConnection();
String sql = "INSERT INTO users(username, role) VALUES(?,?)";
PreparedStatement pst = con.prepareStatement(sql);
pst.setString(1, u.getUsername());
pst.setString(2, u.getRole());
pst.executeUpdate();
con.close();
}


public List<User> getAll() throws Exception {
Connection con = DatabaseConnection.getConnection();
String sql = "SELECT * FROM users";
Statement st = con.createStatement();
ResultSet rs = st.executeQuery(sql);
List<User> list = new ArrayList<>();


while(rs.next()){
list.add(new User(
rs.getInt("id"),
rs.getString("username"),
rs.getString("role")
));
}
con.close();
return list;
}
}