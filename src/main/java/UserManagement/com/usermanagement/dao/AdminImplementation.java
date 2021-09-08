package UserManagement.com.usermanagement.dao;

import UserManagement.com.usermanagement.model.Admins;
import UserManagement.com.usermanagement.model.IpDetails;
import UserManagement.com.usermanagement.model.Users;
import org.hibernate.Session;
import org.hibernate.Query;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import java.util.List;

@Repository
public class AdminImplementation implements AdminDao {
    private EntityManager entityManager;

    public AdminImplementation(EntityManager entityManager){
this.entityManager=entityManager;
    }

    @Override
    public void save(Admins admins) {
        Session currentSession = entityManager.unwrap(Session.class);

        currentSession.saveOrUpdate(admins);


    }

    @Override
    public List<IpDetails> getAllIps() {
        Session currentSession= entityManager.unwrap(Session.class);
        Query<IpDetails> query= currentSession.createQuery("From IpDetails", IpDetails.class);
      List<IpDetails> details=query.getResultList();
        return  details;

    }

    @Override
    public void save(Users users) {
        Session currentSession = entityManager.unwrap(Session.class);

        currentSession.saveOrUpdate(users);

    }

    @Override
    public List<Users> getByIdOfAdmin(int id) {
        Session currentSession=entityManager.unwrap(Session.class);
       Query<Users> query= currentSession.createQuery("From Users where adminId=:Id",Users.class);
     query.setParameter("Id" ,id);
     List<Users> users= query.getResultList();
     return users;

    }


}
