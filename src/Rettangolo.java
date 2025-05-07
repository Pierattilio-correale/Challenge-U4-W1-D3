public class Rettangolo {
    private int altezza;
    private int larghezza;

    // Costruttore
    public Rettangolo(int altezza, int larghezza) {
        this.altezza = altezza;
        this.larghezza = larghezza;
    }

    public int calcolaArea() {
        return altezza * larghezza;
    }

    public int calcolaPerimetro() {
        return 2 * (altezza + larghezza);
    }

    public void stampaRettangolo() {
        System.out.println("Area: " + calcolaArea());
        System.out.println("Perimetro: " + calcolaPerimetro());
    }

    public static void stampaDueRettangoli(Rettangolo r1, Rettangolo r2) {
        System.out.println("Rettangolo 1:");
        r1.stampaRettangolo();
        System.out.println();
        System.out.println("Rettangolo 2:");
        r2.stampaRettangolo();
        System.out.println();
        int sommaAree = r1.calcolaArea() + r2.calcolaArea();
        int sommaPerimetri = r1.calcolaPerimetro() + r2.calcolaPerimetro();

        System.out.println("Somma delle aree: " + sommaAree);
        System.out.println("Somma dei perimetri: " + sommaPerimetri);
    }
}
