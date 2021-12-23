/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Q3;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Main {

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

    public static int UCLN(int a, int b) {
        if (b == 0) return a;
        return UCLN(b, a % b);
    }

    public static int BCNN(int a, int b) {
        return a * b / UCLN(a, b);
    }

    public static void smallestCommons(int arrInt[]) {
        for (int i = 0; i < arrInt.length; i++) {
            System.out.print("Num " + (i + 1) + " : ");
            arrInt[i] = inputInteger();
        }
    }

    public static int Output(int arrInt[]) {
        int i, temp = BCNN(arrInt[0], arrInt[1]);
        for (i = 2; i < arrInt.length; i++) {
            temp = BCNN(temp, arrInt[i]);
        }
        return temp;
    }

    public static void main(String[] args) {
        System.out.print("Input Array: ");
        int n = 0;
        while (n < 2) {
            n = inputInteger();
            if (n < 2) {
                System.out.println("Minimum 2 numbers. Input again");
            }
        }
        int arrInt[] = new int[n];
        smallestCommons(arrInt);
        System.out.println(Output(arrInt));
    }
}
