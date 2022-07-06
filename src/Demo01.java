import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Demo01 {
    public static void main(String[] args) {
         //1.搭桥  加载驱动
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/st1115?useSSL=false&serverTimezone=UTC", "root", "123456");
            System.out.println("数据库连接成功");
            System.out.println(conn);
        } catch (ClassNotFoundException e) {
            System.out.println("数据库驱动加载失败");
            e.printStackTrace(); //打印异常，帮助程序员排错，千万不要删除
        } catch (SQLException throwables) {
            System.out.println("数据库连接失败！！！");
            throwables.printStackTrace();
        }


    }
}
