package Malovatko;

import javafx.scene.layout.Pane;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;

public class Kruh extends Kulaty{
    private double Polomer;

    public Kruh(double StredSouradnice_X, double StredSouradnice_Y, double polomer) {
        super(StredSouradnice_X, StredSouradnice_Y);
        Polomer = polomer;
    }

    public double getPolomer() {
        return Polomer;
    }

    public void Namaluj(Pane pane) {
        Circle Kruh = new Circle(getStredSouradnice_X(), getStredSouradnice_Y(), getPolomer());
        Kruh.setFill(barva());
        pane.getChildren().add(Kruh);
    }


}
