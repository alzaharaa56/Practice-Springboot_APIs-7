package com.example.Practice.Springboot.APIs7;

public class DeleteMemberDemo {
    public static void main(String[] args) {
        LibraryManager manager = new LibraryManager();

        manager.initializeMembers();
        manager.displayMembers();


        System.out.println("\nAttempting to delete member M102...");
        manager.deleteMemberById("M102");


        manager.displayMembers();


        System.out.println("\nAttempting to delete member M999...");
        manager.deleteMemberById("M999");


        manager.displayMembers();
    }
}

