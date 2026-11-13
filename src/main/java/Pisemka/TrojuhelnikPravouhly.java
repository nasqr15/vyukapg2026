package Pisemka;

public class TrojuhelnikPravouhly extends Rohaty{
    private double OdvesnaO1;
    private double OdvesnaO2;


    public TrojuhelnikPravouhly(double souradnice_LevyHorniRoh_X, double souradnice_LevyHorniRoh_Y, double odvesnaO1, double odvesnaO2) {
        super(souradnice_LevyHorniRoh_X, souradnice_LevyHorniRoh_Y);
        OdvesnaO1 = odvesnaO1;
        OdvesnaO2 = odvesnaO2;
    }

    public double getOdvesnaO1() {
        return OdvesnaO1;
    }

    public double getOdvesnaO2() {
        return OdvesnaO2;
    }

    public double obvod(){
        return getOdvesnaO2() + getOdvesnaO2() + Math.sqrt(getOdvesnaO2()*getOdvesnaO2() + getOdvesnaO1()*getOdvesnaO1());
    }

    @Override
    public String toString() {
        return "TrojuhelnikPravouhly{" +
                "druh:" + "PravouhlyTrojuhelnik, "+
                "skupina:" + "Rohaty, " +
                "obvod: " + obvod() +
                '}';
    }



}
