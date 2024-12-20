package org.example;

import enums.ListeColors;

public class Mur extends BlocNew{
    private boolean porteur;
    private ListeColors listeColors;
    public Mur(final int with, final int height, final int length, final boolean porteur, final ListeColors listeColors) {
        super(with, height, length);
        this.porteur = porteur;
        this.listeColors=listeColors;
    }
public Mur(){
        super();
}
    public boolean isPorteur() {
        return porteur;
    }

    public void setPorteur(boolean porteur) {
        this.porteur = porteur;
    }

    public void methodeLierAmur(){
        System.out.println("je suis porteur");
    }

    @Override
    public void afficherDescription() {
        System.out.println("Je suis un mur "+listeColors);
    }
}
