package in.kali.service;

import in.kali.dao.IUserDao;

public class UserServiceImpl implements UserService {

	private IUserDao userDao;
	
	public UserServiceImpl() {
		System.out.println("UserServiceImpl :: 0-param :: Constructor");
	}
	
	public UserServiceImpl(IUserDao userDao) {
		System.out.println("UserServiceImpl :: Constructor");
		this.userDao=userDao;
	}
	public String getName(int id) {
		String name=userDao.findName(id);
		return name;
	}

}
