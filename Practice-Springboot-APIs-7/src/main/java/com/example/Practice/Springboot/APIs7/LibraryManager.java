package com.example.Practice.Springboot.APIs7;

import java.util.ArrayList;
import java.util.Iterator;

public class LibraryManager {

    private ArrayList<LibraryMember> members = new ArrayList<>();


    public void initializeMembers() {
        members.add(new LibraryMember("M101", "Ahmed", "Standard"));
        members.add(new LibraryMember("M102", "Sara", "Premium"));
        members.add(new LibraryMember("M103", "John", "Standard"));
    }


    public void addMember(LibraryMember member) {
        members.add(member);
        System.out.println("Member " + member.getFullName() + " added successfully.");
    }


    public void displayMembers() {
        System.out.println("\nCurrent Members:");
        for (LibraryMember member : members) {
            System.out.println(member.getMemberId() + "/" + member.getFullName() + " / " + member.getMembershipType());
        }
    }


    public boolean deleteMemberById(String memberId) {
        Iterator<LibraryMember> iterator = members.iterator();
        while (iterator.hasNext()) {
            LibraryMember member = iterator.next();
            if (member.getMemberId().equalsIgnoreCase(memberId)) {
                iterator.remove();
                System.out.println("Member " + memberId + " deleted successfully.");
                return true;
            }
        }
        System.out.println("No matching member found for ID: " + memberId);
        return false;
    }
}

