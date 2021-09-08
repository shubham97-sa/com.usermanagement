package UserManagement.com.usermanagement.service;

import UserManagement.com.usermanagement.dao.AdminDao;
import UserManagement.com.usermanagement.model.Admins;
import UserManagement.com.usermanagement.model.IpDetails;
import UserManagement.com.usermanagement.model.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdminServiceLayerImpl  implements AdminService{

    private  final AdminDao adminDao;

    @Autowired
public  AdminServiceLayerImpl(AdminDao adminDao){
        this.adminDao=adminDao;
    }



    @Override
    public void save(Admins admins) {
        adminDao.save(admins);
    }

    @Override
    public List<IpDetails> getAllIps() {
        return adminDao.getAllIps();
    }

    @Override
    public void save(Users users) {
        adminDao.save(users);

    }

    @Override
    public List<Users> getByIdOfAdmin(int adminId) {
        return adminDao.getByIdOfAdmin(adminId);
    }
}
