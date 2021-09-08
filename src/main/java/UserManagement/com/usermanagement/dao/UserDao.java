package UserManagement.com.usermanagement.dao;

import UserManagement.com.usermanagement.model.IpDetails;
import UserManagement.com.usermanagement.model.Users;

import java.util.List;

public interface UserDao {
    Users findByUserId(int userId);
     List<IpDetails> findIps(int userId);
     void save(IpDetails ipDetails);
}
