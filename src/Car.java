import java.sql.SQLOutput;
import java.util.Scanner;

class Car {
    String color;
    String mark;
    double capacity;

    public Car(String color, String mark, double capacity){
        this.color = color;
        this.mark = mark;
        this.capacity = capacity;
    }

    public void getInfo(){
        String color;
        String mark;
        System.out.println("Kolor samochodu to "+ this.color + " | " +" Marka samochodu to "+ this.mark);

    }

    public void getPower(){
        if(this.capacity >= 2){
            System.out.println("Wysokoobrotowy o pojemnosci " + this.capacity);
        } else {
            System.out.println("Niskoobrotowy o pojemnosci " + this.capacity);
        }

    }

    public void getChange(){
        System.out.println("Bazowa pojemnosc silnika " + capacity);
        System.out.println("Wpisz nowa pojemnosc silnika");
        Scanner scanner = new Scanner(System.in);
        double changeCapacity = scanner.nextDouble();
        System.out.println("Nowa pojemnosc silnika to " + changeCapacity);
    }

    public void getChange2(){
        System.out.println("Zmien pojemnosc silnika" + "| Podstawowa pojemnosc silnika " + capacity);
        Scanner scanner2 = new Scanner(System.in);
        double changeCapacity = scanner2.nextDouble();
        double capa = this.capacity + changeCapacity;

        double zaok = capa;
        zaok = capa*100;
        double giga = Math.round(zaok);

        System.out.println("Nowa pojemnosc sinlika to " + giga/100);
    }
}