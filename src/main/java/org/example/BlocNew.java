package org.example;

import interfaces.IBloc;

//Classe parente
public abstract class BlocNew implements IBloc { //non instaciable si elle est abstract
    private int width;
    private int height;
    private int length;
    BlocNew(final int with, final int height, final int length){
        this.height=height;
        this.length=length;
        this.width=with;
    }

    public BlocNew() {
    }

    // setters et getters
    public void setWidth(final int width){
        this.width=width;
    }
    public int getWidth(){
        return this.width;
    }

    public int getHeight() {
        return height;
    }

    public int getLength() {
        return length;
    }

    public void setHeight(final int height) {
        this.height = height;
    }

    public void setLength(final int length) {
        this.length = length;
    }

//    public void afficherDescription(){
//        System.out.println("Je suis un bloc");
//    }
//    //polymorphisme par compilation==meme nom de methodes mais paramtre different ou pas de parametre
//    public void afficherDescription(String  description){
//        System.out.println(description);
//    }
    /*Java ne permet pas de mettre de valeur par défaut aux paramètres des méthodes. Le mécanisme de surcharge permet de résoudre ce point comme le montre l’exemple précédent.*/
}
