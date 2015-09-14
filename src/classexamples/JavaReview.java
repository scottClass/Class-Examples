/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package classexamples;

import java.util.Scanner;

/**
 *
 * @author johns6971
 */
public class JavaReview {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Creating a scanner for system input

        Scanner input = new Scanner(System.in);
        //asking user for name
        System.out.print("Please enter your name: ");
        //get the name and store in variable
        String name = input.nextLine();

        System.out.println("Hello " + name);

        System.out.printf("Total: $%.2f CAD\n", 5.975696986598);

        //generate number
        //a = lowest numebr
        //b = highest number
        // (int) (Math.random()*(b-a+1)+a)
        int randNum = (int) (Math.random() * 11);


        if (randNum > 5) {
            System.out.println("Wow");
            //Checks if number is bigger than 3 and less than or equal to 5
        } else if (randNum > 3 && randNum <= 5) {
            System.out.println("Not bad");
            //any other number
        } else {
            System.out.println("Booooo");
        }

        int count = 0;
        while (count < 10) {
            System.out.println(count);
            //add 1 to count
            count++;
        }

        do {
            System.out.println(count);
            count--;



        } while (count > 0);


        //an integer array of size 5
        int[] myNums = new int[5];

        for (int i = 0; i < myNums.length; i++) {
            System.out.println("Please enter an int");
            //scan in an integer at spot i
            myNums[i] = input.nextInt();

        }

        System.out.println(myNums[0]);
        sayHello("Scott");
        
        double area1 = areaRect(10.5,5);
        double area2 = areaRect(3,1.2);
        double ans = area1 - area2;

    }

    static void sayHello(String name) {
        System.out.println("Hello " + name);
    }
    
    static double areaRect (double length, double width) {
        double ans = length*width;
        return ans;
        
    }
    
    
}
