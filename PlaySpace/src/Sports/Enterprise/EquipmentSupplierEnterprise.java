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
public class EquipmentSupplierEnterprise extends Enterprise{
       public EquipmentSupplierEnterprise(String name){
        super(name, Enterprise.EnterpriseType.EquipmentSupplier);
    }
    @Override
    public ArrayList<Role> getSupportedRole() {
        return null;
    }
    
}
