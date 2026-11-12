package Malovatko;

import javafx.scene.layout.Pane;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Ellipse;

public class Elipsa extends Kulaty{
    private double Polomer_osyX;
    private double Polomer_osyY;

    public Elipsa(double StredSouradnice_X, double StredSouradnice_Y, double polomer_osyX, double polomer_osyY) {
        super(StredSouradnice_X, StredSouradnice_Y);
        Polomer_osyX = polomer_osyX;
        Polomer_osyY = polomer_osyY;
    }

    public double getPolomer_osyX() {
        return Polomer_osyX;
    }

    public double getPolomer_osyY() {
        return Polomer_osyY;
    }

    public void Namaluj(Pane pane) {
        Ellipse Elipsa = new Ellipse(getStredSouradnice_X(), getStredSouradnice_Y(), getPolomer_osyX(), getPolomer_osyY() );
        Elipsa.setFill(barva());
        pane.getChildren().add(Elipsa);
    }
}
