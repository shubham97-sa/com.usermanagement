package UserManagement.com.usermanagement.model;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;

@Entity
@Table(name = "users")
public class Users {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
     int userId;

    @Column(name = "user_name")
//    @NotEmpty(message = "Please enter a valid user name")
      String userName;

    @Column(name = "admin_id")
//    @NotEmpty(message = "please enter valid admin id")
     int adminId;

    @Column(name = "admin_rights")
//    @NotEmpty(message = "Rights are  required")
     String rights;

    public Users(){

    }
    public Users(String userName, int adminId, String rights) {
        this.userName = userName;
        this.adminId = adminId;
        this.rights = rights;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getAdminId() {
        return adminId;
    }

    public void setAdminId(int adminId) {
        this.adminId = adminId;
    }

    public String getRights() {
        return rights;
    }

    public void setRights(String rights) {
        this.rights = rights;
    }
}
