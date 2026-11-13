package pisemkainterfaces;

public class Ctverec extends Rohaty {
    private double StranaCtverce;

    public double getStranaCtverce() {
        return StranaCtverce;
    }

    public Ctverec(double stranaCtverce, double Souradnice_LevyHorniRoh_X, double Souradnice_LevyHorniRoh_Y ) {
        super(Souradnice_LevyHorniRoh_X, Souradnice_LevyHorniRoh_Y);
        StranaCtverce = stranaCtverce;
    }

    public double obvod(){
        return getStranaCtverce()*4;
    }

    @Override
    public String toString() {
        return "Ctverec{" +
                "druh:" + "Ctverec, "+
                "skupina:" + "Rohaty, " +
                "obvod: " + obvod() +
                '}';
    }
}
