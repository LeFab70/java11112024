package Loop;

import java.util.Scanner;

public class AverageOfNumbers {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Complex loops");
        System.out.println("______________");
        //Average of numbers
        System.out.println("Average of numbers");
        System.out.println("______________");
        double inputNumber;
        double sumOfNumber=0.0;
        int count=0;
        do
        {
            System.out.println("Please provide a number [To move out into loop,enter -999] > ");
            inputNumber=scanner.nextDouble();
            if(inputNumber!=-999)
            {
                sumOfNumber+=inputNumber;
                count++;
            }
        }while(inputNumber!=-999);
        System.out.printf("The average of %d numbers is %.2f %n",count,sumOfNumber/count);
    }
}
