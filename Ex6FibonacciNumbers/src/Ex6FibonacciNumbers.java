/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;
/**
 *
 * @author 17011947
 */
public class Ex6FibonacciNumbers {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        int f1 = 0;
        System.out.println(f1);
        int f2 = 1;
        System.out.println(f2);
        for (int n = 0; n < number; n++) {
            int f3 = f2 + f1;
            f1 = f2;
            f2 = f3;
            System.out.println(f3);
        }
        
    }
    
}
