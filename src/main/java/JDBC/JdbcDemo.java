package JDBC;

import java.sql.*;

public class JdbcDemo {
    //JDBC：Java 连接数据库的“六步走”
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/mydb";
        String user = "root";
        String password = "root";
        // 使用 try-with-resources 自动关闭资源
        try (Connection conn = DriverManager.getConnection(url, user, password);
             // 使用 PreparedStatement 防止 SQL 注入
             PreparedStatement ps = conn.prepareStatement("SELECT * FROM users WHERE id = ?")) {

            ps.setInt(1, 1); // 设置参数
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                System.out.println("用户姓名: " + rs.getString("name"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
