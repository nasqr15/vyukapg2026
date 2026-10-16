package Polymorfismus;

public class Kruh {
    private double Polomer;
    private Bod StredKruhu;

    public Kruh(double polomer, Bod stredKruhu) {
        Polomer = polomer;
        StredKruhu = stredKruhu;
    }

    public double getPolomer() {
        return Polomer;
    }

    public double Plocha(){
        return Math.PI*Polomer* Polomer;
    }

    @Override
    public String toString() {
        return "Kruh{" +
                "Polomer=" + Polomer +
                ", StredKruhu=" + StredKruhu +
                '}';
    }
}
