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
public class RecursionExample {

    /**
     * @param args the command line arguments
     */
    
    
    static int fib(int n) {
            if(n == 0 || n == 1) {
                return 1;
            } else {
                return fib(n-1) + fib(n-2);
            }
            
        }
    
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.print("Please enter a number: ");
        int num = input.nextInt();
        
        System.out.println(fib(num));
        
        
    }
}
