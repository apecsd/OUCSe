package dao;

import java.sql.SQLException;
import java.util.List;

import model.User;



public interface UserDao {
	public int insert(User user) throws SQLException;

	public void update(User user) throws SQLException;

	public void delete(int id) throws SQLException;

	public User findById(String sid) throws SQLException;

	public List<User> findAll() throws SQLException;
}
