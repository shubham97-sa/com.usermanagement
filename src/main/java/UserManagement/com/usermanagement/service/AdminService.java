package UserManagement.com.usermanagement.service;

import UserManagement.com.usermanagement.model.Admins;
import UserManagement.com.usermanagement.model.IpDetails;
import UserManagement.com.usermanagement.model.Users;

import java.util.List;

public interface AdminService {
      void save(Admins admins);
     List<IpDetails> getAllIps();
      void save(Users users);
     List<Users> getByIdOfAdmin(int adminId);
}
