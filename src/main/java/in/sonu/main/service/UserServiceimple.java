package in.sonu.main.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.sonu.main.dao.UserDao;
import in.sonu.main.entity.User;
@Service
public class UserServiceimple implements UserService {
	@Autowired
	private UserDao userDao;

	@Override
	public int registerUser(User user) {
		int i = userDao.saveUser(user);
		return i;
	}

}
