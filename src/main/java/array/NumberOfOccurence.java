package array;

import java.util.Scanner;

public class NumberOfOccurence {
    public static void main(String[] args){
        int[] tableau=new int[10];
        Scanner scanner=new Scanner(System.in);
        for (int i = 0; i <10 ; i++) {
            System.out.println("Fournir la valeur # "+(i+1)+" > ");
            tableau[i]=scanner.nextInt();
        }
        System.out.println("Donne un élément N pour compter le nombre d'occurence dans le tableau> ");
        int eltToFind=scanner.nextInt();
        int nbOccurence=0;
        for (int val:tableau)
        {
            if (val==eltToFind)
                nbOccurence++;
        }
        System.out.println(eltToFind+" a "+ nbOccurence + " occurence(s) sur "+ tableau.length + " dans le tableau");
    }
}
