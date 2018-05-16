package cn.mxl.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * �?��JDBC操作数据库的工具�?
 * 01.数据库四要素的获�?
 * 02.�?��连接
 * 03.关闭连接
 * 04.公共的增删改
 * 05.公共的查�?
 */
public class jdbcUtil {
	public static Connection conn = null;//便于我们释放资源
	public static PreparedStatement ps = null;
	public static ResultSet rs = null;//查询数据返回的结果集
	
	/**
	 * 连接数据�?
	 */
		public static boolean getConnection() throws ClassNotFoundException, 
		SQLException {
		try {
			//通过反射机制获取数据库驱动包
			Class.forName(ConfigManager.getInstance().getValue("jdbc.driver"));
			//通过DriverManager获取Conncetion连接对象
			conn=DriverManager.getConnection(ConfigManager.getInstance().getValue("jdbc.url"),
					ConfigManager.getInstance().getValue("jdbc.userName"),
					ConfigManager.getInstance().getValue("jdbc.passWord"));
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
		return true;
	}
		
		
	/**
	 * 释放资源
	 */
		public static void closeConnection() {
				if (ps!=null) {
					try {
						ps.close();
					} catch (SQLException e) {
						e.printStackTrace();
					}
				}
				if (conn!=null) {
					try {
						conn.close();
					} catch (SQLException e) {
						e.printStackTrace();
					}
				}	
				if (rs!=null) {
					try {
						rs.close();
					} catch (SQLException e) {
						e.printStackTrace();
					}
				}
			}
		
	/**
	 * 公共的增删改
	 * 
	 * 我们可以确定的是有sql语句！因为只有sql语句才能操作数据库！
	 * 但是我们无法确定的是�?
	 * 	01.参数的个�?
	 * 	02.参数的类�?
	 * 
	 * 我们应该是�?虑有参数  还是 没有参数 �?有参数的�?
	 * 考虑�?个参数还是有N个参数？  有N个参数的�?
	 * 
	 * 用户�?��传�?�?��执行的sql语句
	 * 		再擦混地�?��参数列表
	 * @throws SQLException 
	 * @throws ClassNotFoundException 
	 */
	public static int myExcuteUpdate(String sql,Object...param) throws ClassNotFoundException, SQLException {
		int rowNum = 0;
		if (getConnection()) {//证明有连�?
			ps=conn.prepareStatement(sql);
			//给sql语句中的 �?�?���?��赋�?
			for (int i= 0;  i< param.length; i++) {
				ps.setObject(i+1, param[i]);
			}
			rowNum = ps.executeUpdate();
		}
		closeConnection();//释放资源
		return rowNum;
		
	}
	/**
	 * 公共的查�?
	 * @throws SQLException 
	 * @throws ClassNotFoundException 
	 */
	public static ResultSet myExcuteQuery(String sql,Object...param) 
			throws ClassNotFoundException, SQLException {
		if (getConnection()) {//证明有连�?
			ps=conn.prepareStatement(sql);
			for (int i = 0; i < param.length; i++) {
				ps.setObject(i+1, param[i]);
			}
			rs=ps.executeQuery();
		}
		/**
		 * 在这里不能实现关闭资源，因为子类中有rs的具体使�? 还需要用到连�?
		 * 子类使用完毕，自行了断！
		 */
		return rs;
		
	}
	
	
	
}
