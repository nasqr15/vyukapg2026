package Pisemka;

public class Rohaty extends Tvar{
    private double Souradnice_LevyHorniRoh_X;
    private double Souradnice_LevyHorniRoh_Y;

    public double getSouradnice_LevyHorniRoh_X() {
        return Souradnice_LevyHorniRoh_X;
    }

    public double getSouradnice_LevyHorniRoh_Y() {
        return Souradnice_LevyHorniRoh_Y;
    }

    public Rohaty(double souradnice_LevyHorniRoh_X, double souradnice_LevyHorniRoh_Y) {
        Souradnice_LevyHorniRoh_X = souradnice_LevyHorniRoh_X;
        Souradnice_LevyHorniRoh_Y = souradnice_LevyHorniRoh_Y;
    }
}
