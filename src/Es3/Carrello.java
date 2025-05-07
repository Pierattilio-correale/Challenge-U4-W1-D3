package Es3;

public class Carrello {
    private Cliente clienteAssociato;
    private Articolo[] elencoArticoli;
    private double totCostoArticolo;

    // Costruttore
    public Carrello(int numArticoli, Cliente cliente) {
        elencoArticoli = new Articolo[numArticoli];
        this.clienteAssociato = cliente;
    }

    // Metodo per calcolare il totale
    public double costoTotale() {
        double totale = 0;

        // Ciclo per scorrere gli articoli
        for (int i = 0; i < elencoArticoli.length; i++) {
            if (elencoArticoli[i] != null) {
                totale += elencoArticoli[i].getPrezzo();
            }
        }

        return totale;  // Restituisci il totale
    }

    // Metodo per aggiungere un articolo al carrello
    public void aggiungiArticolo(Articolo articolo, int index) {
        if (index >= 0 && index < elencoArticoli.length) {
            elencoArticoli[index] = articolo;
        }
    }

    // Metodo per stampare i dettagli del carrello
    public void stampaCarrello() {
        System.out.println("=== Carrello ===");
        if (clienteAssociato != null) {
            clienteAssociato.stampa();
        }
        System.out.println("Totale carrello: " + costoTotale());
        System.out.println("Articoli nel carrello:");
        for (Articolo articolo : elencoArticoli) {
            if (articolo != null) {
                System.out.println(" - Articolo: " + articolo.getPrezzo() + "€");
            }
        }
    }
}