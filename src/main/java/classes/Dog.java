package classes;

public class Dog extends Animal{
    public Dog(String name, String color, int height){
        super(name, color, height);
    }

    public Dog() {
        super();
    }

    @Override
    public void cri() {
        System.out.println("wouaf");
    }

    @Override
    public void printInfo(String name, String color, int height) {
        System.out.println("Dog "+ name+ " de color "+ color + " de taille " + height);
    }

    @Override public void printInfo(){
        System.out.println("Dog "+getName() + " de color "+ getColor()+ " de taille " + getHeight());
    }


}
