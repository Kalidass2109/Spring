package in.kali.dao;

public class IUserDaoImpl implements IUserDao {

	public IUserDaoImpl() {
		System.out.println("IUserDaoImpl::Constructor");
	}
	public String findName(int id) {
		
		//db logic comes here
		if(id==100) {
			return "Raju";
		}else if(id==101) {
			return "Rani";
		}
		return null;
	}

}
