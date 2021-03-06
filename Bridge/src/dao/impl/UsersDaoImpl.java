package dao.impl;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import util.DataBaseUtil;
import dao.IUsersDao;
import entity.Users;

public class UsersDaoImpl extends DataBaseUtil implements IUsersDao {

	@Override
	public List<String> getAllUsersName() {
		List<String> list = new ArrayList<String>();

		// 查找全部用户
		String sql = "SELECT name FROM users";

		// 调用父类公共的查询方法
		rs = exeSelect(sql, null);

		try {
			while(rs.next())
				list.add(rs.getString("name"));
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			closeAll(rs, pstmt, conn);
		}

		return list;
	}

	@Override
	public Users selectUserByName(String name) {
		Users user = null;

		// 按照name查找用户
		String sql = "SELECT * FROM users WHERE name=?";
		Object[] params = {name};

		// 调用父类公共的查询方法
		rs = exeSelect(sql, params);

		try {
			if(rs.next())
				user = new Users(rs.getString("name"), 
						rs.getString("password"), 
						rs.getInt("indentity"), 
						rs.getInt("logged"), 
						rs.getString("phone_number"), 
						rs.getString("address"), 
						rs.getString("rank"));
		} catch (SQLException e) {
			System.err.println("异常出现在src.dao.impl.UsersDaoImpl类的selectUserByName()方法中！");
			e.printStackTrace();
		} finally {
			// 释放资源
			closeAll(rs, pstmt, conn);
		}

		return user;
	}

	@Override
	public boolean addUser(Users u) {
		boolean flag = false;

		// 执行添加的SQL语句
		String sql = "INSERT INTO users(`name`, `password`, `indentity`, `logged`, `phone_number`, `address`, `rank`) VALUE(?, ?, ?, ?, ?, ?, ?)";
		Object[] params = {u.getName(), u.getPassword(), u.getIndentity(), u.getLogged(), u.getPhone_number(), u.getAddress(), u.getRank()};

		int line = exeUpdate(sql, params);

		// 释放资源
		closeAll(rs, pstmt, conn);

		if(line > 0) flag = true;

		return flag;
	}

	@Override
	public boolean updatePassword(Users u) {
		boolean flag = false;

		// 执行修改的SQL语句
		String sql = "UPDATE users SET password=? WHERE name=?";
		Object[] params = {u.getPassword(), u.getName()};

		int line = exeUpdate(sql, params);

		// 释放资源
		closeAll(rs, pstmt, conn);

		if(line > 0) flag = true;

		return flag;
	}

	@Override
	public boolean updateUserByName(Users u, String name) {
		boolean flag = false;

		// 执行修改的SQL语句
		String sql = "UPDATE users SET name=?, password=?, indentity=?, logged=?, phone_number=?, address=?, rank=? "
				+ "WHERE name=?";
		Object[] params = {u.getName(), u.getPassword(), u.getIndentity(), u.getLogged(), u.getPhone_number(), u.getAddress(), u.getRank(), name};

		int line = exeUpdate(sql, params);

		// 释放资源
		closeAll(rs, pstmt, conn);

		if(line > 0) flag = true;

		return flag;
	}

	@Override
	public String getUserPasswordByName(String name) {
		String password = "";

		// 查找全部用户
		String sql = "SELECT password FROM users WHERE name = ?";
		Object[] params = {name};

		// 调用父类公共的查询方法
		rs = exeSelect(sql, params);

		try {
			if(rs.next())
				password = rs.getString("password");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			closeAll(rs, pstmt, conn);
		}

		return password;
	}
	
	
	@Override
	public List<String>[] getUserLoginInfo() {
		List<String> names = new ArrayList<String>();
		List<String> passwords = new ArrayList<String>();
		List<String>[] array = new ArrayList[2];

		// 查找全部用户
		String sql = "SELECT name, password FROM users";

		// 调用父类公共的查询方法
		rs = exeSelect(sql, null);

		try {
			while(rs.next()) {
				names.add(rs.getString("name"));
				passwords.add(rs.getString("password"));
			}
			array[0] = names;
			array[1] = passwords;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			closeAll(rs, pstmt, conn);
		}

		return array;
	}
	
	@Override
	public boolean userLoginByName(String name) {
		boolean flag = false;

		// 执行修改的SQL语句
		String sql = "UPDATE users SET logged = 1 "
				+ "WHERE name=?";
		Object[] params = {name};

		int line = exeUpdate(sql, params);

		// 释放资源
		closeAll(rs, pstmt, conn);

		if(line > 0) flag = true;

		return flag;
	}
	
	@Override
	public boolean userLogoutByName(String name) {
		boolean flag = false;

		// 执行修改的SQL语句
		String sql = "UPDATE users SET logged = 0 "
				+ "WHERE name=?";
		Object[] params = {name};

		int line = exeUpdate(sql, params);

		// 释放资源
		closeAll(rs, pstmt, conn);

		if(line > 0) flag = true;

		return flag;
	}
	
	
	public static void main(String[] args) {
		UsersDaoImpl test = new UsersDaoImpl();
		System.out.println(test.userLoginByName("Tom") + ", " + test.userLogoutByName("Tom"));
	}

}
