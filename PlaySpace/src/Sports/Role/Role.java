/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sports.Role;

import Sports.EcoSystem;
import Sports.Enterprise.Enterprise;
import Sports.Organization.Organization;
import Sports.User.UserAccount;
import javax.swing.JPanel;

/**
 *
 * @author vishnuteja
 */
public abstract class Role {
    
    public enum RoleType{
        Admin("Admin Role"),
        Doctor("Doctor"),
        PlayerRole("Player Role"),
        SystemAdmin("System Admin Role"),
        Coach("Coach Role"),
        DataAnalyst("Data Analyst Role"),
        EquipmentSupplier("Equipment Supplier Role"),
        Sponsor("Sponsor Role"),
        TeamManager("Team Manager Role"),
        VenueManager("Venue Manager Role"),
        LogisticRole("Logistic Manager Role"),
        DataAnalystRole("Data Analyst Role");
        
        private String value;
        private RoleType(String value){
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return value;
        }
        public String getRoleType()
        {
            return value;
        }
    }
    
    public abstract JPanel createWorkArea(JPanel userProcessContainer, 
            UserAccount account, 
            Organization organization, 
            Enterprise enterprise, 
            EcoSystem business);

    @Override
    public String toString() {
        return this.getClass().getName();
    }

    
    
}
