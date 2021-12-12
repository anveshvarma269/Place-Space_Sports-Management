/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Sports.Organization;

import Sports.Role.Role;
import Sports.Sport.SportDirectory;
import Sports.Role.SystemAdminRole;
import java.util.ArrayList;

/**
 *
 * @author revanthkumar
 */
public class SportsOrganization extends Organization { 

     private SportDirectory sportDirectory;

    public SportDirectory getSportDirectory() {
        return sportDirectory;
    }

    public void setSportDirectory(SportDirectory sportDirectory) {
        this.sportDirectory = sportDirectory;
    }

    public SportsOrganization()
    {
        super(Organization.Type.Sports.getValue());
sportDirectory = new SportDirectory();
    }
    
    
    
    
      @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new SystemAdminRole());
        return roles;
    }
}
