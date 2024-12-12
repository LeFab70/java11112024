package Loop;

import java.util.Scanner;

public class ComplexLoop {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Complex loops");
        System.out.println("______________");

        //Max and min of numbers
        System.out.println("Max and min of numbers");
        System.out.println("______________");
        double inputNumber;
        double minNumber=Integer.MAX_VALUE;
        double maxNumber=Integer.MIN_VALUE;
        do {
            System.out.println("Please provide a number [To move out into loop,enter -999] > ");
            inputNumber=scanner.nextDouble();
            if (inputNumber<minNumber && inputNumber!=-999)
                minNumber=inputNumber;
            else if (inputNumber>maxNumber)
                maxNumber=inputNumber;
        }while(inputNumber!=-999);
        System.out.printf("The big number is %.0f and the small number is %.0f %n",maxNumber,minNumber);


    }
}
