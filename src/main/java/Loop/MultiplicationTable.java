package Loop;

public class MultiplicationTable {
    public static void main(String[] args){
        System.out.println("Complex loops");
        System.out.println("______________");
        //Multiplication Table
        System.out.println("Multiplication Table");
        System.out.println("______________");
        for (int i = 1; i <11 ; i++) {
            System.out.println("___________________");
            System.out.println("@ Table de "+i+" @ ");
            System.out.println("___________________");
            for (int j = 0; j <11 ; j++) {
                System.out.println(i+"x"+j+"="+i*j);
            }

        }
    }
}
