package Codegym4;

public class Ifelse {
   public static void main(String[] args) {
       int hour = 18;
       String greeting = "Hello, good ";
       if (hour >= 0 && hour <= 12) {
           System.out.println(greeting + "morning!");
       } else {
           System.out.println(greeting + "evening!");
       }
   }
}