import java.util.Scanner;

public class Main {
    public static void main(String[] args){


        Telephone Filip = new Telephone("myPhone", 6.6,948204928);

        Telephone Karol = new Telephone("Nokia", 5.4, 928047294);

        Telephone Michal = new Telephone("Samsung", 6.2, 692837029);

        System.out.println("Filip " + Filip.resolution + "' " + Filip.mark + " " + Filip.number);

        Karol.sendSMSscanner();

        Karol.sendSMS();
        Michal.sendSMS();

        System.out.println();

        Car auto1 = new Car("black", "audi", 3.6);
        Car auto2 = new Car("red", "ford", 3.0);
        Car auto3 = new Car("white", "tesla", 3.0);
        Car auto4 = new Car("brown", "bmw", 1.0);
        Car auto5 = new Car("grey", "citroen", 1.5);

        auto1.getInfo();
        auto2.getInfo();
        auto3.getInfo();

        System.out.println();

        auto1.getPower();
        auto4.getPower();
        auto5.getPower();
        auto3.getPower();

        System.out.println();

        auto1.getChange();
        auto3.getChange();
        System.out.println();

        auto3.getChange2();
        auto1.getChange2();

    }

}
