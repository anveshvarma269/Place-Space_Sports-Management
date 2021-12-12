/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sports.Enterprise;

/* Vishnu */
import Sports.Organization.Organization;
import Sports.Organization.OrganizationDirectory;
import Sports.Role.Role;
import java.util.ArrayList;

import Sports.Organization.OrganizationDirectory;
/* Vishnu */

/**
 *
 * @author vishnuteja
 */
/* Vishnu */
public abstract class Enterprise extends Organization{

public class Enterprise {
/* Vishnu */
    private EnterpriseType enterpriseType;
    private OrganizationDirectory organizationDirectory;

    public OrganizationDirectory getOrganizationDirectory() {
        return organizationDirectory;
    }
/* Vishnu */

    

/* Vishnu */
    
    public enum EnterpriseType{
        Sports("Sports"),
        Venue("Venue"),
        EquipmentSupplier("EquipmentSupplier"),
        Doctors("Doctors"),
        Sponsors("Sponsors");
        
        
        private String value;
        
        private EnterpriseType(String value){
            this.value=value;
        }
        public String getValue() {
            return value;
        }
        @Override
        public String toString(){
        return value;
    }
    }

    public EnterpriseType getEnterpriseType() {
        return enterpriseType;
    }

    public void setEnterpriseType(EnterpriseType enterpriseType) {
        this.enterpriseType = enterpriseType;
    }
    
    public Enterprise(String name,EnterpriseType type){
        super(name);
        this.enterpriseType=type;
        organizationDirectory=new OrganizationDirectory();
    }
}
