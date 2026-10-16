package Polymorfismus;

public class Main {
    public static void main(String[] args) {
        Bod boda = new Bod(5,5);
        Bod bodb = new Bod(10,10);
        System.out.println("Souradnice XA: " + boda.getX());
        System.out.println("Souradnice YA: " + boda.getY());
        System.out.println("Souradnice XB: " + bodb.getX());
        System.out.println("Souradnice YB: " + bodb.getY());

        double vzdalenot = boda.vzdalenost(bodb);
        System.out.println(vzdalenot);
        for(int i=1; i<5;i++){
            System.out.println();
        }

        Kruh k1 = new Kruh(5,bodb);
        System.out.println("plocha kruhu: " + k1.Plocha());
        System.out.println(k1);
        for(int i=1; i<5;i++){
            System.out.println();
        }


    }



}
