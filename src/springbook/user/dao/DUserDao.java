package springbook.user.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DUserDao extends UserDao{
    public Connection getConnection() throws ClassNotFoundException, SQLException{
        // N 사 DB connection 생성코드
        Class.forName("com.mysql.jdbc.Driver");
        Connection c = DriverManager.getConnection("jdbc:mysql://localhost:13306/springtoby", "root", "1111");

        return c;
    }
}
