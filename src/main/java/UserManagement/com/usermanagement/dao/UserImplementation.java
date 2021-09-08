package UserManagement.com.usermanagement.dao;

import UserManagement.com.usermanagement.model.IpDetails;
import UserManagement.com.usermanagement.model.Users;
import org.hibernate.Session;
import org.hibernate.Query;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import java.util.List;

@Repository
public class UserImplementation implements UserDao{
    private EntityManager entityManager;
    public  UserImplementation(EntityManager entityManager){
        this.entityManager=entityManager;
    }
    @Override
    public Users findByUserId(int userId) {
        Session currentSession=entityManager.unwrap(Session.class);
        Users users=currentSession.get(Users.class,userId);
        return  users;
    }

    @Override
    public List<IpDetails> findIps(int userId) {
        Session currentSession=entityManager.unwrap(Session.class);
        Query<IpDetails> query=currentSession.createQuery("From IpDetails where userId =:Id",IpDetails.class );
        query.setParameter("Id",userId);
       List<IpDetails> details=query.getResultList();
       return details;
    }

    @Override
    public void save(IpDetails ipDetails) {
        Session currentSession = entityManager.unwrap(Session.class);
        currentSession.saveOrUpdate(ipDetails);

    }
}
