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
public class eventPayment {
     String eventId;
    String EventName;
    String Event_Location;
    Date startDate;
    Date endDate;

    public String getEventId() {
        return eventId;
    }

    public void setEventId(String eventId) {
        this.eventId = eventId;
    }

    public String getEventName() {
        return EventName;
    }

    public void setEventName(String EventName) {
        this.EventName = EventName;
    }

    public String getEvent_Location() {
        return Event_Location;
    }

    public void setEvent_Location(String Event_Location) {
        this.Event_Location = Event_Location;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }
}
