package StringsFunctions;

public class StringMethods {
    public static void main(String[] args){
        //methods of string
        String s1=" first string ";
        String s2="second string";
        if (s1.equalsIgnoreCase(s2))
            System.out.println("is equal");
        else
            System.out.println("is not equals");
        System.out.println(s1);
        s1=s1.trim(); // annuler les espaces debut et fin des characters
        System.out.println(s1);
        System.out.println(s1.length()); //longueur de la chaine
        char character=s1.charAt(3);  // retourne le character position 3 partant de 0
        System.out.println(character);

        System.out.println(s1.concat(" ").concat(s2));
    }
}
