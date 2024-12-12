package org.example;

public class Porte extends BlocNew{
    private boolean verrou;
    public Porte(final int with, final int height, final int length, final boolean verrou) {
      super(with, height, length);
      this.verrou=verrou;

    }
    public boolean isVerrou() {
        return verrou;
    }

    @Override
    public void afficherDescription() {
        System.out.println("Je suis une porte");
    }
}
