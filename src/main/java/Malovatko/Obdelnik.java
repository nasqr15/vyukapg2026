package Malovatko;

public class Obdelnik extends Hranaty{
    private double Strana_A;
    private double Strana_B;

    public Obdelnik(double Souradnice_X, double Souradnice_Y, double Strana_A, double Strana_B) {
        super(Souradnice_X, Souradnice_Y);
        this.Strana_A = Strana_A;
        this.Strana_B = Strana_B;
    }

    public double getStrana_A() {
        return Strana_A;
    }

    public double getStrana_B() {
        return Strana_B;
    }

    public double Souradnice_LevyHorniRoh_X(){
        return getSouradnice_LevyDolniRoh_X() + getStrana_B();
    }
    public double Souradnice_LevyHorniRoh_Y(){
        return getSouradnice_LevyDolniRoh_Y();
    }
    public double Souradnice_PravyHorniRoh_X(){
        return getSouradnice_LevyDolniRoh_X() + getStrana_B();
    }
    public double Souradnice_PravyHorniRoh_Y(){
        return getSouradnice_LevyDolniRoh_Y() + getStrana_A();
    }
    public double Souradnice_PravyDolniRoh_X(){
        return getSouradnice_LevyDolniRoh_X();
    }
    public double Souradnice_PravyDolniRoh_Y(){
        return getSouradnice_LevyDolniRoh_Y() + getStrana_A();
    }
}
