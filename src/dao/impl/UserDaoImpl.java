package dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

import dao.UserDao;
import model.User;
import util.db.DatabaseUtil;

public class UserDaoImpl implements UserDao {
	public String findIdByName(String name){
		Connection conn = null;
		PreparedStatement ps = null;
		String sid = "-1";
		
		String sql = "select sid from user where userName=?";
		conn = DatabaseUtil.getConnection();
		try {
			ps = conn.prepareStatement(sql);
			ps.setString(1, name);
			ResultSet rs = ps.executeQuery();
			
			if(rs.next()){
				sid = rs.getString(1);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return sid;
	}
	
	public User findByidAndPwd(String sid, String password){
		Connection conn = null;
		PreparedStatement ps = null;
		User user = new User();
		String sql = "select * from user where sid=? and password=?";
		conn = DatabaseUtil.getConnection();
		try {
			ps = conn.prepareStatement(sql);
			ps.setString(1, sid);
			ps.setString(2, password);
			ResultSet rs = ps.executeQuery();
			
			if(rs.next()){
				user.setSid(sid);;
				user.setPassword(password);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return user;
		
	}
	
	@Override
	public int insert(User user) throws SQLException {

		Connection conn = null;
		PreparedStatement ps = null;
		int autoIncKey = -1;

		String sql = "insert into user (sid, password) values(?, ?)";

		try {
			conn = DatabaseUtil.getConnection();
			ps = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);

			ps.setString(1, user.getSid());
			ps.setString(2, user.getPassword());

			ps.executeUpdate();

			ResultSet rs = ps.getGeneratedKeys();

			if (rs.next()) {
				autoIncKey = rs.getInt(1);
			} else {
			}
		} catch (SQLException e) {
			e.printStackTrace();
			throw new SQLException("add data failed.");
		} finally {
			DatabaseUtil.close(null, ps, conn);
		}
		return autoIncKey;
	}

	@Override
public void update(User user) throws SQLException {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(int id) throws SQLException {
		// TODO Auto-generated method stub

	}

	@Override
	public User findById(int id) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<User> findAll() throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}
}
