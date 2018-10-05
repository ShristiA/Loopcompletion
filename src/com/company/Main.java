package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner SC = new Scanner(System.in);
        int num = 0;
        int total = 0;

        int counter = 1;
        while(counter <11){
            System.out.println(" Enter your number" );
            num = SC.nextInt();
            total += num;
            counter++;
        }


        System.out.println("your total " + total);
    }
}
