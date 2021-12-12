/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Sports.Organization;

import Sports.Role.Role;
import Sports.Sponsor.SponsorDirectory;
import Sports.Role.SponsorRole;
import java.util.ArrayList;

/**
 *
 * @author revanthkumar
 */
public class SponsorsOrganization extends Organization {
    
    SponsorDirectory sponsorDirectory ;

    public SponsorDirectory getSponsorDirectory() {
        return sponsorDirectory;
    }

    public void setSponsorDirectory(SponsorDirectory sponsorDirectory) {
        this.sponsorDirectory = sponsorDirectory;
    }
    public SponsorsOrganization()
    {
        super(Organization.Type.Sponsors.getValue());
        sponsorDirectory = new SponsorDirectory();
    }
    
      @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new SponsorRole());
        return roles;
    }
}
