package UserManagement.com.usermanagement.controller;

import UserManagement.com.usermanagement.exception.ResourceNotFoundException;
import UserManagement.com.usermanagement.model.IpDetails;
import UserManagement.com.usermanagement.model.Users;
import UserManagement.com.usermanagement.service.UserService;
import UserManagement.com.usermanagement.utility.IpBlockage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/v1")
public class UserController {

    private UserService userService;
    IpBlockage ipBlockage=new IpBlockage();

    ArrayList<String> blockage = ipBlockage.blockedIps();
    @Autowired
    public  UserController(UserService userService){
        this.userService=userService;
    }

    @GetMapping("/user/getUser/{userId}")
    public Users getUser(@PathVariable  int userId){
          Users users= userService.findByUserId(userId);
        if(users==null){
            throw new ResourceNotFoundException("Please enter valid user . It is not available :" + userId);
        }
        return  users;

    }

    @GetMapping("/user/getIps/{userId}")
    public List<IpDetails> getIps(@PathVariable int userId){
        List<IpDetails> ipDetails= userService.findIps(userId);
        if(ipDetails==null){
            throw  new ResourceNotFoundException("please enter valid user to get Ips:" + userId);
        }
        return  ipDetails;
    };

    @PostMapping("/user/addIp")
    public IpDetails saveIp( @RequestBody IpDetails ipDetails){
        String ip = ipDetails.getIps();

        for (String str : blockage) {
            if (str.contains(ip)) {
                throw new ResourceNotFoundException("Ip is bloced by admin please type another ip :");
            }
            else{
                userService.save(ipDetails);
            }
        }

        return ipDetails;
    }
}
