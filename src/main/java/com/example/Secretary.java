package com.example;

import java.util.ArrayList;

public class Secretary{

    private String firstName;
    private String lastName;
    private static ArrayList<CalendarEvent> events = new ArrayList<>();

    public Secretary(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public void addEvent(CalendarEvent event) {
        events.add(event);
    }

    public void removeEvent(CalendarEvent event) {
        events.remove(event);
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public static Iterable<CalendarEvent> getEvents() {
        return events;
    }

    public void printEvents() {
        CalendarEvent.printEvents();
    }
}
