package classes;

public class Cat extends Animal{

    public Cat(String name, String color, int height) {
        super(name, color, height);
    }

    public Cat() {
        super();
    }

    @Override
    public void cri() {
        System.out.println("Miaou");
    }

    @Override
    public void printInfo(String name, String color, int height) {
        System.out.println("cat "+ name+ " de color "+ color + " de taille " + height);
    }
    @Override public void printInfo(){
        System.out.println("Dog "+getName() + " de color "+ getColor()+ " de taille " + getHeight());
    }

}
