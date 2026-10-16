package Polymorfismus;

public class Ctverec {
    private double StranaA;
    private Bod LevyHorniRoh;

    public Ctverec(double stranaA, Bod levyHorniRoh) {
        StranaA = stranaA;
        LevyHorniRoh = levyHorniRoh;
    }

    public Bod getLevyHorniRoh() {
        return LevyHorniRoh;
    }

    public double getStranaA() {
        return StranaA;
    }

    public double PravyHorniRohX(){
        return getLevyHorniRoh().getX() + getStranaA();
    }
    public double PravyHorniRohY(){
        return getLevyHorniRoh().getY();
    }
    public double LevyDolniRohX(){
        return getLevyHorniRoh().getX();
    }
    public double LevyDolniRohY(){
        return getLevyHorniRoh().getY() - getStranaA();
    }
    public double PravyDolniRohX(){
        return getLevyHorniRoh().getX() + getStranaA();
    }
    public double PravyDolniRohY(){
        return getLevyHorniRoh().getY() - getStranaA();
    }

    @Override
    public String toString() {
        return "Ctverec{" +
                "StranaA=" + StranaA +
                ", LevyHorniRoh=" + LevyHorniRoh +
                '}';
    }
}
