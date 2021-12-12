/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sports.Organization;

import Sports.Role.Role;
import Sports.WorkQueue.WorkQueue;
import java.util.ArrayList;

/**
 *
 * @author vishnuteja
 */
public abstract class Organization {
    private String name;
    private WorkQueue workQueue;
    private int organizationID;
    private static int counter=0;
    
    public enum Type{
        Admin("Team Manager Organization"), 
        Team("Team Organization"), 
        Sports("Sports Organization"), 
        Coaches("Coaches Organization"),
        Venue("Venue Organization"),
        EquipmentSupplier("Equipment supplier Organization"),
        Doctors("Doctors Organization"),
        Sponsors("Sponsors Organization"),
        Audience("Audience Organization"),
        Referee("Referee Organization"),
        Logistics("Transport Organization");
        
        private String value;
        private Type(String value) {
            this.value = value;
        }
        public String getValue() {
            return value;
        }

        
    }

    public Organization(String name) {
        this.name = name;
        workQueue = new WorkQueue();
        
        organizationID = counter;
        ++counter;
    }
    
    

    public abstract ArrayList<Role> getSupportedRole();
    
    public int getOrganizationID() {
        return organizationID;
    }

    public String getName() {
        return name;
    }

    public WorkQueue getWorkQueue() {
        return workQueue;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWorkQueue(WorkQueue workQueue) {
        this.workQueue = workQueue;
    }

    @Override
    public String toString() {
        return name;
    }
    public Organization(){
        
    }
}
