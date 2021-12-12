/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sports.Enterprise;

import Sports.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author anveshvarma
 */
public class DoctorsEnterprise extends Enterprise {
        public DoctorsEnterprise(String name){
        super(name, Enterprise.EnterpriseType.Doctors);
    }
    
    public ArrayList<Role> getSupportedRole() {
        return null;
    
    
}
}
