import java.sql.*;

public class DBHelper {
    /**
     * 开门
     */
    public static  Connection open() throws Exception {
        //1.加载驱动 (搭桥)
        Class.forName("com.mysql.cj.jdbc.Driver");
        //2.获取连接 (开门)
        Connection conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/st1115?useSSL=false&serverTimezone=UTC", "root", "123456");
        return conn;
    }

    /**
     * 查询的时候使用的关门
     */
    public static void close(ResultSet rs,PreparedStatement ps,Connection conn) throws Exception {
        rs.close();
        ps.close();
        conn.close();
    }

    /**
     * 增删改的时候使用的关门
     */
    public static void close(PreparedStatement ps,Connection conn) throws Exception {

        ps.close();
        conn.close();
    }
}
