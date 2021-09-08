package UserManagement.com.usermanagement.dao;

import UserManagement.com.usermanagement.model.Admins;
import UserManagement.com.usermanagement.model.IpDetails;
import UserManagement.com.usermanagement.model.Users;

import java.util.List;

public interface AdminDao {
public  void save(Admins admins);
public List<IpDetails> getAllIps();
public  void save(Users users);
public List<Users> getByIdOfAdmin(int adminId);
}
