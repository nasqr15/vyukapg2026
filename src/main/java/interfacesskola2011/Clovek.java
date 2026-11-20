package interfacesskola2011;

import java.sql.SQLOutput;
import java.util.Arrays;

public class Clovek implements Comparable<Clovek>{
    private String Jmeno;
    private String Prijmeni;

    public double getSalary(){
        return 40000;
    }

    public Clovek(String Jmeno, String Prijmeni) {
        this.Jmeno = Jmeno;
        this.Prijmeni = Prijmeni;
    }

    @Override
    public int compareTo(Clovek jinyClovek) {
        int prijimeniserazene = this.Prijmeni.compareTo(jinyClovek.Prijmeni);
        if (prijimeniserazene == 0){
            return this.Jmeno.compareTo(jinyClovek.Jmeno);
        }
        return prijimeniserazene;
    }



    @Override
    public String toString() {
        return this.Prijmeni + "  " + this.Jmeno + "  " + getSalary();

    }

    public static void main(String[] args) {
        Clovek[] lide = {
                new Clovek("Adam", "Barta"),
                new Clovek("Jarda", "Jezl"),
                new Clovek("Oliver", "Hyan"),
                new Clovek("Adam", "Rezac"),
                new Manazer("Jachym", "Kout", 4)
        };

        Arrays.sort(lide);
        for(Clovek C : lide){
            System.out.println(C);
        }
    }


}