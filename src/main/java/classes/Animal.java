package classes;

public abstract class Animal { //Not instantiable
    private String name;
    private String color;
    private int height;
    public Animal(final String name, final String color, final int height){
        this.name=name;
        this.color=color;
        this.height=height;
    }

    public Animal() {

    }

    // Animal(){}
    public abstract void cri();  // definition or implementation will be in son classes
    public abstract void printInfo(final String name, final String color, final int height);
    public abstract void printInfo();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
}
