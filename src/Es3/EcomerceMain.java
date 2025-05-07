package Es3;

public class EcomerceMain {
    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        cliente.setNome("Pierattilio");
        cliente.setCognome("Correale");
        cliente.setEmail("pierattiliocorreale@yahoo.it");
        cliente.setCodiceCliente(123);
        cliente.setData("2024-05-07");

        // Crea un carrello con spazio per 5 articoli
        Carrello carrello = new Carrello(5, cliente);

        // Crea e aggiungi articoli
        Articolo articolo1 = new Articolo();
        articolo1.setPrezzo(100);
        articolo1.setCodiceArticolo(22);
        articolo1.setDescrizioneArticolo("Corda");
        articolo1.setNumeroPezziDisponibili(10);

        Articolo articolo2 = new Articolo();
        articolo2.setPrezzo(200);
        articolo2.setCodiceArticolo(14);
        articolo2.setDescrizioneArticolo("Sgabello");
        articolo2.setNumeroPezziDisponibili(10);
        System.out.println();

        carrello.aggiungiArticolo(articolo1, 0); // Aggiungi articolo 1
        carrello.aggiungiArticolo(articolo2, 1); // Aggiungi articolo 2

        // Stampa i dettagli del carrello (cliente + articoli)
        articolo2.stampa();
        carrello.stampaCarrello();
    }
}