package edu.campus02;

public class Tierheim {
    public static void main(String[] args) {
        System.out.println("Willkommen");
        //Hund Leassie - 20 kg spielfreudig, löst Kriminalfälle
        double futterLessie;
        double ge = 20;

        futterLessie = berechneFuttermenge (ge);
        System.out.println("Lessie bekommt " + futterLessie + "kg Futter");
        // Unterschiedliche Varianten um das Gewicht um 1kg zu erhöhen
        double x;
        x = ge++;
        System.out.println(x + " " + ge);

        ++ge;
        // ge = ge + 1;
        // ge += 1;
        // ge++; ++ge;

        //fuettern am Abend
        futterLessie =  berechneFuttermenge (ge);
        System.out.println("Lessie bekommt am Abend " + futterLessie + "kg Futter");
    }

    public static double berechneFuttermenge(double gewicht){
        double futterMenge;

        futterMenge = gewicht / 20;

        return futterMenge;
        //oder so:
        // return gewicht / 20;
    }
}
