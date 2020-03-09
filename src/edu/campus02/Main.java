package edu.campus02;

public class Main {

    public static void main(String[] args) {
        // write your code here
        int alter = 14;
        //hier wird der code immer ausgefuehrt
        if (alter >= 16){
            //hier nur rein wenn mindestens 18 jahre alt
            System.out.println("Auch Schnapps relaubt :)");

        } else if (alter >= 16){
            System.out.println("Yaaayyy ich darf hinein aber nur mit Wein");
        } else{
                //hier gehen wir rein wenn wir jünger sind als 18
                System.out.println("Gehe zwischenzeitlich Pizza essen ^^");
            }
            //hier wird der code immer ausgefuehrt
            System.out.println("Warte gelangweilt im Auto");

        // Beispiel fuer einen switch
        // wenn man zwei hintereinander schreibt dann nur ein Beistrich anstatt Semikolon
        int note = 2, stipendium;

        // Berechne  Foerderstipendium
        switch (note){
            case 1:
                //hier steht der code der ausgeführt wird wenn ich 1 bekomme
                stipendium = 100;
                break;
            case 2:
                stipendium = 50;
                break;
            case 3:
                stipendium = 30;
                break;
            default:
                stipendium = 10;
                break;
        }
        System.out.println("Stipendium: " + stipendium + "€");
    }

}
