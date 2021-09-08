package UserManagement.com.usermanagement.service;

import UserManagement.com.usermanagement.dao.UserDao;
import UserManagement.com.usermanagement.model.IpDetails;
import UserManagement.com.usermanagement.model.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceLayerImpl implements UserService {

    public UserDao userDao;
    @Autowired
    public UserServiceLayerImpl(UserDao userDao){
        this.userDao=userDao;
    }

    @Override
    public Users findByUserId(int userId) {
        return userDao.findByUserId(userId);
    }

    @Override
    public List<IpDetails> findIps(int userId) {
        return userDao.findIps(userId);
    }

    @Override
    public void save(IpDetails ipDetails) {
        userDao.save(ipDetails);

    }
}
