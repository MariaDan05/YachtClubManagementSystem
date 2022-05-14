package com.example;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Member john = new Member("John", "Sinatra", "1234567890");
        Boat kayak = new Boat("Kayak", 3);
        john.addBoat(kayak);
        john.printBoatList();

        Member frank = new Member("Frank", "Sinatra", "0987654321");
        Boat yacht = new Boat("Yacht", 10);
        frank.addBoat(yacht);
        Boat kayak2 = new Boat("Kayak", 3);
        frank.addBoat(kayak2);
        frank.addBoat(kayak);
        frank.printBoatList();

        frank.removeBoat(kayak2);
        frank.printBoatList();

        MembershipFee membershipFee = new MembershipFee(john);
        System.out.print("The total membership fee for " + john.getFirstName() + " " + john.getLastName());
        System.out.println(" is " + membershipFee.totalMembershipFee(20000.9));
        System.out.println();

        Secretary secretary = new Secretary("Jane", "Jonson");
        CalendarEvent openDoorsDayEvent = new CalendarEvent("Open doors day", 13, 14);
        secretary.addEvent(openDoorsDayEvent);
        CalendarEvent competitionDayEvent = new CalendarEvent("Competition day", 22, 25);
        secretary.addEvent(competitionDayEvent);
        secretary.printEvents();

        secretary.removeEvent(openDoorsDayEvent);
        secretary.printEvents();

        john.viewEvents();
    }

}
