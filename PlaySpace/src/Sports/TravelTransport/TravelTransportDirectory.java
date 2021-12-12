/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sports.TravelTransport;

import java.util.ArrayList;

/**
 *
 * @author vishnuteja
 */
public class TravelTransportDirectory {
    ArrayList<TravelTransport> travelList = new ArrayList<TravelTransport>();

    public ArrayList<TravelTransport> getTravelList() {
        return travelList;
    }

    public void setTravelList(ArrayList<TravelTransport> travelList) {
        this.travelList = travelList;
    }
    
    public void addTravelTransport(TravelTransport travelTransport)
    {
        travelList.add(travelTransport);
    }
    
    public TravelTransport getTravelTransport(String transportName)
    {
        for(TravelTransport t: travelList)
        {
            if(t.getTransportName().equals(transportName))
            {
                return t;
            }
        }
        return null;
    }
    
}
