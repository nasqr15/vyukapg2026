package interfacesskola2011;

public class Manazer extends Clovek{
    int pocetPodrizenych;
    public Manazer(String Jmeno, String Prijimeni, int pocetPodrizenych){
        super(Jmeno, Prijimeni);
        this.pocetPodrizenych= pocetPodrizenych;
    }

    @Override
    public double getSalary() {
        return super.getSalary() + (pocetPodrizenych*2000);
    }
}
