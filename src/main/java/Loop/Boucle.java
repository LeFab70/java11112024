package Loop;

import java.util.Scanner;

public class Boucle {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        //Loop for while and do...while
//square of numbers
        System.out.println("Square of numbers from 1 to 10");
        System.out.println("_______________________________");
        for (int i = 1; i <=10 ; i++) {
            System.out.printf("%.0f%n",Math.pow(i,2));
        }
//Evens numbers
        System.out.println("Evens  numbers from 0 to 20");
        System.out.println("_______________________________");
        for (int i = 0; i <=20 ; i+=2) {
            System.out.println(i);
        }
 //Translate for to while
//        for (int i=10; i>0; --i){
//            System.out.println(i);
//        }
        System.out.println("Translate for to while");
        System.out.println("_______________________________");
        int i=10; //initialisation
        while (i>0) // conditions
        {
            System.out.println(i); // actions
            i--; // incrementation
        }
//Looking for one factor of 41 into [191-207]
        System.out.println("Looking for one factor of 41 into [191-207]");
        System.out.println("_______________________________");
        int factorOf41=0;
        for (int j = 191; j <=207 ; j++) {
            if(j%41==0)
            {
                factorOf41=j;
                break; // move out to loop, stop iteration. If just one value
            }

        }
        if(factorOf41==0)
            System.out.println("No factor of 41 into [191-207]");
        else
            System.out.println("Factor of 41 into [191-207] :"+ factorOf41);

//Check if number is prime number
        System.out.println("Checking if prime number");
        System.out.println("_______________________________");
        int inputNumber=0;
        do {
            System.out.println("Please provide your number(>2): ");
            inputNumber= scanner.nextInt();
          } while (inputNumber<=2);
        boolean isPrimeNumber=false;
        for (int j = 2; j <inputNumber ; j++) {
            if(inputNumber%j==0)
            {
                isPrimeNumber=true;
                break; // move out to loop, stop iteration. number is prime
            }

        }
        if(isPrimeNumber)
            System.out.println(inputNumber+" is a prime number");
        else
            System.out.println(inputNumber+" is not a prime number");
        int a,b;


    }


}
