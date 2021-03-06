package biz.impl;

import java.util.List;

import dao.IUsersDao;
import dao.impl.UsersDaoImpl;
import entity.Users;
import biz.IUsersBiz;

public class UsersBizImpl implements IUsersBiz {

	// 注入数据表示层
	IUsersDao udao = new UsersDaoImpl();

	@Override
	public List<String> getAllUsersName() {
		return udao.getAllUsersName();
	}

	@Override
	public Users selectUserByName(String name) {
		return udao.selectUserByName(name);
	}

	@Override
	public boolean addUser(Users u) {
		return udao.addUser(u);
	}

	@Override
	public boolean updatePassword(Users u) {
		return udao.updatePassword(u);
	}

	@Override
	public boolean updateUserByName(Users u, String name) {
		return udao.updateUserByName(u, name);
	}

	@Override
	public String getUserPasswordByName(String name) {
		return udao.getUserPasswordByName(name);
	}

	@Override
	public List<String>[] getUserLoginInfo() {
		return udao.getUserLoginInfo();
	}

	@Override
	public boolean userLoginByName(String name) {
		return udao.userLoginByName(name);
	}

	@Override
	public boolean userLogoutByName(String name) {
		return udao.userLogoutByName(name);
	}

}
