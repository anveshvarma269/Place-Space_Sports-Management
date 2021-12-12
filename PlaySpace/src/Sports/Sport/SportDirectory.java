/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Sports.Sport;

import Sports.Team.Team;
import Sports.User.UserAccount;
import java.util.ArrayList;

/**
 *
 * @author revanthkumar
 */
public class SportDirectory {
  ArrayList<Sport> sportsList = new ArrayList<Sport>();

    public ArrayList<Sport> getSportsList() {
        return sportsList;
    }

    public void setSportsList(ArrayList<Sport> sportsList) {
        this.sportsList = sportsList;
    }
    
    
    public boolean checkTeamNameUnique(String teamName)
    {
        for(Sport s: sportsList)
        {
            ArrayList<Team> teams = s.getTeamsOfSport();
            for(Team t: teams)
            {
                if(t.getTeamName().equals(teamName))
                    return true;
            }
        }
        return false;
    }
    
    
    public void addSport(Sport sport)
    {
        sportsList.add(sport);
    }
    
    
    public Sport getSport(String sportName)
    {
        for(Sport s: sportsList)
        {
            if(s.getSportName().equals(sportName))
                return s;
        }
        return null;
    }
    
    
        public Sport getSport(UserAccount ua)
    {
        ArrayList<Team> teams;
        for(Sport s: sportsList)
        {
            teams = s.getTeamsOfSport();
            for(Team t: teams)
            {
                if(t.getUserAccount().equals(ua))
                    return s;
            }
        }
        return null;
    }
    
    
    public Team getTeam(String teamName,String sportName)
    {
        for(Sport s: sportsList)
        {
            if(s.getSportName().equals(sportName)){
            ArrayList<Team> teams = s.getTeamsOfSport();
            for(Team t: teams)
            {
                if(t.getTeamName().equals(teamName))
                    return t;
            }
            }
        }
        return null;
    }
    
    public void addTeamToSport(String sportName,Team team)
    {
        for(Sport s: sportsList)
        {
            if(s.getSportName().equals(sportName))
            {
                s.addTeamRequest(team);
            }
        }
    }
    
    public Match getMatch(String matchName,String sportName)
    {
        for(Sport s: sportsList)
        {
            if(s.getSportName().equals(sportName))
            {
            ArrayList<Match> matches = s.getMatches();
            for(Match m: matches)
            {
                if(String.valueOf(m.getMatchNo()).equals(matchName))
                    return m;
            }
            }
        }
        return null;
    }
    
    public Team getTeam(UserAccount ua)
    {
        ArrayList<Team> teams;
        for(Sport s: sportsList)
        {
            teams = s.getTeamsOfSport();
            for(Team t: teams)
            {
                if(t.getUserAccount().equals(ua))
                    return t;
            }
        }
        return null;
    }
    
    public void sponsorBudgetToTeam(int budget,String teamName,String sportName)
    {
        ArrayList<Team> teams;
        for(Sport s: sportsList)
        {
            if(s.getSportName().equals(sportName)){
            teams = s.getTeamsOfSport();
            for(Team t: teams)
            {
                if(t.getUserAccount().equals(teamName))
                {
                    int teamBudget = t.getBudget();
                    t.setBudget(teamBudget + budget);
                }
            }}
        }
    }
       
}
