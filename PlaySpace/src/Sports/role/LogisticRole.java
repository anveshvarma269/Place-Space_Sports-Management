/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sports.role;

import Sports.EcoSystem;
import Sports.Enterprise.Enterprise;
import Sports.Organization.Organization;
import Sports.Role.Role;
import Sports.User.UserAccount;
import javax.swing.JPanel;

/**
 *
 * @author anveshvarma
 */
public class LogisticRole extends Role {
    
    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
