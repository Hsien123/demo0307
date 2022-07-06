import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 * 查询所有的部门信息并打印
 */
public class Demo05 {
    public static void main(String[] args) throws Exception {
        Connection conn =DBHelper.open();
        System.out.println(conn);
        //3. 创建sql指令
        String sql="SELECT did,deptName,address from dept";
        //4.创建陈述对象(仓库管理员）
        PreparedStatement ps = conn.prepareStatement(sql);
        //5. 陈述对象执行sql （仓库管理员干活）
        ResultSet rs = ps.executeQuery();
        while (rs!=null&&rs.next()){
            int did = rs.getInt("did");
            String deptName = rs.getString("deptName");
            String address = rs.getString("address");
            System.out.println("编号："+did+"，部门名称："+deptName+"，地址："+address+"");

        }
        //7.关门
        DBHelper.close(rs,ps,conn);
    }

}
