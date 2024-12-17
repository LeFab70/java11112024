package array;

import java.util.Random;

public class RandomArray {
    public static void main(String[] args){
        Random random=new Random();
        // Arrays in java
        //type[] arrayName=new type[dimensionOfArray];
        double[] notes =new double[10];
        for (int i = 0; i < 10; i++) {
            notes[i]= random.nextDouble(20); //genere des notes entre 0 et 20 en double //Math.random();
        }
        for (double note:notes){
            System.out.printf("%.2f %n",note);
        }
    }
}
