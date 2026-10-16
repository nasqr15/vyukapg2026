package Polymorfismus;

public class Bod {
    private double x;
    private double y;


    public Bod(double x, double y) {
        this.x = x;
        this.y = y;

    }

    public double vzdalenost(Bod sousedici) {
        double rozdilX = Math.abs(this.x - sousedici.x);
        double rozdilY = Math.abs(this.y - sousedici.y);

        return Math.sqrt(rozdilX*rozdilX+rozdilY*rozdilY);
    }

    @Override
    public String toString() {
        return "Bod{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }
}
