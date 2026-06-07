package com.example.Practice.Springboot.APIs7;
import java.util.ArrayList;

public class DeleteTaskDemo {


    public static void main(String[] args) {

        ArrayList<String> tasks = new ArrayList<>();
        tasks.add("Buy groceries");
        tasks.add("Call doctor");
        tasks.add("Finish report");
        tasks.add("Go to gym");


        System.out.println("Initial Task List:");
        for (String task : tasks) {
            System.out.println("- " + task);
        }


        String targetTask = "Call doctor";


        boolean deleted = false;
        for (int i = 0; i < tasks.size(); i++) {
            if (tasks.get(i).equalsIgnoreCase(targetTask)) {
                tasks.remove(i);
                System.out.println("\nTask \"" + targetTask + "\" deleted successfully.");
                deleted = true;
                break;
            }
        }


        if (!deleted) {
            System.out.println("\nTask not found. No deletion performed.");
        }


        System.out.println("\nFinal Task List:");
        for (String task : tasks) {
            System.out.println(" - " + task);
        }
    }
}
