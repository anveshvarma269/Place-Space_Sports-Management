/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Sports.Organization;

import Sports.Doctor.DoctorDirectory;
import Sports.Role.Role;
import Sports.role.DoctorRole;
import java.util.ArrayList;

/**
 *
 * @author revanthkumar
 */

    public class DoctorsOrganization extends Organization {
    
    DoctorDirectory dd ;

    public DoctorDirectory getDd() {
        return dd;
    }

    public void setDd(DoctorDirectory dd) {
        this.dd = dd;
    }
    public DoctorsOrganization()
    {
        super(Organization.Type.Doctors.getValue());
        dd = new DoctorDirectory();
    }
    

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new DoctorRole());
        return roles;
    }
}
