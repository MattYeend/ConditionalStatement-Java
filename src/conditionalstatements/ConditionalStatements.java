/*
Conditional Statements
*/
package conditionalstatements;

import java.util.Scanner;

public class ConditionalStatements {

    //Displays weekday between 1 and 7 - name of week class
    public static String getDayName(int day){
        String dayName = "";
        switch(day){
            case 1: dayName = "Monday"; break;
            case 2: dayName = "Tuesday"; break;
            case 3: dayName = "Wednesday"; break;
            case 4: dayName = "Thursday"; break;
            case 5: dayName = "Friday"; break;
            case 6: dayName = "Saturday"; break;
            case 7: dayName = "Sunday"; break;
        }
        return dayName;
    }
    
    public static void main(String[] args) {
        //Program to check if the number is positive or negative
        System.out.println("A program to check if a number is positive or negative");
        Scanner in = new Scanner(System.in);
        System.out.println("Input a number: ");
        int input = in.nextInt();
        if(input > 0){
            System.out.println("Number is positive. \n");
        }else if(input < 0){
            System.out.println("Number is negative. \n");
        }else{
            System.out.println("Number is zero. \n");
        }
        
        //Finds greatest number out of three
        System.out.println("Finds greatest number out of three");
        System.out.println("Input the first number: ");
        int num1 = in.nextInt();
        System.out.println("Input the second number: ");
        int num2 = in.nextInt();
        System.out.println("Input the third number: ");
        int num3 = in.nextInt();
        if(num1 > num2){
            if(num1 > num3){
                System.out.println("The greatest number is: " + num1 + "\n");
            }
        }
        if(num2 > num1){
            if(num2 > num3){
                System.out.println("The greatest number is: " + num2 + "\n");
            }
        }
        if(num3 > num1){
            if(num3 > num2){
                System.out.println("The greatest number is: " + num3 + "\n");
            }
        }
        
        //Displays weekday between 1 and 7
        System.out.println("Displays weekday between 1 and 7");
        System.out.println("Input a number: ");
        int day = in.nextInt();
        System.out.println(getDayName(day));
        
        //Test two floating point numbers are same upto three decimal places
        System.out.println("Test two floating point numbers are the same upto three decimal places");
        System.out.println("Input a floating point number: ");
        double x = in.nextDouble();
        System.out.println("Input another floating point number: ");
        double y = in.nextDouble();
        x = Math.round(x * 1000);
        x = x / 1000;
        y = Math.round(y * 1000);
        y = y / 1000;
        if(x == y){
            System.out.println("They are the same up to three decimal places. \n");
        }else{
            System.out.println("The are different. \n");
        }
        
        //Display the first 10 natural numbers
        System.out.println("Display the first 10 natural numbers");
        int i;
        System.out.println("The first 10 natural numbers are: \n");
        for(i = 1; i < 10; i++){
            System.out.println(i);
        }
        System.out.println("\n");
        
        //Display n terms of natural numbers and their sums
        System.out.println("Display n terms of natural numbers and their sums");
        int n, sum = 0;{
            System.out.println("Input a number: ");
            n = in.nextInt();
        }
        System.out.println("The first n natural numbers are: " + n);
        for(i = 1;i <= n;i++){
            System.out.println(i);
            sum += i;
        }
        System.out.println("The Sum of Natural Number upto n terms: " + sum + "\n");
        
        //Display the cube of the number upto a given integer
        System.out.println("Display the cube of the number upto a given integer");
        System.out.println("Input number of terms: ");
        n = in.nextInt();
        for(i = 1; i <= n; i++){
            System.out.println("Number is: " + i + "is: " + (i*i*i) + "\n");
        }
        
        //Display the multiplication table of a given integer
        System.out.println("Display the multiplication table of a given integer");
        int j;
        System.out.println("Input a number (Table to be calculated): ");
        {
            System.out.println("Input number of terms: ");
            n = in.nextInt();
            System.out.println("\n");
            for(j = 0; j <= n; j++){
                System.out.println(n + " X " + j + " = " + n * j + "\n");
            }
        }
    }
}
