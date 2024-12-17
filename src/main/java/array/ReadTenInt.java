package array;

import java.util.Scanner;

public class ReadTenInt {
    public static void main(String[] args){
        int[] tableau=new int[10];
        Scanner scanner=new Scanner(System.in);
        for (int i = 0; i <10 ; i++) {
            System.out.println("Fournir la valeur # "+(i+1)+" > ");
            tableau[i]=scanner.nextInt();
        }
        for (int val:tableau){
            System.out.println(val);
        }
    }
}
