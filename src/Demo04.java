import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Demo04 {
    public static void main(String[] args) throws Exception {
        //获取连接
        Connection conn = DBHelper.open();
        System.out.println(conn);
        String deptName="ddd";
        String address="dkk";
        int did=12;
        //3. 创建sql指令
        String sql="UPDATE `dept` SET `deptName` = ?, `address` = ? WHERE `did` = ?";
        //4.创建陈述对象(仓库管理员）
        PreparedStatement ps = conn.prepareStatement(sql);
        //5.占位符赋值
       ps.setString(1,deptName);
       ps.setString(2,address);
       ps.setInt(3,did);
        //6. 陈述对象执行sql （仓库管理员干活）
        ps.executeUpdate();
        //7.关门
        DBHelper.close(ps,conn);
    }
}
