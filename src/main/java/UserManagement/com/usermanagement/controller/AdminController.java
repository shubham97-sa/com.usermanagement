package UserManagement.com.usermanagement.controller;

import UserManagement.com.usermanagement.exception.ResourceNotFoundException;
import UserManagement.com.usermanagement.model.Admins;
import UserManagement.com.usermanagement.model.IpDetails;
import UserManagement.com.usermanagement.model.Users;
import UserManagement.com.usermanagement.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/v1")
public  class AdminController {

   private  AdminService adminService;

   @Autowired
   public  AdminController(AdminService adminService){
       this.adminService=adminService;
   }

    @PostMapping("/admin/addAdmin")
    public Admins adminDetails(@RequestBody Admins admins){
        adminService.save(admins);
        return admins;
    };

    @PostMapping("/admin/addUser")
    public Users userDetails(@RequestBody Users users){
        adminService.save(users);
        return users;
    };


    @GetMapping("/admin/getAllIp")
    public List<IpDetails> getAllIps()
    {
        List<IpDetails> details =  adminService.getAllIps();
        if(details==null){
            throw  new ResourceNotFoundException("There is no Ip found !!!");
        }
        return details;
    }
    @GetMapping("/admin/getUser/{adminId}")
    public List<Users> getUser(@PathVariable int adminId){
        List<Users> users= adminService.getByIdOfAdmin(adminId);
        if(users==null){
            throw  new ResourceNotFoundException("No user is registered with this adminId.Please enter valid admin id: " + adminId);
        }
        return  users;
    };
}
