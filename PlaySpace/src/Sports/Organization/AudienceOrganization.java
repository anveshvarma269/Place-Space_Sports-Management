/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Sports.Organization;

import Sports.Role.Role;
import Sports.role.SponsorRole;
import java.util.ArrayList;

/**
 *
 * @author revanthkumar
 */
    public class AudienceOrganization extends Organization{
    public AudienceOrganization()
    {
        super(Organization.Type.Audience.getValue());
    }
    
      @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new SponsorRole());
        return roles;
    }
}
