/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sports.Doctor;

import Sports.Team.Team;
import Sports.User.UserAccount;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author anveshvarma
 */
public class Doctor {
    String doctorName;
    UserAccount ua;
    Date date;
    HashMap<Date,Map<Date,Boolean>> doctorAvailability ;
    HashMap<Team,HashMap<Date,List<Date>>> teamMapping;

    public HashMap<Date, Map<Date, Boolean>> getDoctorAvailability() {
        return doctorAvailability;
    }

    public void setDoctorAvailability(HashMap<Date, Map<Date, Boolean>> doctorAvailability) {
        this.doctorAvailability = doctorAvailability;
    }

    public UserAccount getUa() {
        return ua;
    }

    public void setUa(UserAccount ua) {
        this.ua = ua;
    }

    public String getDoctorName() {
        return doctorName;
    }

    public void setDoctorName(String doctorName) {
        this.doctorName = doctorName;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) throws ParseException {
        this.date = date;
        if(!doctorAvailability.containsKey(date))
        doctorAvailability.put(date, this.timeMap());
    }



    public String getDoctorDesignation() {
        return doctorDesignation;
    }

    public void setDoctorDesignation(String doctorDesignation) {
        this.doctorDesignation = doctorDesignation;
    }
    int doctorId;

    public HashMap<Team, HashMap<Date, List<Date>>> getTeamMapping() {
        return teamMapping;
    }

    public void setTeamMapping(HashMap<Team, HashMap<Date, List<Date>>> teamMapping) {
        this.teamMapping = teamMapping;
    }

    public int getDoctorId() {
        return doctorId;
    }

    public void setDoctorId(int doctorId) {
        this.doctorId = doctorId;
    }
    String doctorDesignation;
    public Doctor(UserAccount ua,String doctorName,String doctorDesignation) throws ParseException
    {
        this.doctorName = doctorName;
        this.doctorDesignation = doctorDesignation;
        this.ua = ua;
        if(doctorAvailability == null)
           doctorAvailability = new  HashMap<Date,Map<Date,Boolean>> ();
        if(teamMapping == null)
            teamMapping = new HashMap<Team,HashMap<Date,List<Date>>>();
                
        //doctorAvailability.put(new Date(), this.timeMap());
    }
    public Doctor(UserAccount ua,String doctorName)
    {
        this.doctorName = doctorName;
        //this.doctorDesignation = doctorDesignation;
        this.ua = ua;
    }
    
    public final  Map<Date,Boolean> timeMap() throws ParseException
    {
        Map<Date,Boolean> map = new HashMap<Date,Boolean>();
        SimpleDateFormat sdf = new SimpleDateFormat ("HH:mm");
        map.put(sdf.parse("09:00"), Boolean.TRUE);
        map.put(sdf.parse("10:00"), Boolean.TRUE);
        map.put(sdf.parse("11:00"), Boolean.TRUE);
        map.put(sdf.parse("12:00"), Boolean.TRUE);
        map.put(sdf.parse("13:00"), Boolean.TRUE);
        map.put(sdf.parse("14:00"), Boolean.TRUE);
        map.put(sdf.parse("15:00"), Boolean.TRUE);
        map.put(sdf.parse("16:00"), Boolean.TRUE);
        map.put(sdf.parse("17:00"), Boolean.TRUE);
        return map;
    }
   
    
    
}
