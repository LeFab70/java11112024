package org.example;

 class Bloc {

        private String description ;
        private int size;
        Bloc(){ // constructor without arg
            this.description="Game Naruto this is default value";
            this.size=0;
        }
        Bloc(final String description,final int size){ // constructor with arg
            this.description=description;
           if (size>0) this.size=size;
        }
        public void displayDescription(){ //method
            System.out.printf(" Description: %s, size: %s %n",description, size);

        }

        //getters et setters
        public String getDescription(){
            return this.description;
        }
        public int getSize(){
            return this.size;
        }
     // setters
     public void setDescription(final String description){
            this.description=description;
     }

     public void setSize(final int size) {
         this.size = size;
     }
 }
