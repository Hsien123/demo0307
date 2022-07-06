import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;

/**
 * 将 行政部  暂无 插入到dept表中
 */
public class Demo02 {
    public static void main(String[] args) throws Exception {

        Connection conn =DBHelper.open();
        System.out.println(conn);
        String deptName="行政部4";
        String address="暂无4";
        //3. 创建sql指令
        String sql="INSERT INTO `dept` (`deptName`, `address`) VALUES (?,?)";
        //4.创建陈述对象(仓库管理员）
        PreparedStatement ps = conn.prepareStatement(sql);
        //5.占位符赋值
        ps.setString(1,deptName);
        ps.setString(2,address);
        //6. 陈述对象执行sql （仓库管理员干活）
        ps.executeUpdate();
        //7.关门
        DBHelper.close(ps,conn);

    }
}
