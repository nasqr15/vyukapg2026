package Malovatko;

import javafx.scene.paint.Color;

public abstract class Kulaty extends Tvar{
    private double StredSouradnice_X;
    private double StredSouradnice_Y;

    public Kulaty(double stredSouradnice_X, double stredSouradnice_Y) {
        StredSouradnice_X = stredSouradnice_X;
        StredSouradnice_Y = stredSouradnice_Y;
    }

    public double getStredSouradnice_X() {
        return StredSouradnice_X;
    }

    public double getStredSouradnice_Y() {
        return StredSouradnice_Y;
    }

    protected Color barva() { return Color.BLUE; }
}
