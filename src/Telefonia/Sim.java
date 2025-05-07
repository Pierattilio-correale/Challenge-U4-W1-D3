package Telefonia;

public class Sim {
    private String phoneNumber;
    private double credito;
    private Chiamata[] listaChiamate;
    private int numeroChiamate;

    // Costruttore
    public Sim(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        this.credito = 0.0;
        this.listaChiamate = new Chiamata[5];
        this.numeroChiamate = 0;
    }


    public void aggiungiChiamata(String numeroChiamato, int durataMinuti) {
        // Se già ci sono 5 chiamate, sposta tutto a sinistra (elimina la più vecchia)
        if (numeroChiamate == 5) {
            for (int i = 0; i < 4; i++) {
                listaChiamate[i] = listaChiamate[i + 1];
            }
            listaChiamate[4] = new Chiamata(numeroChiamato, durataMinuti);
        } else {
            listaChiamate[numeroChiamate] = new Chiamata(numeroChiamato, durataMinuti);
            numeroChiamate++;
        }
    }


    public void stampa() {
        System.out.println("Numero di telefono: " + phoneNumber);
        System.out.println("Credito disponibile: " + credito + "€");
        System.out.println("Ultime chiamate:");
        for (int i = 0; i < numeroChiamate; i++) {
            Chiamata c = listaChiamate[i];
            System.out.println(" -> Chiamato: " + c.numero + ", Durata: " + c.durata + " minuti");
        }
    }
}