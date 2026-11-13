package Pisemka;

public class Bod extends Obly {
    public Bod(double souradnice_Stred_X, double souradnice_Stred_Y) {
        super(souradnice_Stred_X, souradnice_Stred_Y);
    }
    @Override
    public String toString() {
        return "Bod{" +
                "druh:" + "Bod, "+
                "skupina:" + "Obly, " +
                "obvod: " + null +
                '}';
    }

}
