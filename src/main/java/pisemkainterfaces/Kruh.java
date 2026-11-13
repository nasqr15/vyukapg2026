package pisemkainterfaces;

public class Kruh extends Obly implements Comparable<Tvar> {
    private double Polomer;

    public Kruh(double Polomer) {
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


    @Override
    public int compareTo(Tvar o) {
        double mujObvod = obvod();
        double obvodtvaru = o.obvod();

        if (mujObvod < obvodtvaru) {
            return -1;

        }
        if (mujObvod > obvodtvaru) {
            return 1;
        }
        return 0;

    }
}
