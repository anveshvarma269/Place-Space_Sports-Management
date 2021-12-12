/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Sports.Enterprise;

import Sports.Doctor.DoctorDirectory;
import Sports.Organization.DoctorsOrganization;
import Sports.Organization.EquipmentSupplierOrganization;
import Sports.Organization.Organization;
import Sports.Organization.OrganizationDirectory;
import Sports.Organization.SponsorsOrganization;
import Sports.Organization.SportsOrganization;
import Sports.Organization.VenueOrganization;
import Sports.Sponsor.SponsorDirectory;
import Sports.Sport.SportDirectory;
import Sports.Supplier.SupplierDirectory;
import Sports.Venue.VenueDirectory;
import java.util.ArrayList;

/**
 *
 * @author revanthkumar
 */
public class EnterpriseDirectory {
     public static  ArrayList<Enterprise> enterpriseList;
   


    public  ArrayList<Enterprise> getEnterpriseList() {
        return enterpriseList;
    }

    public  void setEnterpriseList(ArrayList<Enterprise> enterpriseList) {
        this.enterpriseList = enterpriseList;
    }
    
    public EnterpriseDirectory(){
        enterpriseList=new ArrayList<Enterprise>();
    }
    
    //Create enterprise
    public Enterprise AddNewEnterprise(String name,Enterprise.EnterpriseType type){
        Enterprise enterprise=null;
      
        
        if(type==Enterprise.EnterpriseType.Sports){
            enterprise=new SportsEnterprise(name);
            enterpriseList.add(enterprise);
        }
        
        else if(type==Enterprise.EnterpriseType.Doctors){
            enterprise=new DoctorsEnterprise(name);
            enterpriseList.add(enterprise);
        }
        
        else if(type==Enterprise.EnterpriseType.EquipmentSupplier){
            enterprise=new EquipmentSupplierEnterprise(name);
            enterpriseList.add(enterprise);
        }
        
        else if(type==Enterprise.EnterpriseType.Venue){
            enterprise=new VenueEnterprise(name);
            enterpriseList.add(enterprise);
        }
        
        else if(type==Enterprise.EnterpriseType.Sponsors){
            enterprise=new SponsorsEnterprise(name);
            enterpriseList.add(enterprise);
        }
        return enterprise;
    }
    
    public SportDirectory getSportsDirectory()
    {
         SportDirectory sd;
         SportsOrganization so;
        for(Enterprise e: enterpriseList)
        {
            OrganizationDirectory od = e.getOrganizationDirectory();
            ArrayList<Organization> orgList = od.getOrganizationList();
            for(Organization o :orgList)
            {
                if(o.getName().equals("Sports Organization"))
                {
                     so = (SportsOrganization) o;
                     sd  =  so.getSportDirectory();
                     return sd;
                }
            }
        }
        return null;
    }
    
    
    public VenueDirectory getVenueDirectory()
    {
         VenueDirectory vd;
         VenueOrganization vo;
        for(Enterprise e: enterpriseList)
        {
            OrganizationDirectory od = e.getOrganizationDirectory();
            ArrayList<Organization> orgList = od.getOrganizationList();
            for(Organization o :orgList)
            {
                if(o.getName().equals("Venue Organization"))
                {
                     vo = (VenueOrganization) o;
                     vd  =  vo.getVd();
                     return vd;
                }
            }
        }
        return null;
    }
    
    
    public DoctorDirectory getDoctorDirectory()
    {
        DoctorDirectory dd;
        DoctorsOrganization docO;
        for(Enterprise e: enterpriseList)
        {
            OrganizationDirectory od = e.getOrganizationDirectory();
            ArrayList<Organization> orgList = od.getOrganizationList();
            for(Organization o :orgList)
            {
                if(o.getName().equals("Doctors Organization"))
                {
                     docO = (DoctorsOrganization) o;
                     dd  =  docO.getDd();
                     return dd;
                }
            }
        }
        return null;
        
    }
    
    public SponsorDirectory getSponsorDirectory()
    {
        SponsorDirectory sponsorD;
        SponsorsOrganization sponsorO;
        for(Enterprise e: enterpriseList)
        {
            OrganizationDirectory od = e.getOrganizationDirectory();
            ArrayList<Organization> orgList = od.getOrganizationList();
            for(Organization o :orgList)
            {
                if(o.getName().equals("Sponsors Organization"))
                {
                     sponsorO = (SponsorsOrganization) o;
                     if(sponsorO.getSponsorDirectory() == null) sponsorO.setSponsorDirectory(new SponsorDirectory());
                     sponsorD  =  sponsorO.getSponsorDirectory();
                     
                     return sponsorD;
                }
            }
        }
        return null;
        
    }
    
    
    public SupplierDirectory getSupplierDirectory()
    {
        SupplierDirectory supplierD;
        EquipmentSupplierOrganization eo;
        for(Enterprise e: enterpriseList)
        {
            OrganizationDirectory od = e.getOrganizationDirectory();
            ArrayList<Organization> orgList = od.getOrganizationList();
            for(Organization o :orgList)
            {
                if(o.getName().equals("Equipment supplier Organization"))
                {
                     eo = (EquipmentSupplierOrganization) o;
                     if(eo.getSupplierDirectory() == null) eo.setSupplierDirectory(new SupplierDirectory());
                     supplierD  =  eo.getSupplierDirectory();
                     return supplierD;
                }
            }
        }
        return null;
        
    }
}
