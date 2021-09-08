package UserManagement.com.usermanagement.utility;

import java.util.ArrayList;

public class IpBlockage {


    public static ArrayList<String> listOfIps = new ArrayList<>();

    public ArrayList<String> blockedIps(){

        listOfIps.add("ip101");
        listOfIps.add("ip102");
        listOfIps.add("ip103");
        listOfIps.add("ip104");
        listOfIps.add("ip105");
        listOfIps.add("ip106");
        listOfIps.add("ip107");
        listOfIps.add("ip108");
        listOfIps.add("ip109");
        listOfIps.add("ip110");

        return listOfIps;
    }
}
