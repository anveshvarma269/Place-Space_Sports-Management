/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sports.Organization;

import Sports.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author anveshvarma
 */
public class LogisticsOrganization extends Organization {
        
    public LogisticsOrganization()
    {
        super(Organization.Type.Logistics.getValue());
    }
    
      @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        return roles;
    }
    
}
