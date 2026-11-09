package Malovatko;

public class Elipsa extends Kulaty{
    private double Polomer_osyX;
    private double Polomer_osyY;

    public Elipsa(double StredSouradnice_X, double StredSouradnice_Y, double polomer_osyX, double polomer_osyY) {
        super(StredSouradnice_X, StredSouradnice_Y);
        Polomer_osyX = polomer_osyX;
        Polomer_osyY = polomer_osyY;
    }
}
