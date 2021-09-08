package UserManagement.com.usermanagement.model;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "admins")
public class Admins {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)//,generator = "admins_id_seq")
    //@SequenceGenerator(name ="admins_id_seq", sequenceName ="admins_id_seq" ,allocationSize = 1)

    int id;

    @Column(name="admin_name")
    @NotEmpty(message = "please enter valid admin name.....")
    String adminName;

    public Admins(){

    }

    public Admins(String adminName) {
        this.adminName = adminName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAdminName() {
        return adminName;
    }

    public void setAdminName(String adminName) {
        this.adminName = adminName;
    }

    @Override
    public String toString() {
        return "Admin{" +
                "id=" + id +
                ", adminName='" + adminName + '\'' +
                '}';
    }
}