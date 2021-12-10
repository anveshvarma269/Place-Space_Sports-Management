/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Sports.Organization;

import Sports.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author revanthkumar
 */
public class TeamOrganization extends Organization {
    
    public TeamOrganization()
    {
        super(Organization.Type.Team.getValue());
    }
    
      @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        return roles;
    }
    
}
