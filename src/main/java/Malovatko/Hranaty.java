package Malovatko;

public class Hranaty extends Tvar{
    private double Souradnice_LevyDolniRoh_X;
    private double Souradnice_LevyDolniRoh_Y;

    public Hranaty(double Souradnice_LevyDolniRoh_X, double Souradnice_LevyDolniRoh_Y) {
        this.Souradnice_LevyDolniRoh_X = Souradnice_LevyDolniRoh_X;
        this.Souradnice_LevyDolniRoh_Y = Souradnice_LevyDolniRoh_Y;
    }

    public double getSouradnice_LevyDolniRoh_X() {
        return Souradnice_LevyDolniRoh_X;
    }

    public double getSouradnice_LevyDolniRoh_Y() {
        return Souradnice_LevyDolniRoh_Y;
    }
}
