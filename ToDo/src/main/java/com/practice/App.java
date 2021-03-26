package com.practice;

import java.util.Scanner;

public class App {

    private static void menu() {
        System.out.print(   "Options:\n" +
                            "1 - Show tasks\n" +
                            "2 - Delete task\n" +
                            "3 - Add new task\n" +
                            "4 - Mark as completed\n" +
                            "0 - Exit\n" );
    }
    
    public static int validateNumber(String input) {
        try {
            return Integer.parseInt(input);
        } catch (NumberFormatException ex) {
            System.out.println("Only numbers are allowed");
        }
        return -1;
    }
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        TaskLists tasks = new TaskLists();
        loop: while (true) {
            menu();
            String input = scan.nextLine();
            int validInput = validateNumber(input);
            
            switch(validInput) {
                case 0:
                    break loop;

                case 1:
                    tasks.printTasks();
                    break;

                case 2:
                    if (tasks.getList().isEmpty()) {
                        System.out.println("There are no tasks!");
                        break ;
                    }
                    int option = validateNumber(scan.nextLine());
                    tasks.removeTask(option);
                    break;

                case 3:
                    String desc = scan.nextLine();
                    tasks.addTask(desc);
                    break;

                case 4:
                    if (tasks.getList().isEmpty()) {
                        System.out.println("There are no tasks!");
                        break ;
                    }
                    tasks.setToCompleted(validateNumber(scan.nextLine()));
                    break;

                default :
                    break;
            }
        }

        scan.close();

        
    }
}
