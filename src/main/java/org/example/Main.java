package org.example;

import classes.Animal;
import classes.Cat;
import classes.Dog;
import interfaces.IBloc;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Animal animalCat=new Cat();
        animalCat.cri();
        Animal animalDog=new Dog("test dog","red",12);
        animalDog.printInfo();
        animalDog.cri();
        animalCat.printInfo("testcat","red",13);
        //les classes
        //BlocNew blocNew=new BlocNew();
       // blocNew.setHeight(12);
        ///System.out.println(blocNew.getHeight());
        // class is abstract, so it represent model not instantiable
        BlocNew blocNew1=new Mur(10,12,13,true);
        blocNew1.afficherDescription();
        ////BlocNew blocNew2=new BlocNew();
        ///blocNew2.afficherDescription();
        BlocNew blocNew3=new Porte(12,13,24,true);
        blocNew3.afficherDescription();
        // les classes filles peuvent instancier la classe mère mais inverse pas possible
        //Impossible d'ecrire ceci==>Porte porte=new BlocNew();
        // une porte ou un mur est forcement un bloc
        // mais linverse nest pas vraie, cad un bloc nest pas forcement un mur ou un bloc
        Porte porte=new Porte(12,23,3,false);
/* Une instance d’une classe fille peut être
typée par la classe mère mais l’inverse n’est pas possible.
Une instance d’une classe mère ne peut pas être typée par une classe fille.
*/
        porte.afficherDescription();

        // on peut definir le type des classe fille avec la classe mere/abstraite ou par l'interface
        // faut noter que les methode propres a la classe fille dans ce ca seront pas disponilbe

        BlocNew blocNew=new Mur();
        blocNew.afficherDescription();//methode de interface et classes abstraite

        IBloc bloc=new Mur();
        bloc.afficherDescription(); // pas toujours de methodes de la classe fille dispo

        Mur mur=new Mur();
        mur.isPorteur();//methode propre a la classe fille dispo


        Bloc unBloc=new Bloc("test",12); //instanciation grace au constructeur
        unBloc.displayDescription();
        Bloc bloc1=new Bloc(); //instanciation grace au constructeur par default
        bloc1.displayDescription();
        //Mise a jour par les setters mieux les constructeurs pour instancier les valeurs rapidement
        unBloc.setSize(13);
        unBloc.displayDescription();


//        int birdDay=LocalDate.now().getYear();
//        System.out.println("Hello, World!");
//        final double PI=3.14; //Value immuable.
//        String language="Java";
//        String str=language+ " is a programming language";
//        System.out.println(str.toUpperCase().trim());
//        Main.display("Java is efficiently language");
//        Main.discriment(4);
//        System.out.println(birdDay);
       Scanner sc=new Scanner(System.in);
//        int actuelDate=LocalDate.now().getYear();
//        System.out.println("Entrer votre age :");
//        short ageUser=sc.nextShort();
//        Main.classAge(ageUser,actuelDate);
//        Main.commentMeteo("soleil");
//        System.out.println(Main.categoryOfMovie("Star wars"));
//        System.out.println(Main.categoryOfMovie("Blanche neige"));
//        System.out.println(Main.categoryOfMovie("Indiana jones"));
//        System.out.println(Main.categoryOfMovie("Indjkdf"));
//Main.displayLanguage();
//Main.notedStudent();
//byte numberOfMonth=Main.monthNumber();
//if (numberOfMonth!=-1)
//    System.out.println(numberOfMonth);

//        System.out.println("Calculator");
//        System.out.println("Provide the numbers and operator");
//        System.out.println("First number: ");
//        double firstNumber=sc.nextDouble();
//        System.out.println("Second number: ");
//        double secondNumber=sc.nextDouble();
//        System.out.println("Operator: +, - , / et * ");
//        char operator=sc.next().charAt(0);
//        double result=Main.calculator(firstNumber,secondNumber,operator);
//        if(result!=-1)
//            System.out.printf("%.2f %s %.2f = %.2f", firstNumber,operator,secondNumber,result);
//        else
//            System.out.println("wrong operator");
//Main.displayMajVoy();
    }



//Character.toUpperCase(noteLetter)
    public static void displayMajVoy(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Give the word");
        String word= scanner.nextLine();
        char firstLetter= word.charAt(0);
        //if (Character.toUpperCase(firstLetter)==word.charAt(0))
        if (Character.isUpperCase(firstLetter))
            System.out.println(word + " started with capital letter");

        switch (Character.toUpperCase(firstLetter))
          {
            case  'A','E','I','O','U','Y'-> System.out.println(word+" begin with vowel "+ firstLetter);
          }


    }
public static double calculator(final double a, final double b, final char operator)
{
    //double result=0;
    switch (operator) {
        case '+' -> {
            return a + b;
        }
        case '-'-> {return a-b;}
        case '*'->{return a*b;}
        case '/'->{
            if(b!=0)
                return a/b;
            return 0;
        }

    }
    return -1;
}
    public static void displayLanguage(){
        List<String> namesOfLanguages= Arrays.asList("Java","TypeScript","C++");
        for (String language: namesOfLanguages){
            System.out.println(language);
        }
    }

    public static String categoryOfMovie(final String movieName){
        // cas de plusieurs valeurs juste separer par ,
        // cas ou il ya un traitement avant de retourner la valeur par yield
        //retourne la valeur suite a un traitement


        // depuis java14

        return switch (movieName)
        {
            case "Star wars"-> "Science fiction";
            case "Blanche neige", "la petite sirène"->"Disney"; // cas de plusieurs valeurs juste separer par ,
            case "Indiana jones"->{
                // cas ou il ya un traitement avant de retourner la valeur par yield
                yield "Aventure"; //retourne la valeur suite a un traitement
            }
            default -> "Inconnue";
        };
    }
    public static void display(final String msg){
        System.out.println(msg);
    }
    public static void discriment(final int value){
        if (value>0) {
            System.out.println(value);
            discriment(value - 1);
        }
    }
    public static void commentMeteo(final String meteo){
        switch (meteo){
            case "soleil"-> System.out.println("Beau temps");
            case "nuage"-> System.out.println("Couvert");
            case "pluie"-> System.out.println("Mauvais temps");
            default -> System.out.println("Je ne sais pas");
        }
    }

    public static void classAge(final int ageUser, final int actuelDate)
    {

        int yearOfBirth=actuelDate-(int)ageUser;
        if(yearOfBirth < 1925)
            System.out.println("wow tu es un dinosaure");

        else if(yearOfBirth < 1943)
            System.out.println("Génération silencieuse");
        else if(yearOfBirth < 1960)
            System.out.println("Baby boomer");
        else if(yearOfBirth < 1978)
            System.out.println("Génération X");

        else if(yearOfBirth < 1995)
            System.out.println("Génération Y");
        else
            System.out.println("Génération Z");

    }
    public static void notedStudent(){
        Scanner sc=new Scanner(System.in);
        System.out.println("La lettre de la note: ");
        char noteLetter=sc.next().charAt(0);
        switch (Character.toUpperCase(noteLetter))
        {
            case 'A'-> System.out.println("Excellent");
            case 'B'-> System.out.println("Très bien");
            case 'C'-> System.out.println("Bien");
            default -> System.out.println("Aucune corresponddance");

        }
    }
    public static byte monthNumber(){
       // byte numberOfMonth=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Entrer le mois en lettre en anglais: ");
        String month=sc.nextLine().toLowerCase();
        switch (month)
        {
            case "january" -> {return 1;}
            case "february" ->{return 2;}
            default -> {
            return -1;
        }
        }

        //return numberOfMonth;
    }


}