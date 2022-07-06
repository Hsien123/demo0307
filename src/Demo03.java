import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

/**
 * 删除部门id=14的部门信息
 */
public class Demo03 {
    public static void main(String[] args) throws Exception {
        Connection conn =DBHelper.open();
        System.out.println(conn);
        //3. 创建sql指令
        String sql="DELETE FROM `dept` WHERE `did` =?";
        //4.创建陈述对象(仓库管理员）
        PreparedStatement ps = conn.prepareStatement(sql);
        //5.占位符赋值
        ps.setInt(1,14);
        //6. 陈述对象执行sql （仓库管理员干活）
        ps.executeUpdate();
        //7.关门
        DBHelper.close(ps,conn);
    }
}
