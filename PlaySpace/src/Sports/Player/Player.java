/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Sports.Player;

/**
 *
 * @author revanthkumar
 */
public class Player {
    String playerName;

    public Player(String playerName)
    {
        this.playerName = playerName;
    }
    
    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    int age;
    
    String playerDesignation;

    public String getPlayerDesignation() {
        return playerDesignation;
    }

    public void setPlayerDesignation(String playerDesignation) {
        this.playerDesignation = playerDesignation;
    }
    

}
