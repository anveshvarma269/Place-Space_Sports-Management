/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sports;

import Sports.Employee.Employee;
import Sports.Employee.EmployeeDirectory;
import Sports.Enterprise.Enterprise;
import Sports.Enterprise.EnterpriseDirectory;
import Sports.Organization.Organization;
import Sports.Organization.OrganizationDirectory;
import Sports.Organization.SystemAdminRole;
import Sports.User.UserAccount;
import Sports.User.UserAccountDirectory;

/**
 *
 * @author anveshvarma
 */
public class ConfigureASystem {
    
        public static EcoSystem configure(){
        
        EcoSystem system = EcoSystem.getInstance();
        EmployeeDirectory employeeDirectory = system.getEmployeeDirectory();
        if(employeeDirectory == null)
        {
            employeeDirectory = new EmployeeDirectory();
        }
        EnterpriseDirectory ed= system.getEnterpriseDirectory();
        if(ed == null)
         {
            ed = new EnterpriseDirectory();
         }
        
        /*Sysadmin*/
        Employee employee = employeeDirectory.createEmployee("sysadmin");
        UserAccountDirectory userAccountDirectory = system.getUserAccountDirectory();
        if(userAccountDirectory == null)
        {
            userAccountDirectory = new UserAccountDirectory();
        }
        UserAccount ua = userAccountDirectory.createUserAccount("sysadmin", "sysadmin", employee, new SystemAdminRole());
        system.setEmployeeDirectory(employeeDirectory);
        system.setUserAccountDirectory(userAccountDirectory);
        
        /*SportsEnterprise*/


        Enterprise sportsEnterprise = ed.AddNewEnterprise("SportsEnterprise", Enterprise.EnterpriseType.Sports);
        OrganizationDirectory sportsOrganizationDirectory = sportsEnterprise.getOrganizationDirectory();
        if(sportsOrganizationDirectory == null)
        {
            sportsOrganizationDirectory = new OrganizationDirectory();
        }
        sportsOrganizationDirectory.createOrganization(Organization.Type.Sports);
        sportsOrganizationDirectory.createOrganization(Organization.Type.Team);
        sportsOrganizationDirectory.createOrganization(Organization.Type.Admin);
        sportsOrganizationDirectory.createOrganization(Organization.Type.Coaches);
        sportsOrganizationDirectory.createOrganization(Organization.Type.Referee);
        
     
        
        /*Venue Enterprse*/
        
        Enterprise venueEnterprise = ed.AddNewEnterprise("VenueEnterprise", Enterprise.EnterpriseType.Venue);
        OrganizationDirectory venueOrganizationDirectory = venueEnterprise.getOrganizationDirectory();
        if(venueOrganizationDirectory == null)
        {
            venueOrganizationDirectory = new OrganizationDirectory();
        }
        venueOrganizationDirectory.createOrganization(Organization.Type.Venue);
        venueOrganizationDirectory.createOrganization(Organization.Type.Audience);
        
        /*Sponsor Enterprise*/
        
        Enterprise sponsorEnterprise = ed.AddNewEnterprise("SponsorEnterprise", Enterprise.EnterpriseType.Sponsors);
        OrganizationDirectory sponsorOrganizationDirectory = sponsorEnterprise.getOrganizationDirectory();
        if(sponsorOrganizationDirectory == null)
        {
            sponsorOrganizationDirectory = new OrganizationDirectory();
        }
        sponsorOrganizationDirectory.createOrganization(Organization.Type.Sponsors);
        
        
        /*Doctor Enterprise*/
        
        Enterprise doctorEnterprise = ed.AddNewEnterprise("DoctorsEnterprise", Enterprise.EnterpriseType.Doctors);
        OrganizationDirectory doctorOrganizationDirectory = doctorEnterprise.getOrganizationDirectory();
        if(doctorOrganizationDirectory == null)
        {
            doctorOrganizationDirectory = new OrganizationDirectory();
        }
        doctorOrganizationDirectory.createOrganization(Organization.Type.Doctors);
        
        
        /*Supplier Enterprise*/
        
        Enterprise supplierEnterprise = ed.AddNewEnterprise("SupplierEnterprise", Enterprise.EnterpriseType.EquipmentSupplier);
        OrganizationDirectory supplierOrganizationDirectory = supplierEnterprise.getOrganizationDirectory();
        if(supplierOrganizationDirectory == null)
        {
            supplierOrganizationDirectory = new OrganizationDirectory();
        }
        supplierOrganizationDirectory.createOrganization(Organization.Type.EquipmentSupplier);
                
        
        
        
        system.setEnterpriseDirectory(ed);
        return system;
    }
    
}
