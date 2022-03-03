import java.util.Scanner;

/**
 * this is a class to demo the stack we made
 */
public class SeafoodDemo {


    public static void main(String[] args) {

        // first make a stack (makes a new arraylist for us to use as a stack)
        ZSeafoodTower<String> foodTower = new ZSeafoodTower<>();


        // Initialize user input scanner and prompt the user for some words
        Scanner keys = new Scanner(System.in);
        String input = "";

        System.out.println("Welcome to the foreign seafood tower. ");

        System.out.println("Enter a food:");

        input = keys.next();


        while (input != "4") {


            System.out.println("thank you. Press 1 to push.\nPress 2 to peek. \nPress 3 to pop.\nPress 4 to exit.");
            input = keys.next();

            switch(input){
                case "1":
                    System.out.println("enter another input");
                    input = keys.next();
                    System.out.println(" You have pushed: " + foodTower.push(input));
                    break;
                case "2":
                    System.out.println(" Peeking top element: " + foodTower.peek());
                    break;
                case "3":
                    System.out.println(" Popping top element: " + foodTower.pop());
                    System.out.println(" The new top is: " + foodTower.peek());
                    break;
                case "4":
                    System.exit(0);
            }

        }


    }
}
