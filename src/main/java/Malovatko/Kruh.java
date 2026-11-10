package Malovatko;

import javafx.scene.layout.Pane;
import javafx.scene.shape.Rectangle;

public class Kruh extends Kulaty{
    private double Polomer;

    public Kruh(double StredSouradnice_X, double StredSouradnice_Y, double polomer) {
        super(StredSouradnice_X, StredSouradnice_Y);
        Polomer = polomer;
    }
    public void Namaluj(Pane pane) {
        Rectangle Obdelnik = new Rectangle(getSouradnice_LevyHorniRoh_X(), getSouradnice_LevyHorniRoh_Y());
        Obdelnik.setFill(barva());
        pane.getChildren().add(Obdelnik);
    }


}
