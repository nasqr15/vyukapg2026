package Malovatko;

public class Trojuhelnik extends Hranaty{
    private double StranaTrojuhelniku;
    private double Bod2X;
    private double Bod2Y;
    private double Bod3X;
    private double Bod3Y;

    public Trojuhelnik(double Souradnice_LevyDolniRoh_X, double Souradnice_LevyDolniRoh_Y, double stranaTrojuhelniku, double bod2X, double bod2Y, double bod3X, double bod3Y) {
        super(Souradnice_LevyDolniRoh_X, Souradnice_LevyDolniRoh_Y);
        StranaTrojuhelniku = stranaTrojuhelniku;
        Bod2X = bod2X;
        Bod2Y = bod2Y;
        Bod3X = bod3X;
        Bod3Y = bod3Y;
    }
}

