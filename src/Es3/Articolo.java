package Es3;

public class Articolo {
    private int codiceArticolo;
    private String descrizioneArticolo;
    private int prezzo ;
    private int numeroPezziDisponibili;

    public int getPrezzo() {
        return prezzo;
    }

    public void setPrezzo(int prezzo) {
        this.prezzo = prezzo;
    }

    public int getCodiceArticolo() {
        return codiceArticolo;
    }

    public void setCodiceArticolo(int codiceArticolo) {
        this.codiceArticolo = codiceArticolo;
    }

    public String getDescrizioneArticolo() {
        return descrizioneArticolo;
    }

    public void setDescrizioneArticolo(String descrizioneArticolo) {
        this.descrizioneArticolo = descrizioneArticolo;
    }

    public int getNumeroPezziDisponibili() {
        return numeroPezziDisponibili;
    }

    public void setNumeroPezziDisponibili(int numeroPezziDisponibili) {
        this.numeroPezziDisponibili = numeroPezziDisponibili;
    }
    public void stampa() {
        System.out.println("Codice Articolo: " + codiceArticolo);
        System.out.println("Descrizione Articolo: " + descrizioneArticolo);
        System.out.println("Prezzo: " + prezzo + "€");
        System.out.println("Numero pezzi disponibili: " + numeroPezziDisponibili);
        System.out.println();
    }
}
