package Malovatko;

import javafx.scene.layout.Pane;
import javafx.scene.shape.Rectangle;

public class Obdelnik extends Hranaty{
    private double Strana_A;
    private double Strana_B;

    public Obdelnik(double Souradnice_LevyHorniRoh_X, double Souradnice_LevyHorniRoh_Y, double Strana_A, double Strana_B) {
        super(Souradnice_LevyHorniRoh_X, Souradnice_LevyHorniRoh_Y);
        this.Strana_A = Strana_A;
        this.Strana_B = Strana_B;
    }


    public double getStrana_A() {
        return Strana_A;
    }

    public double getStrana_B() {
        return Strana_B;
    }


    public double Souradnice_LevyDolniRoh_X(){
        return getSouradnice_LevyHorniRoh_X();
    }
    public double Souradnice_LevyDolniRoh_Y(){
        return getSouradnice_LevyHorniRoh_Y() - getStrana_B();
    }
    public double Souradnice_PravyHorniRoh_X(){
        return getSouradnice_LevyHorniRoh_X() + getStrana_A();
    }
    public double Souradnice_PravyHorniRoh_Y(){
        return getSouradnice_LevyHorniRoh_Y();
    }
    public double Souradnice_PravyDolniRoh_X(){
        return getSouradnice_LevyHorniRoh_X() + getStrana_A();
    }
    public double Souradnice_PravyDolniRoh_Y(){
        return getSouradnice_LevyHorniRoh_Y() - getStrana_B();
    }

    public void Namaluj(Pane pane) {
        Rectangle Obdelnik = new Rectangle(getSouradnice_LevyHorniRoh_X(), getSouradnice_LevyHorniRoh_Y(), getStrana_A(), getStrana_B());
        Obdelnik.setFill(Barva());
        pane.getChildren().add(Obdelnik);
    }
}
