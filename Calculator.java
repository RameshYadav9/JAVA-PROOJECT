package org.Projects;

import java.util.Scanner;

public class    Calculator{
    public static void main(String[] args) {
        Scanner Scan = new Scanner(System.in);
        System.out.println("Enter Two Numbers");
        double num1 = Scan.nextInt();
        double num2 = Scan.nextInt();

        System.out.println("Enter The Operation (+ , - , * , /)");
        char Operation = Scan.next().charAt(0);
        double result = 0;
        switch (Operation){
            case'+':
                 result = num1+num2;
                 break;

            case'-':
                result = num1-num2;
                break;

            case'*':
                result = num1*num2;
                break;

            case'/':
                if(num2!=0){
                    result = num1/num2;
                    break;

                }else {
                    System.out.println("Error: cannot divided by zero");
                    return;
                }

        }
        System.out.println("Result: " + result);
    }

}