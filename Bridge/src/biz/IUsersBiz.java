package biz;

import java.util.List;

import entity.Users;

public interface IUsersBiz {
	// 获取所有用户
	public List<String> getAllUsersName();
	
	// 获取指定用户名的密码
	public String getUserPasswordByName(String name);
	
	// 获取用户登录信息
	public List<String>[] getUserLoginInfo();
	
	// 用户通过用户名登录
	public boolean userLoginByName(String name);
		
	// 用户通过用户名注销
	public boolean userLogoutByName(String name);

	// 查询用户
	public Users selectUserByName(String name);

	// 添加用户
	public boolean addUser(Users u);

	// 修改密码
	public boolean updatePassword(Users u);

	// 修改用户信息
	public boolean updateUserByName(Users u, String name);
}
