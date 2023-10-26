package org.lessons.java;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Present> presents = new ArrayList<>();

        boolean exit = false;

        while(!exit){
            System.out.println("Insert new person? yes/no");
            String choice = scanner.nextLine();
            if(choice.equals("yes")){
                System.out.print("Subject: ");
                String subject = scanner.nextLine();
                System.out.print("Description: ");
                String description = scanner.nextLine();
                presents.add(new Present(subject, description));
                System.out.println("Your list contains: " + presents.size() + " present/s");
            } else if (choice.equals("no")){
                exit = true;
            }else {
                System.out.println("invalid answer");
            }
        }
        System.out.println(presents);
        scanner.close();
    }
}
