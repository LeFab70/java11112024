package StringsFunctions;

import java.util.Scanner;

public class PenduJeu {
    public static void main(String[] args){
        Scanner keyboard=new Scanner(System.in);
        String str="abracadabra"; // mot caché
        boolean isPresent=false;
        char character=' ';
        char[] findWorlds=new char[str.length()];
        int nbEssai=str.length();
        do {
            System.out.println("Merci de saisir un caractère à rechercher:(tapez 1 pour sortir) ");
            character=keyboard.next().charAt(0);
            if(character!='1') {
                isPresent = str.trim().contains("" + character); //step 1
                if (isPresent)  // caractère trouvé
                {
                    System.out.println("is present");
                    for (int i = 0; i < str.length() ; i++) {   //step 2
                        if(str.indexOf(character,i)!=str.indexOf(character,i+1)) {
                             //System.out.println(str.indexOf(character, i));
                             findWorlds[str.indexOf(character,i)]= (character);
                       }
                    }

                    for (char charac:findWorlds)
                    {
                        System.out.print(charac);
                    }
                    System.out.println(" ");
                }
                else
                {
                    System.out.println("Not present");
                    --nbEssai;
                }
            }
        } while (character!='1' || nbEssai>0);


        System.out.println("programme terminé");

    }
}
