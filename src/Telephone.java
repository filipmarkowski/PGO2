import java.util.Scanner;

class Telephone {
    String mark;
    double resolution;
    int number;
    String mess = " 'Podaj kod' ";

    public Telephone(String mark, double resolution, int number) {
        this.mark = mark;
        this.resolution = resolution;
        this.number = number;
    }

    public static void sendSMSscanner() {
        System.out.println("Napisz wiadomosc");
        Scanner scanner = new Scanner(System.in);
        String message = scanner.nextLine();
        System.out.println("Napisz numer");
        int contactNumber = scanner.nextInt();
        System.out.println("Wysylam wiadomosc "+ message + " na numer " + contactNumber);
    }

    public void sendSMS() {
        String message = "'wiadomosc x'";
        int anotherNumber = 696002882;
        System.out.println("Wysylam wiadomosc " + message + " na numer " + anotherNumber);
    }



}