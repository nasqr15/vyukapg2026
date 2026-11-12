package Malovatko;

import javafx.scene.layout.Pane;
import javafx.scene.shape.Rectangle;

public class Ctverec extends Hranaty {
    private double StranaCtverce;

    public Ctverec(double Souradnice_LevyHorniRoh_X, double Souradnice_LevyHorniRoh_Y, double StranaCtverce) {
        super(Souradnice_LevyHorniRoh_X, Souradnice_LevyHorniRoh_Y);
        this.StranaCtverce = StranaCtverce;
    }

    public double getStranaCtverce() {
        return StranaCtverce;
    }
    public double Souradnice_LevyDolniRoh_X(){
        return getSouradnice_LevyHorniRoh_X();
    }
    public double Souradnice_LevyDolniRoh_Y(){
        return getSouradnice_LevyHorniRoh_Y() - getStranaCtverce();
    }
    public double Souradnice_PravyHorniRoh_X(){
        return getSouradnice_LevyHorniRoh_X() + getStranaCtverce();
    }
    public double Souradnice_PravyHorniRoh_Y(){
        return getSouradnice_LevyHorniRoh_Y();
    }
    public double Souradnice_PravyDolniRoh_X(){
        return getSouradnice_LevyHorniRoh_X() + getStranaCtverce();
    }
    public double Souradnice_PravyDolniRoh_Y(){
        return getSouradnice_LevyHorniRoh_Y() - getStranaCtverce();
    }



    public void Namaluj(Pane pane) {
        Rectangle Ctverec = new Rectangle(getSouradnice_LevyHorniRoh_X(), getSouradnice_LevyHorniRoh_Y(), getStranaCtverce(), getStranaCtverce());
        Ctverec.setFill(Barva());
        pane.getChildren().add(Ctverec);
    }


}
