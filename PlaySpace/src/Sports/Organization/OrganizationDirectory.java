/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sports.Organization;

import Sports.Organization.Organization.Type;

import java.util.ArrayList;

/**
 *
 * @author vishnuteja
 */
public class OrganizationDirectory {
    private ArrayList<Organization> organizationList;

    public OrganizationDirectory() {
        organizationList = new ArrayList();
    }

    
    public ArrayList<Organization> getOrganizationList() {
        return organizationList;
    }
    public Organization createOrganization(Type type){
        Organization organization = null;
        if (type.getValue().equals(Type.Sports.getValue())){
            organization = new SportsOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.Team.getValue())){
            organization = new TeamOrganization();
            organizationList.add(organization);
        }
        
        else if (type.getValue().equals(Type.Sponsors.getValue())){
            organization = new SponsorsOrganization();
            organizationList.add(organization);
        }
        
        else if (type.getValue().equals(Type.EquipmentSupplier.getValue())){
            organization = new EquipmentSupplierOrganization();
            organizationList.add(organization);
        }
        
        else if (type.getValue().equals(Type.Doctors.getValue())){
            organization = new DoctorsOrganization();
            organizationList.add(organization);
        }
        
        else if (type.getValue().equals(Type.Venue.getValue())){
            organization = new VenueOrganization();
            organizationList.add(organization);
        }
        
        
        else if (type.getValue().equals(Type.Admin.getValue())){
            organization = new TeamManagerOrganization();
            organizationList.add(organization);
        }
        
        else if (type.getValue().equals(Type.Coaches.getValue())){
            organization = new CoachesOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.Referee.getValue())){
            organization = new RefereeOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.Audience.getValue())){
            organization = new AudienceOrganization();
            organizationList.add(organization);
        }
        
        
        return organization;
    }
    
    
        
        
}

