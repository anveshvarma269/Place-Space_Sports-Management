/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Sports.Team;

import Sports.Player.Player;
import Sports.Sport.Sport;
import Sports.User.UserAccount;
import java.util.ArrayList;

/**
 *
 * @author revanthkumar
 */
public class Team {
    
    public String teamName;
    String teamManager;
    UserAccount userAccount;
    Sport sport;
    String teamStatus;

    public String getTeamName() {
        return teamName;
    }
    
    public Team(UserAccount ua,String teamName)
    {
        this.userAccount = ua;
        this.teamName = teamName;
        this.teamStatus = "Requested";
       // this.sport = sport;
    }

    public String getTeamManager() {
        return teamManager;
    }

    public void setTeamManager(String teamManager) {
        this.teamManager = teamManager;
    }

    public UserAccount getUserAccount() {
        return userAccount;
    }

    public void setUserAccount(UserAccount userAccount) {
        this.userAccount = userAccount;
    }

    public String getTeamStatus() {
        return teamStatus;
    }

    public void setTeamStatus(String teamStatus) {
        this.teamStatus = teamStatus;
    }
    
    public int budget;

    public int getBudget() {
        return budget;
    }

    public void setBudget(int budget) {
        this.budget = budget;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public ArrayList<Player> getTeamPlayers() {
        return teamPlayers;
    }

    public void setTeamPlayers(ArrayList<Player> teamPlayers) {
        this.teamPlayers = teamPlayers;
    }
    public ArrayList<Player> teamPlayers = new ArrayList<Player>();
    public Team(String teamName)
    {
        this.teamName = teamName;
    }
    
    public void addPlayer(Player player)
    {
        teamPlayers.add(player);
    }
    
    public Player getPlayer(String playerName)
    {
        for(Player player: teamPlayers)
        {
            if(player.getPlayerName().equals(playerName))
                return player;
        }
        return null;
    }
    
    int matchesPlayed;
    int matchesWon;
    int matchesLost;
    

    public int getMatchesPlayed() {
        return matchesPlayed;
    }

    public void setMatchesPlayed(int matchesPlayed) {
        this.matchesPlayed = matchesPlayed;
    }

    public int getMatchesWon() {
        return matchesWon;
    }

    public void setMatchesWon(int matchesWon) {
        this.matchesWon = matchesWon;
    }

    public int getMatchesLost() {
        return (matchesPlayed - matchesWon);
    }

    public void setMatchesLost(int matchesLost) {
        this.matchesLost = matchesLost;
    }
    
    public void updateMatchPlayed()
    {
        matchesPlayed++;
    }
    public void updateMatchesWon()
    {
        matchesWon++;
    }
    
    public void addBudget(int budget)
    {
      this.budget = this.budget + budget;
    }
    
}


