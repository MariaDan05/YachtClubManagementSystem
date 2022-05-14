package com.example;

public class CalendarEvent {
    private String eventTitle;
    private int startDate;
    private int endDate;

    public CalendarEvent(String eventTitle, int startDate, int endDate) {
        this.eventTitle = eventTitle;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public String getEventTitle() {
        return eventTitle;
    }

    public int getStartDate() {
        return startDate;
    }

    public int getEndDate() {
        return endDate;
    }

    public static void printEvents() {
        Iterable<CalendarEvent> events = Secretary.getEvents();
        System.out.println("Event(s): ");
        for (CalendarEvent event : events) {
            System.out.println(event.getEventTitle() + " start date: " + event.getStartDate() + " end date: " + event.getEndDate());
        }
        System.out.println();
    }
}
