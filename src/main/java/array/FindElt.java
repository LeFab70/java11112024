package array;

import java.util.Scanner;

public class FindElt {
    public static void main(String[] args)
    {
        Scanner scanner=new Scanner(System.in);
        int[] listOfNumber={12,13,43,45,12,14,15,155,20,1}; // initialiser arrays
        System.out.println("Entrez la valeur à rechercher dans le tableau> ");
        int valToFind=scanner.nextInt();
        boolean isPresent=false;
        for (int val:listOfNumber)
           if(val==valToFind)
           {
               isPresent=true;
               break;
           }
        // affichage resultat
        if(isPresent)
            System.out.println(valToFind+" est présent dans le tableau");
        else
            System.out.println(valToFind+" non trouvé dans le tableau");
    }
}
