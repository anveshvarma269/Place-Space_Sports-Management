/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sports.Doctor;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author anveshvarma
 */
public class DoctorDirectory {
    ArrayList<Doctor> doctors;
   int docId = 100;
   String status;
    public ArrayList<Doctor> getDoctors() {
        return doctors;
    }

    public void setDoctors(ArrayList<Doctor> doctors) {
        this.doctors = doctors;
    }
    
    public void addDoctor(Doctor doctor)
    {
        if(doctors == null) doctors= new ArrayList<Doctor>();
        doctor.setDoctorId(docId);
        doctors.add(doctor);
        docId++;
    }
    
    public Doctor getDoctor(String doctorName)
    {
        for(Doctor d: doctors)
        {
            if(d.getDoctorName().equals(doctorName))
                return d;
        }
        return null;
    }
    
     public Doctor getDoctor(UserAccount ua)
    {
        for(Doctor d: doctors)
        {
            if(d.getUa().equals(ua))
                return d;
        }
        return null;
    }
    
    public ArrayList<Doctor> getDoctorsByDesignation(String designation)
    {
        ArrayList<Doctor> doctorsWithDesination = new ArrayList<Doctor>();
        for(Doctor d: doctors)
        {
            if(d.getDoctorDesignation().equals(designation))
               doctorsWithDesination.add(d);
        }
        return doctorsWithDesination;        
    }
    
    public ArrayList<Date> getAvailbleSlots(Date date,String doctorName) throws ParseException
    {
        ArrayList<Date> availbleSlots = new ArrayList<Date>();
        Doctor d=null;
        for(Doctor dc : doctors)
        {
            if(dc.getDoctorName().equals(doctorName))
                d=dc;
        }
        Map<Date,Boolean> timeMap = d.getDoctorAvailability().get(date);
        for(Date dt : timeMap.keySet()){
            if(timeMap.get(dt) == Boolean.TRUE)
                availbleSlots.add(dt);
        }
        return availbleSlots;
    }
    
     public void requestDoctor(Date date,Date time,Doctor doctor,Team t) throws ParseException{
 
         for(Doctor d: doctors)
        {
            if(d.getDoctorName().equals(doctor.getDoctorName()))
            {       
                if(d.getDoctorAvailability().containsKey(date))
                    d.getDoctorAvailability().get(date).put(time,Boolean.FALSE);
                else{
                    d.getDoctorAvailability().put(date, d.timeMap());
                    d.getDoctorAvailability().get(date).put(time,Boolean.FALSE);
                }
                if(d.getTeamMapping().containsKey(t)){
                 if(d.getTeamMapping().get(t).containsKey(date))
                       d.getTeamMapping().get(t).get(date).add(time);
                 else{
                     d.getTeamMapping().get(t).put(date, new ArrayList<Date>());
                     d.getTeamMapping().get(t).get(date).add(time);
                 }
                 
                     }
          else{
              d.getTeamMapping().put(t, new HashMap<Date,List<Date>>());
               d.getTeamMapping().get(t).put(date, new ArrayList<Date>());
               d.getTeamMapping().get(t).get(date).add(time);
          }
            }
          
        }
     } 
     
     public void updateStatusDoctor(Date date,Date time,Doctor doctor) throws ParseException{
 
         for(Doctor d: doctors)
        {
            if(d.getUa().equals(doctor.getUa()))
            {    
              //  if(availbility.equals("Unavailable")){
                if(d.getDoctorAvailability().containsKey(date))
                    d.getDoctorAvailability().get(date).put(time,Boolean.FALSE);
                else{
                    d.getDoctorAvailability().put(date, d.timeMap());
                    d.getDoctorAvailability().get(date).put(time,Boolean.FALSE);
                }
            //}
                
               
               /* if(availbility.equals("Available")){
                if(d.getDoctorAvailability().containsKey(date))
                    d.getDoctorAvailability().get(date).put(time,Boolean.TRUE);
                else{
                    d.getDoctorAvailability().put(date, d.timeMap());
                    d.getDoctorAvailability().get(date).put(time,Boolean.TRUE);
                }} */
                    
            }
            }
          
    
          
        
