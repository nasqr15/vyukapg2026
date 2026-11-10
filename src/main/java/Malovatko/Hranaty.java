package Malovatko;

import javafx.scene.paint.Color;

public class Hranaty extends Tvar{
    private double Souradnice_LevyHorniRoh_X;
    private double Souradnice_LevyHorniRoh_Y;

    public Hranaty(double Souradnice_LevyHorniRoh_X, double Souradnice_LevyHorniRoh_Y) {
        this.Souradnice_LevyHorniRoh_X = Souradnice_LevyHorniRoh_X;
        this.Souradnice_LevyHorniRoh_Y = Souradnice_LevyHorniRoh_Y;
    }

    public double getSouradnice_LevyHorniRoh_X() {
        return Souradnice_LevyHorniRoh_X;
    }
    public double getSouradnice_LevyHorniRoh_Y() {
        return Souradnice_LevyHorniRoh_Y;
    }

    protected Color Barva() { return Color.GREEN; }
}


