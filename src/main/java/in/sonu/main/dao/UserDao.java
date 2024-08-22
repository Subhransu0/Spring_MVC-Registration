package in.sonu.main.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import in.sonu.main.entity.User;
@Repository
public class UserDao {
	@Autowired
	private JdbcTemplate jdbcTemplate;

	public int saveUser(User user) {
		String query = "insert into user(name , email,password,image) values(?,?,?,?)";
		int i = jdbcTemplate.update(query, user.getFullname(), user.getEmail(), user.getPassword(), user.getImage());
		return i;

	}

}
