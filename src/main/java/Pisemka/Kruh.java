package Pisemka;

public class Kruh extends Obly{
    private double Polomer;

    public Kruh(double souradnice_Stred_X, double souradnice_Stred_Y,double Polomer) {
        super(souradnice_Stred_X, souradnice_Stred_Y);
        this.Polomer = Polomer;
    }

    public double getPolomer() {
        return Polomer;
    }
    public double obvod(){
        return 2*Math.PI*getPolomer();
    }

    @Override
    public String toString() {
        return "Kruh{" +
                "druh: " + "Kruh, "+
                "skupina:" + "Obly, " +
                "obvod: " + obvod() +
                '}';
    }





}
