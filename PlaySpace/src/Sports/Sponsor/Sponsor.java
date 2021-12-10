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
public class Sponsor {
    String sponsorName;

    public String getSponsorName() {
        return sponsorName;
    }
    
    HashMap<Team, Integer> sponsoredRequests;
    HashMap<Team,String> offerStatus;

    public void setSponsorName(String sponsorName) {
        this.sponsorName = sponsorName;
    }

    public UserAccount getUserAccount() {
        return userAccount;
    }

    public HashMap<Team, String> getOfferStatus() {
        return offerStatus;
    }

    public void setOfferStatus(HashMap<Team, String> offerStatus) {
        this.offerStatus = offerStatus;
    }

    public void setUserAccount(UserAccount userAccount) {
        this.userAccount = userAccount;
    }
    int sponsorBudget;
    ArrayList<String> sponsoredTeams = new ArrayList<String>();

    public ArrayList<String> getSponsoredTeams() {
        return sponsoredTeams;
    }

    public void setSponsoredTeams(ArrayList<String> sponsoredTeams) {
        this.sponsoredTeams = sponsoredTeams;
    }
    UserAccount userAccount;

    public Sponsor(UserAccount ua,String sponsorName)
    {
        this.userAccount = ua;
        this.sponsorName = sponsorName;
        sponsoredTeams = new ArrayList<String>();
        sponsoredRequests = new HashMap<Team,Integer>();
        offerStatus = new HashMap<Team,String>();
       
    }

    public HashMap<Team, Integer> getSponsoredRequests() {
        return sponsoredRequests;
    }

    public void setSponsoredRequests(HashMap<Team, Integer> sponsoredRequests) {
        this.sponsoredRequests = sponsoredRequests;
    }
    public int getSponsorBudget() {
        return sponsorBudget;
    }

    public void setSponsorBudget(int sponsorBudget) {
        this.sponsorBudget = sponsorBudget;
    }
    
    public void setSponsorship(Team team,int budget)
    {
        offerStatus.put(team,"Accepted");
       // sponsoredRequests.put(team,sponsoredRequests.get(team) + budget);
        
    }


}