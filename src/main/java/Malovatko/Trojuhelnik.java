package Malovatko;

import javafx.scene.layout.Pane;
import javafx.scene.shape.Polygon;

public class Trojuhelnik extends Hranaty{
    private double Bod2X;
    private double Bod2Y;
    private double Bod3X;
    private double Bod3Y;

    public Trojuhelnik(double Souradnice_LevyDolniRoh_X, double Souradnice_LevyDolniRoh_Y, double bod2X, double bod2Y, double bod3X, double bod3Y) {
        super(Souradnice_LevyDolniRoh_X, Souradnice_LevyDolniRoh_Y);
        Bod2X = bod2X;
        Bod2Y = bod2Y;
        Bod3X = bod3X;
        Bod3Y = bod3Y;
    }

    public double getBod2X() {
        return Bod2X;
    }

    public double getBod2Y() {
        return Bod2Y;
    }

    public double getBod3X() {
        return Bod3X;
    }

    public double getBod3Y() {
        return Bod3Y;
    }

    public void Namaluj(Pane pane) {
        Polygon Trojuhlenik = new Polygon(getSouradnice_LevyHorniRoh_X(), getSouradnice_LevyHorniRoh_Y(), getBod2X(), getBod2Y(), getBod3X(), getBod3Y());
        Trojuhlenik.setFill(Barva());
        pane.getChildren().add(Trojuhlenik);
    }
}

