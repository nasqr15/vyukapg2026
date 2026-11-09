package Malovatko;

public class Ctverec extends Hranaty {
    private double StranaCtverce;

    public Ctverec(double Souradnice_LevyDolniRoh_X, double Souradnice_LevyDolniRoh_Y, double StranaCtverce) {
        super(Souradnice_LevyDolniRoh_X, Souradnice_LevyDolniRoh_Y);
        this.StranaCtverce = StranaCtverce;
    }

    public double getStranaCtverce() {
        return StranaCtverce;
    }
    public double Souradnice_LevyHorniRoh_X(){
        return getSouradnice_LevyDolniRoh_X() + getStranaCtverce();
    }
    public double Souradnice_LevyHorniRoh_Y(){
        return getSouradnice_LevyDolniRoh_Y();
    }
    public double Souradnice_PravyHorniRoh_X(){
        return getSouradnice_LevyDolniRoh_X() + getStranaCtverce();
    }
    public double Souradnice_PravyHorniRoh_Y(){
        return getSouradnice_LevyDolniRoh_Y() + getStranaCtverce();
    }
    public double Souradnice_PravyDolniRoh_X(){
        return getSouradnice_LevyDolniRoh_X();
    }
    public double Souradnice_PravyDolniRoh_Y(){
        return getSouradnice_LevyDolniRoh_Y() + getStranaCtverce();
    }



}
