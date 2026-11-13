package Pisemka;

public class Obly extends Tvar{
    private double Souradnice_Stred_X;
    private double Souradnice_Stred_Y;

    public double getSouradnice_Stred_X() {
        return Souradnice_Stred_X;
    }

    public double getSouradnice_Stred_Y() {
        return Souradnice_Stred_Y;
    }

    public Obly(double souradnice_Stred_X, double souradnice_Stred_Y) {
        Souradnice_Stred_X = souradnice_Stred_X;
        Souradnice_Stred_Y = souradnice_Stred_Y;
    }
}
