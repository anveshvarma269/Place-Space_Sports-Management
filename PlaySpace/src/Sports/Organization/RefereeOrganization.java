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
public class RefereeOrganization extends Organization{

    
    public RefereeOrganization()
    {
        super(Organization.Type.Referee.getValue());
    }
    @Override
    public ArrayList<Role> getSupportedRole() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
