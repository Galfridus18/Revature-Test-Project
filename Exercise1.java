package com.revature.Day5;

import java.util.*;

class Calculator{
    public static void main(String[] args) {
       int num1 = 0;
       String flag = "";
       int num2 = 0;
       char operator = 0;
       double answer = 0.0;

        try {
       Scanner scanObject = new Scanner(System.in);


        System.out.println("Please enter the first number: ");
        num1 = scanObject.nextInt();
        System.out.println("Please enter the second number: ");
        num2 = scanObject.nextInt();
        System.out.println("What operation? ");
        operator = scanObject.next().charAt(0);



            switch (operator) {
                case '+':
                    answer = num1 + num2;
                    break;
                case '-':
                    answer = num1 - num2;
                    break;
                case '*':
                    answer = num1 * num2;
                    break;
                case '/':
                    answer = num1 / num2;
                    break;
            }
        }
        catch (Exception e) {
            System.out.println("sorry you entered something invalid, try running program again,");
            flag = flag + "jk";
        }

        if (flag != ""){
            System.out.println("Invalid input");
        }
        else{
            System.out.println(num1+" "+operator+" "+num2+" = "+answer);
        }

    }

}

