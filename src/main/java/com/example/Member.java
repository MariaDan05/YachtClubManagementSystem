package com.example;

import java.util.ArrayList;

public class Member{
    private String firstName;
    private String lastName;
    private String id;
    private ArrayList<Boat> boatList = new ArrayList<>();

    public Member(String firstName, String lastName, String id) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.id = id;
    }

    public String getLastName() {
        return lastName;
    }

    public String getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public int boatCount() {
        return boatList.size();
    }

    public void addBoat(Boat boat) {
        boatList.add(boat);
    }

    public void removeBoat(Boat boat) {
        boatList.remove(boat);
    }

    public void viewEvents() {
        CalendarEvent.printEvents();
    }

    public void printBoatList() {
        System.out.print("Boat List of ");
        System.out.println(this.getFirstName() + " " + this.getLastName() + " is:");
        for (Boat b : boatList) {
            System.out.println(b.getLength() + " " + b.getType());
        }
        System.out.println();
    }

}

