package dao;

import java.sql.SQLException;
import java.util.ArrayList;

import model.Type;

public interface TypeDao {
   Type findById(int tid) throws SQLException;
   
   ArrayList<Type> findAllType() throws SQLException;
}
