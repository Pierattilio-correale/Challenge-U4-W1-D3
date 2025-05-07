public class MainRettangolo {
    public static void main(String[] args) {
        Rettangolo primoRettangolo = new Rettangolo(10, 4);
        Rettangolo secondoRettangolo = new Rettangolo(5, 8);

        // Esercizio 1
        System.out.println("ESERCIZIO 1");
        primoRettangolo.stampaRettangolo();
        System.out.println();

        // Esercizio 2
        System.out.println("ESERCIZIO 2");
        System.out.println();
        Rettangolo.stampaDueRettangoli(primoRettangolo, secondoRettangolo);
    }
}