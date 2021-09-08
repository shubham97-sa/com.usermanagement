package UserManagement.com.usermanagement.service;

import UserManagement.com.usermanagement.model.IpDetails;
import UserManagement.com.usermanagement.model.Users;

import java.util.List;

public interface UserService {
    Users findByUserId(int userId);
    List<IpDetails> findIps(int userId);
    void save(IpDetails ipDetails);
}
