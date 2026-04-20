package JDBC;

import com.alibaba.druid.pool.DruidDataSource;

import javax.sql.DataSource;
import java.sql.*;

public class Jdbc_Transaction_Demo {
    public static void main(String[] args) {
        //使用连接池优化
        DruidDataSource dataSource = new DruidDataSource();
        dataSource.setUrl("jdbc:mysql://localhost:3306/springboot_test");
        dataSource.setUsername("spring_user");
        dataSource.setPassword("265942");
//        String url = "jdbc:mysql://localhost:3306/springboot_test";
//        String user = "spring_user";
//        String password = "265942";
        Connection conn = null;
        try {
            System.out.println("正在连接数据库...");
//            conn = DriverManager.getConnection(url, user, password);
            //连接池用法
            conn = dataSource.getConnection();
            System.out.println("数据库连接成功！");

            conn.setAutoCommit(false);
            System.out.println("事务已开启");
            //查询 👉 executeQuery()（返回 ResultSet）
            //增删改 👉 executeUpdate()（返回 int）

            //sql增加
            PreparedStatement ps3 = conn.prepareStatement(
                    "INSERT INTO booking (guest_id, room_id) VALUES (?, ?)"
            );
            ps3.setInt(1, 20);
            ps3.setInt(2, 5);

            ps3.executeUpdate();
            //sql删除
            PreparedStatement ps4 = conn.prepareStatement(
                    "DELETE FROM booking WHERE booking_id = ?"
            );
            ps4.setInt(1, 1);

            ps4.executeUpdate();

            //sql修改
            PreparedStatement ps1 = conn.prepareStatement("UPDATE booking SET room_id = ? WHERE booking_id = ?");
            ps1.setInt(1, 1);
            ps1.setInt(2, 2);
            int rows1 = ps1.executeUpdate();
            System.out.println("第一条SQL执行完成，影响行数：" + rows1);

            PreparedStatement ps2 = conn.prepareStatement("UPDATE booking SET guest_id = ? WHERE booking_id = ?");
            ps2.setInt(1, 16);
            ps2.setInt(2, 2);
            int rows2 = ps2.executeUpdate();
            System.out.println("第二条SQL执行完成，影响行数：" + rows2);

            //sql查询
            PreparedStatement ps = conn.prepareStatement(
                    "SELECT * FROM booking WHERE guest_id = ?"
            );
            ps.setInt(1, 16);

            //查询用：executeQuery()（返回结果集）
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                int id = rs.getInt("booking_id");
                int guestId = rs.getInt("guest_id");
                int roomId = rs.getInt("room_id");
                System.out.println(id + " " + guestId + " " + roomId);
            }


            conn.commit();
            System.out.println("Transaction successful");
        }
        catch (SQLException e) {
            System.err.println("发生SQL异常：" + e.getMessage());
            if(conn != null) {
                try {
                    conn.rollback();
                    System.out.println("Transaction failed");
                } catch (SQLException ex) {
                    ex.printStackTrace();
                }
            }
        } finally {
            if(conn != null) {
                try {
                    conn.setAutoCommit(true);
                    conn.close();
                    System.out.println("数据库连接已关闭");
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }

    }
}
