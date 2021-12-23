/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Q2;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Main {

    public static void main(String[] args) {
        int n;

        System.out.print("Enter the value of n: ");
        n = inputInteger();

        System.out.println("Sum: " + sumFibs(n));
    }

    public static int sumFibs(int n) {
        int prevNum = 1, currNum = 1;
        int sum = 2;
        int tmp = prevNum + currNum;
        while (tmp <= n) {
            if ((tmp % 2 != 0) && (tmp <= n)) {
                sum += tmp;
            }
            prevNum = currNum;
            currNum = tmp;
            tmp = prevNum + currNum;
        }

        return sum;
    }
    
    public static int inputInteger() {
        Scanner input = new Scanner(System.in);
        boolean check = false;
        int n = 0;
        while (!check) {
            try {
                n = Integer.parseInt(input.nextLine());
                if (n < 0) {
                    System.out.println("Invalid Number. Please input again.");
                    continue;
                }
                check = true;
            } catch (Exception e) {
                System.out.println("Please input again.");
            }
        }
        return n;
    }
}
