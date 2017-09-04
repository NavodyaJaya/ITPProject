/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Event.Classes;

import java.util.Date;

/**
 *
 * @author Navodya
 */
public class Ad_Payments {
   
    String AdvertismentID;
    String type;
    String Location;
    int width;
    int height;
    int period;
    Date Todaydate;

    public String getAdvertismentID() {
        return AdvertismentID;
    }

    public void setAdvertismentID(String AdvertismentID) {
        this.AdvertismentID = AdvertismentID;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getLocation() {
        return Location;
    }

    public void setLocation(String Location) {
        this.Location = Location;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getPeriod() {
        return period;
    }

    public void setPeriod(int period) {
        this.period = period;
    }

    public Date getTodaydate() {
        return Todaydate;
    }

    public void setTodaydate(Date Todaydate) {
        this.Todaydate = Todaydate;
    }
    
}
