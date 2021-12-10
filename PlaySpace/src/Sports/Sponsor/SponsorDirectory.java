/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sports.Sponsor;

import Sports.Team.Team;
import Sports.User.UserAccount;
import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author anveshvarma
 */
public class SponsorDirectory {
    ArrayList<Sponsor> sponsorsList = new ArrayList<Sponsor>();

    public ArrayList<Sponsor> getSponsorsDirectory() {
        return sponsorsList;
    }

    public void setSponsorsDirectory(ArrayList<Sponsor> sponsorsDirectory) {
        this.sponsorsList = sponsorsDirectory;
    }
    
    public Sponsor getSponsor(UserAccount ua)
    {
        for(Sponsor s: sponsorsList)
        {
            if(s.getUserAccount().equals(ua))
                return s;
        }
        return null;
    }
    
       public Sponsor getSponsor(String spName)
    {
        for(Sponsor s: sponsorsList)
        {
            if(s.getSponsorName().equals(spName))
                return s;
        }
        return null;
    }
    
       
    public void sponsorToTeam(String sponsorName,int budget,Team team)
    {
        Sponsor sponsor = getSponsor(sponsorName);
        sponsor.setSponsorship(team, budget);
        
    }
       
    public void addTeamToSponsored(String  teamName,String sponsorName)
    {
        
        for(Sponsor s: sponsorsList)
        {
            if(s.getSponsorName().equals(sponsorName))
            {
                s.getSponsoredTeams().add(teamName);
            }
        }
    }
    
    public void offerToTeam(Sponsor sponsor,Team team,int budget)
    {
        HashMap<Team,Integer> offer;
        HashMap<Team,String> offerStatus;
        
        for(Sponsor s: sponsorsList)
        {
            if(s.equals(sponsor))
            {
                if(s.getSponsoredRequests() == null) s.setSponsoredRequests(new HashMap<Team,Integer>());
                offer = s.getSponsoredRequests();
                offer.put(team, budget);
                if(s.getOfferStatus() == null) s.setOfferStatus(new HashMap<Team,String>());
                offerStatus = s.getOfferStatus();
                offerStatus.put(team,"Requested");
                
                
            }
        }
        
    }

    
    
    public void addSponsor(Sponsor sponsor)
    {
        sponsorsList.add(sponsor);
    }
}
