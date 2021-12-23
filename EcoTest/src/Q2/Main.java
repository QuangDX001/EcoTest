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
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of n: ");
        n = sc.nextInt();

        System.out.println("Sum: " + sumFibs(n));
    }

    static int sumFibs(int n) {
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
}
