/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Sports.Sport;

import Sports.Team.Team;
import Sports.User.UserAccount;
import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author revanthkumar
 */
public class Sport {
  ArrayList<Team> teamsOfSport = new ArrayList<Team>();
    
    ArrayList<Team> requestTeamAccess = new ArrayList<Team>();
    
    
    String[][] schedule;
    HashMap<String, Integer> pointsTable;
    String[][] pointsScheduledTable;
    int noOfMatches;
    ArrayList<Match> matches;
    boolean matchesScheduled;
    UserAccount userAccount;
    String scheduleType ;
    
    public Sport(String sportName)
    {
       // this.userAccount = ua;
        this.sportName = sportName;
        this.scheduleType = "TBD";

        matchesScheduled = false;
    }
    
    

    public ArrayList<Match> getMatches() {
        return matches;
    }

    public void setMatches(ArrayList<Match> matches) {
        this.matches = matches;
    }
    int pointsPerMatch = 2;

    public String[][] getSchedule() {
        return schedule;
    }

    public void setSchedule(String[][] schedule) {
        this.schedule = schedule;
    }

    public HashMap<String, Integer> getPointsTable() {
        return pointsTable;
    }

    public void setPointsTable(HashMap<String, Integer> pointsTable) {
        this.pointsTable = pointsTable;
    }

    public ArrayList<Team> getTeamsOfSport() {
        return teamsOfSport;
    }

    public void setTeamsOfSport(ArrayList<Team> teamsOfSport) {
        this.teamsOfSport = teamsOfSport;
    }

    public String getSportName() {
        return sportName;
    }

    public void setSportName(String sportName) {
        this.sportName = sportName;
    }
    
    public int getNoOfTeam()
    {
        return teamsOfSport.size();
    }
    
    String sportName;

    
    
    
    public void generateRoundRobinSchedule()
    {
                matches = new ArrayList<Match>();
        int noOfTeams = teamsOfSport.size();
        int row = 0,matchNoStatic = 1;
        int noOfMatches = (noOfTeams/2)*(noOfTeams-1);
        schedule = new String[noOfMatches][3];
        scheduleType = "Round robin";
        int days = (noOfTeams % 2 == 0) ? noOfTeams -1 : noOfTeams; 
        for (int i=0; i<days; i++) {
            for (int j=0; j<noOfTeams/2; j++) {
                int t1 = (j+i) % noOfTeams;
                int t2 = ((noOfTeams - j -1) + i) % noOfTeams;
                Match match = new Match();
                match.setMatchNo(matchNoStatic);
                match.setTeam1(teamsOfSport.get(t1));
                match.setTeam2(teamsOfSport.get(t2));
                match.setSport(sportName);
                match.setDay(i+1);
                matches.add(match);
              
                
                row++;matchNoStatic++;
            }
        }
        
     
    }
    
    public void generateKnockoutSchedule()
    {
                matches = new ArrayList<Match>();
        int noOfTeams = teamsOfSport.size();
        schedule = new String[noOfTeams/2][3];
        scheduleType = "Knockout";
        noOfMatches = noOfTeams/2;
        int row = 0,matchNoStatic = 1,team = 0;
        for(int i = 0; i < noOfTeams/2;i++)
        {
            Match match = new Match();
            match.setMatchNo(matchNoStatic);
            match.setSport(sportName);
            match.setTeam1(teamsOfSport.get(team));
            match.setTeam2(teamsOfSport.get(team+1));
            match.setDay(i);
            matches.add(match);
         
            row++;matchNoStatic++;  
            team = team + 2;
        }
    
    }
    
    
    public HashMap<String,Integer> generateHashPointsTable()
    {
        int noOfTeams = teamsOfSport.size();
        for(int i = 0 ; i < noOfMatches; i++)
        {
            String teamWon = schedule[i][3];
            int matchesWon = pointsTable.get(teamWon);
            matchesWon++;
            pointsTable.put(teamWon, matchesWon);
        }
        return pointsTable;
    }
    
    
    public void updatePoints(String team1,String team2,String teamWon)
    {
        Team team1Played = getTeam(team1);
        team1Played.updateMatchPlayed();
        Team team2Played = getTeam(team2);
        team2Played.updateMatchPlayed();
        Team teamPlayedWon = getTeam(teamWon);
        teamPlayedWon.updateMatchesWon();
    }
    
    public void addTeamRequest(Team team)
    {
        if(teamsOfSport == null) teamsOfSport = new ArrayList<Team>();
        teamsOfSport.add(team);
    }
    
    public void provideTeamAccess(String teamName)
    {
        for(Team t: teamsOfSport)
        {
            if(t.getTeamName().equals(teamName))
            {
                t.setTeamStatus("Playing");
            }
        }
    }
    
    public Team getTeam(String teamName)
    {
        for(Team t: teamsOfSport)
        {
            if(t.getTeamName().equals(teamName))
                return t;
        }
        return null;
    }

    public String getScheduleType() {
        return scheduleType;
    }
    public void setScheduleType(String type)
    {
        this.scheduleType = type;
    }
    
    
     public HashMap<String,Integer> winByLocation(String Location)
     {
         HashMap<String,Integer> stats = new HashMap<String,Integer>();
         for(Match m : matches)
         {
             if(m.getVenue() == null) continue;
             if(m.getVenue().getLocation().equals(Location))
             {
             if(m.getMatchWinner() == null) continue;
             else
             {
                if(stats.containsKey(m.getMatchWinner())) 
                {
                    stats.put(m.getMatchWinner(), stats.get(m.getMatchWinner()) + 1);
                }
                else
                    stats.put(m.getMatchWinner(),1);
             }
             }
         }
         return stats;
         
     }  
}
