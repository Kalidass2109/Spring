package in.kali;

public class UserDao {

	public String getUserNameById(Integer id) {
		if(id==100) {
			return "Raja";
		}else if(id==101) {
			return "Rani";
		}else {
			return null;
		}
	}
}
