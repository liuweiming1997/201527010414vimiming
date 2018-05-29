package cn.edu.scau.cmi.liuweiming.util;

import java.sql.*;


public class DButil {
    private static final String URL = "jdbc:mysql://95.163.202.160:3306/homework?serverTimezone=UTC";
    private static final String USER = "root";
    private static final String PASSWORD = "dc";
    private static Connection connection = null;
    static { //只加载一次，以后都不加载
    	System.out.println("statrt");
        try {
            //1.加载驱动程序
        	Class.forName("com.mysql.jdbc.Driver");
            //2. 获得数据库连接
            connection = DriverManager.getConnection(URL, USER, PASSWORD);
        } catch (SQLException e) {
            System.out.println("DbUtil22" + "   " + e.getMessage());
            System.out.println(PASSWORD);
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
        	System.out.println("fuck you?");
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
    public static Connection getConnection() {
        return connection;
    }
}
