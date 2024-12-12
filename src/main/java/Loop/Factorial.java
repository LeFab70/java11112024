package Loop;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Complex loops");
        System.out.println("______________");
        //Factorial of number
        System.out.println("Factorial of number");
        System.out.println("______________");
        int inputNumber;
        long multiplicationOfNumber =1;
        do
        {
            System.out.println("Please provide a natural number  > 0 ");
            inputNumber=scanner.nextInt();
        }while(inputNumber<0);

        for (int i = 1; i <=inputNumber ; i++) {
            multiplicationOfNumber*=i;
        }
        System.out.printf("%d!= %d %n",inputNumber, multiplicationOfNumber);

    }
}
