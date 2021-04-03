package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Size of array: ");
        int size = scanner.nextInt();

        WebinarRepository webinarRepository = new WebinarRepository(size);
        int option;
        do {
            System.out.println("----Webinar App---");
            System.out.println("1 - Add");
            System.out.println("2 - Display");
            System.out.println("3 - Find");
            System.out.println("4 - Exit");
            option = scanner.nextInt();
            scanner.nextLine();// przechwytuje enter
            Webinar webinar;
            switch(option){
                case 1:
                    System.out.println("Title: ");
                    String title = scanner.nextLine();

                    System.out.println("Description: ");
                    String description = scanner.nextLine();

                    System.out.println("Link: ");
                    String link = scanner.nextLine();

                    webinar = new Webinar(title,description,link);
                    webinarRepository.add(webinar);
                    break;
                case 2:
                    webinarRepository.display();
                    break;
                case 3:
                    System.out.println("Title: ");
                    title = scanner.nextLine();
                    webinar = webinarRepository.find(title, 0);
                    if(webinar!=null){
                        System.out.println(webinar);
                    } else {
                        System.out.println("Not found.");
                    }

                    break;
                case 4:
                    return;
            }
        }while(option!=0);
    }
}
