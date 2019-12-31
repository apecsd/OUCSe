package dao;

import java.sql.SQLException;
import java.util.ArrayList;

import model.Fabu;

public interface FabuDao {
  public ArrayList<Fabu> findAll() throws SQLException;
  
  public ArrayList<Fabu> findBysid(String sid) throws SQLException;
  
  public int addFabu(Fabu fabu) throws SQLException;
  
  public ArrayList<Integer> findpidBysid(String sid) throws SQLException;
}
