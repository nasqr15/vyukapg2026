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

    public void Namaluj(Pane pane) {
        Polygon Trojuhlenik = new Polygon(getSouradnice_LevyHorniRoh_X(), getSouradnice_LevyHorniRoh_Y());
        Trojuhlenik.setFill(Barva());
        pane.getChildren().add(Trojuhlenik);
    }
}

