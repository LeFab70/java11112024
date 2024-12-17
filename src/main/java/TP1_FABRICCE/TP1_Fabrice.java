/*
    --> Programmer : Fabrice Orgrick Kouonang
    --> Date : 13 /12 /2024
    --> But: Calcul de l’impôt provincial pour un résident du Québec selon la grille 2023
 */

package TP1_FABRICCE;

import java.util.Scanner;

public class TP1_Fabrice {
    public static void main(String[] args){
        Scanner keyboard=new Scanner(System.in);

        //List of inputs
        double userIncome=0.0;
        // List of intermediate variable
        double amountLine3=0.0; // valeur non calculée
        double applicableRate=0.0;  // taux applicable selon le revenu du résident
        double additionalAmount=0.0; // Montant additionnel ajoutée selon le revenu
        //List of outputs
        double incomeTax=0.0;

        /* OPERATIONS */
        System.out.printf("Entrez un montant d'argent (ex. 1234.56) pour calculer %nl'impôt provincial pour l'année 2023.%n%n");
        do {
            System.out.println("Entrez un revenu <pour sortir, entrez -1> : ");
            userIncome=keyboard.nextDouble();



            if (userIncome!=-1) // on ne fait le calcul que si le montant entré est différent de -1==sortie du loop
            {
                // Recherche des taux applicables selon le revenu ---> cas de la province Québec
                if (userIncome < 49275) //ligne 2 colonne A
                {
                    amountLine3 = 0.0;
                    applicableRate = 14.0 / 100;
                    additionalAmount = 0.0;
                } else if (userIncome < 98540) { //colonne B
                    amountLine3 = 49275.0;
                    applicableRate = 19.0 / 100;
                    additionalAmount = 6898.50;
                } else if (userIncome < 119910) { //colonne C
                    amountLine3 = 98540.00;
                    applicableRate = 24.0 / 100;
                    additionalAmount = 16258.85;
                } else {  // colonne D, montant plus grand que 119 910
                    amountLine3 = 119910.0;
                    applicableRate = 25.75 / 100;
                    additionalAmount = 21387.65;
                }
                //Calcul de l'impôt
                incomeTax = ((userIncome - amountLine3) * applicableRate) + additionalAmount;
                System.out.println("_________________________________________________");
                System.out.printf("Montant à payer au Québec : %.2f $ %n", incomeTax);
                System.out.printf("Montant à payer divisé par le revenu: %.2f %% %n", incomeTax/userIncome *100);


                // Recherche des taux applicables selon le revenu ---> cas du fédéral
                if (userIncome < 53359) // max 53 359$
                {
                    amountLine3 = 0.0;
                    applicableRate = 15.0 / 100;
                    additionalAmount = 0.0;
                } else if (userIncome < 106717) { // max 106 717$
                    amountLine3 = 53359;
                    applicableRate = 20.5 / 100;
                    additionalAmount = 53359.0*15.0/100;  // partie dépassant le bloc de revenu précédent
                } else if (userIncome < 165430) { //max 165 430$
                    amountLine3 = 106717;
                    applicableRate = 26.0 / 100;
                    additionalAmount = (53359.0*15.0/100)+((106717-53359)*20.5/100);
                }
                else if(userIncome < 235675) // max 235 675$
                {
                    amountLine3 = 165430;
                    applicableRate = 29.0 / 100;
                    additionalAmount = (53359.0*15.0/100)+((106717-53359)*20.5/100)+((165430-106717)*26.0/100);
                }
                else // cas des montants > 235 675
                {
                    amountLine3 = 235675;
                    applicableRate = 33.0 / 100;
                    additionalAmount = (53359.0*15/100)+((106717-53359)*20.5/100)+((165430-106717)*26.0/100)+((235675-165430)*29.0/100);
                }
                //Calcul de l'impôt
                incomeTax = ((userIncome - amountLine3) * applicableRate) + additionalAmount;
                System.out.println("_________________________________________________");
                System.out.printf("Montant à payer au fédéral: %.2f $ %n", incomeTax);
                System.out.printf("Montant à payer au fédéral divisé par le revenu: %.2f %% %n", incomeTax/userIncome *100);

            }
        } while(userIncome!=-1);

        System.out.println("Fin du programme");
    }
}
