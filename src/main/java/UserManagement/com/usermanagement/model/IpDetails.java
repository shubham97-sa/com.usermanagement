package UserManagement.com.usermanagement.model;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;

@Entity
@Table(name = "ipdetails")
public class IpDetails {

    @Id
    @Column(name="id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
     int id;

    @Column(name = "ips")
     String ips;

//    @NotEmpty(message = "please type Ip description...")
    @Column(name = "ips_description")
     String ipsDescription;
    @Column(name = "user_id")
     int userId;

    public  IpDetails(){

    }

    public IpDetails(String ips, String ipsDescription, int userId) {
        this.ips = ips;
        this.ipsDescription = ipsDescription;
        this.userId = userId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getIps() {
        return ips;
    }

    public void setIps(String ips) {
        this.ips = ips;
    }

    public String getIpsDescription() {
        return ipsDescription;
    }

    public void setIpsDescription(String ipsDescription) {
        this.ipsDescription = ipsDescription;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    @Override
    public String toString() {
        return "IpDetails{" +
                "id=" + id +
                ", ips='" + ips + '\'' +
                ", ipsDescription='" + ipsDescription + '\'' +
                ", userId='" + userId + '\'' +
                '}';
    }
}
