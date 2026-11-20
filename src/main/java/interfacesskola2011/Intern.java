package interfacesskola2011;

public class Intern extends Clovek {
    public Intern(String Jmeno, String Prijimeni){
        super(Jmeno, Prijimeni);
    }


    public double getSalary(){
        return super.getSalary()/2;
    }


}
