package com.example.androidpractica;

import java.time.LocalDate;

public class EventDto {


    private Integer EventId;

        private String EventName;
        private String EventDescription;

        private String EventType;

        private String Venue;

        private Integer EventImage;
        private LocalDate StartDate;
        private LocalDate EndDate;

    public void setEventId(Integer eventId) {
        EventId = eventId;
    }

    public LocalDate getStartDate() {
        return StartDate;
    }

    public void setStartDate(LocalDate startDate) {
        StartDate = startDate;
    }

    public LocalDate getEndDate() {
        return EndDate;
    }

    public void setEndDate(LocalDate endDate) {
        EndDate = endDate;
    }

    public int getEventId() {
        return EventId;
    }

    public void setEventId(int eventId) {
        EventId = eventId;
    }

    public String getEventName() {
        return EventName;
    }

    public void setEventName(String eventName) {
        EventName = eventName;
    }

    public String getEventDescription() {
        return EventDescription;
    }

    public void setEventDescription(String eventDescription) {
        EventDescription = eventDescription;
    }

    public String getEventType() {
        return EventType;
    }

    public void setEventType(String eventType) {
        EventType = eventType;
    }

    public String getVenue() {
        return Venue;
    }

    public void setVenue(String venue) {
        Venue = venue;
    }

    public Integer getEventImage() {
        return EventImage;
    }

    public void setEventImage(Integer eventImage) {
        EventImage = eventImage;
    }
    public EventDto(Integer eventId, String eventName, String eventDescription, String eventType, String venue, Integer eventImage) {
        EventId = eventId;
        EventName = eventName;
        EventDescription = eventDescription;
        EventType = eventType;
        Venue = venue;
        EventImage = eventImage;
    }
    public EventDto(Integer eventId, String eventName, String eventDescription, String eventType, String venue, Integer eventImage,LocalDate startDate, LocalDate endDate) {
        EventId = eventId;
        EventName = eventName;
        EventDescription = eventDescription;
        EventType = eventType;
        Venue = venue;
        EventImage = eventImage;
        StartDate=startDate;
        EndDate=endDate;
    }
}
