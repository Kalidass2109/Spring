package in.kali.service;

import in.kali.dao.BookDao;

public class BookServiceImpl implements BookService {

	private BookDao bookDao;
	
	public void setBookDao(BookDao bookDao) {
		this.bookDao= bookDao;
	}
	
	public void saveBook() {
		boolean status=bookDao.save();
		if(status) {
			System.out.println("Record Inserted...");
		}else {
			System.out.println("Insertion Failed...");
		}
	}

}
