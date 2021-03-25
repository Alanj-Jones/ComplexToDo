package com.practice;

public class App {

    private static void menu() {
        System.out.print(   "Options:\n" +
                            "1 - Show tasks\n" +
                            "2 - Delete task\n" +
                            "3 - Add new task\n" +
                            "4 - Mark as completed\n" +
                            "0 - Exit\n" );
    }
    
    public static void main(String[] args) {
        
        menu();
    }
}
