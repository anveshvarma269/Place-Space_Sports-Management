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
 * @author vishnuteja
 */
public class SportsEnterprise  extends Enterprise {
      public SportsEnterprise(String name){
        super(name, EnterpriseType.Sports);
    }
    @Override
    public ArrayList<Role> getSupportedRole() {
        return null;
    }
}
