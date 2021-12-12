/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sports.Organization;

import Sports.Role.Role;
import Sports.Supplier.SupplierDirectory;
import Sports.Role.EquipmentSupplierRole;
import java.util.ArrayList;

/**
 *
 * @author anveshvarma
 */
public class EquipmentSupplierOrganization extends Organization{
        SupplierDirectory supplierDirectory = new SupplierDirectory();

    public SupplierDirectory getSupplierDirectory() {
        return supplierDirectory;
    }

    public void setSupplierDirectory(SupplierDirectory supplierDirectory) {
        this.supplierDirectory = supplierDirectory;
    }
    public EquipmentSupplierOrganization()
    {
        super(Organization.Type.EquipmentSupplier.getValue());
    }
    
      @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new EquipmentSupplierRole());
        return roles;
    }
    
}
